package valkyrie.ide.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

import yggdrasil.psi.ParserDefinition
import yggdrasil.psi.YggdrasilTypes.*


class ValkyrieBracketMatch : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean {
        return next in InsertPairBraceBefore
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(BRACE_L, BRACE_R, true),
            BracePair(BRACKET_L, BRACKET_R, true),
            BracePair(PARENTHESIS_L, PARENTHESIS_R, true),
            // BracePair(VomlTypes.EXT_PREFIX, VomlTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            ParserDefinition.commentTokens,
            TokenSet.create(
                TokenType.WHITE_SPACE,
                COMMA,
//                AwslTypes.PARENTHESIS_R,
//                AwslTypes.BRACKET_R,
//                AwslTypes.BRACE_R,
            )
        )
        val Left = TokenSet.create(
            PARENTHESIS_L, BRACKET_L, BRACE_L,
        )
        val Right = TokenSet.create(
            PARENTHESIS_R, BRACKET_R, BRACE_R,
        )
    }
}
