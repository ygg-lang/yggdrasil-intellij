package valkyrie.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.openapi.progress.ProgressManager
import com.intellij.psi.util.elementType
import com.intellij.psi.util.parents
import com.intellij.util.ProcessingContext
import yggdrasil.antlr.YggdrasilLexer
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.unions.YggdrasilUnionNode
import yggdrasil.language.file.YggdrasilFileNode


class CompletionRegistrar : CompletionContributor() {
    init {
        extend(CompletionType.BASIC, CompletionInFileScope.Condition, CompletionInFileScope())
        extend(CompletionType.BASIC, CompletionInClassScope.Condition, CompletionInClassScope())
    }

    override fun fillCompletionVariants(parameters: CompletionParameters, result: CompletionResultSet) {
//        super.fillCompletionVariants(parameters, result)
        myFill(parameters, result)
    }

    private fun myFill(parameters: CompletionParameters, result: CompletionResultSet) {
        ProgressManager.checkCanceled()
        val context = ProcessingContext()
        val element = parameters.originalPosition ?: return
        println("CompletionRegistrar: ${element.elementType}")
        if (YggdrasilLexer.CompletionWords.contains(element.elementType)) {
            for (node in element.parents(false)) {
                if (result.isStopped) {
                    return
                }
                when (node) {
                    is YggdrasilFileNode -> {
                        CompletionInFileScope().addCompletionVariants(parameters, context, result)
                        return
                    }
                    is YggdrasilClassNode -> {
                        CompletionInClassScope().addCompletionVariants(parameters, context, result)
                        return
                    }

                    is YggdrasilUnionNode -> {
                        CompletionInClassScope().addCompletionVariants(parameters, context, result)
                        return
                    }
                }
            }
        }
    }
}
