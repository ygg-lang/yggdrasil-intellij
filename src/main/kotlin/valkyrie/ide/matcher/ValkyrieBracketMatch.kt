package valkyrie.ide.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import yggdrasil.antlr.NexusLexer
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import yggdrasil.antlr.YggdrasilAntlrLexer


class ValkyrieBracketMatch : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = arrayOf(
        BracePair(Instance.BraceL, Instance.BraceR, true),
        BracePair(Instance.BracketL, Instance.BracketR, true),
        BracePair(Instance.ParenthesisL, Instance.ParenthesisR, true),
        BracePair(Instance.GenericL, Instance.GenericR, true),
//        BracePair(STRING_START, STRING_END, true),
    )

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean {
        val insertPairBraceBefore = TokenSet.orSet(
            NexusLexer.Comments, TokenSet.orSet(
                TokenSet.create(TokenType.WHITE_SPACE),
//                COMMA,
                Instance.Right
            )
        )
        return next in insertPairBraceBefore
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    object Instance {
        val ParenthesisL = TokenIElementType(YggdrasilAntlrLexer.PARENTHESES_L, ")", yggdrasil.language.YggdrasilLanguage);
        val ParenthesisR = TokenIElementType(YggdrasilAntlrLexer.PARENTHESES_R, "(", yggdrasil.language.YggdrasilLanguage);
        val BracketL = TokenIElementType(YggdrasilAntlrLexer.BRACKET_L, "[", yggdrasil.language.YggdrasilLanguage);
        val BracketR = TokenIElementType(YggdrasilAntlrLexer.BRACKET_R, "]", yggdrasil.language.YggdrasilLanguage);
        val BraceL = TokenIElementType(YggdrasilAntlrLexer.BRACE_L, "{", yggdrasil.language.YggdrasilLanguage);
        val BraceR = TokenIElementType(YggdrasilAntlrLexer.BRACE_R, "}", yggdrasil.language.YggdrasilLanguage);

        val GenericL = TokenIElementType(YggdrasilAntlrLexer.GENERIC_L, "<", yggdrasil.language.YggdrasilLanguage);
        val GenericR = TokenIElementType(YggdrasilAntlrLexer.GENERIC_R, ">", yggdrasil.language.YggdrasilLanguage);

        val Left = TokenSet.create(
            ParenthesisL, BracketL, BraceL, GenericL
        )
        val Right = TokenSet.create(
            ParenthesisR, BracketR, BraceR, GenericR
        )
    }
}

