package valkyrie.ide.actions

import com.intellij.codeInspection.HintAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiFile
import yggdrasil.language.ast.YggdrasilFunctionParameter
import yggdrasil.language.file.YggdrasilIconProvider
//import nexus.language.psi_node.ValkyrieDefineItemNode
import javax.swing.Icon

class InferDefineReturnEffect(private val element: YggdrasilFunctionParameter) : HintAction, Iconable {
    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getText(): String {
        return "Infer define parameter's type"
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
        return YggdrasilIconProvider.Instance.IMPORT
    }
}

