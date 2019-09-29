package yggdrasil.language.ast.classes

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.NexusIdentifierNode
import yggdrasil.language.psi.ValkyrieRewritableElement
import valkyrie.ide.formatter.ValkyrieRewriter

// must = must use `::`
class ValkyrieGenericCall(node: CompositeElement, must: Boolean) : ASTWrapperPsiElement(node), ValkyrieRewritableElement {
    private val _identifier by lazy { NexusIdentifierNode.find(this) }
//    override fun getBaseIcon(): Icon {
//        return ValkyrieIconProvider.Instance.CLASS
//    }

//    override fun getPresentation(): ItemPresentation {
//        return IdentifierPresentation(_identifier, this.baseIcon)
//    }

    override fun on_rewrite(e: ValkyrieRewriter) {
        e.rewriteGeneric(this)
    }
}