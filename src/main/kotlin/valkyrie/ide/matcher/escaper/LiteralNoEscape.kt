package valkyrie.ide.matcher.escaper

import com.intellij.openapi.util.TextRange
import com.intellij.psi.LiteralTextEscaper
import com.intellij.psi.PsiLanguageInjectionHost
import yggdrasil.language.ast.YggdrasilStringNode

//import nexus.language.psi_node.ValkyrieStringNode

class LiteralNoEscape(private val host: YggdrasilStringNode) : LiteralTextEscaper<PsiLanguageInjectionHost>(host) {
    override fun decode(rangeInsideHost: TextRange, outChars: StringBuilder): Boolean {
        outChars.append(myHost!!.text, rangeInsideHost.startOffset, rangeInsideHost.endOffset)
        return true
    }

    override fun getOffsetInHost(offsetInDecoded: Int, rangeInsideHost: TextRange): Int {
        var offset = offsetInDecoded + rangeInsideHost.startOffset
        if (offset < rangeInsideHost.startOffset) offset = rangeInsideHost.startOffset
        if (offset > rangeInsideHost.endOffset) offset = rangeInsideHost.endOffset
        return offset
    }

    override fun isOneLine(): Boolean {
        return host.text.contains("\n")
    }
}