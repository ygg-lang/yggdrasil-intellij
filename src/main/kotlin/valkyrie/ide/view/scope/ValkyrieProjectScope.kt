package valkyrie.ide.view.scope

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.GlobalSearchScope


class ValkyrieProjectScope(project: Project) : GlobalSearchScope(project) {
    override fun contains(file: VirtualFile): Boolean {
        return false;
    }

    override fun isSearchInModuleContent(aModule: Module): Boolean {
        return true;
    }

    override fun isSearchInLibraries(): Boolean {
        return true;
    }
}