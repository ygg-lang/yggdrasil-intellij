package ygg.intellij.ide.folding

import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.elementType
import ygg.intellij.language.psi.*

class FoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : YggRecursiveVisitor() {

    override fun visitComment(comment: PsiComment) {
        if (comment.tokenType == YggTypes.COMMENT_BLOCK) {
            fold(comment)
            super.visitComment(comment)
        }
    }

    override fun visitObject(o: YggObject) {
        foldInner(o)
    }


    override fun visitImportBody(o: YggImportBody) {
        foldInner(o)
    }


    override fun visitRuleBody(o: YggRuleBody) {
        foldInner(o)
    }


    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }

    private fun foldInner(element: PsiElement) {
        val range = TextRange(element.firstChild.endOffset, element.lastChild.startOffset)
        descriptors += FoldingDescriptor(element.node, range)
    }

    private fun foldInner(element: PsiElement, left: IElementType, right: IElementType) {
        val start = element.childrenWithLeaves.filter { it.elementType == left }.map { it.endOffset }.firstOrNull();
        val end = element.childrenWithLeaves.filter { it.elementType == right }.map { it.startOffset }.firstOrNull();
        if (start != null && end != null && start < end) {
            val range = TextRange(start, end)
            descriptors += FoldingDescriptor(element.node, range)
        }
    }

    private fun fold(element: PsiElement, text: String) {
        descriptors += FoldingDescriptor(element.node, element.textRange, null, text)
    }

    private fun fold(element: PsiElement, text: String, collapsed: Boolean) {
        descriptors += FoldingDescriptor(element.node, element.textRange, null, text, collapsed, setOf())
    }
}
