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
import yggdrasil.psi.node.YggdrasilDefineFunction

import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon

abstract class MixinDefineFunction(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilDefineFunction {
    override fun getNavigationElement(): PsiElement {
        return nameIdentifier ?: this
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifierFree as? YggdrasilIdentifierNode
    }


    override fun getName(): String {
        return nameIdentifier?.name ?: ""
    }


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Function
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData("YggdrasilClass", "YggdrasilClass", baseIcon, null)
    }

    override fun createLookup(completions: MutableList<LookupElement>) {
        this.nameIdentifier?.let {
            completions.add(
                LookupElementBuilder.create(it)
                    .withIcon(baseIcon)
                    .withCaseSensitivity(false)
                    .withTypeText("withTypeText")
                    .withPresentableText(name)
                    .withTailText(" atomic", true)
            )
        }
    }
}