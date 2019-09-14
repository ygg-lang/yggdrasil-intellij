package ygg.intellij.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.psi.*
import ygg.intellij.language.psi_node.YggDefineStatementNode

class HighlightAST : YggVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun clone(): HighlightVisitor = HighlightAST()

    override fun suitableForFile(file: PsiFile): Boolean = file is YggdrasilFileNode

    override fun visit(element: PsiElement) = element.accept(this)

    override fun visitGrammarStatement(o: YggGrammarStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
        highlight(o.identifier, HighlightColor.SYM_MACRO)
    }

    override fun visitExportStatement(o: YggExportStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
        highlight(o.identifier, HighlightColor.SYM_MACRO)
    }

    override fun visitImportStatement(o: YggImportStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
    }

    override fun visitModifiers(o: YggModifiers) {
        for (modifier in o.identifierList) {
            highlight(modifier, HighlightColor.KEYWORD)
        }
    }

    override fun visitClassStatement(o: YggClassStatement) {
        highlight(o.identifier, HighlightColor.SYM_CLASS)
    }

    override fun visitUnionStatement(o: YggUnionStatement) {
        highlight(o.identifier, HighlightColor.SYM_UNION)
    }

    override fun visitDefineStatement(o: YggDefineStatement) {
        o as YggDefineStatementNode
        highlight(o.identifier, HighlightColor.SYM_FUNCTION)
        for (node in o.parameterNodes) {
            highlight(node, HighlightColor.SYM_PARAMETER)
        }
    }

    override fun visitMacroCall(o: YggMacroCall) {
        highlight(o.firstChild, HighlightColor.SYM_MACRO)
        highlight(o.identifier, HighlightColor.SYM_MACRO)
    }

    override fun visitFunctionCall(o: YggFunctionCall) {
        highlight(o.firstChild, HighlightColor.SYM_FUNCTION)
        highlight(o.identifier, HighlightColor.SYM_FUNCTION)
    }

    override fun visitBranchMark(o: YggBranchMark) {
        highlight(o, HighlightColor.BRANCH_MARK)
    }

    override fun visitFieldMark(o: YggFieldMark) {
        highlight(o.firstChild, HighlightColor.FIELD_MARK)
    }

    override fun visitObjectKey(o: YggObjectKey) {
        highlight(o, HighlightColor.FIELD_MARK)
    }

    override fun visitIdentifier(o: YggIdentifier) {
        var const = true
        for (char in o.text) {
            if (char.isLowerCase()) {
                const = false;
                break
            }
        }
        if (const) {
            highlight(o, HighlightColor.SYM_CONSTANT);
            return
        }
        when (o.text) {
            "Self", "Any" -> {
                highlight(o, HighlightColor.KEYWORD)
            }

            else -> {}
        }
    }


    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable,
    ): Boolean {
        infoHolder = holder
        action.run()
        return true
    }

    private fun highlight(element: PsiElement, color: HighlightColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)
        infoHolder?.add(builder.create())
    }

}