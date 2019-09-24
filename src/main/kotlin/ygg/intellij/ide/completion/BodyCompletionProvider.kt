package ygg.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.InsertionContext
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.file.YggdrasilIcon
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggClimbStatementNode
import ygg.intellij.language.psi_node.YggDefineStatementNode
import ygg.intellij.language.psi_node.YggUnionStatementNode

class BodyCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        resultSet: CompletionResultSet,
    ) {
        val file = parameters.originalFile as YggdrasilFileNode;
        resultSet.addDeclare(file.children)
        resultSet.addKeywords("Any", "Self")
        resultSet.addKeywords("true", "false")
        resultSet.addConstants("ASCII_BIN", "ASCII_OCT", "ASCII_DEC", "ASCII_HEX")
        resultSet.addConstants("XID_START", "XID_CONTINUE")
        resultSet.addConstants("EMOJI")
    }
}

private fun CompletionResultSet.addDeclare(set: Array<PsiElement>) {
    for (psi in set) {
        when (psi) {
            is YggClassStatementNode -> {
                val e = LookupElementBuilder.create(psi.name)
                    .withCaseSensitivity(false)
                    .withIcon(YggdrasilIcon.Class)
                    .withPresentableText(psi.name)
                    .withTypeText("class", true)
                    .withInsertHandler { context, _ -> textReplacer(context, psi.name, 0) }
                this.addElement(e)
            }

            is YggUnionStatementNode -> {
                val e = LookupElementBuilder.create(psi.name)
                    .withCaseSensitivity(false)
                    .withIcon(YggdrasilIcon.Union)
                    .withPresentableText(psi.name)
                    .withTypeText("union", true)
                    .withInsertHandler { context, _ -> textReplacer(context, psi.name, 0) }
                this.addElement(e)
            }

            is YggDefineStatementNode -> {
                val e = LookupElementBuilder.create(psi.name)
                    .withCaseSensitivity(false)
                    .withIcon(YggdrasilIcon.Macro)
                    .withPresentableText(psi.name)
                    .withTypeText("macro", true)
                    .withInsertHandler { context, _ -> textReplacer(context, psi.name, 0) }
                this.addElement(e)
            }
        }
    }
}

private fun CompletionResultSet.addConstants(vararg set: String, namespace: String = "std") {
    for (constant in set) {
        val upper = constant.uppercase()
        val e = LookupElementBuilder.create(upper)
            .withCaseSensitivity(false)
            .withIcon(YggdrasilIcon.CONSTANT)
            .withPresentableText(upper)
            .withTailText(" ($namespace)", true)
            .withInsertHandler { context, _ -> textReplacer(context, upper, 0) }
        this.addElement(e)
    }
}

private fun CompletionResultSet.addKeywords(vararg set: String) {
    for (keyword in set) {
        val e = LookupElementBuilder.create(keyword)
            .withCaseSensitivity(false)
            .withIcon(YggdrasilIcon.KEYWORD)
            .withPresentableText(keyword)
            .withTypeText("keyword", true)
            .withInsertHandler { context, _ -> textReplacer(context, keyword, 0) }
        this.addElement(e)
    }
}

private fun textReplacer(context: InsertionContext, text: String, offset: Int) {
    val document = context.document
    document.replaceString(context.startOffset, context.tailOffset, text)
    EditorModificationUtil.moveCaretRelatively(context.editor, offset)
}