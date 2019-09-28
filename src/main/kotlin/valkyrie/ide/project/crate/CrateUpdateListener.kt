package valkyrie.ide.project.crate

import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.vfs.AsyncFileListener
import com.intellij.openapi.vfs.AsyncFileListener.ChangeApplier
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.intellij.psi.PsiManager
import nexus.language.file.NexusFileNode


class CrateUpdateListener : AsyncFileListener {
    override fun prepareChange(events: MutableList<out VFileEvent>): ChangeApplier {
        val project = ProjectManager.getInstance().defaultProject;
        val finder = PsiManager.getInstance(project);
        val changes = mutableListOf<NexusFileNode>()
        for (event in events) {
            val file = event.file?.let { finder.findFile(it) } as? NexusFileNode
            if (file != null) {
                changes.add(file)
            }
        }
        return NamespaceMapping(changes.toTypedArray())
    }
}

//class ModuleInfo2 {
//    val path: Array<String> = arrayOf()
//    val version: String = "0"
//}





