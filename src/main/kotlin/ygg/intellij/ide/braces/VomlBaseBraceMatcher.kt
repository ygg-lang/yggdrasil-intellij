package ygg.intellij.ide.braces

import ygg.intellij.language.psi.YggTypes
import com.github.ygg_lang.ygg_intellij.language.psi.Voml_COMMENTS
import com.github.ygg_lang.ygg_intellij.language.psi.tokenSetOf
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class VomlBaseBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean =
        next in InsertPairBraceBefore

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(ygg.intellij.language.psi.YggTypes.BRACE_L, ygg.intellij.language.psi.YggTypes.BRACE_R, true),
            BracePair(ygg.intellij.language.psi.YggTypes.BRACKET_L, ygg.intellij.language.psi.YggTypes.BRACKET_R, true),
            BracePair(ygg.intellij.language.psi.YggTypes.PARENTHESIS_L, ygg.intellij.language.psi.YggTypes.PARENTHESIS_R, true),
            // BracePair(YggTypes.EXT_PREFIX, YggTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            Voml_COMMENTS,
            tokenSetOf(
                TokenType.WHITE_SPACE,
                ygg.intellij.language.psi.YggTypes.COMMA,
                ygg.intellij.language.psi.YggTypes.PARENTHESIS_R,
                ygg.intellij.language.psi.YggTypes.BRACKET_R,
                ygg.intellij.language.psi.YggTypes.BRACE_R,
                ygg.intellij.language.psi.YggTypes.BRACE_L
            )
        )
    }
}
