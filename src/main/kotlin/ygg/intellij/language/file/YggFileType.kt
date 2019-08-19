package ygg.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import ygg.intellij.YggdrasilBundle
import ygg.intellij.YggdrasilLanguage
import javax.swing.Icon

class YggFileType private constructor() : LanguageFileType(YggdrasilLanguage) {
    override fun getName(): String = YggdrasilLanguage.id
    override fun getDescription(): String = YggdrasilBundle.message("filetype.description")
    override fun getDefaultExtension(): String = "ygg;yggdrasil;"
    override fun getIcon(): Icon = YggIconProvider.FILE

    companion object {
        @JvmStatic
        val INSTANCE = YggFileType()
    }
}