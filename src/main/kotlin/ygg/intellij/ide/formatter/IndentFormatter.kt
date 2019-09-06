package ygg.intellij.ide.formatter

import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import ygg.intellij.language.psi.YggTypes

fun computeIndent(formatBlock: FormatBlock, child: ASTNode): Indent? {
    val isCornerChild = formatBlock.node.firstChildNode == child || formatBlock.node.lastChildNode == child
    return when (formatBlock.node.elementType) {
        YggTypes.TABLE -> when {
            isCornerChild || child.elementType == YggTypes.COMMA -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }

        YggTypes.OBJECT -> when {
            isCornerChild -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }

        YggTypes.RULE_BODY -> when {
            isCornerChild -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }

        else -> Indent.getNoneIndent()
    }
}