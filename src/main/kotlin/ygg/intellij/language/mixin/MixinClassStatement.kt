package ygg.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import ygg.intellij.language.file.YggdrasilIcon
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggIdentifierNode

open class MixinClassStatement(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement() = this as YggClassStatementNode

    override fun getNameIdentifier() = originalElement.identifier as YggIdentifierNode

    override fun getIcon(flags: Int) = YggdrasilIcon.KEYWORD

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


}