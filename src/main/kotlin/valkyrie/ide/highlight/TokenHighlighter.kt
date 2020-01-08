package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import yggdrasil.antlr.YggdrasilLexer
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.matcher.ValkyrieBracketMatch


class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return YggdrasilLexer()
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
            YggdrasilLexer.Keywords.contains(tokenType) -> YggdrasilHighlightColor.KEYWORD.textAttributesKey
            YggdrasilLexer.Operators.contains(tokenType) -> DefaultLanguageHighlighterColors.OPERATION_SIGN
            YggdrasilLexer.MacroOperators.contains(tokenType) -> YggdrasilHighlightColor.SYM_MACRO.textAttributesKey
            YggdrasilLexer.Integers.contains(tokenType) -> YggdrasilHighlightColor.INTEGER.textAttributesKey
            YggdrasilLexer.Decimals.contains(tokenType) -> YggdrasilHighlightColor.DECIMAL.textAttributesKey
            YggdrasilLexer.Strings.contains(tokenType) -> YggdrasilHighlightColor.STRING.textAttributesKey
            YggdrasilLexer.Comments.contains(tokenType) -> DefaultLanguageHighlighterColors.LINE_COMMENT
            // inherit
            YggdrasilLexer.Comma.contains(tokenType) -> DefaultLanguageHighlighterColors.COMMA
            YggdrasilLexer.Semicolon.contains(tokenType) -> DefaultLanguageHighlighterColors.SEMICOLON
            YggdrasilLexer.Escapes.contains(tokenType) -> YggdrasilHighlightColor.STRING_ESCAPED.textAttributesKey

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
