package valkyrie.ide.view

import com.intellij.lang.Language
import com.intellij.psi.PsiElement
import com.intellij.ui.breadcrumbs.BreadcrumbsProvider
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilDefineUnionNode

class YggdrasilBreadcrumbsProvider : BreadcrumbsProvider {
    override fun getLanguages(): Array<Language> {
        return arrayOf(YggdrasilLanguage)
    }

    override fun acceptElement(element: PsiElement) = when (element) {
        is YggdrasilClassNode -> {
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
        is YggdrasilClassNode -> {
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
