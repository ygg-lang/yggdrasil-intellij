package yggdrasil.language.ast.pattern_match

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.NexusIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusMatchCall(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    val bind by lazy { NexusIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            e.register(bind, NexusHighlightColor.SYM_LOCAL)
        }
    }
}