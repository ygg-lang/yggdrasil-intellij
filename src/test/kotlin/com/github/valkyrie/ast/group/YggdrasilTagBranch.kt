package yggdrasil.language.ast.group

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.HighlightColor

class YggdrasilTagBranch(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        e.register(this, HighlightColor.TAG_BRANCH)
    }
}