package valkyrie.ide.project

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ex.ProjectNameProvider
import java.nio.file.Path

/**
 * A group of *members*.
 *
 * ```toml
 * [workspace]
 * name = "<ProjectName>"
 * ```
 */
@Suppress("UnstableApiUsage")
class ValkyrieProjectName : ProjectNameProvider {
    override fun getNameFile(project: Project): Path? {
//        val dir = project.basePath ?: return null;
//        for (file in File(dir).listFiles()!!) {
//            val name = file.nameWithoutExtension.lowercase(Locale.getDefault());
//            if (name == "legion") {
//                return file.toPath()
//            }
//        }
        return null
    }
}