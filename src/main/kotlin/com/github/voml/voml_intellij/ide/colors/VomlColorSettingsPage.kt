package com.github.voml.voml_intellij.ide.colors

import com.github.voml.voml_intellij.ide.VomlSyntaxHighlighter
import com.github.voml.voml_intellij.ide.icons.VomlIcons
import com.github.voml.voml_intellij.language.VomlBundle
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class VomlColorSettingsPage : ColorSettingsPage {
    private val attrs = VomlColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    private val annotatorTags = VomlColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = attrs

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() =  VomlBundle.message("filetype.voml.name")

    override fun getIcon() = VomlIcons.FILE

    override fun getHighlighter() = VomlSyntaxHighlighter()

    override fun getDemoText() =
"""<KEYWORD>@inherit</KEYWORD> <PREDEFINED>user</PREDEFINED>;

@include <STRING_HINT>json</STRING_HINT> <STRING>"some/path/test.json"</STRING> <KEYWORD>as</KEYWORD> <KEY_SYMBOL>json</KEY_SYMBOL>;
@include <STRING>"https://example.org/test.voml"</STRING> {
	<KEY_SYMBOL>external_key</KEY_SYMBOL> <KEYWORD>as</KEYWORD> <KEY_SYMBOL>external</KEY_SYMBOL>
}

[<SCOPE_SYMBOL>literals</SCOPE_SYMBOL>]
<KEY_SYMBOL>boolean</KEY_SYMBOL> = [true, false]
<KEY_SYMBOL>integer</KEY_SYMBOL> = <INTEGER>10</INTEGER><NUMBER_HINT>cm</NUMBER_HINT>
<KEY_SYMBOL>decimal</KEY_SYMBOL> = <DECIMAL>0.1</DECIMAL><NUMBER_HINT>m</NUMBER_HINT>
<KEY_SYMBOL>string</KEY_SYMBOL>  = <STRING>"string"</STRING>
<KEY_SYMBOL>escape</KEY_SYMBOL>  = <STRING>"\n"</STRING>

[<SCOPE_SYMBOL>keywords</SCOPE_SYMBOL>]
// remove this key-value pair
<KEY_SYMBOL>key</KEY_SYMBOL> = <NULL>null</NULL>

[<SCOPE_SYMBOL>scopes</SCOPE_SYMBOL>]
	[<SCOPE_MARK>></SCOPE_MARK><SCOPE_SYMBOL>a1</SCOPE_SYMBOL>] // Increase scope level
	<KEY_SYMBOL>key1</KEY_SYMBOL> = <STRING>"scopes.a1.key1"</STRING>
	[<SCOPE_MARK>^</SCOPE_MARK><SCOPE_SYMBOL>a2</SCOPE_SYMBOL>] // Maintain scope level
	<KEY_SYMBOL>key2</KEY_SYMBOL> = <STRING>"scopes.a2.key2"</STRING>
		[<SCOPE_MARK>></SCOPE_MARK><SCOPE_SYMBOL>b1</SCOPE_SYMBOL>]
		<KEY_SYMBOL>key3</KEY_SYMBOL> = <STRING>"a.a2.b1.key3"</STRING>
	[<SCOPE_MARK><</SCOPE_MARK>] // Decrease scope level
	<KEY_SYMBOL>key4</KEY_SYMBOL> = <STRING>"scopes.a2.key4"</STRING>
		[<SCOPE_MARK>></SCOPE_MARK><SCOPE_SYMBOL>b1</SCOPE_SYMBOL>]
		<KEY_SYMBOL>key5</KEY_SYMBOL> = <STRING>"a.a2.b1.key5"</STRING>
	[<SCOPE_MARK><</SCOPE_MARK><SCOPE_SYMBOL>a2</SCOPE_SYMBOL>]  // same as [<][^a2]
	<KEY_SYMBOL>key</KEY_SYMBOL> = <STRING>"scopes.a3.key"</STRING>

<SCOPE_MARK>---</SCOPE_MARK> // Back2Top

<KEY_SYMBOL>v</KEY_SYMBOL> = [
	<ANNOTATION>@merge</ANNOTATION>(override)
	<ANNOTATION>@merge_as_source</ANNOTATION>(unset)
	<ANNOTATION>@merge_as_target</ANNOTATION>(ignore)
	<KEY_SYMBOL>a</KEY_SYMBOL> = <TYPE_HINT>Some</TYPE_HINT>(1)
    <KEY_SYMBOL>b</KEY_SYMBOL> = <TYPE_HINT>None</TYPE_HINT>()
]

[<SCOPE_SYMBOL>name</SCOPE_SYMBOL>]
  <INSERT_MARK>.</INSERT_MARK> <KEY_SYMBOL>a</KEY_SYMBOL> = 2
  <INSERT_MARK>*</INSERT_MARK> 1
  <INSERT_MARK>*</INSERT_MARK> [true]
"""

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags
}
