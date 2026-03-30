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

class YggdrasilSemanticHighlighter : YggdrasilVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitDefineClass(o: YggdrasilDefineClass) {
        o.nameIdentifier?.let { highlight(it, HighlightColor.RULE_CLASS) }
    }

    override fun visitDefineUnion(o: YggdrasilDefineUnion) {
        o.nameIdentifier?.let { highlight(it, HighlightColor.RULE_UNION) }
    }

    override fun visitDefineFunction(o: YggdrasilDefineFunction) {
        o.nameIdentifier?.let { highlight(it, HighlightColor.SYM_FUNCTION) }
    }

    fun highlight(element: PsiElement?, color: HighlightColor) {
        if (element == null) {
            return
        }
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

    override fun clone(): HighlightVisitor = YggdrasilSemanticHighlighter()

    override fun suitableForFile(file: PsiFile): Boolean = file is YggdrasilFileNode

    override fun visit(element: PsiElement) = element.accept(this)
}