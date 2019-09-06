package ygg.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import ygg.intellij.language.YggdrasilLanguage

data class FormatContext(val commonSettings: CommonCodeStyleSettings, val spacingBuilder: SpacingBuilder) {
    companion object {
        fun create(settings: CodeStyleSettings): FormatContext {
            val commonSettings = settings.getCommonSettings(YggdrasilLanguage)
            return FormatContext(commonSettings, createSpacingBuilder(commonSettings))
        }
    }
}