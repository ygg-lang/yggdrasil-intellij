package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class YggdrasilLambdaSlot : ASTWrapperPsiElement, YggdrasilHighlightElement {

    constructor(node: CompositeElement) : super(node) {

    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(this, NexusHighlightColor.SYM_ARG)
    }
}