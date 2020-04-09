package yggdrasil.language.file

import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class YggdrasilIconProvider : IconProvider() {
    override fun getIcon(psiElement: PsiElement, flags: Int): Icon? {
        val file = psiElement.containingFile ?: return null
        return when {
            file.name.endsWith(".ygg") -> Instance.File
            file.name.endsWith(".yggdrasil") -> Instance.File
            else -> null
        }
    }

    object Instance {
        val File = IconLoader.getIcon("/icons/ygg.svg", YggdrasilIconProvider::class.java)
    }
}
