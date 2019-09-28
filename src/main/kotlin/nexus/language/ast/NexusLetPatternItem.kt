package nexus.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusLetPatternItem : ASTWrapperPsiElement, NexusHighlightElement {


    constructor(node: CompositeElement) : super(node) {

    }


    override fun on_highlight(e: NodeHighlighter) {

    }
}

