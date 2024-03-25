package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase.pack
import com.intellij.psi.tree.IElementType
import yggdrasil.psi.ParserDefinition
import yggdrasil.psi.YggdrasilTypes
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
            COLON, EQ -> HighlightColor.OPERATION
            OP_OR, OP_CONCAT -> HighlightColor.OPERATION
            OP_OPTIONAL, OP_MANY, OP_MANY1 -> HighlightColor.OPERATION


//
//            SELECTION_LINE -> YggdrasilHighlightColor.TEXT
            TEXT_SINGLE, TEXT_DOUBLE -> HighlightColor.STRING
            ESCAPED -> HighlightColor.STRING_ESCAPED
            INTEGER -> HighlightColor.INTEGER
//            // 注释
            COMMENT_LINE -> HighlightColor.COMMENT_LINE
            COMMENT_BLOCK -> HighlightColor.COMMENT_BLOCK
//            COMMENT_DOCUMENT -> YggdrasilHighlightColor.DOC_COMMENT
            // 错误
//            TokenType.BAD_CHARACTER -> YggdrasilHighlightColor.BAD_CHARACTER

            else -> null
        }
    }
}
