package ygg.intellij.ide.highlight


import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import ygg.intellij.ide.file_view.YggIconProvider

class YggHighlightSettingPage : ColorSettingsPage {
    private val attrs = YggHighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    private val annotatorTags = YggHighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = attrs

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = ygg.intellij.YggBundle.message("filetype.name")

    override fun getIcon() = YggIconProvider.FILE

    override fun getHighlighter() = YggHighlightToken()

    override fun getDemoText() =
        """@grammar <PREDEFINED>ygg</PREDEFINED> {"*.yg","*.ygg", "*.grammar"};

// Import the predefined types,
// Otherwise the `String` type of each language will be used directly to represent the atomic expression
@import "literal_types.toml";

@ignore {NEWLINE, WHITESPACE, COMMENT}
"""

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags
}
