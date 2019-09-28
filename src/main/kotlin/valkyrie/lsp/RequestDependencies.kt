package valkyrie.lsp

import com.intellij.openapi.roots.SyntheticLibrary

//@Serializable
data class RequestDependencies(val workspace: String) {
    //    @Serializable
    data class DependenciesInfo(
        val name: String,
        val version: String,
        val path: String,
        val kind: Int,
    )

    companion object {
        fun request(workspace: String?): MutableList<SyntheticLibrary> {
//            val out = LanguageClient.send<RequestDependencies, List<DependenciesInfo>>("workspace/dependencies", RequestDependencies(workspace ?: ""))
//            return out.map { DependenceLibrary(it) }.toMutableSmartList()
            return mutableListOf()
        }
    }
}

