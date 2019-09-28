package valkyrie.ide.formatter

import com.intellij.lang.LanguageFormattingRestriction
import com.intellij.psi.PsiElement

class FormatRestriction : LanguageFormattingRestriction {
    override fun isFormatterAllowed(context: PsiElement): Boolean {
        return true
    }

    override fun isAutoFormatAllowed(context: PsiElement): Boolean {
        return true
    }
}