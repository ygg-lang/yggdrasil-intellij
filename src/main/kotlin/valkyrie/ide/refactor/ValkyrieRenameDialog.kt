package valkyrie.ide.refactor

import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.refactoring.rename.RenamePsiElementProcessorBase
import com.intellij.refactoring.rename.RenameRefactoringDialog
import com.intellij.refactoring.rename.RenameRefactoringDialogProvider

class ValkyrieRenameDialog : RenameRefactoringDialogProvider() {
    override fun createDialog(
        project: Project,
        element: PsiElement,
        nameSuggestionContext: PsiElement?,
        editor: Editor?,
    ): RenameRefactoringDialog {
        TODO("Not yet implemented")
    }

    override fun isApplicable(processor: RenamePsiElementProcessorBase?): Boolean {
        return false
    }
}