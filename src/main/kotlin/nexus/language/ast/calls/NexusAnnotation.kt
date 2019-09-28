package nexus.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.elementType
import nexus.antlr.childrenWithLeaves
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.antlr.YggdrasilAntlrLexer

class NexusAnnotation(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val dye = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage, YggdrasilAntlrLexer.BRACKET_L, YggdrasilAntlrLexer.BRACKET_R);
        for (child in this.childrenWithLeaves) {
            if (dye.contains(child.elementType)) {
                e.register_macro(child)
            }
        }
    }
}