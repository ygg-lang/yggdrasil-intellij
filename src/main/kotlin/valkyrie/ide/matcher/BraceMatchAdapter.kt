package valkyrie.ide.matcher

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType
import yggdrasil.language.file.YggdrasilFileType

class BraceMatchAdapter : PairedBraceMatcherAdapter(ValkyrieBracketMatch(), yggdrasil.language.YggdrasilLanguage) {
    override fun isLBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean {
        return isBrace(iterator, fileText, fileType, true)
    }

    override fun isRBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean {
        return isBrace(iterator, fileText, fileType, false)
    }

    private fun isBrace(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType, left: Boolean): Boolean {
        if (fileType != YggdrasilFileType) return false
        val pair = findPair(left, iterator, fileText, fileType)
        return pair != null
    }
}
