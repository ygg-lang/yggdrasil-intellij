package valkyrie.ide.runner

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class ValkyrieConfigurationFactory(type: ValkyrieConfigurationType) : ConfigurationFactory(type) {
    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return ValkyrieRunningTask(project, this)
    }

    override fun getId(): String {
        return "valkyrie.running";
    }

    override fun createConfiguration(name: String?, template: RunConfiguration): RunConfiguration {
        return super.createConfiguration(name, template)
    }
}