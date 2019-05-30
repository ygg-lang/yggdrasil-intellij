package com.github.ygg_lang.ygg_intellij.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class YggFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, YggLanguage.INSTANCE) {
    override fun getFileType(): FileType = YggFileType.INSTANCE

    override fun toString(): String = YggBundle.message("filetype.voml.create")
}