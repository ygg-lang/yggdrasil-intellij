package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilIdentifierNode
import yggdrasil.psi.node.YggdrasilUnionVariant
import javax.swing.Icon

abstract class MixinUnionItem(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilUnionVariant {
    override fun getNavigationElement(): PsiElement {
        return nameIdentifier ?: this
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.tagBranch?.identifier as? YggdrasilIdentifierNode
    }


    override fun getName(): String {
        return nameIdentifier?.name ?: "⟪anonymous⟫"
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Variable
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}