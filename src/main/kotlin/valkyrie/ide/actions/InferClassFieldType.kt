package valkyrie.ide.actions

//import nexus.language.psi_node.ValkyrieClassFieldNode
import com.intellij.codeInspection.HintAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiFile
import nexus.language.ast.classes.NexusClassFieldNode
import nexus.language.file.NexusIconProvider
import javax.swing.Icon

class InferClassFieldType(private val element: NexusClassFieldNode) : HintAction, Iconable {
    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getText(): String {
        return "Infer class field's type"
    }

    override fun getFamilyName(): String {
        return "getFamilyName"
    }

    override fun isAvailable(project: Project, editor: Editor?, file: PsiFile?): Boolean {
        return true
    }

    override fun invoke(project: Project, editor: Editor?, file: PsiFile?) {

    }

    override fun showHint(editor: Editor): Boolean {
        return true
    }

    override fun getIcon(flags: Int): Icon {
        return NexusIconProvider.Instance.TYPE
    }
}

