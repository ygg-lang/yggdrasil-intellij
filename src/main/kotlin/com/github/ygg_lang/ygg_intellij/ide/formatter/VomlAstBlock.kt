package com.github.ygg_lang.ygg_intellij.ide.formatter

import com.github.ygg_lang.ygg_intellij.language.YggLanguage
import com.github.ygg_lang.ygg_intellij.language.psi.YggTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.TokenType
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.formatter.FormatterUtil

class VomlAstBlock(
    private val node: ASTNode,
    private val alignment: Alignment?,
    private val indent: Indent?,
    private val wrap: Wrap?,
    val ctx: VomlFormatterContext
) : ASTBlock {
    override fun isLeaf(): Boolean = node.firstChildNode == null

    override fun getNode() = node

    override fun getTextRange(): TextRange = node.textRange

    override fun getWrap() = wrap

    override fun getIndent() = indent

    override fun getAlignment() = alignment

    override fun getSpacing(child1: Block?, child2: Block) = computeSpacing(child1, child2, ctx)

    override fun getSubBlocks(): List<Block> = mySubBlocks

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        val indent = when (node.elementType) {
            YggTypes.TABLE -> Indent.getNormalIndent()
            else -> Indent.getNoneIndent()
        }
        return ChildAttributes(indent, null)
    }

    override fun isIncomplete(): Boolean = myIsIncomplete

    private val myIsIncomplete: Boolean by lazy {
        node.getChildren(null).any {
            it.elementType is PsiErrorElement
        }
        || FormatterUtil.isIncomplete(node)
    }

    private val mySubBlocks: List<Block> by lazy { buildChildren() }
}

data class VomlFormatterContext(
    val commonSettings: CommonCodeStyleSettings,
    val spacingBuilder: SpacingBuilder
) {
    companion object {
        fun create(settings: CodeStyleSettings): VomlFormatterContext {
            val commonSettings = settings.getCommonSettings(YggLanguage.INSTANCE)
            return VomlFormatterContext(commonSettings, createSpacingBuilder(commonSettings))
        }
    }
}

fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder =
    SpacingBuilder(commonSettings)
        // ,
        .after(YggTypes.COMMA).spacing(1, 1, 0, true, 0)
        .before(YggTypes.COMMA).spaceIf(false)
        // [ ]
        .after(YggTypes.BRACKET_L).spaceIf(false)
        .before(YggTypes.BRACKET_R).spaceIf(false)
        // { }
        .after(YggTypes.BRACE_L).spaceIf(false)
        .before(YggTypes.BRACE_R).spaceIf(false)
        // ( )
        .after(YggTypes.PARENTHESIS_L).spaceIf(false)
        .before(YggTypes.PARENTHESIS_R).spaceIf(false)

private fun Block.computeSpacing(child1: Block?, child2: Block, ctx: VomlFormatterContext): Spacing? {
    return ctx.spacingBuilder.getSpacing(this, child1, child2)
}

private fun ASTNode?.isWhitespaceOrEmpty() = this == null || textLength == 0 || elementType == TokenType.WHITE_SPACE

private fun VomlAstBlock.computeIndent(child: ASTNode): Indent? {
    val isCornerChild = node.firstChildNode == child || node.lastChildNode == child
    return when (node.elementType) {
        YggTypes.TABLE -> when {
            isCornerChild || child.elementType == YggTypes.COMMA -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }
        else -> Indent.getNoneIndent()
    }
}

private fun VomlAstBlock.buildChildren(): List<Block> {
    return node.getChildren(null)
        .filter { !it.isWhitespaceOrEmpty() }
        .map { childNode ->
            VomlFormattingModelBuilder.createBlock(
                node = childNode,
                alignment = null,
                indent = computeIndent(childNode),
                wrap = null,
                ctx
            )
        }
}
