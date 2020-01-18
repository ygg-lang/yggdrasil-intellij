package yggdrasil.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.icons.AllIcons
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.NexusModifiedNode
import yggdrasil.language.file.YggdrasilIconProvider
import yggdrasil.language.psi.ValkyrieInlayElement
import yggdrasil.language.psi.ValkyrieLineMarkElement
import yggdrasil.language.psi.YggdrasilScopeNode
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon


class YggdrasilClassFieldNode(node: CompositeElement) : YggdrasilScopeNode(node), PsiNameIdentifierOwner, YggdrasilHighlightElement,
    ValkyrieLineMarkElement, ValkyrieInlayElement {
    val field by lazy { NexusModifiedNode.findIdentifier(this)!! }
    val modifiers by lazy { NexusModifiedNode.findModifiers(this) };

    override fun getName(): String {
        return field.name
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode {
        return field
    }

    override fun isVisibilitySupported(): Boolean {
        return true;
    }

    override fun getBaseIcon(): Icon {
        for (m in modifiers) {
            if (m.name == "inherit") {
                return AllIcons.Gutter.OverridingMethod
            }
        }
        return YggdrasilIconProvider.Instance.Field
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(field, this.baseIcon)
    }


    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, YggdrasilHighlightColor.SYM_FIELD)
        e.register_modifiers(modifiers)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
        val item = RelatedItemLineMarkerInfo(
            nameIdentifier.firstChild,
            nameIdentifier.textRange,
            baseIcon,
            null,
            null,
            GutterIconRenderer.Alignment.RIGHT // 下
        ) { mutableListOf(GotoRelatedItem(this)) };
        e.add(item)
    }

}

