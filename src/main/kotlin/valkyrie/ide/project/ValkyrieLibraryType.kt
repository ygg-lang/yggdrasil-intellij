package valkyrie.ide.project.`package`

import yggdrasil.language.file.NexusIconProvider
import javax.swing.Icon

enum class ValkyrieLibraryType {
    Core, LIBRARY, NAMESPACE;

    fun getIcon(): Icon {
        return when (this) {
            Core -> NexusIconProvider.Instance.Valkyrie
            LIBRARY -> NexusIconProvider.Instance.NAMESPACE
            NAMESPACE -> NexusIconProvider.Instance.NAMESPACE
        }
    }
}

