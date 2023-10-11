package yggdrasil.language.ast.literals

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
        return this
    }

    override fun createLiteralTextEscaper(): LiteralTextEscaper<out PsiLanguageInjectionHost> {
        return YggdrasilRegexEscaper(this)
    }


    fun injectPerform(r: MultiHostRegistrar) {
        r.startInjecting(RegExpLanguage.INSTANCE).addPlace(null, null, this, innerRange()).doneInjecting()
    }

    fun innerRange(): TextRange {
        return if (text.startsWith('/')) {
            TextRange(1, textLength - 1)
        } else {
            TextRange(0, textLength)
        }
    }
}

