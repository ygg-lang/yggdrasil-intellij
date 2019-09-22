package ygg.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.search.SearchScope
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.psi.YggIdentifier
import ygg.intellij.language.psi.YggdrasilSymbol
import ygg.intellij.language.psi.ancestors
import ygg.intellij.language.psi_node.*


open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): YggIdentifierNode = this as YggIdentifierNode
    override fun getName(): String {
        return this.text.trimStart('_')
    }

    override fun getContext(): PsiElement? {
        for (node in this.ancestors) {
            when (node) {
                is YggClassStatementNode, is YggUnionStatementNode, is YggDefineStatementNode -> {
                    return node
                }
            }
        }
        return null;
    }

    override fun getContainingFile(): YggdrasilFileNode {
        return super.getContainingFile() as YggdrasilFileNode
    }

    override fun getReference(): PsiReference? {
        if (this.text == "Self") {
            return YggdrasilSymbol(this, this.context)
        }
        return when (parent) {
            is YggClassStatementNode, is YggUnionStatementNode, is YggDefineStatementNode -> null
            is YggBranchMarkNode -> null;
            else -> YggdrasilSymbol(this, containingFile.definitions[name])
        }
    }
}