package valkyrie.ide.runner

//import nexus.language.psi_node.ValkyrieClassStatementNode
import com.intellij.execution.lineMarker.RunLineMarkerContributor.Info
import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.classes.YggdrasilClassStatement


class RunClassGroup : ActionGroup() {
    private val name: String = ""

    init {
        templatePresentation.isPopupGroup = false
        templatePresentation.icon = AllIcons.RunConfigurations.TestState.Run_run
        templatePresentation.text = yggdrasil.language.YggdrasilBundle.message("action.run.class.group.name")
        templatePresentation.description = yggdrasil.language.YggdrasilBundle.message("action.run.class.group.help")
    }

    companion object {
        fun markClass(element: PsiElement): Info? {
            if (element !is YggdrasilClassStatement) return null;
            return Info(RunClass(listOf("element"), false))
        }

//        fun markExtends(element: PsiElement): Info? {
//            if (element !is ValkyrieExtendsStatementNode) return null;
//            return Info(RunClassGroup())
//        }
    }

    override fun actionPerformed(event: AnActionEvent) {

    }

    override fun getChildren(e: AnActionEvent?): Array<AnAction> {
        return arrayOf(RunClass(listOf(name), true), RunClass(listOf(name), false))
    }
}
