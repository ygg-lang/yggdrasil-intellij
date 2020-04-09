package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilGroup
import yggdrasil.psi.node.YggdrasilGroupItemNode
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon


abstract class MixinGroup(node: ASTNode) : YggdrasilElement(node),
    PsiNameIdentifierOwner,
    YggdrasilGroup {


    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifier as? YggdrasilIdentifierNode
    }

    override fun getName(): String? {
        return nameIdentifier?.name ?: "⟪anonymous⟫"
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.ModuleGroup
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }

    override fun getTokenList(): MutableList<YggdrasilGroupItemNode> {
        if (groupBody == null) {
            return mutableListOf()
        }
        val items = mutableListOf<YggdrasilGroupItemNode>()
        for (item in groupBody!!.groupTermList) {
            val inner = item.groupItem as? YggdrasilGroupItemNode;
            if (inner != null) {
                items.add(inner)
            }
        }
        return items;
    }

}

