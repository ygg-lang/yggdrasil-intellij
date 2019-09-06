package ygg.intellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import ygg.intellij.language.YggdrasilLanguage
import ygg.intellij.language.file.YggdrasilBundle
import ygg.intellij.language.file.YggdrasilIcon

private const val TEMPLATE_NAME = "Voml File"

class YggCreateFile : CreateFileFromTemplateAction(Name, Description, YggdrasilIcon.FILE) {
    companion object {
        val Name = YggdrasilLanguage.id
        val Description = YggdrasilBundle.message("action.create.description")
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(Name).addKind("Empty file", YggdrasilIcon.FILE, TEMPLATE_NAME)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = Name
}
