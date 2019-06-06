package ygg.intellij.ide.file_view

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class YggFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ygg.intellij.YggLanguage.INSTANCE) {
    override fun getFileType(): FileType = YggFileType.INSTANCE

    override fun toString(): String = ygg.intellij.YggBundle.message("action.create")
}