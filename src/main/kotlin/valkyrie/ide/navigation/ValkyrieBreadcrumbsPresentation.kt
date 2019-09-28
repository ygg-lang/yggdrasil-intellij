package valkyrie.ide.navigation

import com.intellij.psi.PsiElement
import com.intellij.xml.breadcrumbs.BreadcrumbsPresentationProvider
import com.intellij.xml.breadcrumbs.CrumbPresentation

class ValkyrieBreadcrumbsPresentation : BreadcrumbsPresentationProvider() {
    override fun getCrumbPresentations(element: Array<out PsiElement>): Array<CrumbPresentation>? {
//        for (e in element) {
//            println("getCrumbPresentations($e)")
//        }
        return null
    }
}