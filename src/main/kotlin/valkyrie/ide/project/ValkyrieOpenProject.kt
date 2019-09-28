package valkyrie.ide.project

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.projectImport.ProjectOpenProcessor

class ValkyrieOpenProject : ProjectOpenProcessor() {
    override val name: String
        get() = "Open Valkyrie Project"

    override fun canOpenProject(file: VirtualFile): Boolean {
        return true
    }

    override fun doOpenProject(virtualFile: VirtualFile, projectToClose: Project?, forceOpenInNewFrame: Boolean): Project? {
        return projectToClose
    }
}