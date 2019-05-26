package com.github.voml.voml_intellij.ide.folding

import com.github.voml.voml_intellij.language.psi.*
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement

class VomlFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : VomlRecursiveVisitor() {
    override fun visitTable(o: VomlTable) {
        //if (o.valueList.isNotEmpty()) {
        fold(o)
        super.visitTable(o)
    }

    override fun visitIncludeStatement(o: VomlIncludeStatement) {
        fold(o)
        super.visitIncludeStatement(o)
    }

    override fun visitInheritStatement(o: VomlInheritStatement) {
        fold(o)
        super.visitInheritStatement(o)
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
        if (comment.tokenType == VomlTypes.BLOCK_COMMENT) {
            fold(comment)
            super.visitComment(comment)
        }
    }

    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
