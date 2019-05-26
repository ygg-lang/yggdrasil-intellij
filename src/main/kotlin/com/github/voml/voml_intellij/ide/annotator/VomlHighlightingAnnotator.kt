package com.github.voml.voml_intellij.ide.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement

class VomlHighlightingAnnotator : AnnotatorBase() {
    override fun annotateInternal(element: PsiElement, holder: AnnotationHolder) {
        val parent = element.parent
        if (holder.isBatchMode || parent == null) return

        when (parent) {
//            is VomlExt -> if (parent.ident != element) {
//                holder
//                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
//                    .textAttributes(VomlColor.EXTENSION.textAttributesKey)
//                    .create()
//            }
//            is VomlTable -> if (parent.ident == element) {
//                holder
//                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
//                    .textAttributes(VomlColor.OBJECT_NAME.textAttributesKey)
//                    .create()
//            }
//            is VomlEnum -> if (parent.ident == element) {
//                holder
//                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
//                    .textAttributes(VomlColor.OBJECT_NAME.textAttributesKey)
//                    .create()
//            }
//            is VomlNamedField -> if (parent.ident == element) {
//                holder
//                    .newSilentAnnotation(HighlightSeverity.INFORMATION)
//                    .textAttributes(VomlColor.KEY_NAME.textAttributesKey)
//                    .create()
//            }
        }
    }
}
