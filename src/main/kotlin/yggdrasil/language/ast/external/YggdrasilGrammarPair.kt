package yggdrasil.language.ast.external

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilAntlrLexer
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.antlr.YggdrasilParser

class YggdrasilGrammarPair(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val key = YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_grammar_key)
        e.register_argument(key)
    }
}