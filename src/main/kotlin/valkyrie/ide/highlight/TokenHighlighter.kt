package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import yggdrasil.antlr.NexusLexer
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.matcher.ValkyrieBracketMatch


class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return NexusLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        val key = getTokenColor(tokenType);
        return if (key == null) {
            TextAttributesKey.EMPTY_ARRAY
        } else {
            arrayOf(key)
        }
    }

    private fun getTokenColor(tokenType: IElementType): TextAttributesKey? {
        val hash = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        return when {
            NexusLexer.Keywords.contains(tokenType) -> NexusHighlightColor.KEYWORD.textAttributesKey
            NexusLexer.Operators.contains(tokenType) -> DefaultLanguageHighlighterColors.OPERATION_SIGN
            NexusLexer.MacroOperators.contains(tokenType) -> NexusHighlightColor.SYM_MACRO.textAttributesKey
            NexusLexer.Integers.contains(tokenType) -> NexusHighlightColor.INTEGER.textAttributesKey
            NexusLexer.Decimals.contains(tokenType) -> NexusHighlightColor.DECIMAL.textAttributesKey
            NexusLexer.Strings.contains(tokenType) -> NexusHighlightColor.STRING.textAttributesKey
            NexusLexer.Comments.contains(tokenType) -> DefaultLanguageHighlighterColors.LINE_COMMENT
            // inherit
            NexusLexer.Comma.contains(tokenType) -> DefaultLanguageHighlighterColors.COMMA
            NexusLexer.Semicolon.contains(tokenType) -> DefaultLanguageHighlighterColors.SEMICOLON
            NexusLexer.Escapes.contains(tokenType) -> NexusHighlightColor.STRING_ESCAPED.textAttributesKey

            else -> {
                when (tokenType) {
                    ValkyrieBracketMatch.Instance.ParenthesisL, ValkyrieBracketMatch.Instance.ParenthesisR -> DefaultLanguageHighlighterColors.PARENTHESES
                    ValkyrieBracketMatch.Instance.BracketL, ValkyrieBracketMatch.Instance.BracketR -> DefaultLanguageHighlighterColors.BRACKETS
                    ValkyrieBracketMatch.Instance.BraceL, ValkyrieBracketMatch.Instance.BraceR -> DefaultLanguageHighlighterColors.BRACES
                    //
//                    COLON, OP_SET -> ValkyrieHighlightColor.ASSIGN
                    // 原子类型
//                    BYTE -> ValkyrieHighlightColor.INTEGER
//                    COLOUR -> ValkyrieHighlightColor.INTEGER
//                    NUMBER_SUFFIX -> ValkyrieHighlightColor.OP_NUMBER
                    // 错误
                    TokenType.BAD_CHARACTER -> com.intellij.openapi.editor.HighlighterColors.BAD_CHARACTER
                    else -> null
                }
            }
        }
    }
}
