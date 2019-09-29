package valkyrie.ide.runner

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import yggdrasil.language.file.NexusIconProvider
import javax.swing.Icon

class ValkyrieConfigurationType : ConfigurationType {
    override fun getDisplayName(): String {
        return yggdrasil.language.NexusBundle.message("running.group.name")
    }

    override fun getConfigurationTypeDescription(): String {
        return "ValkyrieRunningConfigType.getConfigurationTypeDescription"
    }

    override fun getIcon(): Icon {
        return NexusIconProvider.Instance.Valkyrie
    }

    override fun getId(): String {
        return "valkyrie.script"
    }

    override fun getConfigurationFactories(): Array<ConfigurationFactory> {
        return arrayOf(ValkyrieConfigurationFactory(this))
    }
}