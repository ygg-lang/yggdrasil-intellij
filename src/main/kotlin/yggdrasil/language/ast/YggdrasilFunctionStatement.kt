package yggdrasil.language.ast

//import nexus.language.psi.ValkyrieGenericDefine
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.file.NexusIconProvider
import yggdrasil.language.psi.YggdrasilScopeNode
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon

class YggdrasilFunctionStatement(node: CompositeElement) : YggdrasilScopeNode(node), PsiNameIdentifierOwner, YggdrasilHighlightElement {
    val namepath by lazy { YggdrasilNamepathNode.find(this) }
    val modifiers by lazy { NexusModifiedNode.findModifiers(this) };


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        TODO("Not yet implemented")
    }


    override fun getBaseIcon(): Icon {
        return NexusIconProvider.Instance.Function
    }

    override fun getPresentation(): ItemPresentation {
        TODO("Not yet implemented")
    }


    override fun on_highlight(e: NodeHighlighter) {
        e.register_function(nameIdentifier)
        e.register_modifiers(modifiers)
    }
}

