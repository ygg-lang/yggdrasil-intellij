package valkyrie.ide.project.library

import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.roots.SyntheticLibrary
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.containers.toMutableSmartList
import valkyrie.ide.project.crate.ValkyrieModuleFilter
import valkyrie.ide.project.crate.ValkyrieModuleTree
import valkyrie.ide.project.`package`.ValkyrieLibraryType
//import valkyrie.lsp.LanguageClient
//import valkyrie.lsp.RequestDependencies
import java.io.File


// ImmutableSyntheticLibrary
class DependenceLibrary : SyntheticLibrary, ItemPresentation {
    val id: String;
    var version: String = "";
    var path: String = "";
    var kind: ValkyrieLibraryType = ValkyrieLibraryType.LIBRARY;

    constructor(id: String = "") : super() {
        this.id = id
    }


    override fun isShowInExternalLibrariesNode() = true;
    override fun getSourceRoots(): MutableCollection<VirtualFile> {
//        val iter = File(LanguageClient.libraryPath).listFiles(ValkyrieModuleFilter()) ?: return mutableListOf();
//        return iter.map { ValkyrieModuleTree(it.name) }.toMutableSmartList()
        return mutableListOf()
    }

    override fun getBinaryRoots(): MutableCollection<VirtualFile> {
        return mutableListOf()
    }

    override fun getExcludedRoots(): MutableSet<VirtualFile> {
        return mutableSetOf()
    }

    override fun getIcon(unused: Boolean) = kind.getIcon()
    override fun getPresentableText() = id;
    override fun getLocationString(): String? = when {
        version.isEmpty() -> null
        else -> "($version)"
    }

    override fun hashCode() = "$id-$version".hashCode()
    override fun equals(other: Any?) = when (other) {
        is DependenceLibrary -> this.hashCode() == other.hashCode()
        else -> false
    }

    override fun toString(): String {
        return super.toString()
    }
}

