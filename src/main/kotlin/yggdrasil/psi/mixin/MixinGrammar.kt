package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilGrammar
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon

abstract class MixinGrammar(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilGrammar {

    override fun getName(): String? {
        return this.nameIdentifier?.name ?: "⟪anonymous⟫"
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifier as? YggdrasilIdentifierNode
    }


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.DataSchema
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}

