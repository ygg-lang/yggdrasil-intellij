package ygg.intellij.ide.braces


import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import ygg.intellij.language.YggParserDefinition
import ygg.intellij.language.psi.YggTypes.*

class VomlBaseBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean =
        next in InsertPairBraceBefore

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(BRACE_L, BRACE_R, true),
            BracePair(BRACKET_L, BRACKET_R, true),
            BracePair(PARENTHESIS_L, PARENTHESIS_R, true),
            // BracePair(YggTypes.EXT_PREFIX, YggTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            YggParserDefinition.COMMENTS,
            TokenSet.create(
                TokenType.WHITE_SPACE,
                COMMA,
                PARENTHESIS_R,
                BRACKET_R,
                BRACE_R,
                BRACE_L
            )
        )
    }
}
