package valkyrie.ide.lint

import com.intellij.ide.actions.QualifiedNameProvider
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement

class ValkyrieNameQualifier : QualifiedNameProvider {
    override fun adjustElementToCopy(element: PsiElement): PsiElement? {
        return null
    }

    override fun getQualifiedName(element: PsiElement): String? {
        val name = element.text
        return null
    }

    override fun qualifiedNameToElement(fqn: String, project: Project): PsiElement? {
        return null
    }

    override fun insertQualifiedName(fqn: String, element: PsiElement, editor: Editor, project: Project) {
        super.insertQualifiedName(fqn, element, editor, project)
    }
}