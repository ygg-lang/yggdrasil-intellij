package yggdrasil.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import yggdrasil.language.YggdrasilLanguage
import javax.swing.Icon

object YggdrasilFileType : LanguageFileType(YggdrasilLanguage) {
    override fun getName(): String = YggdrasilLanguage.id

    override fun getDescription(): String = yggdrasil.language.YggdrasilBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "ygg;yggdrasil;"

    override fun getIcon(): Icon = YggdrasilIconProvider.Instance.Yggdrasil

}