package valkyrie.ide.formatter

import com.intellij.application.options.CodeStyle
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.impl.source.codeStyle.PreFormatProcessor
import com.intellij.util.DocumentUtil
import nexus.antlr.traversal
import nexus.language.psi.ValkyrieRewritableElement
import valkyrie.ide.codeStyle.ValkyrieCodeStyleSettings

//import nexus.language.psi_node.ValkyrieClassStatementNode


class ValkyrieBeforeFormat : PreFormatProcessor {
    override fun process(element: ASTNode, range: TextRange): TextRange {
        val psiRoot = element.psi
        if (psiRoot.language !is nexus.language.NexusLanguage) {
            return range
        }
        val settings = CodeStyle.getCustomSettings(
            psiRoot.containingFile, ValkyrieCodeStyleSettings::class.java
        )
        val psiDocumentManager = PsiDocumentManager.getInstance(psiRoot.project)
        val document = psiDocumentManager.getDocument(psiRoot.containingFile) ?: return range
        DocumentUtil.executeInBulk(document) {
            psiDocumentManager.doPostponedOperationsAndUnblockDocument(document)
            val writer = ValkyrieRewriter(document, settings);
            psiRoot.traversal {
                if (it is ValkyrieRewritableElement) {
                    it.on_rewrite(writer)
                }
                true
            }

            psiDocumentManager.commitDocument(document)
        }
        return range
    }
}


