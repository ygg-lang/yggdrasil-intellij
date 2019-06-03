package ygg.intellij.ide.annotator.checkers


import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import ygg.intellij.ide.annotator.AnnotatorBase

abstract class CheckerAnnotator : AnnotatorBase() {
    protected abstract fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult
    override fun annotateInternal(element: PsiElement, holder: AnnotationHolder) {
        when (val result = check(element, holder)) {
            CheckerAnnotatorResult.Ok -> {}
            is CheckerAnnotatorResult.Error -> {
                val (errorText, subRange) = result
                holder
                    .newAnnotation(HighlightSeverity.ERROR, errorText)
                    .range(subRange)
                    .create()
            }
        }
    }
}