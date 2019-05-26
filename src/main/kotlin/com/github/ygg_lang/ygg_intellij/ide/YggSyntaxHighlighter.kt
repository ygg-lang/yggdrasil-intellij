package com.github.ygg_lang.ygg_intellij.ide

import com.github.ygg_lang.ygg_intellij.ide.colors.VomlColor
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

    private fun getTokenColor(tokenType: IElementType): VomlColor? {
        return when (tokenType) {
            //
            YggTypes.INCLUDE, YggTypes.INHERIT, YggTypes.AS -> VomlColor.KEYWORD
            YggTypes.ANNOTATION, YggTypes.ANNOTATION_MARK -> VomlColor.ANNOTATION
            YggTypes.PREDEFINED_SYMBOL -> VomlColor.PREDEFINED
            //
            YggTypes.STRING_PREFIX -> VomlColor.STRING_HINT
            YggTypes.NUMBER_SUFFIX -> VomlColor.NUMBER_HINT
            YggTypes.TYPE_HINT -> VomlColor.TYPE_HINT
            YggTypes.SCOPE_SYMBOL -> VomlColor.SCOPE_SYMBOL
            YggTypes.SCOPE_MARK -> VomlColor.SCOPE_MARK
            YggTypes.INSERT_DOT, YggTypes.INSERT_STAR -> VomlColor.INSERT_MARK
            //
            YggTypes.PARENTHESIS_L, YggTypes.PARENTHESIS_R -> VomlColor.PARENTHESES
            YggTypes.BRACKET_L, YggTypes.BRACKET_R -> VomlColor.BRACKETS
            YggTypes.BRACE_L, YggTypes.BRACE_R -> VomlColor.BRACES
            YggTypes.COLON, YggTypes.EQ -> VomlColor.SET
            YggTypes.COMMA -> VomlColor.COMMA
            // atom
            YggTypes.NULL -> VomlColor.NULL
            YggTypes.BOOLEAN -> VomlColor.BOOLEAN

            YggTypes.NUMBER_SUFFIX -> VomlColor.NUMBER_HINT
            YggTypes.INTEGER -> VomlColor.INTEGER
            YggTypes.DECIMAL -> VomlColor.DECIMAL

            YggTypes.STRING_PREFIX -> VomlColor.STRING_HINT
            YggTypes.STRING_INLINE -> VomlColor.STRING
            YggTypes.STRING_MULTI -> VomlColor.STRING

            YggTypes.SYMBOL -> VomlColor.IDENTIFIER
            // 注释
            YggTypes.COMMENT -> VomlColor.LINE_COMMENT
            YggTypes.BLOCK_COMMENT -> VomlColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> VomlColor.BAD_CHARACTER
            else -> null
        }
    }
}
