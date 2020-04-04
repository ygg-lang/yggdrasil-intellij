package yggdrasil.psi.mixin

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilIdentifierNode
import yggdrasil.psi.node.YggdrasilTokenItem

abstract class MixinTokenItem(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilTokenItem {

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifierList.lastOrNull() as? YggdrasilIdentifierNode
    }

    override fun getName(): String {
        return nameIdentifier?.name ?: ""
    }


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


    override fun getPresentation(): ItemPresentation? {
        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
    }

    override fun createLookup(completions: MutableList<LookupElement>) {
        this.nameIdentifier?.let {
            completions.add(LookupElementBuilder.create(it))
        }
    }
}