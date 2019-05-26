package com.github.voml.voml_intellij.ide

import com.github.voml.voml_intellij.ide.colors.VomlColor
import com.github.voml.voml_intellij.language.VomlLexerAdapter
import com.github.voml.voml_intellij.language.psi.VomlTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class VomlSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return VomlLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): VomlColor? {
        return when (tokenType) {
            //
            VomlTypes.INCLUDE, VomlTypes.INHERIT, VomlTypes.AS -> VomlColor.KEYWORD
            VomlTypes.ANNOTATION, VomlTypes.ANNOTATION_MARK -> VomlColor.ANNOTATION
            VomlTypes.PREDEFINED_SYMBOL -> VomlColor.PREDEFINED
            //
            VomlTypes.STRING_PREFIX -> VomlColor.STRING_HINT
            VomlTypes.NUMBER_SUFFIX -> VomlColor.NUMBER_HINT
            VomlTypes.TYPE_HINT -> VomlColor.TYPE_HINT
            VomlTypes.SCOPE_SYMBOL -> VomlColor.SCOPE_SYMBOL
            VomlTypes.SCOPE_MARK -> VomlColor.SCOPE_MARK
            VomlTypes.INSERT_DOT, VomlTypes.INSERT_STAR -> VomlColor.INSERT_MARK
            //
            VomlTypes.PARENTHESIS_L, VomlTypes.PARENTHESIS_R -> VomlColor.PARENTHESES
            VomlTypes.BRACKET_L, VomlTypes.BRACKET_R -> VomlColor.BRACKETS
            VomlTypes.BRACE_L, VomlTypes.BRACE_R -> VomlColor.BRACES
            VomlTypes.COLON, VomlTypes.EQ -> VomlColor.SET
            VomlTypes.COMMA -> VomlColor.COMMA
            // atom
            VomlTypes.NULL -> VomlColor.NULL
            VomlTypes.BOOLEAN -> VomlColor.BOOLEAN

            VomlTypes.NUMBER_SUFFIX -> VomlColor.NUMBER_HINT
            VomlTypes.INTEGER -> VomlColor.INTEGER
            VomlTypes.DECIMAL -> VomlColor.DECIMAL

            VomlTypes.STRING_PREFIX -> VomlColor.STRING_HINT
            VomlTypes.STRING_INLINE -> VomlColor.STRING
            VomlTypes.STRING_MULTI -> VomlColor.STRING

            VomlTypes.SYMBOL -> VomlColor.IDENTIFIER
            // 注释
            VomlTypes.COMMENT -> VomlColor.LINE_COMMENT
            VomlTypes.BLOCK_COMMENT -> VomlColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> VomlColor.BAD_CHARACTER
            else -> null
        }
    }
}
