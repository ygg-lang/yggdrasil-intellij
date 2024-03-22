package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.antlr.childrenWithLeaves
import yggdrasil.language.ast.YggdrasilNamepathNode
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class YggdrasilAnnotationItem(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val id = this.findChildByClass(YggdrasilNamepathNode::class.java) ?: return;
        for (node in id.childrenWithLeaves) {
            e.register_macro(node)
        }
    }
}

