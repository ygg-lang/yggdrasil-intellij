package valkyrie.ide.actions.ast_transform

//import nexus.language.psi_node.ValkyrieIfStatementNode
import com.intellij.codeInsight.intention.PriorityAction
import com.intellij.codeInspection.LocalQuickFixAndIntentionActionOnPsiElement
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import nexus.language.ast.ValkyrieIfStatementNode
import javax.swing.Icon

class ToModernIf(element: ValkyrieIfStatementNode) : LocalQuickFixAndIntentionActionOnPsiElement(element), PriorityAction, Iconable {
    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getFamilyName(): String {
        return "getFamilyName"
    }

    override fun getText(): String {
        return nexus.language.NexusBundle.message("action.convert.modern_if.name")
    }

    fun getDescription(): String {
        return nexus.language.NexusBundle.message("action.convert.modern_if.help")
    }

    override fun invoke(project: Project, file: PsiFile, editor: Editor?, startElement: PsiElement, endElement: PsiElement) {

    }

    override fun getIcon(flags: Int): Icon {
        return AllIcons.Nodes.Deploy
    }

    override fun getPriority(): PriorityAction.Priority {
        return PriorityAction.Priority.LOW
    }
}

