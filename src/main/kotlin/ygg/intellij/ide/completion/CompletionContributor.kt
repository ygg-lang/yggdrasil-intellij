package ygg.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.ElementPatternCondition
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import com.intellij.util.ProcessingContext
import ygg.intellij.language.psi.YggTypes

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            psiElement(YggTypes.SYMBOL),
            BodyCompletionProvider()
        )
        extend(
            CompletionType.BASIC,
            psiElement(YggTypes.SYMBOL),
            ProgramCompletionProvider()
        )
    }
}
