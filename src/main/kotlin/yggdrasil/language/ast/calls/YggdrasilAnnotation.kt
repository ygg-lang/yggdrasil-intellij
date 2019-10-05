package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.elementType
import yggdrasil.antlr.childrenWithLeaves
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.antlr.YggdrasilAntlrLexer

class YggdrasilAnnotation(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val dye = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage, YggdrasilAntlrLexer.BRACKET_L, YggdrasilAntlrLexer.BRACKET_R);
        for (child in this.childrenWithLeaves) {
            if (dye.contains(child.elementType)) {
                e.register_macro(child)
            }
        }
    }
}