package valkyrie.ide.completion

import com.intellij.lang.ImportOptimizer
import com.intellij.psi.PsiFile
import yggdrasil.language.file.YggdrasilFileNode

class ValkyrieImportOptimizer : ImportOptimizer {
    override fun supports(file: PsiFile): Boolean {
        return file is YggdrasilFileNode
    }

    override fun processFile(file: PsiFile): Runnable {
        return Runnable { }
    }
}