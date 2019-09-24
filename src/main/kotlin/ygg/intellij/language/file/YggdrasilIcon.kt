package ygg.intellij.language.file

import com.intellij.icons.AllIcons
import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

object YggdrasilIcon : IconProvider() {
    val FILE = IconLoader.getIcon("/icons/fileIcon.svg", YggdrasilIcon::class.java)
    val CONSTANT = AllIcons.Nodes.Constant
    val KEYWORD = AllIcons.Nodes.Bookmark
    val Class = AllIcons.Nodes.Class
    val Union = AllIcons.Nodes.Enum
    val Macro = AllIcons.Nodes.Method

    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        return null
    }
}
