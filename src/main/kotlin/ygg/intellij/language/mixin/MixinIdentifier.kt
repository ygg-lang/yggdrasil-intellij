package ygg.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.psi.YggdrasilSymbol
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggDefineStatementNode
import ygg.intellij.language.psi_node.YggIdentifierNode
import ygg.intellij.language.psi_node.YggUnionStatementNode


enum class IdentifierKind {
    Self,
    Builtin,
    Function,
}


open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): YggIdentifierNode = this as YggIdentifierNode
    override fun getName(): String {
        return this.text.trimStart('_')
    }
    override fun getContainingFile(): YggdrasilFileNode {
        return super.getContainingFile() as YggdrasilFileNode
    }

    override fun getReference(): PsiReference? {
        return when (parent) {
            is YggClassStatementNode, is YggUnionStatementNode, is YggDefineStatementNode -> null
            else -> YggdrasilSymbol(this, containingFile.definitions[name])
        }
    }
}