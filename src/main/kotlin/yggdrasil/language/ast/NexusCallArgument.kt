package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter


class NexusCallArgument(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    val key by lazy { YggdrasilIdentifierNode.find(this) }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(key, NexusHighlightColor.SYM_ARG)
    }


}