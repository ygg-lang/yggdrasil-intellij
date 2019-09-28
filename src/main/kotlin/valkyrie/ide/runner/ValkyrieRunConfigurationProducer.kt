package valkyrie.ide.runner

import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.LazyRunConfigurationProducer
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiElement

class ValkyrieRunConfigurationProducer : LazyRunConfigurationProducer<ValkyrieRunningTask>() {
    override fun getConfigurationFactory(): ValkyrieConfigurationFactory {
        return ValkyrieConfigurationFactory(ValkyrieConfigurationType())
    }

    /**
     * @return 点击运行按钮之后的效果
     */
    override fun setupConfigurationFromContext(
        configuration: ValkyrieRunningTask,
        context: ConfigurationContext,
        sourceElement: Ref<PsiElement>,
    ): Boolean {
        return true;

    }


    override fun isConfigurationFromContext(configuration: ValkyrieRunningTask, context: ConfigurationContext): Boolean {
        TODO("Not yet implemented")
    }

}


