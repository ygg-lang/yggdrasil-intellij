package ygg.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import ygg.intellij.language.YggdrasilLanguage
import javax.swing.Icon

object YggdrasilFileType : LanguageFileType(YggdrasilLanguage) {
    override fun getName(): String = YggdrasilLanguage.id
    override fun getDescription(): String = YggdrasilBundle.message("filetype.description")
    override fun getDefaultExtension(): String = YggdrasilLanguage.FileExtension
    override fun getIcon(): Icon = YggdrasilIcon.FILE
}