package valkyrie.ide.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.YggdrasilFunctionParameter
import yggdrasil.language.ast.external.YggdrasilLetStatement
import yggdrasil.language.ast.classes.YggdrasilClassFieldNode
import valkyrie.ide.actions.InferClassFieldType
import valkyrie.ide.actions.InferDefineItemType

//import nexus.language.psi_node.ValkyrieClassFieldNode
//import nexus.language.psi_node.ValkyrieDefineItemNode
//import nexus.language.psi_node.ValkyrieLetStatementNode

class MarkImplicitTypes : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is YggdrasilLetStatement -> {
//                if (element.typeExpressionList.isEmpty()) {
//                    holder.newAnnotation(HighlightSeverity.INFORMATION, "Infer type")
//                        .range(element.firstChild.textRange)
//                        .withFix(InferLetType(element, true))
//                        .create()
//                } else {
//                    holder.newAnnotation(HighlightSeverity.INFORMATION, "Remove the obvious type")
//                        .range(element.firstChild.textRange)
//                        .withFix(InferLetType(element, false))
//                        .create()
//                }
            }

            is YggdrasilClassFieldNode -> {
//                if (element.typeExpression == null) {
                holder.newAnnotation(HighlightSeverity.INFORMATION, "Infer type")
                    .range(element.firstChild.textRange)
                    .withFix(InferClassFieldType(element))
                    .create()
//                }
            }

            is YggdrasilFunctionParameter -> {
//                if (element.typeExpression == null) {
                holder.newAnnotation(HighlightSeverity.INFORMATION, "Infer type")
                    .range(element.firstChild.textRange)
                    .withFix(InferDefineItemType(element))
                    .create()
//                }
            }
        }
    }
}

