package yggdrasil.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.icons.ExpUiIcons
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.NexusModifiedNode
import yggdrasil.language.psi.ValkyrieLineMarkElement
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon

class NexusClassCustomNode(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement, ValkyrieLineMarkElement {
    val custom by lazy { NexusModifiedNode.findIdentifier(this)!! };
    val modifiers by lazy { NexusModifiedNode.findModifiers(this) };
    override fun on_highlight(e: NodeHighlighter) {
        e.register(custom, NexusHighlightColor.SYM_MACRO)
        e.register_modifiers(modifiers)
    }

    override fun getBaseIcon(): Icon {
        return ExpUiIcons.FileTypes.Json
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(custom, baseIcon)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
        val item = RelatedItemLineMarkerInfo(
            custom.firstChild,
            custom.textRange,
            baseIcon,
            null,
            null,
            GutterIconRenderer.Alignment.RIGHT // 下
        ) { mutableListOf(GotoRelatedItem(this)) };
        e.add(item)
    }
}