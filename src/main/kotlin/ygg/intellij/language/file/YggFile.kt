package ygg.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class YggFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ygg.intellij.YggdrasilLanguage) {
    override fun getFileType(): FileType = YggFileType.INSTANCE
    override fun toString(): String = ygg.intellij.YggdrasilBundle.message("action.create")
}