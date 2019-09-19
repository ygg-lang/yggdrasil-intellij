package ygg.intellij.language.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

class YggdrasilSymbol(private val source: PsiElement, private val target: PsiElement?) : PsiReference {
    override fun getElement(): PsiElement {
        return source
    }

    override fun getRangeInElement(): TextRange {
        return TextRange(0, source.textLength)
    }

    override fun resolve(): PsiElement? {
        return target
    }

    override fun getCanonicalText(): String {
        return source.text
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun bindToElement(element: PsiElement): PsiElement {
        TODO("Not yet implemented")
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return resolve() == element
    }

    override fun isSoft(): Boolean {
        return true
    }

}