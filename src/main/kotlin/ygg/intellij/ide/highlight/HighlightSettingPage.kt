package ygg.intellij.ide.highlight


import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import ygg.intellij.language.file.YggdrasilIcon

class HighlightSettingPage : ColorSettingsPage {
    override fun getAttributeDescriptors() = HighlightColor.values().map { it.attributesDescriptor }.toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = "Yggdrasil"

    override fun getIcon() = YggdrasilIcon.FILE

    override fun getHighlighter() = HighlightToken()

    override fun getDemoText() = javaClass.getResource("/fileTemplates/demoColor.rmb")!!.readText()

    override fun getAdditionalHighlightingTagToDescriptorMap() =
        HighlightColor.values().associateBy({ it.name }, { it.textAttributesKey })
}
