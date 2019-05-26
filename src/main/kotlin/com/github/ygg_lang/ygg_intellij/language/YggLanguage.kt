package com.github.ygg_lang.ygg_intellij.language

import com.intellij.lang.Language
import com.github.ygg_lang.ygg_intellij.ide.icons.VomlIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class YggLanguage private constructor() : Language("YGG") {
    companion object {
        @JvmStatic
        val INSTANCE = YggLanguage()
    }
}
class YggFileType private constructor() : LanguageFileType(YggLanguage.INSTANCE) {
    override fun getName(): String = "YGG"
        //YggBundle.message("filetype.voml.name")

    override fun getDescription(): String = YggBundle.message("filetype.voml.description")

    override fun getDefaultExtension(): String = "ygg"

    override fun getIcon(): Icon = VomlIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = YggFileType()
    }
}

class YggFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, YggLanguage.INSTANCE) {
    override fun getFileType(): FileType = YggFileType.INSTANCE

    override fun toString(): String = YggBundle.message("filetype.voml.create")
}
