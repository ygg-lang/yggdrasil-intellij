package com.github.ygg_lang.ygg_intellij.ide.annotator.checkers

import com.github.ygg_lang.ygg_intellij.language.psi.YggScope
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement

class YggScopeCheckerAnnotator : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is YggScope -> checkScope(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkScope(objectEntry: YggScope): CheckerAnnotatorResult {
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

