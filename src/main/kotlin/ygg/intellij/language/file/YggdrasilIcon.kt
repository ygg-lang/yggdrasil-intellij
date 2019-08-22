package ygg.intellij.language.file

import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class YggdrasilIcon : IconProvider() {
    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        return null
    }

    companion object {
        val FILE = IconLoader.getIcon("/icons/vomlIcon.svg", YggdrasilIcon::class.java)
    }
}
