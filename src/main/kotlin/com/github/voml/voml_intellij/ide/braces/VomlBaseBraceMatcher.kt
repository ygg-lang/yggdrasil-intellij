package com.github.voml.voml_intellij.ide.braces

import com.github.voml.voml_intellij.language.psi.VomlTypes
import com.github.voml.voml_intellij.language.psi.Voml_COMMENTS
import com.github.voml.voml_intellij.language.psi.tokenSetOf
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
            BracePair(VomlTypes.BRACE_L, VomlTypes.BRACE_R, true),
            BracePair(VomlTypes.BRACKET_L, VomlTypes.BRACKET_R, true),
            BracePair(VomlTypes.PARENTHESIS_L, VomlTypes.PARENTHESIS_R, true),
            // BracePair(VomlTypes.EXT_PREFIX, VomlTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            Voml_COMMENTS,
            tokenSetOf(
                TokenType.WHITE_SPACE,
                VomlTypes.COMMA,
                VomlTypes.PARENTHESIS_R,
                VomlTypes.BRACKET_R,
                VomlTypes.BRACE_R,
                VomlTypes.BRACE_L
            )
        )
    }
}
