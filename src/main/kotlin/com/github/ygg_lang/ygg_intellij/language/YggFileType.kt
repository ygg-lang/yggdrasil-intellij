package com.github.ygg_lang.ygg_intellij.language

import com.github.ygg_lang.ygg_intellij.ide.icons.YggIconProvider
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class YggFileType private constructor() : LanguageFileType(YggLanguage.INSTANCE) {
    override fun getName(): String = YggLanguage.LanguageID

    override fun getDescription(): String = YggBundle.message("filetype.voml.description")

    override fun getDefaultExtension(): String = YggLanguage.LanguageExtensions

    override fun getIcon(): Icon = YggIconProvider.FILE

    companion object {
        @JvmStatic
        val INSTANCE = YggFileType()
    }
}