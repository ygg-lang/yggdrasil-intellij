package ygg.intellij.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import ygg.intellij.language.YggLexerAdapter
import ygg.intellij.language.psi.YggTypes.*
import ygg.intellij.ide.highlight.YggHighlightColor as Color

class YggHighlightToken : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return YggLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): Color? {
        return when (tokenType) {
            //
            IMPORT, GRAMMAR, IGNORE, AS -> Color.KEYWORD
            ANNOTATION, ANNOTATION_MARK -> Color.ANNOTATION
            GRAMMAR, IGNORE, IMPORT -> Color.PREDEFINED
            OPTIONAL, -> Color.KEYWORD
            //
            NUMBER_SUFFIX -> Color.NUMBER_HINT
            TYPE_HINT -> Color.TYPE_HINT
            RULE_SYMBOL -> Color.SCOPE_SYMBOL
            SCOPE_MARK -> Color.SCOPE_MARK
            INSERT_DOT, INSERT_STAR -> Color.INSERT_MARK
            //
            PARENTHESIS_L, PARENTHESIS_R -> Color.PARENTHESES
            BRACKET_L, BRACKET_R -> Color.BRACKETS
            BRACE_L, BRACE_R -> Color.BRACES
            COLON, EQ -> Color.SET
            COMMA -> Color.COMMA
            // atom
            NULL -> Color.NULL
            BOOLEAN -> Color.BOOLEAN
            STRING, STRING_QUOTE -> Color.STRING
            NUMBER_SUFFIX -> Color.NUMBER_HINT
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
