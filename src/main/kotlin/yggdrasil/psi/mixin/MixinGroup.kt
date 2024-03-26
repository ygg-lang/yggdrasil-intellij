package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilToken
import yggdrasil.psi.node.YggdrasilTokenItemNode

abstract class MixinGroup(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilToken {

    override fun getTokenList(): MutableList<YggdrasilTokenItemNode> {
        if (tokenBody == null) {
            return mutableListOf()
        }
        val items = mutableListOf<YggdrasilTokenItemNode>()
        for (item in tokenBody!!.tokenTermList) {
            if (item is YggdrasilTokenItemNode) {
                items.add(item)
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

