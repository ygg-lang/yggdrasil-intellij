package nexus.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.icons.AllIcons
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.ast.NexusIdentifierNode
import nexus.language.ast.NexusNamepathNode
import nexus.language.file.NexusFileNode
import nexus.language.file.NexusIconProvider
import nexus.language.psi.ValkyrieLineMarkElement
import nexus.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.NamepathPresentation
import javax.swing.Icon


class NexusClassStatement(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
    NexusHighlightElement {
    private val _path by lazy { NexusNamepathNode.find(this)!! }

    override fun getName(): String {
        return nameIdentifier.text;
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): NexusIdentifierNode {
        return _path.nameIdentifier;
    }

    override fun getBaseIcon(): Icon {
        return NexusIconProvider.Instance.CLASS
    }

    override fun getContainingFile(): NexusFileNode {
        return super.getContainingFile() as NexusFileNode
    }

    override fun getPresentation(): ItemPresentation {
        return NamepathPresentation(_path, this.baseIcon)
    }

    override fun on_highlight(e: NodeHighlighter) {
        val lang = NexusIdentifierNode.find(this)
        if (lang != null) {
            e.register(lang, NexusHighlightColor.SYM_LANGUAGE)
        }

        e.register(nameIdentifier, NexusHighlightColor.SYM_CLASS)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
        val info = RelatedItemLineMarkerInfo(
            nameIdentifier.firstChild,
            nameIdentifier.textRange,
            AllIcons.Gutter.OverridenMethod,
            null,
            null,
            GutterIconRenderer.Alignment.RIGHT // 上
        ) { mutableListOf(GotoRelatedItem(this)) }
        e.add(info)
    }
}

