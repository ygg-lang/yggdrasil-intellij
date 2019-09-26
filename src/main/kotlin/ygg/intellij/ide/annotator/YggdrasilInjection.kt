package ygg.intellij.ide.annotator

import com.intellij.json.JsonLanguage
import com.intellij.lang.injection.general.Injection
import com.intellij.lang.injection.general.LanguageInjectionContributor
import com.intellij.lang.injection.general.SimpleInjection
import com.intellij.psi.PsiElement
import org.intellij.lang.regexp.RegExpLanguage
import ygg.intellij.language.psi_node.YggCharsetNode
import ygg.intellij.language.psi_node.YggStringLiteralNode

class YggdrasilInjection : LanguageInjectionContributor {
    override fun getInjection(context: PsiElement): Injection? {
        if (context is YggCharsetNode) {
            return SimpleInjection(JsonLanguage.INSTANCE, "", "", null)
        }
        return null;
    }
}