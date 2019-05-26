package com.github.ygg_lang.ygg_intellij.ide.annotator.checkers

import com.github.ygg_lang.ygg_intellij.language.psi.YggPair
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement


class YggTableCheckerAnnotator : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is YggPair -> checkPair(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkPair(mapEntry: YggPair): CheckerAnnotatorResult {
//        val filteredEntries = (mapEntry.parent as YggMap)
//            .mapEntryList
//            .asSequence()
//            .filterNot { it == mapEntry }
//
//        val duplicatesFound = filteredEntries.any { mapEntry.keyAsTextMatches(it.keyAsText) }
//
//        return if (duplicatesFound) {
//            CheckerAnnotatorResult.Error(
//                "Duplicate keys found in a dictionary",
//                mapEntry.mapKey.textRange
//            )
//        } else {
//            CheckerAnnotatorResult.Ok
//        }
        return CheckerAnnotatorResult.Ok
    }
}