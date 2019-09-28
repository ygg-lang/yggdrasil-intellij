package nexus.language.ast.classes

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.psi.ValkyrieRewritableElement
import valkyrie.ide.formatter.ValkyrieRewriter

class ValkyrieGenericStatement(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieRewritableElement {
    override fun on_rewrite(e: ValkyrieRewriter) {
        e.rewriteGeneric(this)
    }
}