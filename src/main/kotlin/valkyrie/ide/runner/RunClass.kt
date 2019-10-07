package valkyrie.ide.runner

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.ui.Messages


class RunClass(val classPath: List<String>, private val full: Boolean) : AnAction() {
    init {
        if (full) {
            templatePresentation.text = yggdrasil.language.YggdrasilBundle.message("action.run.class.full.name")
            templatePresentation.description = yggdrasil.language.YggdrasilBundle.message("action.run.class.full.help")
        } else {
            templatePresentation.text = yggdrasil.language.YggdrasilBundle.message("action.run.class.part.name")
            templatePresentation.description = yggdrasil.language.YggdrasilBundle.message("action.run.class.part.help")
        }
        templatePresentation.icon = AllIcons.RunConfigurations.TestState.Run_run
    }

    override fun actionPerformed(event: AnActionEvent) {
        val message = StringBuilder(event.presentation.text + " Selected!")
        val selectedElement = event.getData(CommonDataKeys.NAVIGATABLE)
        if (selectedElement != null) {
            message.append("\nSelected Element: ").append(selectedElement)
        }
        Messages.showMessageDialog(
            event.project,
            message.toString(),
            "RunClass.actionPerformed",
            Messages.getInformationIcon()
        )
    }

    override fun displayTextInToolbar(): Boolean {
        return true
    }

    override fun getTemplateText(): String? {
        return "RunFile.getTemplateText"
    }
}