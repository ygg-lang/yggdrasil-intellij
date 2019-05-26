package com.github.ygg_lang.ygg_intellij.ide.completion

import com.github.ygg_lang.ygg_intellij.language.psi.YggTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext

class VomlOptionCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(YggTypes.SYMBOL),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    resultSet.addElement(
                        LookupElementBuilder
                            .create("@include")
                            .withInsertHandler { ctx, _ ->
                                EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
                            }
                    )
                    resultSet.addElement(
                        LookupElementBuilder
                            .create("@inherit")
                            .withInsertHandler { ctx, _ ->
                                EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
                            }
                    )
                    resultSet.addElement(
                        LookupElementBuilder
                            .create("Some()")
                            .withInsertHandler { ctx, _ ->
                                EditorModificationUtil.moveCaretRelatively(ctx.editor, - 1)
                            }
                    )
                    resultSet.addElement(LookupElementBuilder.create("None()"))
                }
            }
        )
    }
}