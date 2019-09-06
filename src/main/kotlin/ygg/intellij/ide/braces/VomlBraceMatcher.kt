package ygg.intellij.ide.braces


import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType
import ygg.intellij.language.YggdrasilLanguage
import ygg.intellij.language.file.YggdrasilFileType

class VomlBraceMatcher : PairedBraceMatcherAdapter(VomlBaseBraceMatcher(), YggdrasilLanguage) {
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
        if (fileType != YggdrasilFileType) return false
        val pair = findPair(left, iterator, fileText, fileType)
        return pair != null
    }
}
