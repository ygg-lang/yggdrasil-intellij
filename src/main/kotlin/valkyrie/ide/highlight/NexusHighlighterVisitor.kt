package valkyrie.ide.highlight


//import nexus.language.psi_node.ValkyrieIdentifierNode
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.openapi.progress.ProgressManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import yggdrasil.antlr.traversal
import yggdrasil.language.file.YggdrasilFileNode

class NexusHighlighterVisitor : HighlightVisitor {
    private var _info: HighlightInfoHolder? = null
    override fun suitableForFile(file: PsiFile): Boolean {
        return file is YggdrasilFileNode
    }

    override fun visit(element: PsiElement) {
        val writer = NodeHighlighter(_info);
        element.traversal {
            if (it is YggdrasilHighlightElement) {
                it.on_highlight(writer)
            }
            ProgressManager.checkCanceled()
            true
        }
    }

    override fun analyze(file: PsiFile, updateWholeFile: Boolean, holder: HighlightInfoHolder, action: Runnable): Boolean {
        _info = holder
        action.run()
        return true
    }

    override fun clone(): HighlightVisitor = NexusHighlighterVisitor()
}

