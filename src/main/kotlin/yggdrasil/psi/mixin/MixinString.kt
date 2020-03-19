package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.*
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilString

abstract class MixinString(node: ASTNode) : YggdrasilElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    PsiLanguageInjectionHost,
    YggdrasilString {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return null
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
    }

     override fun isValidHost(): Boolean {
         TODO("Not yet implemented")
     }

     override fun updateText(text: String): PsiLanguageInjectionHost {
         TODO("Not yet implemented")
     }

     override fun createLiteralTextEscaper(): LiteralTextEscaper<out PsiLanguageInjectionHost> {
         TODO("Not yet implemented")
     }
 }