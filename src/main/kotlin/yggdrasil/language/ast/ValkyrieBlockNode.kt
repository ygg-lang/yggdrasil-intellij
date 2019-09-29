package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import yggdrasil.antlr.childrenWithLeaves
import yggdrasil.language.psi.ValkyrieFoldableElement
import yggdrasil.language.psi.ValkyrieIndentElement
import yggdrasil.language.psi.types.ValkyrieBlockType
import valkyrie.ide.folding.ValkyrieNodeFolder


class ValkyrieBlockNode : ASTWrapperPsiElement, ValkyrieFoldableElement, ValkyrieIndentElement {
    val kind: ValkyrieBlockType

    constructor(node: CompositeElement, kind: ValkyrieBlockType) : super(node) {
        this.kind = kind
    }

    override fun on_fold(e: ValkyrieNodeFolder) {
        if (kind == ValkyrieBlockType.Indent) {
            e.fold(this, firstChild.endOffset, lastChild.endOffset)
        } else {
            var start = startOffset;
            var end = endOffset;
            for (leaf in childrenWithLeaves) {
                if (leaf.text == "{") {
                    start = leaf.endOffset;
                    continue
                }
                if (leaf.text == "}") {
                    end = leaf.startOffset;
                    break
                }
            }
            e.fold(this, start, end)
        }
    }

    override fun on_indent(child: ASTNode): Indent {
        return if (kind == ValkyrieBlockType.Indent) {
            if (node.firstChildNode == child) {
                Indent.getNoneIndent()
            } else {
                Indent.getNormalIndent()
            }
        } else {
            val firstLine = node.firstChildNode == child;
            val lastLine = node.lastChildNode == child;
            val isCornerChild = firstLine || lastLine
            if (isCornerChild) {
                Indent.getNoneIndent()
            } else {
                Indent.getNormalIndent()
            }
        }
    }


}

