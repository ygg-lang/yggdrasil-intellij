package com.github.ygg_lang.ygg_intellij.ide.braces

import com.github.ygg_lang.ygg_intellij.language.YggFileType
import com.github.ygg_lang.ygg_intellij.language.YggLanguage
import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType

class VomlBraceMatcher : PairedBraceMatcherAdapter(VomlBaseBraceMatcher(), YggLanguage.INSTANCE) {
    override fun isLBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean =
        isBrace(iterator, fileText, fileType, true)

    override fun isRBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean =
        isBrace(iterator, fileText, fileType, false)

    private fun isBrace(
        iterator: HighlighterIterator,
        fileText: CharSequence,
        fileType: FileType,
        left: Boolean
    ): Boolean {
        if (fileType != YggFileType.INSTANCE) return false
        val pair = findPair(left, iterator, fileText, fileType)
        return pair != null
    }
}
