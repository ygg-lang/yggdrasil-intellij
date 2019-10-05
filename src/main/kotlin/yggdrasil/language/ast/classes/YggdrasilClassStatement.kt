package yggdrasil.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.file.NexusFileNode
import yggdrasil.language.file.NexusIconProvider
import yggdrasil.language.psi.ValkyrieLineMarkElement
import yggdrasil.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import yggdrasil.antlr.YggdrasilParser
import javax.swing.Icon


class YggdrasilClassStatement(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
    YggdrasilHighlightElement {
    private val _all by lazy {
        YggdrasilParser.getChildrenOfType<YggdrasilIdentifierNode>(this)
    }

    override fun getName(): String? {
        return nameIdentifier?.text;
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return _all.lastOrNull();
    }

    override fun getBaseIcon(): Icon {
        return NexusIconProvider.Instance.CLASS
    }

    override fun getContainingFile(): NexusFileNode {
        return super.getContainingFile() as NexusFileNode
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(nameIdentifier!!, this.baseIcon)
    }

    override fun on_highlight(e: NodeHighlighter) {
//        val lang = YggdrasilIdentifierNode.find(this)
//        if (lang != null) {
//            e.register(lang, NexusHighlightColor.SYM_LANGUAGE)
//        }

        e.register(nameIdentifier, NexusHighlightColor.SYM_CLASS)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
//        val info = RelatedItemLineMarkerInfo(
//            nameIdentifier.firstChild,
//            nameIdentifier.textRange,
//            AllIcons.Gutter.OverridenMethod,
//            null,
//            null,
//            GutterIconRenderer.Alignment.RIGHT // 上
//        ) { mutableListOf(GotoRelatedItem(this)) }
//        e.add(info)
    }
}

