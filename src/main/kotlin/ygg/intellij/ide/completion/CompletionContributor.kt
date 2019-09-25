package ygg.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.ElementPatternCondition
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import ygg.intellij.language.psi.YggTypes
import ygg.intellij.language.psi.ancestors

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            BodyCompletionTrigger(),
            BodyCompletionProvider()
        )
        extend(
            CompletionType.BASIC,
            ProgramCompletionTrigger(),
            ProgramCompletionProvider()
        )
    }
}

private class BodyCompletionTrigger : ElementPattern<PsiElement> {
    private val maxDepth = 255
    override fun accepts(o: Any?): Boolean {
        val psi = o as? PsiElement ?: return false
        for (node in psi.ancestors.take(maxDepth)) {
            when (node.node.elementType) {
                YggTypes.STRING_LITERAL -> return false
                YggTypes.RULE_BODY -> return true
            }
        }
        return false
    }

    override fun accepts(o: Any?, context: ProcessingContext?): Boolean {
        return accepts(o)
    }

    override fun getCondition(): ElementPatternCondition<PsiElement> {
        TODO("Not yet implemented")
    }
}

private class ProgramCompletionTrigger : ElementPattern<PsiElement> {
    private val maxDepth = 255
    override fun accepts(o: Any?): Boolean {
        val psi = o as? PsiElement ?: return false
        for (node in psi.ancestors.take(maxDepth)) {
            when (node.node.elementType) {
                YggTypes.RULE_BODY -> return false
            }
        }
        return true
    }

    override fun accepts(o: Any?, context: ProcessingContext?): Boolean {
        return accepts(o)
    }

    override fun getCondition(): ElementPatternCondition<PsiElement> {
        TODO("Not yet implemented")
    }
}