package valkyrie.ide.project

import com.intellij.openapi.module.Module
import com.intellij.openapi.module.PrimaryModuleManager
import com.intellij.openapi.project.Project

/**
 * Get the primary package in project.
 *
 * ```toml
 * [workspace]
 * primary = "<PackagePath>"
 * ```
 */
class ValkyriePrimaryPackage : PrimaryModuleManager() {
    override fun getPrimaryModule(project: Project): Module? {
        println("getPrimaryModule(${project})")
        return null
    }
}

