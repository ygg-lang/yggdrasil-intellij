package ygg.intellij.ide.highlight

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts
import ygg.intellij.YggBundle
import java.util.function.Supplier
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default


enum class YggHighlightColor(
    humanName: Supplier<@NlsContexts.AttributeDescriptor String>,
    default: TextAttributesKey? = null,
) {
    // 特殊关键词
    KEYWORD(YggBundle.messagePointer("color.settings.toml.keyword"), Default.KEYWORD),
    EXTENSION(OptionsBundle.messagePointer("options.language.defaults.metadata"), Default.METADATA),

    // 字面量
    NULL(YggBundle.messagePointer("color.settings.voml.null"), Default.KEYWORD),
    BOOLEAN(YggBundle.messagePointer("color.token.boolean"), Default.KEYWORD),
    NUMBER_HINT(YggBundle.messagePointer("color.settings.toml.number_hint"), Default.METADATA),
    DECIMAL(YggBundle.messagePointer("color.literal.decimal"), Default.NUMBER),
    INTEGER(YggBundle.messagePointer("color.literal.integer"), Default.NUMBER),
    STRING_HINT(YggBundle.messagePointer("color.settings.toml.string_hint"), Default.KEYWORD),
    STRING(OptionsBundle.messagePointer("options.language.defaults.string"), Default.STRING),
    IDENTIFIER(OptionsBundle.messagePointer("options.language.defaults.identifier"), Default.IDENTIFIER),

    //
    TYPE_HINT(YggBundle.messagePointer("color.settings.toml.type_hint"), Default.CLASS_NAME),
    KEY_SYMBOL(YggBundle.messagePointer("color.symbol.builtin"), Default.STATIC_FIELD),
    SCOPE_SYMBOL(YggBundle.messagePointer("color.symbol.scope"), Default.STATIC_METHOD),
    SCOPE_MARK(YggBundle.messagePointer("color.settings.voml.scope_mark"), KEYWORD.textAttributesKey),
    INSERT_MARK(YggBundle.messagePointer("color.settings.voml.insert_mark"), KEYWORD.textAttributesKey),
    ANNOTATION(OptionsBundle.messagePointer("options.java.attribute.descriptor.annotation.name"), Default.METADATA),
    PREDEFINED(OptionsBundle.messagePointer("options.language.defaults.predefined"), Default.PREDEFINED_SYMBOL),

    // 标点符号
    PARENTHESES(OptionsBundle.messagePointer("options.language.defaults.parentheses"), Default.PARENTHESES),
    BRACKETS(OptionsBundle.messagePointer("options.language.defaults.brackets"), Default.BRACKETS),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), Default.BRACES),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), Default.DOT),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), Default.COMMA),
    SEMICOLON(OptionsBundle.messagePointer("options.language.defaults.semicolon"), Default.SEMICOLON),
    SET(YggBundle.messagePointer("color.token.set"), Default.OPERATION_SIGN),

    // 注释
    COMMENT_INLINE(OptionsBundle.messagePointer("options.language.defaults.line.comment"), Default.LINE_COMMENT),
    COMMENT_BLOCK(OptionsBundle.messagePointer("options.language.defaults.block.comment"), Default.BLOCK_COMMENT),
    COMMENT_DOCUMENT(OptionsBundle.messagePointer("options.language.defaults.block.comment"),
        Default.DOC_COMMENT_MARKUP),

    // 错误
    BAD_CHARACTER(OptionsBundle.messagePointer("options.java.attribute.descriptor.bad.character"),
        HighlighterColors.BAD_CHARACTER),
    ;


    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("ygg.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
