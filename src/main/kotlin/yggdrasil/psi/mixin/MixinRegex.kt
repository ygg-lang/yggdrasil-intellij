package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.TextRange
import com.intellij.psi.LiteralTextEscaper
import com.intellij.psi.PsiLanguageInjectionHost
import org.intellij.lang.regexp.RegExpLanguage
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilRegex
import yggdrasil.psi.node.YggdrasilRegexNode

abstract class MixinRegex(node: ASTNode) : YggdrasilElement(node), PsiLanguageInjectionHost, YggdrasilRegex {

    override fun getPresentation(): ItemPresentation? {
        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
    }

    override fun isValidHost(): Boolean {
        return true
    }

    override fun updateText(text: String): PsiLanguageInjectionHost {
        TODO("Not yet implemented")
    }

    override fun createLiteralTextEscaper(): LiteralTextEscaper<out PsiLanguageInjectionHost> {
        return YggdrasilRegexEscaper(this as YggdrasilRegexNode)
    }

    fun injectPerform(r: MultiHostRegistrar) {
        if (text.startsWith('/')) {
            val range = TextRange(1, textLength - 1);
            r.startInjecting(RegExpLanguage.INSTANCE).addPlace("(?x)", null, this, range).doneInjecting()
        } else {
            val range = TextRange(0, textLength);
            r.startInjecting(RegExpLanguage.INSTANCE).addPlace(null, null, this, range).doneInjecting()
        }
    }
}

private class YggdrasilRegexEscaper : LiteralTextEscaper<PsiLanguageInjectionHost> {
    private val host: YggdrasilRegexNode

    constructor(host: YggdrasilRegexNode) : super(host) {
        this.host = host
    }

    override fun decode(rangeInsideHost: TextRange, outChars: StringBuilder): Boolean {
        outChars.append(myHost!!.text, rangeInsideHost.startOffset, rangeInsideHost.endOffset)
        return true
    }

    override fun getOffsetInHost(offsetInDecoded: Int, rangeInsideHost: TextRange): Int {
        var offset = offsetInDecoded + rangeInsideHost.startOffset
        if (offset < rangeInsideHost.startOffset) {
            offset = rangeInsideHost.startOffset
        }
        if (offset > rangeInsideHost.endOffset) {
            offset = rangeInsideHost.endOffset
        }
        return offset
    }

    override fun isOneLine(): Boolean {
        return host.text.contains("\n")
    }
}
