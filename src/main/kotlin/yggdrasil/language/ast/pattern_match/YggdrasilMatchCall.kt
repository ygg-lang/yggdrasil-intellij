package yggdrasil.language.ast.pattern_match

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.YggdrasilIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class YggdrasilMatchCall(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    val bind by lazy { YggdrasilIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            e.register(bind, NexusHighlightColor.SYM_LOCAL)
        }
    }
}