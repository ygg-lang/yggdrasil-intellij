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
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilFunctionDefine
import yggdrasil.psi.node.YggdrasilGroupItem
import yggdrasil.psi.node.YggdrasilIdentifierNode

abstract class MixinGroupItem(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilGroupItem {
    override fun getNavigationElement(): PsiElement {
        return nameIdentifier ?: this
    }

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
        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Constant, null)
    }

    override fun highlight(highlighter: NodeHighlighter) {
        this.identifierList.forEach {
            if (it == this.identifierList.lastOrNull()) {
                highlighter.highlight(it, HighlightColor.SYM_CONSTANT)
            } else {
                highlighter.highlight(it, HighlightColor.KEYWORD)
            }
        }
    }

    override fun createLookup(completions: MutableList<LookupElement>) {
        this.nameIdentifier?.let {
            completions.add(
                LookupElementBuilder.create(it)
                    .withIcon(AllIcons.Nodes.Constant)
                    .withCaseSensitivity(false)
                    .withTypeText("withTypeText")
                    .withPresentableText(name)
                    .withTailText(" atomic", true)
            )
        }
    }
}

abstract class MixinDefineFunction(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilFunctionDefine {
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


    override fun getPresentation(): ItemPresentation? {
        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Constant, null)
    }

    override fun createLookup(completions: MutableList<LookupElement>) {
        this.nameIdentifier?.let {
            completions.add(
                LookupElementBuilder.create(it)
                    .withIcon(AllIcons.Nodes.Constant)
                    .withCaseSensitivity(false)
                    .withTypeText("withTypeText")
                    .withPresentableText(name)
                    .withTailText(" atomic", true)
            )
        }
    }
}

