package valkyrie.ide.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import yggdrasil.psi.YggdrasilTypes.*


class BraceMatch : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> {
        return arrayOf(
            BracePair(BRACE_L, BRACE_R, true),
            BracePair(BRACKET_L, BRACKET_R, true),
            BracePair(PARENTHESIS_L, PARENTHESIS_R, true),
        )
    }

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean {
        return false
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }

    companion object {
        val Left = TokenSet.create(
            PARENTHESIS_L, BRACKET_L, BRACE_L,
        )
        val Right = TokenSet.create(
            PARENTHESIS_R, BRACKET_R, BRACE_R,
        )
    }
}
