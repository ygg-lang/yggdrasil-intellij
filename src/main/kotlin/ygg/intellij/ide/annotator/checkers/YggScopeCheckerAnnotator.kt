package ygg.intellij.ide.annotator.checkers

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement
import ygg.intellij.language.psi.YggRegex

class YggScopeCheckerAnnotator : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is YggRegex -> checkScope(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkScope(objectEntry: YggRegex): CheckerAnnotatorResult {
//        val filteredEntries = (objectEntry.parent as VomlObjectBody)
//            .objectEntryList
//            .asSequence()
//            .filterNot { it == objectEntry }
//
//        val duplicatesFound = filteredEntries.any { it.keyTextMatches(objectEntry.keyText) }
//
//        return if (duplicatesFound) {
//            CheckerAnnotatorResult.Error(
//                "Duplicate keys found in an object",
//                objectEntry.namedField.ident.textRange
//            )
//        } else {
//            CheckerAnnotatorResult.Ok
//        }
        return CheckerAnnotatorResult.Ok
    }
}

