package valkyrie.ide.completion

import com.intellij.application.options.CodeCompletionOptionsCustomSection
import com.intellij.openapi.options.ConfigurableBuilder

private val TITLE = nexus.language.NexusBundle.message("settings.completion.title")

class CompletionConfig : ConfigurableBuilder(TITLE), CodeCompletionOptionsCustomSection {
    init {
//        checkBox(
//            ValkyrieBundle.message("settings.completion.suggest_out_of_scope_items"),
//            CodeInsightSettings.getInstance()::suggestOutOfScopeItems
//        )
    }
}