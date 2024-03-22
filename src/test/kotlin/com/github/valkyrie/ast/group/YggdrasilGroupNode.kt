package yggdrasil.language.ast.group

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.HighlightColor
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.language.ast.YggdrasilIdentifierNode


class YggdrasilGroupNode(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    val key by lazy { YggdrasilIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        e.register(key, HighlightColor.SYM_GLOBAL)
    }

    fun findPairs(): List<YggdrasilGroupItem> {
        val out = YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_group_block);
        return YggdrasilParser.getChildrenOfType<YggdrasilGroupItem>(out)
    }
}
