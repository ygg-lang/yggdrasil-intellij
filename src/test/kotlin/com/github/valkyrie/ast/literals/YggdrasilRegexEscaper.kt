package yggdrasil.language.ast.literals

import com.intellij.openapi.util.TextRange
import com.intellij.psi.LiteralTextEscaper

class YggdrasilRegexEscaper(val psi: YggdrasilRegex) : LiteralTextEscaper<YggdrasilRegex>(psi) {
    override fun decode(rangeInsideHost: TextRange, outChars: StringBuilder): Boolean {
        val hostText = myHost.text.substring(rangeInsideHost.startOffset, rangeInsideHost.endOffset)

        var index = 0;
        for (c in hostText) {
            if (c == '\\') {
                if (index >= hostText.length) {
                    return false
                }
                val next = hostText[index]
                // \/ -> /
                if (next == '/') {
                    outChars.append('/')
                    index++
                    index++
                    continue
                }
            }
            outChars.append(c)
            index++
        }


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