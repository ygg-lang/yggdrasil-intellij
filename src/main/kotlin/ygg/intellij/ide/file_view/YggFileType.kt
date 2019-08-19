package ygg.intellij.ide.file_view

import com.intellij.openapi.fileTypes.LanguageFileType
import ygg.intellij.YggBundle
import ygg.intellij.YggdrasilLanguage
import javax.swing.Icon

class YggFileType private constructor() : LanguageFileType(YggdrasilLanguage.INSTANCE) {
    override fun getName(): String = YggdrasilLanguage.LanguageID

    override fun getDescription(): String = YggBundle.message("filetype.description")

    override fun getDefaultExtension(): String = YggdrasilLanguage.LanguageExtensions

    override fun getIcon(): Icon = YggIconProvider.FILE

    companion object {
        @JvmStatic
        val INSTANCE = YggFileType()
    }
}