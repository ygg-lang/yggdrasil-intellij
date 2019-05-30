package com.github.ygg_lang.ygg_intellij.ide

import com.github.ygg_lang.ygg_intellij.ide.colors.YggColor
import com.github.ygg_lang.ygg_intellij.language.YggLexerAdapter
import com.github.ygg_lang.ygg_intellij.language.psi.YggTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class YggSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return YggLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): YggColor? {
        return when (tokenType) {
            //
            YggTypes.IMPORT, YggTypes.GRAMMAR, YggTypes.IGNORE, YggTypes.AS -> YggColor.KEYWORD
            YggTypes.ANNOTATION, YggTypes.ANNOTATION_MARK -> YggColor.ANNOTATION
            YggTypes.PREDEFINED_SYMBOL -> YggColor.PREDEFINED
            //
            YggTypes.STRING_PREFIX -> YggColor.STRING_HINT
            YggTypes.NUMBER_SUFFIX -> YggColor.NUMBER_HINT
            YggTypes.TYPE_HINT -> YggColor.TYPE_HINT
            YggTypes.RULE_SYMBOL -> YggColor.SCOPE_SYMBOL
            YggTypes.SCOPE_MARK -> YggColor.SCOPE_MARK
            YggTypes.INSERT_DOT, YggTypes.INSERT_STAR -> YggColor.INSERT_MARK
            //
            YggTypes.PARENTHESIS_L, YggTypes.PARENTHESIS_R -> YggColor.PARENTHESES
            YggTypes.BRACKET_L, YggTypes.BRACKET_R -> YggColor.BRACKETS
            YggTypes.BRACE_L, YggTypes.BRACE_R -> YggColor.BRACES
            YggTypes.COLON, YggTypes.EQ -> YggColor.SET
            YggTypes.COMMA -> YggColor.COMMA
            // atom
            YggTypes.NULL -> YggColor.NULL
            YggTypes.BOOLEAN -> YggColor.BOOLEAN

            YggTypes.NUMBER_SUFFIX -> YggColor.NUMBER_HINT
            YggTypes.INTEGER -> YggColor.INTEGER
            YggTypes.DECIMAL -> YggColor.DECIMAL

            YggTypes.STRING_PREFIX -> YggColor.STRING_HINT
            YggTypes.STRING_INLINE -> YggColor.STRING
            YggTypes.STRING_MULTI -> YggColor.STRING

            YggTypes.SYMBOL -> YggColor.IDENTIFIER
            // 注释
            YggTypes.COMMENT -> YggColor.LINE_COMMENT
            YggTypes.BLOCK_COMMENT -> YggColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> YggColor.BAD_CHARACTER
            else -> null
        }
    }
}
