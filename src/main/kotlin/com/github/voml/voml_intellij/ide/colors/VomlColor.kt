package com.github.voml.voml_intellij.ide.colors

import com.github.voml.voml_intellij.language.VomlBundle
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default
import java.util.function.Supplier


// TODO: 分类
enum class VomlColor(humanName: Supplier<@NlsContexts.AttributeDescriptor String>, default: TextAttributesKey? = null) {
    // 特殊关键词
    KEYWORD(VomlBundle.messagePointer("color.settings.toml.keyword"), Default.KEYWORD),
    // 字面量
    NULL(VomlBundle.messagePointer("color.settings.voml.null"), Default.KEYWORD),
    BOOLEAN(VomlBundle.messagePointer("color.settings.voml.boolean"), Default.KEYWORD),
    NUMBER_HINT(VomlBundle.messagePointer("color.settings.toml.number_hint"), Default.METADATA),
    DECIMAL(VomlBundle.messagePointer("color.settings.toml.decimal"), Default.NUMBER),
    INTEGER(VomlBundle.messagePointer("color.settings.toml.integer"), Default.NUMBER),
    STRING_HINT(VomlBundle.messagePointer("color.settings.toml.string_hint"), Default.KEYWORD),
    STRING(OptionsBundle.messagePointer("options.language.defaults.string"), Default.STRING),
    IDENTIFIER(OptionsBundle.messagePointer("options.language.defaults.identifier"), Default.IDENTIFIER),
    //
    TYPE_HINT(VomlBundle.messagePointer("color.settings.toml.type_hint"), Default.CLASS_NAME),
    KEY_SYMBOL(VomlBundle.messagePointer("color.settings.voml.key_symbol"), Default.STATIC_FIELD),
    SCOPE_SYMBOL(VomlBundle.messagePointer("color.settings.voml.scope_symbol"), Default.STATIC_METHOD),
    SCOPE_MARK(VomlBundle.messagePointer("color.settings.voml.scope_mark"), KEYWORD.textAttributesKey),
    INSERT_MARK(VomlBundle.messagePointer("color.settings.voml.insert_mark"), KEYWORD.textAttributesKey),
    ANNOTATION(OptionsBundle.messagePointer("options.java.attribute.descriptor.annotation.name"), Default.METADATA),
    PREDEFINED(OptionsBundle.messagePointer("options.language.defaults.predefined"), Default.PREDEFINED_SYMBOL),
    // 标点符号
    PARENTHESES(OptionsBundle.messagePointer("options.language.defaults.parentheses"), Default.PARENTHESES),
    BRACKETS(OptionsBundle.messagePointer("options.language.defaults.brackets"), Default.BRACKETS),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), Default.BRACES),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), Default.DOT),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), Default.COMMA),
    SET(VomlBundle.messagePointer("color.settings.voml.set"), Default.OPERATION_SIGN),
    SEMICOLON(OptionsBundle.messagePointer("options.language.defaults.semicolon"), Default.SEMICOLON),
    // 注释
    LINE_COMMENT(OptionsBundle.messagePointer("options.language.defaults.line.comment"), Default.LINE_COMMENT),
    BLOCK_COMMENT(OptionsBundle.messagePointer("options.language.defaults.block.comment"), Default.BLOCK_COMMENT),
    // 错误
    BAD_CHARACTER(OptionsBundle.messagePointer("options.java.attribute.descriptor.bad.character"), HighlighterColors.BAD_CHARACTER),
    // 废弃
    EXTENSION(OptionsBundle.messagePointer("options.language.defaults.metadata"), Default.METADATA),
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("voml.lang.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
