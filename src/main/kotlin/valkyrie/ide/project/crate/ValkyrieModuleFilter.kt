package valkyrie.ide.project.crate

import java.io.File
import java.io.FileFilter

class ValkyrieModuleFilter : FileFilter {
    private val configFie = "fleet"
    override fun accept(pathname: File?): Boolean {
        if (pathname?.listFiles() == null) return false;
        for (file in pathname.listFiles()!!) {
            if (file.name == "$configFie.json5") {
                return true;
            }
            if (file.name == "$configFie.json") {
                return true;
            }
            if (file.name == "$configFie.toml") {
                return true;
            }
        }
        return true
    }
}

//     val jsonData = Json.decodeFromString<ModuleInfo>(string)
//@Serializable
private data class ModuleInfo(val a: Int, val b: String = "42")