package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.YggdrasilNamepathNode

class YggdrasilModifiers(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    val modifiers by lazy {
        YggdrasilParser.getChildrenOfType<YggdrasilIdentifierNode>(this)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_modifiers(modifiers)
    }
}