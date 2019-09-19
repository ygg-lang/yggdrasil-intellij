package ygg.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import ygg.intellij.language.YggdrasilLanguage
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggDefineStatementNode
import ygg.intellij.language.psi_node.YggUnionStatementNode
import javax.swing.Icon

class YggdrasilFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, YggdrasilLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = YggdrasilFileType
    override fun getPresentableText(): String {
        return YggdrasilBundle.message("action.create")
    }

    override fun getIcon(unused: Boolean): Icon {
        return YggdrasilIcon.FILE
    }

    val definitions: MutableMap<String, PsiElement>
        get() {
            val result =  mutableMapOf<String, PsiElement>()
            for (child in children) {
                when (child) {
                    is YggClassStatementNode -> result[child.name] = child
                    is YggUnionStatementNode -> result[child.name] = child
                    is YggDefineStatementNode -> result[child.name] = child
                }
            }
            return result
        }
}