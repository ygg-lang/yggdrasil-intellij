package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.openapi.util.TextRange
import com.intellij.psi.LiteralTextEscaper
import com.intellij.psi.PsiLanguageInjectionHost
import org.intellij.lang.regexp.RegExpLanguage

class YggdrasilRegex(node: ASTNode) : ASTWrapperPsiElement(node), PsiLanguageInjectionHost {
    override fun isValidHost(): Boolean {
        return true
    }

    override fun updateText(p0: String): PsiLanguageInjectionHost {
        TODO("Not yet implemented")
    }

    override fun createLiteralTextEscaper(): LiteralTextEscaper<out PsiLanguageInjectionHost> {
        TODO("Not yet implemented")
    }

    fun injectPerform(r: MultiHostRegistrar) {
        r.startInjecting(RegExpLanguage.INSTANCE)
            .addPlace(null, null, this, innerRange())
            .doneInjecting()
    }

    private fun innerRange(): TextRange {
        val start = textRange.startOffset - textRange.startOffset + 1;
        val end = textRange.endOffset - textRange.startOffset - 1;
        return TextRange(start, end)
    }
}