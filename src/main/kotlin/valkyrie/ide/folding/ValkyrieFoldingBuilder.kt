package valkyrie.ide.folding

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.CustomFoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import nexus.antlr.traversal
import nexus.language.file.NexusFileNode
import nexus.language.psi.ValkyrieFoldableElement

class ValkyrieFoldingBuilder : CustomFoldingBuilder(), DumbAware {
    override fun buildLanguageFoldRegions(descriptors: MutableList<FoldingDescriptor>, root: PsiElement, document: Document, quick: Boolean) {
        if (root !is NexusFileNode) return
        val visitor = ValkyrieNodeFolder(descriptors)
        root.traversal {
            if (it is ValkyrieFoldableElement) {
                it.on_fold(visitor)
            }
            true
        }
    }

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange) = "..."

    override fun isRegionCollapsedByDefault(node: ASTNode) = false
}