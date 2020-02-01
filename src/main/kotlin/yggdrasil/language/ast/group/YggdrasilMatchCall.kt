package yggdrasil.language.ast.pattern_match

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.language.ast.YggdrasilIdentifierNode

class YggdrasilMatchCall(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    val bind by lazy { YggdrasilIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            e.register(bind, YggdrasilHighlightColor.SYM_LOCAL)
        }
    }
}