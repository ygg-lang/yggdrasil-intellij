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

class InsertElseIf(element: PsiElement, private val above: Boolean) : LocalQuickFixAndIntentionActionOnPsiElement(element), PriorityAction,
    Iconable {
    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getFamilyName(): String {
        return "getFamilyName"
    }

    override fun getText(): String {
        return if (above) nexus.language.NexusBundle.message("action.insert.else_if.above.name") else nexus.language.NexusBundle.message("action.insert.else_if.below.name")
    }

    fun getDescription(): String {
        return if (above) nexus.language.NexusBundle.message("action.insert.else_if.above.help") else nexus.language.NexusBundle.message("action.insert.else_if.below.help")
    }

    override fun invoke(project: Project, file: PsiFile, editor: Editor?, startElement: PsiElement, endElement: PsiElement) {

    }

    override fun getIcon(flags: Int): Icon {
        return AllIcons.Nodes.EntryPoints
    }

    override fun getPriority(): PriorityAction.Priority {
        return PriorityAction.Priority.LOW
    }
}

