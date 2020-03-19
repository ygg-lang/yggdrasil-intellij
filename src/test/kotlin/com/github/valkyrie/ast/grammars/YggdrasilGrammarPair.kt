package yggdrasil.language.ast.grammars

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.psi.parser.YggdrasilParser

class YggdrasilGrammarPair(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val key = YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_grammar_key)
        e.register_argument(key)
    }

    fun containsKey(text: String): Boolean {
        return key?.text == text
    }

    val key: PsiElement?
        get() {
            return children.firstOrNull()
        }

    val value: PsiElement?
        get() {
            return children.lastOrNull()
        }
}