package valkyrie.ide.completion

import com.intellij.lang.ImportOptimizer
import com.intellij.psi.PsiFile
import yggdrasil.language.file.NexusFileNode

class ValkyrieImportOptimizer : ImportOptimizer {
    override fun supports(file: PsiFile): Boolean {
        return file is NexusFileNode
    }

    override fun processFile(file: PsiFile): Runnable {
        return Runnable { }
    }
}