package yggdrasil.psi

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.refactoring.suggested.startOffset
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon

abstract class YggdrasilDeclaration(node: ASTNode) : YggdrasilElement(node), PsiNameIdentifierOwner {
    override fun getNavigationElement(): PsiElement {
        return nameIdentifier ?: this
    }

    abstract override fun getNameIdentifier(): YggdrasilIdentifierNode?;

    override fun getName(): String? {
        return this.nameIdentifier?.text ?: ""
    }

    override fun setName(name: String): YggdrasilIdentifierNode {
        TODO("Not yet implemented")
    }
    override fun getTextOffset(): Int {
        return navigationElement.startOffset
    }

    abstract override fun getBaseIcon(): Icon;

    override fun getIcon(flags: Int): Icon {
        return baseIcon
    }

    override fun getPresentation(): ItemPresentation? {
        // annotations.identifierList.joinToString(" ")
        return PresentationData(name, "", baseIcon, null)
    }

    fun createLookup(completions: MutableList<LookupElement>) {
        nameIdentifier?.let {
            completions.add(
                LookupElementBuilder.create(it)
                    .withIcon(baseIcon)
                    .withCaseSensitivity(false)
                    .withTypeText("withTypeText")
                    .withPresentableText(name ?: "")
                    .withTailText(" atomic", true)
            )
        }
    }
}