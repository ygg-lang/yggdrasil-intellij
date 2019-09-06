package ygg.intellij.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.psi.*

class HighlightAST : YggVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun clone(): HighlightVisitor = HighlightAST()

    override fun suitableForFile(file: PsiFile): Boolean = file is YggdrasilFileNode

    override fun visit(element: PsiElement) = element.accept(this)

    override fun visitGrammarStatement(o: YggGrammarStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
        highlight(o.identifier, HighlightColor.MACRO_SYMBOL)
    }

    override fun visitExportStatement(o: YggExportStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
        highlight(o.identifier, HighlightColor.MACRO_SYMBOL)
    }

    override fun visitImportStatement(o: YggImportStatement) {
        highlight(o.firstChild, HighlightColor.KEYWORD)
    }

    override fun visitRuleStatement(o: YggRuleStatement) {
        highlight(o.define, HighlightColor.KEYWORD)
        if (o.ruleArgument == null) {
            highlight(o.identifier, HighlightColor.RULE_SYMBOL)
        }
        else {
            highlight(o.identifier, HighlightColor.FUNCTION_SYMBOL)
        }
        o.ruleType?.let {
            highlight(it.identifier, HighlightColor.RULE_SYMBOL)
        }
    }

    override fun visitMacroCall(o: YggMacroCall) {
        highlight(o.firstChild, HighlightColor.MACRO_SYMBOL)
        highlight(o.identifier, HighlightColor.MACRO_SYMBOL)
    }

    override fun visitFunctionCall(o: YggFunctionCall) {
        highlight(o.firstChild, HighlightColor.FUNCTION_SYMBOL)
        highlight(o.identifier, HighlightColor.FUNCTION_SYMBOL)
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
        when (o.text) {
            "Self" -> {
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