package com.github.ygg_lang.ygg_intellij.ide.folding

import com.github.ygg_lang.ygg_intellij.language.psi.*
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement

class YggFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : YggRecursiveVisitor() {
    override fun visitTable(o: YggTable) {
        //if (o.valueList.isNotEmpty()) {
        fold(o)
        super.visitTable(o)
    }

    override fun visitImportStatement(o: YggImportStatement) {
        fold(o)
        super.visitImportStatement(o)
    }

    override fun visitGrammarStatement(o: YggGrammarStatement) {
        fold(o)
        super.visitGrammarStatement(o)
    }

    override fun visitIgnoreStatement(o: YggIgnoreStatement) {
        fold(o)
        super.visitIgnoreStatement(o)
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
        if (comment.tokenType == YggTypes.BLOCK_COMMENT) {
            fold(comment)
            super.visitComment(comment)
        }
    }

    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
