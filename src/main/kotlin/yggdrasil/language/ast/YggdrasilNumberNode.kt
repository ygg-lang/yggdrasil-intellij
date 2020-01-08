package yggdrasil.language.ast

import com.intellij.lang.ASTNode
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class YggdrasilNumberNode(node: ASTNode) : ANTLRPsiNode(node), YggdrasilHighlightElement {
    val handler by lazy {
        PsiTreeUtil.getChildOfType(this, YggdrasilIdentifierNode::class.java)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(handler, YggdrasilHighlightColor.SYM_MACRO)
    }
}