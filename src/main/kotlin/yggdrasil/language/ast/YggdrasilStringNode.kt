package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.json.json5.Json5Language
import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.html.HTMLLanguage
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.lang.xml.XMLLanguage
import com.intellij.openapi.util.TextRange
import com.intellij.psi.LiteralTextEscaper
import com.intellij.psi.PsiLanguageInjectionHost
import com.intellij.psi.util.PsiTreeUtil
import org.intellij.lang.regexp.RegExpLanguage
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.matcher.escaper.StringEscape

class YggdrasilStringNode(node: ASTNode) : ASTWrapperPsiElement(node), PsiLanguageInjectionHost, YggdrasilHighlightElement {
    val handler by lazy {
        PsiTreeUtil.getChildOfType(this, YggdrasilIdentifierNode::class.java)
    }

    //    private val _text by lazy {
//        NexusParser.getChildOfType(this, NexusAntlrParser.RULE_string)!!
//    }
    private val injectLanguage = handler?.name?.lowercase();

    override fun isValidHost(): Boolean {
        return handler != null
    }

    override fun updateText(text: String): PsiLanguageInjectionHost {
        TODO("Not yet implemented")
    }

    override fun createLiteralTextEscaper(): LiteralTextEscaper<out PsiLanguageInjectionHost> {
        return StringEscape(this)
    }

    fun injectPerform(r: MultiHostRegistrar) {
        when (injectLanguage) {
            "re" -> injectRegex(r)
            "json5", "jsonp", "json" -> inject(r, Json5Language.INSTANCE)
            "xp", "xpath" -> inject(r, XMLLanguage.INSTANCE)
            "xml" -> inject(r, XMLLanguage.INSTANCE)
            "html" -> inject(r, HTMLLanguage.INSTANCE)
            null -> {}
            else -> Language.getRegisteredLanguages()
                .filter { it != Language.ANY }
                .firstOrNull { it.id == injectLanguage }
                ?.let { inject(r, it) }
        }
    }

    private fun inject(registrar: MultiHostRegistrar, language: Language) {
        registrar.startInjecting(language)
            .addPlace(null, null, this, innerRange())
            .doneInjecting()
    }

    private fun injectRegex(registrar: MultiHostRegistrar) {
        registrar.startInjecting(RegExpLanguage.INSTANCE)
            .addPlace("(?x)", null, this, innerRange())
            .doneInjecting()
    }


    private fun innerRange(): TextRange {
//        val start = _text.textRange.startOffset - textRange.startOffset + 1;
//        val end = _text.textRange.endOffset - textRange.startOffset - 1;
//        return TextRange(start, end)
        return TextRange(0, 0)
    }


    override fun on_highlight(e: NodeHighlighter) {
        e.register(handler, NexusHighlightColor.SYM_MACRO)
    }
}