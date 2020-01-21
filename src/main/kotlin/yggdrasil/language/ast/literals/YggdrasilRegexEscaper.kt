package yggdrasil.language.ast.literals

import com.intellij.openapi.util.TextRange
import com.intellij.psi.LiteralTextEscaper
import java.lang.StringBuilder

class YggdrasilRegexEscaper(val psi: YggdrasilRegex) : LiteralTextEscaper<YggdrasilRegex>(psi) {
    override fun decode(rangeInsideHost: TextRange, outChars: StringBuilder): Boolean {
        val hostText = myHost.text
        outChars.append(hostText.substring(rangeInsideHost.startOffset, rangeInsideHost.endOffset))
        return true
    }

    override fun getOffsetInHost(offsetInDecoded: Int, rangeInsideHost: TextRange): Int {
        return rangeInsideHost.startOffset + offsetInDecoded
    }

    override fun getRelevantTextRange(): TextRange {
        return psi.innerRange()
    }

    override fun isOneLine(): Boolean {
        return true
    }
}