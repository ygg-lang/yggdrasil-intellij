package valkyrie.ide.project.library

import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.AdditionalLibraryRootsProvider
import com.intellij.openapi.roots.SyntheticLibrary
import com.intellij.openapi.vfs.VirtualFile
//import valkyrie.lsp.RequestDependencies
import java.net.ConnectException

class LibraryRootsProvider : AdditionalLibraryRootsProvider() {
    private var dependences = mutableListOf<SyntheticLibrary>()
    override fun getAdditionalProjectLibraries(project: Project): MutableList<SyntheticLibrary> {
       return mutableListOf()
    }

    override fun getRootsToWatch(project: Project): MutableCollection<VirtualFile> {
        return dependences.map { it.sourceRoots }.flatten().toMutableList()
    }
}

