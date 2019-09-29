package valkyrie.ide.project.crate

import com.intellij.openapi.vfs.AsyncFileListener
import yggdrasil.language.file.NexusFileNode

class NamespaceMapping(private val changes: Array<NexusFileNode>) : AsyncFileListener.ChangeApplier {
    override fun afterVfsChange() {
        for (change in changes) {
            // 根据命名空间查文件
//            Instance.Cache.getOrPut(change) { mutableSetOf() }.add(change)
            // 根据类名查命名空间
            change.updateCache()

        }
    }

    object Instance {
        // namespace -> file[]
        val Cache: MutableMap<String, MutableSet<NexusFileNode>> = mutableMapOf()

        // class -> namespace[]
        val ClassCache: MutableMap<String, MutableSet<String>> = mutableMapOf();
    }
}