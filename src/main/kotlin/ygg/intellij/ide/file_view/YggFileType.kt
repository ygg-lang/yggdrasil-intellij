package ygg.intellij.ide.file_view

import com.intellij.openapi.fileTypes.LanguageFileType
import ygg.intellij.YggBundle
import ygg.intellij.YggLanguage
import javax.swing.Icon

class YggFileType private constructor() : LanguageFileType(YggLanguage.INSTANCE) {
    override fun getName(): String = YggLanguage.LanguageID

    override fun getDescription(): String = YggBundle.message("filetype.description")

    override fun getDefaultExtension(): String = YggLanguage.LanguageExtensions

    override fun getIcon(): Icon = YggIconProvider.FILE

    companion object {
        @JvmStatic
        val INSTANCE = YggFileType()
    }
}