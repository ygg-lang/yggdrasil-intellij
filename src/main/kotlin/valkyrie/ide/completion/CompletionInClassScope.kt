package valkyrie.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.util.ProcessingContext
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.language.file.YggdrasilFileNode

class CompletionInClassScope : CompletionProvider<CompletionParameters>() {
    var element: PsiElement? = null;
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
        element = parameters.position
        result.addAllKey()
    }

    private fun CompletionResultSet.addAllKey() {
        val file = element?.containingFile as? YggdrasilFileNode ?: return;
        for (completion in file.Cache.completions) {
            addElement(completion)
        }
    }

    companion object {
        val Condition = triggerCondition();
    }
}


private fun triggerCondition(): PsiElementPattern.Capture<LeafPsiElement> {
    return PlatformPatterns.psiElement(LeafPsiElement::class.java)

        .withLanguage(YggdrasilLanguage)
}