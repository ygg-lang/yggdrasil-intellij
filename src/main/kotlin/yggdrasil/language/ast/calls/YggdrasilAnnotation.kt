package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.elementType
import yggdrasil.antlr.childrenWithLeaves
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.antlr.YggdrasilAntlrLexer
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.language.ast.YggdrasilNamepathNode

class YggdrasilAnnotation(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    private val namepath by lazy {
        YggdrasilParser.getChildOfType<YggdrasilNamepathNode>(this)
    }

    override fun on_highlight(e: NodeHighlighter) {
        val dye = PSIElementTypeFactory.createTokenSet(
            YggdrasilLanguage,
            YggdrasilAntlrLexer.BRACKET_L,
            YggdrasilAntlrLexer.BRACKET_R,
            YggdrasilAntlrLexer.KW_EXTERNAL,
            YggdrasilAntlrLexer.KW_INSPECTOR,
        )
        for (child in this.childrenWithLeaves) {
            if (dye.contains(child.elementType)) {
                e.register_macro(child)
            }
        }
        e.register_macro(this.firstChild)
        e.register_macro(namepath)
    }
}