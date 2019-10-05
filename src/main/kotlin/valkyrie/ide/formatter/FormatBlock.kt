package valkyrie.ide.formatter

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.formatter.FormatterUtil
import yggdrasil.antlr.isWhitespaceOrEmpty
import yggdrasil.language.psi.ValkyrieAlignmentElement
import yggdrasil.language.psi.YggdrasilIndentElement

//import nexus.language.psi.ValkyrieTokenType

class FormatBlock : ASTBlock {
    private val _node: ASTNode
    private val _alignment: Alignment?
    private val _indent: Indent?
    private val _wrap: Wrap?
    private val _space: FormatSpace

    constructor(node: ASTNode, space: FormatSpace) {
        this._node = node
        this._alignment = computeAlignment(node)
        this._indent = computeIndent(node)
        this._wrap = computeWrap(node)
        this._space = space
    }

    constructor(node: ASTNode, alignment: Alignment?, indent: Indent?, wrap: Wrap?, space: FormatSpace) {
        this._node = node
        this._alignment = alignment
        this._indent = indent
        this._wrap = wrap
        this._space = space
    }

    override fun isLeaf(): Boolean {
        return _node.firstChildNode == null
    }

    override fun getNode(): ASTNode {
        return _node
    }


    override fun getWrap(): Wrap? {
        return _wrap
    }

    override fun getIndent(): Indent? {
        return _indent
    }

    override fun getAlignment(): Alignment? {
        return _alignment
    }

    override fun getTextRange(): TextRange = _node.textRange

    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return _space.spacingBuilder.getSpacing(this, child1, child2)
    }

    override fun getSubBlocks(): List<Block> {
        return node.getChildren(null).filter { !it.isWhitespaceOrEmpty() }.map {
            FormatBlock(
                node = it,
                alignment = computeAlignment(it),
                indent = computeIndent(it),
                wrap = computeWrap(it),
                _space
            )
        }
    }

    override fun isIncomplete(): Boolean {
        return _node.getChildren(null).any { it.elementType is PsiErrorElement } || FormatterUtil.isIncomplete(_node)
    }

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        return ChildAttributes(Indent.getNoneIndent(), null)
    }

    private fun computeIndent(child: ASTNode): Indent? {
        val psi = _node.psi;
        if (psi is YggdrasilIndentElement) {
            return psi.on_indent(child)
        }
        return Indent.getNoneIndent()
    }


    private fun computeAlignment(child: ASTNode): Alignment? {
        val psi = _node.psi;
        if (psi is ValkyrieAlignmentElement) {
            return psi.on_alignment(child)
        }
        return null
    }

    private fun computeWrap(child: ASTNode): Wrap? {
        return when (_node.psi) {
            else -> null
        }
    }
}
