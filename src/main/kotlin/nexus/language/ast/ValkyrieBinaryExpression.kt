package nexus.language.ast

import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class ValkyrieBinaryExpression(node: CompositeElement, infix: PsiElement) : ANTLRPsiNode(node) {
    val lhs: ANTLRPsiNode;
    val rhs: ANTLRPsiNode;
//    val operator: ValkyrieOperatorNode

    init {
        lhs = ANTLRPsiNode(node.firstChildNode)
        rhs = ANTLRPsiNode(node.lastChildNode)
//        operator = when (infix.text) {
//            "*" -> {
//                ValkyrieOperatorNode(infix)
//            }
//
//            else -> {
//                ValkyrieOperatorNode(infix)
//            }
//        }
    }
}

