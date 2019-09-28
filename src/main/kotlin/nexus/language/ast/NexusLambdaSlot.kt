package nexus.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusLambdaSlot : ASTWrapperPsiElement, NexusHighlightElement {

    constructor(node: CompositeElement) : super(node) {

    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(this, NexusHighlightColor.SYM_ARG)
    }
}