package ygg.intellij.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import ygg.intellij.language.YggLexerAdapter
import ygg.intellij.language.psi.YggTypes.*
import ygg.intellij.ide.highlight.HighlightColor as Color

class HighlightToken : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return YggLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): Color? {
        return when (tokenType) {
            //
            KW_CLASS, KW_UNION, KW_DEFINE -> Color.KEYWORD
            AS -> Color.KEYWORD
            // ANNOTATION, ANNOTATION_MARK -> Color.ANNOTATION
            OPTIONAL -> Color.KEYWORD
            MANY -> Color.MANY
            MANY1 -> Color.MANY1
            //
            // INSERT_DOT, INSERT_STAR -> Color.INSERT_MARK
            //
            PARENTHESIS_L, PARENTHESIS_R -> Color.PARENTHESES
            BRACKET_L, BRACKET_R -> Color.BRACKETS
            BRACE_L, BRACE_R -> Color.BRACES
            COLON, EQ -> Color.SET
            COMMA -> Color.COMMA
            // atom
            BOOLEAN -> Color.BOOLEAN
            STRING_LITERAL, STRING_SQ, STRING_DQ, CHARACTER -> Color.STRING
            ESCAPE_SPECIAL, ESCAPE_UNICODE -> Color.STRING_ESCAPE
            INTEGER -> Color.INTEGER
            DECIMAL -> Color.DECIMAL

            SYMBOL -> Color.IDENTIFIER
            // 注释
            COMMENT_LINE -> Color.COMMENT_INLINE
            COMMENT_BLOCK -> Color.COMMENT_BLOCK
            COMMENT_DOC -> Color.COMMENT_BLOCK
            // 错误
            TokenType.BAD_CHARACTER -> Color.BAD_CHARACTER
            else -> null
        }
    }
}
