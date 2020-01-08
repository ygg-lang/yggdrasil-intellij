package yggdrasil.language.ast

//import nexus.language.psi.ValkyrieGenericDefine
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.file.NexusIconProvider
import yggdrasil.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon

class YggdrasilFunctionStatement(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, YggdrasilHighlightElement {
    val namepath by lazy { YggdrasilNamepathNode.find(this) }
    val modifiers by lazy { NexusModifiedNode.findModifiers(this) };
    override fun getName(): String {
        return namepath?.nameIdentifier?.name ?: "[Unknown Function]"
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return namepath?.nameIdentifier
    }

    override fun getBaseIcon(): Icon {
        return NexusIconProvider.Instance.Function
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(namepath?.nameIdentifier, this.baseIcon)
    }


    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, YggdrasilHighlightColor.SYM_FUNCTION_FREE)
        e.register_modifiers(modifiers)
    }
}
