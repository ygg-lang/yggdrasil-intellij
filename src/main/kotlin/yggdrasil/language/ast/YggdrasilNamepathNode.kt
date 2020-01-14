package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.PsiTreeUtil
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.antlr.YggdrasilParser


class YggdrasilNamepathNode(node: CompositeElement) : ASTWrapperPsiElement(node),
    YggdrasilHighlightElement {
    private val _identifiers by lazy {
        YggdrasilParser.getChildrenOfType<YggdrasilIdentifierNode>(this)
    }
    val identifier = _identifiers.last()
    val namespace: List<YggdrasilIdentifierNode> = _identifiers.dropLast(1)

    override fun getName(): String? {
        return super.getName()
    }

    companion object {
        fun find(node: PsiElement): YggdrasilNamepathNode? {
            return PsiTreeUtil.getChildOfType(node, YggdrasilNamepathNode::class.java)
        }
    }

    override fun on_highlight(e: NodeHighlighter) {
//        fakeTypeColor(e, nameIdentifier)
    }
}
