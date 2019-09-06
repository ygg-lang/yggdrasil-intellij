package ygg.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import ygg.intellij.language.psi.YggTypes

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(YggTypes.SYMBOL),
            SymbolCompletionProvider()
        )
    }
}

