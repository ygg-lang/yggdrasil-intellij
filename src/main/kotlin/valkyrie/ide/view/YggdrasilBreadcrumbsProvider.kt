package valkyrie.ide.view

import com.intellij.lang.Language
import com.intellij.psi.PsiElement
import com.intellij.ui.breadcrumbs.BreadcrumbsProvider
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.psi.node.YggdrasilDefineClassNode
import yggdrasil.psi.node.YggdrasilDefineUnionNode
import yggdrasil.psi.node.YggdrasilGrammarNode
import yggdrasil.psi.node.YggdrasilGroupNode

class YggdrasilBreadcrumbsProvider : BreadcrumbsProvider {
    override fun getLanguages(): Array<Language> {
        return arrayOf(YggdrasilLanguage)
    }

    override fun acceptElement(element: PsiElement) = when (element) {
        is YggdrasilGrammarNode,
        is YggdrasilDefineClassNode,
        is YggdrasilGroupNode,
            -> {
            true
        }
        is YggdrasilDefineUnionNode -> {
            true
        }
        else -> {
            false
        }
    }

    override fun getElementInfo(element: PsiElement) = when (element) {
        is YggdrasilDefineClassNode -> {
            element.name ?: "?"
        }

        is YggdrasilDefineUnionNode -> {
            element.name ?: "?"
        }

        else -> {
            "?"
        }
    }
}
