package yggdrasil.language.ast.group

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilBlockNode
import yggdrasil.language.ast.YggdrasilIdentifierNode


class YggdrasilGroupNode(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    val key by lazy { YggdrasilIdentifierNode.find(this) }
    val items by lazy { findPairs() }
    override fun on_highlight(e: NodeHighlighter) {
        e.register(key, YggdrasilHighlightColor.SYM_GLOBAL)
    }

    private fun findPairs(): List<YggdrasilGroupItem> {
        val out = YggdrasilParser.getChildOfType<YggdrasilBlockNode>(this);
        return out?.children?.filterIsInstance<YggdrasilGroupItem>() ?: emptyList();
    }
}

