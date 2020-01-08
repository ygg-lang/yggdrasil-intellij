package yggdrasil.language.ast

import ai.grazie.utils.isUppercase
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter


class YggdrasilNamepathNode(node: ASTNode, type: IElementType, val free: Boolean = false) : IdentifierDefSubtree(node, type),
    YggdrasilHighlightElement {
    val identifiers = findChildrenByClass(YggdrasilIdentifierNode::class.java)
    val parentIdentifier: Array<YggdrasilIdentifierNode> = identifiers.dropLast(1).toTypedArray()
    val namespace: String = parentIdentifier.joinToString(".") { it.text }

    override fun getName(): String {
        return nameIdentifier.name
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode {
        return identifiers.last()
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
