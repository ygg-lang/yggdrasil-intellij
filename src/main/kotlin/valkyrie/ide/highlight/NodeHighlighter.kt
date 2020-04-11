package valkyrie.ide.highlight


//import nexus.language.psi_node.ValkyrieIdentifierNode
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.psi.node.*

class NodeHighlighter : YggdrasilVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitGrammar(o: YggdrasilGrammar) {
        o.identifier?.let { highlight(it, HighlightColor.SYM_MACRO) }
    }

    override fun visitUsing(o: YggdrasilUsing) {
        o.identifier?.let { highlight(it, HighlightColor.SYM_MACRO) }
    }


    override fun visitModifier(o: YggdrasilModifier) {
        highlight(o, HighlightColor.KEYWORD)
    }


    override fun visitAttribute(o: YggdrasilAttribute) {
        o.highlight(this)
    }

    override fun visitClass(o: YggdrasilClass) {
        o.identifier?.let { highlight(it, HighlightColor.RULE_CLASS) }
    }

    override fun visitDefineUnion(o: YggdrasilDefineUnion) {
        o.identifier?.let { highlight(it, HighlightColor.RULE_UNION) }
    }

    override fun visitDefineFunction(o: YggdrasilDefineFunction) {
        o.identifier?.let { highlight(it, HighlightColor.SYM_FUNCTION) }
    }

    override fun visitGroupItem(o: YggdrasilGroupItem) {
        o.identifierList.forEach {
            if (it == o.identifierList.lastOrNull()) {
                highlight(it, HighlightColor.SYM_CONSTANT)
            } else {
                highlight(it, HighlightColor.KEYWORD)
            }
        }
    }

    override fun visitExpressionTag(o: YggdrasilExpressionTag) {
        o.identifier?.let { highlight(it, HighlightColor.TAG_NODE) }
    }

    override fun visitTagBranch(o: YggdrasilTagBranch) {
        highlight(o, HighlightColor.TAG_BRANCH)
    }

    override fun visitArgument(o: YggdrasilArgument) {
        o.identifier?.let { highlight(it, HighlightColor.SYM_FIELD) }
    }

    override fun visitPair(o: YggdrasilPair) {
        highlight(o.key, HighlightColor.SYM_FIELD)
    }

    override fun visitFunctionCall(o: YggdrasilFunctionCall) {
        highlight(o.firstChild, HighlightColor.SYM_FUNCTION)
        highlight(o.identifier, HighlightColor.SYM_FUNCTION)
    }

    override fun visitAtomic(o: YggdrasilAtomic) {
        o.identifier?.highlight(this)
    }

    override fun visitCategory(o: YggdrasilCategory) {
        o.key?.let { highlight(it, HighlightColor.SYM_FIELD) }
        highlight(o.identifier, HighlightColor.SYM_CONSTANT)
    }

    override fun visitRange(o: YggdrasilRange) {
        highlight(o.firstChild, HighlightColor.OPERATION)
        highlight(o.lastChild, HighlightColor.OPERATION)
    }

    fun highlight(element: PsiElement, color: HighlightColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
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

    override fun clone(): HighlightVisitor = NodeHighlighter()

    override fun suitableForFile(file: PsiFile): Boolean = file is YggdrasilFileNode

    override fun visit(element: PsiElement) = element.accept(this)
}