package valkyrie.ide.highlight

import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import yggdrasil.language.file.YggdrasilIconProvider

class HighlightSetting : ColorSettingsPage {
    private val annotatorTags = HighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = HighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = yggdrasil.language.YggdrasilBundle.message("filetype.name")

    override fun getIcon() = YggdrasilIconProvider.Instance.File

    override fun getHighlighter() = TokenHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText(): String {
        val file = javaClass.getResource("/templates/code-highlight.ne");
        return file?.readText() ?: ""
    }
}

