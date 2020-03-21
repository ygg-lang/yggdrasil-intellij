package yggdrasil.language.ast.unions

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.HighlightColor
import yggdrasil.language.ast.YggdrasilIdentifierNode


class YggdrasilClimbStatement(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    val key by lazy { YggdrasilIdentifierNode.find(this) }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(key, HighlightColor.TAG_BRANCH)
    }


}