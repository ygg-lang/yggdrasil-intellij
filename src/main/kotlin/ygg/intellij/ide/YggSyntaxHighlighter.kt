package ygg.intellij.ide

import ygg.intellij.language.psi.YggTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import ygg.intellij.ide.colors.YggColor
import ygg.intellij.language.YggLexerAdapter
import ygg.intellij.language.psi.YggTypes.*

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
            IMPORT, GRAMMAR, IGNORE, AS -> YggColor.KEYWORD
            ANNOTATION, ANNOTATION_MARK -> YggColor.ANNOTATION
            PREDEFINED_SYMBOL -> YggColor.PREDEFINED
            //
            STRING_PREFIX -> YggColor.STRING_HINT
            NUMBER_SUFFIX -> YggColor.NUMBER_HINT
            TYPE_HINT -> YggColor.TYPE_HINT
            RULE_SYMBOL -> YggColor.SCOPE_SYMBOL
            SCOPE_MARK -> YggColor.SCOPE_MARK
            INSERT_DOT, INSERT_STAR -> YggColor.INSERT_MARK
            //
            PARENTHESIS_L, PARENTHESIS_R -> YggColor.PARENTHESES
            BRACKET_L, BRACKET_R -> YggColor.BRACKETS
            BRACE_L, BRACE_R -> YggColor.BRACES
            COLON, EQ -> YggColor.SET
            COMMA -> YggColor.COMMA
            // atom
            NULL -> YggColor.NULL
            BOOLEAN -> YggColor.BOOLEAN

            NUMBER_SUFFIX -> YggColor.NUMBER_HINT
            INTEGER -> YggColor.INTEGER
            DECIMAL -> YggColor.DECIMAL

            STRING_PREFIX -> YggColor.STRING_HINT
            STRING_INLINE -> YggColor.STRING
            STRING_MULTI -> YggColor.STRING

            SYMBOL -> YggColor.IDENTIFIER
            // 注释
            COMMENT -> YggColor.LINE_COMMENT
            BLOCK_COMMENT -> YggColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> YggColor.BAD_CHARACTER
            else -> null
        }
    }
}
