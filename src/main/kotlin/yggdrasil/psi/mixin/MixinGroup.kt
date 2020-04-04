package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilGroup
import yggdrasil.psi.node.YggdrasilGroupItemNode


abstract class MixinGroup(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilGroup {

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


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return null
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
    }
}

