package com.github.voml.voml_intellij.language

import com.intellij.lang.Language
import com.github.voml.voml_intellij.ide.icons.VomlIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class VomlLanguage private constructor() : Language("VOML") {
    companion object {
        @JvmStatic
        val INSTANCE = VomlLanguage()
    }
}
class VomlFileType private constructor() : LanguageFileType(VomlLanguage.INSTANCE) {
    override fun getName(): String = VomlBundle.message("filetype.voml.name")

    override fun getDescription(): String = VomlBundle.message("filetype.voml.description")

    override fun getDefaultExtension(): String = "voml"

    override fun getIcon(): Icon = VomlIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = VomlFileType()
    }
}

class VomlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, VomlLanguage.INSTANCE) {
    override fun getFileType(): FileType = VomlFileType.INSTANCE

    override fun toString(): String = VomlBundle.message("filetype.voml.create")
}
