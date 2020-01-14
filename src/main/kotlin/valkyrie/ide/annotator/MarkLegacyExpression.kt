package valkyrie.ide.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.CodeInsightColors
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.YggdrasilNodeTag
import yggdrasil.language.ast.calls.tokens.YggdrasilExternalNode
import yggdrasil.language.ast.ValkyrieWhichStatement
import valkyrie.ide.actions.ast_transform.*

class MarkLegacyExpression : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is YggdrasilExternalNode -> {
//                if (element.elseStatement == null) {
//                    insertElseBlock(element, holder)
//                } else {
//                    switchBranch(element.firstChild, holder, true)
//                    switchBranch(element.elseStatement!!.firstChild, holder, true)
//                    insertElseIf(element.elseStatement!!, holder, true)
//                }
//                for (item in element.efStatementList) {
//                    insertElseIf(item.firstChild, holder, true)
//                    insertElseIf(item.firstChild, holder, false)
//                    switchBranch(element, holder, true)
//                    switchBranch(element, holder, false)
//                } insertElseIf(element.firstChild!!, holder, false)
//                val warn = element.elseStatement != null || element.efStatementList.isNotEmpty()
//                toModernIf(element, holder, warn)

            }

            is ValkyrieWhichStatement -> {
                toLegacyIf(element, holder)
            }

//            is ValkyrieForStatementNode -> {
//                if (element.elseStatement == null) {
//                    insertElseBlock(element, holder)
//                }
//            }
        }
    }

    private fun toModernIf(element: YggdrasilExternalNode, holder: AnnotationHolder, warn: Boolean) {
        val fixer = ToModernIf(element);
        if (warn) {
            holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
                .range(element.firstChild.textRange)
                .withFix(fixer)
                .textAttributes(CodeInsightColors.WEAK_WARNING_ATTRIBUTES)
                .create()
        } else {
            holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
                .range(element.firstChild.textRange)
                .withFix(fixer)
                .create()
        }
    }

    private fun toLegacyIf(element: ValkyrieWhichStatement, holder: AnnotationHolder) {
        val fixer = ToLegacyIf(element);
        holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
            .range(element.firstChild.textRange)
            .withFix(fixer)
            .create()
    }

    private fun insertElseIf(element: PsiElement, holder: AnnotationHolder, above: Boolean) {
        val fixer = InsertElseIf(element, above);
        holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
            .range(element.textRange)
            .withFix(fixer)
            .create()
    }

    private fun switchBranch(element: PsiElement, holder: AnnotationHolder, above: Boolean) {
        val fixer = SwapIfBranch(element, above);
        holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
            .range(element.textRange)
            .withFix(fixer)
            .create()
    }

    private fun insertElseBlock(element: YggdrasilExternalNode, holder: AnnotationHolder) {
        // 确保 if 末尾没有 else 语句
        val fixer = InsertElseBlock(element);
        holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
            .range(element.firstChild.textRange)
            .withFix(fixer)
            .create()
    }

    private fun insertElseBlock(element: YggdrasilNodeTag, holder: AnnotationHolder) {
        val fixer = InsertElseBlock(element);
        holder.newAnnotation(HighlightSeverity.INFORMATION, fixer.getDescription())
            .range(element.firstChild.textRange)
            .withFix(fixer)
            .create()
    }
}

