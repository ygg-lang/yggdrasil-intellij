package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class YggdrasilLetPatternItem : ASTWrapperPsiElement, YggdrasilHighlightElement {


    constructor(node: CompositeElement) : super(node) {

    }


    override fun on_highlight(e: NodeHighlighter) {

    }
}

