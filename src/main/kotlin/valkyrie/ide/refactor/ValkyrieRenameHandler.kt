package valkyrie.ide.refactor

import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.ScrollType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType
import com.intellij.refactoring.rename.RenameHandler
import com.intellij.refactoring.util.CommonRefactoringUtil
import yggdrasil.antlr.YggdrasilLexer
import yggdrasil.language.file.NexusFileNode

//import nexus.language.psi.ValkyrieTypes

class ValkyrieRenameHandler : RenameHandler {
    override fun invoke(project: Project, editor: Editor?, file: PsiFile?, dataContext: DataContext?) {
        if (file !is NexusFileNode || editor == null) {
            return
        }
        val offset = editor.caretModel.offset
        editor.scrollingModel.scrollToCaret(ScrollType.MAKE_VISIBLE)
        val element = file.findElementAt(offset) ?: return
        if (YggdrasilLexer.Keywords.contains(element.elementType)) {
            val message = yggdrasil.language.YggdrasilBundle.message("rename.invalid.keyword", element.elementType!!)
            CommonRefactoringUtil.showErrorHint(project, editor, message, "getTitle", "getHelpId")
        } else if (YggdrasilLexer.Identifiers.contains(element.elementType)) {
            invoke(project, arrayOf(element), dataContext)
        } else {

        }

    }

    override fun invoke(project: Project, elements: Array<out PsiElement>, dataContext: DataContext?) {
        println("invoke2($elements, $dataContext)")
//        val file = CommonDataKeys.PSI_FILE.getData(dataContext!!)
//        val editor = CommonDataKeys.EDITOR.getData(dataContext!!)
//        showDialog(project, elements[0], editor, file, dataContext)
    }

    override fun isAvailableOnDataContext(dataContext: DataContext): Boolean {
        return true
    }

    override fun isRenaming(dataContext: DataContext): Boolean {
        return super.isRenaming(dataContext)
    }
}