package valkyrie.ide.runner

import com.intellij.execution.configurations.RunConfigurationsSettings
import com.intellij.openapi.options.UnnamedConfigurable
import javax.swing.JComponent

class ValkyrieRunnerSettings : RunConfigurationsSettings {
    override fun createConfigurable(): UnnamedConfigurable {
        return RunnerSettingPanel()
    }
}

private class RunnerSettingPanel : UnnamedConfigurable {
    override fun createComponent(): JComponent? {
        TODO("Not yet implemented")
    }

    override fun isModified(): Boolean {
        TODO("Not yet implemented")
    }

    override fun apply() {
        TODO("Not yet implemented")
    }

}