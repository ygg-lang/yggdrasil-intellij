package valkyrie.ide.navigation

//import nexus.language.psi_node.ValkyrieClassStatementNode
//import nexus.language.psi_node.ValkyrieTraitStatementNode
import com.intellij.lang.Language
import com.intellij.navigation.NavigationItem
import com.intellij.psi.PsiElement
import com.intellij.ui.breadcrumbs.BreadcrumbsProvider
import yggdrasil.language.psi.YggdrasilScopeNode
import javax.swing.Action
import javax.swing.Icon

class ValkyrieBreadcrumbsProvider : BreadcrumbsProvider {
    override fun getLanguages(): Array<Language> {
        return arrayOf(yggdrasil.language.YggdrasilLanguage)
    }

    override fun acceptElement(element: PsiElement): Boolean {
        return element is YggdrasilScopeNode
    }

    override fun getElementInfo(element: PsiElement): String {
        return if (element is NavigationItem) {
            element.name ?: "[Missing]"
        } else {
            "[Unknown]"
        }
    }

    override fun getChildren(element: PsiElement): MutableList<PsiElement> {
        return super.getChildren(element)
    }

    override fun getParent(element: PsiElement): PsiElement? {
        return super.getParent(element)
    }

    override fun getElementIcon(element: PsiElement): Icon? {
        return element.getIcon(0)
    }

    override fun getContextActions(element: PsiElement): MutableList<out Action> {
        return super.getContextActions(element)
    }

    override fun getElementTooltip(element: PsiElement): String? {
        return super.getElementTooltip(element)
    }

}