package com.github.ygg_lang.ygg_intellij.ide.todo

import com.github.ygg_lang.ygg_intellij.language.YggFile
import com.github.ygg_lang.ygg_intellij.language.YggLexerAdapter
import com.github.ygg_lang.ygg_intellij.language.psi.Voml_COMMENTS
import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class VomlTodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? =
        if (file is YggFile) YggLexerAdapter() else null

    override fun getCommentTokenSet(file: PsiFile): TokenSet? =
        if (file is YggFile) Voml_COMMENTS else null

    override fun getCommentStartDelta(tokenType: IElementType?): Int =
        if (tokenType in Voml_COMMENTS) 2 else 0

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
