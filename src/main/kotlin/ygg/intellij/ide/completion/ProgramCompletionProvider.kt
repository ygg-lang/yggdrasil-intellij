package ygg.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.InsertionContext
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.util.ProcessingContext
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.file.YggdrasilIcon

class ProgramCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        resultSet: CompletionResultSet,
    ) {
        resultSet.addElement(LookupElementBuilder.create("struct").withInsertHandler { ctx, _ ->
            EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
        })
    }
}

private fun ProgramCompletionProvider.addKeywords(vararg set: String) {
    for (keyword in set) {
        val e = LookupElementBuilder.create(keyword)
            .withCaseSensitivity(false)
            .withIcon(YggdrasilIcon.KEYWORD)
            .withPresentableText(keyword)
            .withTypeText("keyword", true)
            .withInsertHandler { context, _ -> textReplacer(context, keyword, 0) }
        // this.addElement(e)
    }
}

private fun textReplacer(context: InsertionContext, text: String, offset: Int) {
    val document = context.document
    document.replaceString(context.startOffset, context.tailOffset, text)
    EditorModificationUtil.moveCaretRelatively(context.editor, offset)
}