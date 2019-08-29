package ygg.intellij.ide.folding

import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import ygg.intellij.language.psi.YggObject
import ygg.intellij.language.psi.YggRecursiveVisitor
import ygg.intellij.language.psi.YggTypes

class FoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : YggRecursiveVisitor() {

    override fun visitObject(o: YggObject) {
        if (o.objectItemList.isNotEmpty()) {
            fold(o)
        }
    }

//    override fun visitObjectBody(o: VomlObjectBody) {
//        if (o.objectEntryList.isNotEmpty()) {
//            fold(o)
//            super.visitObjectBody(o)
//        }
//    }
//
//    override fun visitTupleBody(o: VomlTupleBody) {
//        if (o.valueList.isNotEmpty()) {
//            fold(o)
//            super.visitTupleBody(o)
//        }
//    }
//
//    override fun visitMap(o: VomlMap) {
//        if (o.mapEntryList.isNotEmpty()) {
//            fold(o)
//            super.visitMap(o)
//        }
//    }

    override fun visitComment(comment: PsiComment) {
        if (comment.tokenType == YggTypes.COMMENT_BLOCK) {
            fold(comment)
            super.visitComment(comment)
        }
    }

    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }

    private fun fold(element: PsiElement, text: String) {
        descriptors += FoldingDescriptor(element.node, element.textRange, null, text)
    }

    private fun fold(element: PsiElement, text: String, collapsed: Boolean) {
        descriptors += FoldingDescriptor(element.node, element.textRange, null, text, collapsed, setOf())
    }
}
