package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase.pack
import com.intellij.psi.tree.IElementType
import yggdrasil.psi.ParserDefinition
import yggdrasil.psi.YggdrasilTypes.*

class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return ParserDefinition.createLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): HighlightColor? {
        return when (tokenType) {
            KW_GRAMMAR, KW_CLASS, KW_UNION, KW_GROUP,
//            KW_INCLUDE, KW_USE, KW_IMPORT, KW_EXPORT, KW_AS,
//            KW_TYPE, KW_RESOURCE, KW_RECORD, KW_VARIANT, KW_FLAGS, KW_ENUM,
//            KW_FUNCTION, KW_CONSTRUCTOR,
            -> HighlightColor.KEYWORD
//
//            PARENTHESIS_L, PARENTHESIS_R -> YggdrasilHighlightColor.PARENTHESES
//            BRACKET_L, BRACKET_R -> YggdrasilHighlightColor.BRACKETS
//            BRACE_L, BRACE_R -> YggdrasilHighlightColor.BRACES
//            COLON, EQ -> YggdrasilHighlightColor.OPERATION
//            AT, STAR -> YggdrasilHighlightColor.OPERATION
//
//            COMMA -> YggdrasilHighlightColor.COMMA
//            // atom
//            VERSION -> YggdrasilHighlightColor.NUMBER
//
//            SELECTION_LINE -> YggdrasilHighlightColor.TEXT
//            STRING_QUOTE, STRING_CHAR -> YggdrasilHighlightColor.STRING
//            STRING_ESCAPE -> YggdrasilHighlightColor.STRING_ESCAPED
////            STRING -> AwslColor.STRING
//            SYMBOL -> YggdrasilHighlightColor.IDENTIFIER
//            // 注释
//            COMMENT_LINE -> YggdrasilHighlightColor.LINE_COMMENT
//            COMMENT_BLOCK -> YggdrasilHighlightColor.BLOCK_COMMENT
//            COMMENT_DOCUMENT -> YggdrasilHighlightColor.DOC_COMMENT
                // 错误
//            TokenType.BAD_CHARACTER -> YggdrasilHighlightColor.BAD_CHARACTER

            else -> null
        }
    }
}
