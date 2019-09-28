package valkyrie.ide.refactor

import com.intellij.psi.PsiElement
import com.intellij.refactoring.rename.ResolveSnapshotProvider

class ValkyrieRenameInplace : ResolveSnapshotProvider() {
    override fun createSnapshot(scope: PsiElement?): ResolveSnapshot {
        TODO("Not yet implemented")
    }
}