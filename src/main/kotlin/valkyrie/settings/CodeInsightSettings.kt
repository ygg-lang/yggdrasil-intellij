package valkyrie.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.service
import com.intellij.util.xmlb.XmlSerializerUtil

@State(name = "ValkyrieCodeInsightSettings", storages = [Storage("valkyrie.xml")])
class CodeInsightSettings : PersistentStateComponent<CodeInsightSettings> {
    var showImportPopup: Boolean = false
    var importOutOfScopeItems: Boolean = true
    var suggestOutOfScopeItems: Boolean = true
    var addUnambiguousImportsOnTheFly: Boolean = false

    override fun getState(): CodeInsightSettings = this

    override fun loadState(state: CodeInsightSettings) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {
        fun getInstance(): CodeInsightSettings = service()
    }
}