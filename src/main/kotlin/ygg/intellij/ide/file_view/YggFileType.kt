package ygg.intellij.ide.file_view

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class YggFileType private constructor() : LanguageFileType(ygg.intellij.YggLanguage.INSTANCE) {
    override fun getName(): String = ygg.intellij.YggLanguage.LanguageID

    override fun getDescription(): String = ygg.intellij.YggBundle.message("filetype.voml.description")

    override fun getDefaultExtension(): String = ygg.intellij.YggLanguage.LanguageExtensions

    override fun getIcon(): Icon = YggIconProvider.FILE

    companion object {
        @JvmStatic
        val INSTANCE = YggFileType()
    }
}