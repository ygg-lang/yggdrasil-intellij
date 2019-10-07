package valkyrie.ide.actions.ast_transform

import com.intellij.codeInsight.intention.PriorityAction
import com.intellij.codeInspection.LocalQuickFixAndIntentionActionOnPsiElement
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import javax.swing.Icon

class DeleteThis(element: PsiElement, vararg rest: PsiElement?) : LocalQuickFixAndIntentionActionOnPsiElement(element), PriorityAction,
    Iconable {
    val todo = mutableListOf<PsiElement>()

    init {
        this.todo.add(element)
        for (item in rest) {
            if (item != null) {
                this.todo.add(item)
            }
        }
    }

    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getFamilyName(): String {
        return "getFamilyName"
    }

    override fun getText(): String {
        return yggdrasil.language.YggdrasilBundle.message("action.delete.node.name")
    }

    fun getDescription(): String {
        return yggdrasil.language.YggdrasilBundle.message("action.delete.node.help")
    }

    override fun invoke(project: Project, file: PsiFile, editor: Editor?, startElement: PsiElement, endElement: PsiElement) {
        for (item in todo) {
            item.delete()
        }
    }

    override fun getIcon(flags: Int): Icon {
        return AllIcons.CodeWithMe.CwmTerminate
    }

    override fun getPriority(): PriorityAction.Priority {
        return PriorityAction.Priority.LOW
    }
}

