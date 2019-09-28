package nexus.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object NexusFileType : LanguageFileType(nexus.language.NexusLanguage) {
    override fun getName(): String = nexus.language.NexusLanguage.id

    override fun getDescription(): String = nexus.language.NexusBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "ne;nexus;"

    override fun getIcon(): Icon = NexusIconProvider.Instance.Valkyrie

}