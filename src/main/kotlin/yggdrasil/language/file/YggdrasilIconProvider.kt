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

        //
        val NAMESPACE = AllIcons.Nodes.Artifact
        val SNIPPET = AllIcons.Actions.MoreHorizontal

        // val IMPORT = AllIcons.Welcome.Import
        val IMPORT = AllIcons.Nodes.EntryPoints
        val MACRO = AllIcons.Gutter.ExtAnnotation
        val ANNOTATION = AllIcons.Nodes.Annotationtype

        //
        val TYPE = AllIcons.Nodes.Type
        val CLASS = AllIcons.Nodes.Class
        val UNION = AllIcons.Nodes.Enum
        val VARIANT = AllIcons.Nodes.AnonymousClass
        val TRAIT = AllIcons.Nodes.Interface
        val Function = AllIcons.Nodes.Function
        val Field = AllIcons.Nodes.Field
        val Method = AllIcons.Nodes.Method
    }
}