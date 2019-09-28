package valkyrie.ide.runner

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.impl.RunConfigurationLevel
import com.intellij.execution.impl.RunConfigurationTemplateProvider
import com.intellij.execution.impl.RunManagerImpl
import com.intellij.execution.impl.RunnerAndConfigurationSettingsImpl

class ValkyrieRunningTemplateProvider : RunConfigurationTemplateProvider {
    override fun getRunConfigurationTemplate(factory: ConfigurationFactory, runManager: RunManagerImpl): RunnerAndConfigurationSettingsImpl? {
        if (factory !is ValkyrieConfigurationFactory) return null
        return RunnerAndConfigurationSettingsImpl(
            runManager,
            ValkyrieRunningTask(runManager.project, factory),
            false,
            RunConfigurationLevel.PROJECT
        )
    }
}

