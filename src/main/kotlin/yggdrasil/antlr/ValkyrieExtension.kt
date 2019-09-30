package yggdrasil.antlr


import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.TokenType
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.ValkyrieBinaryExpression
import valkyrie.ide.highlight.NexusHighlightColor


fun ASTNode?.isWhitespaceOrEmpty(): Boolean {
    return this == null || textLength == 0 || elementType == TokenType.WHITE_SPACE
}

fun extractExpression(node: CompositeElement): ASTWrapperPsiElement {
    val infix = node.findPsiChildByType(YggdrasilLexer.OperatorInfix);
    return if (infix == null) {
//        println("extractExpression: ${node.elementType} ${node.text}")
        ASTWrapperPsiElement(node)
    } else {
        ValkyrieBinaryExpression(node, infix)
    }
}

fun HighlightInfoHolder.register(element: PsiElement?, color: NexusHighlightColor) {
    if (element == null) return
    val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
    builder.textAttributes(color.textAttributesKey)
    builder.range(element.textRange)
    this.add(builder.create())
}