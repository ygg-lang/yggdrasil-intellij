package valkyrie.ide.project

import com.intellij.ide.util.projectWizard.ModuleWizardStep
//import valkyrie.ide.project.crate.ValkyrieModuleType
import javax.swing.JComponent
import javax.swing.JLabel


private class ValkyrieModuleWizardSteps : ModuleWizardStep() {
    override fun getComponent(): JComponent {
        return JLabel("Put your content here")
    }

    override fun updateDataModel() {

    }
}