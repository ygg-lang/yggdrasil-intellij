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

    override fun visitAnnotations(o: YggdrasilAnnotations) {
        for (modifier in o.identifierList) {
            highlight(modifier, HighlightColor.KEYWORD)
        }
    }


    override fun visitAttribute(o: YggdrasilAttribute) {
        o as YggdrasilAttributeNode;
        o.highlight(this)
    }

    override fun visitClass(o: YggdrasilClass) {
        o.identifier?.let { highlight(it, HighlightColor.RULE_CLASS) }
    }

    override fun visitUnion(o: YggdrasilUnion) {
        o.identifier?.let { highlight(it, HighlightColor.RULE_UNION) }
    }


    override fun visitTagBranch(o: YggdrasilTagBranch) {
        highlight(o, HighlightColor.TAG_BRANCH)
    }


    override fun visitAtomic(o: YggdrasilAtomic) {
        val id = o.identifier as? YggdrasilIdentifierNode
        id?.highlight(this)
    }

    override fun visitCategory(o: YggdrasilCategory) {
        super.visitCategory(o)
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