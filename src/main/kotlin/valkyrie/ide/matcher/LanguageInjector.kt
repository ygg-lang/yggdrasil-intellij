package valkyrie.ide.matcher

//import com.intellij.jsonpath.JsonPathLanguage
import com.intellij.lang.injection.MultiHostInjector
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.literals.YggdrasilRegex
import yggdrasil.language.ast.YggdrasilStringNode

//import nexus.language.psi_node.ValkyrieStringNode

class LanguageInjector : MultiHostInjector {
    override fun getLanguagesToInject(registrar: MultiHostRegistrar, context: PsiElement) {
        when (context) {
            is YggdrasilRegex -> context.injectPerform(registrar)
            is YggdrasilStringNode -> context.injectPerform(registrar)
        }
    }

    override fun elementsToInjectIn(): MutableList<out Class<out PsiElement>> {
        return mutableListOf(YggdrasilStringNode::class.java, YggdrasilRegex::class.java)
    }
}

