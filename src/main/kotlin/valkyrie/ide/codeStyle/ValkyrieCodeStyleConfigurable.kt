package valkyrie.ide.codeStyle

import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.GenerationCodeStylePanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleSettings
import javax.swing.JComponent

class ValkyrieCodeStyleConfigurable(settings: CodeStyleSettings, modelSettings: CodeStyleSettings) :
    CodeStyleAbstractConfigurable(settings, modelSettings, nexus.language.NexusLanguage.displayName) {
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun createComponent(): JComponent? {
        return super.createComponent()
    }

    override fun createPanel(settings: CodeStyleSettings): CodeStyleAbstractPanel {
        return ValkyrieCodeStyleMainPanel(currentSettings, settings)
    }
}

private class ValkyrieCodeStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings) :
    TabbedLanguageCodeStylePanel(nexus.language.NexusLanguage, currentSettings, settings) {
    override fun initTabs(settings: CodeStyleSettings) {
//        addIndentOptionsTab(settings)
//        addWrappingAndBracesTab(settings)
        addTab(GenerationCodeStylePanel(settings, nexus.language.NexusLanguage))
    }
}
