package ygg.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import ygg.intellij.language.psi.ancestors
import ygg.intellij.language.psi_node.YggIdentifierNode
import ygg.intellij.language.psi_node.YggRuleStatementNode


enum class IdentifierKind {
    Self,
    Builtin,
    Function,
}

open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): YggIdentifierNode = this as YggIdentifierNode


}