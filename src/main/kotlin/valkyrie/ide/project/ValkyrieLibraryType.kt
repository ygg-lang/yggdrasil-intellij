package valkyrie.ide.project.`package`

import yggdrasil.language.file.YggdrasilIconProvider
import javax.swing.Icon

enum class ValkyrieLibraryType {
    Core, LIBRARY, NAMESPACE;

    fun getIcon(): Icon {
        return when (this) {
            Core -> YggdrasilIconProvider.Instance.File
            LIBRARY -> YggdrasilIconProvider.Instance.NAMESPACE
            NAMESPACE -> YggdrasilIconProvider.Instance.NAMESPACE
        }
    }
}

