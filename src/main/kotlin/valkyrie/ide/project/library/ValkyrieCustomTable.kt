package valkyrie.ide.project.`package`.library

import com.intellij.openapi.roots.libraries.CustomLibraryTableDescription
import com.intellij.openapi.roots.libraries.LibraryTablePresentation

class ValkyrieCustomTable : CustomLibraryTableDescription {
    override fun getTableLevel(): String {
        return "CustomTable.getTableLevel"
    }

    override fun getPresentation(): LibraryTablePresentation {
        return ValkyrieTablePresentation()
    }
}

private class ValkyrieTablePresentation : LibraryTablePresentation() {
    override fun getDisplayName(plural: Boolean): String {
        return "CustomTable.getPresentation"
    }

    override fun getDescription(): String {
        return "CustomTable.getPresentation"
    }

    override fun getLibraryTableEditorTitle(): String {
        return "CustomTable.getPresentation"
    }
}