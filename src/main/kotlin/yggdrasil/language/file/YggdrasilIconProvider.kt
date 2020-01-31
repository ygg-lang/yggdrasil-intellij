package yggdrasil.language.file

import com.intellij.icons.AllIcons
import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class YggdrasilIconProvider : IconProvider() {
    override fun getIcon(psiElement: PsiElement, flags: Int): Icon? {
        val file = psiElement.containingFile
        return when {
            file != null && file.name.endsWith(".ygg") -> {
                Instance.File
            }

            else -> {
                null
            }
        }
    }

    object Instance {
        val File = IconLoader.getIcon("/icons/ygg.svg", YggdrasilIconProvider::class.java)
        val SNIPPET = AllIcons.Actions.MoreHorizontal
        val CLASS = AllIcons.Nodes.Class
        val UNION = AllIcons.Nodes.Enum
        val TRAIT = AllIcons.Nodes.Interface
        val Function = AllIcons.Nodes.Function
    }
}