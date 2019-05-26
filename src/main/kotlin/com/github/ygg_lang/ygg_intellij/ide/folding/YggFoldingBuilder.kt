package com.github.ygg_lang.ygg_intellij.ide.folding

import com.github.ygg_lang.ygg_intellij.language.YggFile
import com.github.ygg_lang.ygg_intellij.language.psi.*
import com.intellij.lang.ASTNode
import com.intellij.lang.folding.CustomFoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

class YggFoldingBuilder : CustomFoldingBuilder(), DumbAware {
    override fun buildLanguageFoldRegions(
        descriptors: MutableList<FoldingDescriptor>,
        root: PsiElement,
        document: Document,
        quick: Boolean
    ) {
        if (root !is YggFile) return
        val visitor = YggFoldingVisitor(descriptors)
        PsiTreeUtil.processElements(root) {
            it.accept(visitor); true
        }
    }

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange) =
        when (node.elementType) {
            YggTypes.TABLE -> "[...]"
            else -> "{...}"
        }

    override fun isRegionCollapsedByDefault(node: ASTNode) = false
}

