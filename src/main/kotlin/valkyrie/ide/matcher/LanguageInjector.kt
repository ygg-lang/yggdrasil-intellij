package valkyrie.ide.matcher

//import com.intellij.jsonpath.JsonPathLanguage
import com.intellij.lang.injection.MultiHostInjector
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.psi.PsiElement
import yggdrasil.psi.node.YggdrasilRegex
import yggdrasil.psi.node.YggdrasilString


//import nexus.language.psi_node.ValkyrieStringNode

class LanguageInjector : MultiHostInjector {
    override fun getLanguagesToInject(registrar: MultiHostRegistrar, context: PsiElement) {
        when (context) {
//            is YggdrasilRegexNode -> context.injectPerform(registrar)
//            is YggdrasilStringNode -> context.injectPerform(registrar)
        }
    }

    override fun elementsToInjectIn(): MutableList<out Class<out PsiElement>> {
        return mutableListOf(YggdrasilString::class.java, YggdrasilRegex::class.java)
    }
}

