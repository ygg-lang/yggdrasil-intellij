package valkyrie.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.openapi.progress.ProgressManager
import com.intellij.psi.util.elementType
import com.intellij.psi.util.parents
import com.intellij.util.ProcessingContext
import nexus.antlr.NexusLexer
import nexus.language.file.NexusFileNode


class CompletionRegistrar : CompletionContributor() {
    init {
        extend(CompletionType.BASIC, CompletionInFileScope.Condition, CompletionInFileScope())
    }

    override fun fillCompletionVariants(parameters: CompletionParameters, result: CompletionResultSet) {
        super.fillCompletionVariants(parameters, result)
//        myFill(parameters, result)
    }

    private fun myFill(parameters: CompletionParameters, result: CompletionResultSet) {
        ProgressManager.checkCanceled()
        val context = ProcessingContext()
        val element = parameters.originalPosition ?: return
        println("CompletionRegistrar: ${element.elementType}")
        if (NexusLexer.CompletionWords.contains(element.elementType)) {
            for (node in element.parents(false)) {
                if (result.isStopped) {
                    return
                }
                when (node) {
                    is NexusFileNode -> {
                        println("ValkyrieFileNode: ${result.hashCode()}")
                        CompletionInFileScope().addCompletionVariants(parameters, context, result)
                        return
                    }
                }
            }
        }
    }
}
