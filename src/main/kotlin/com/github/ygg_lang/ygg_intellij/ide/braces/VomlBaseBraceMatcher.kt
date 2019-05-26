package com.github.ygg_lang.ygg_intellij.ide.braces

import com.github.ygg_lang.ygg_intellij.language.psi.YggTypes
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
            BracePair(YggTypes.BRACE_L, YggTypes.BRACE_R, true),
            BracePair(YggTypes.BRACKET_L, YggTypes.BRACKET_R, true),
            BracePair(YggTypes.PARENTHESIS_L, YggTypes.PARENTHESIS_R, true),
            // BracePair(YggTypes.EXT_PREFIX, YggTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            Voml_COMMENTS,
            tokenSetOf(
                TokenType.WHITE_SPACE,
                YggTypes.COMMA,
                YggTypes.PARENTHESIS_R,
                YggTypes.BRACKET_R,
                YggTypes.BRACE_R,
                YggTypes.BRACE_L
            )
        )
    }
}
