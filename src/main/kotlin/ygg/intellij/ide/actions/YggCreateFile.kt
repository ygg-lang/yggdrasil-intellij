package ygg.intellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import ygg.intellij.YggdrasilBundle
import ygg.intellij.YggdrasilLanguage
import ygg.intellij.language.file.YggIconProvider

class YggCreateFile : CreateFileFromTemplateAction(Name, Description, YggIconProvider.FILE) {
    companion object {
        val Name = YggdrasilLanguage.id
        const val TemplateName = "Voml File";
        val Description = YggdrasilBundle.message("action.create.description")
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(Name).addKind("Empty file", YggIconProvider.FILE, TemplateName)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = Name
}
