package nexus.language.file

import com.intellij.ide.projectView.ProjectViewNestingRulesProvider
import com.intellij.ide.projectView.ProjectViewNestingRulesProvider.Consumer
import org.jetbrains.annotations.NotNull

class NexusFileGroup : ProjectViewNestingRulesProvider {
    override fun addFileNestingRules(@NotNull consumer: Consumer) {
        consumer.addNestingRule(".ne", ".js")
        consumer.addNestingRule(".ne", ".cs")
        consumer.addNestingRule(".ne", ".md")
    }
}