package yggdrasil.language.ast.calls.unions

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.view.IdentifierPresentation
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.language.file.NexusIconProvider
import yggdrasil.language.psi.ValkyrieLineMarkElement
import yggdrasil.language.psi.YggdrasilScopeNode
import javax.swing.Icon

class YggdrasilUnionStatement(node: CompositeElement) : YggdrasilScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
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
        return NexusIconProvider.Instance.UNION
    }

    override fun getContainingFile(): YggdrasilFileNode {
        return super.getContainingFile() as YggdrasilFileNode
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(nameIdentifier!!, this.baseIcon)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_modifiers(_all.dropLast(1))
        e.register(nameIdentifier, YggdrasilHighlightColor.RULE_UNION)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
        val info = RelatedItemLineMarkerInfo(
            nameIdentifier!!.firstChild,
            nameIdentifier!!.firstChild.textRange,
            baseIcon,
            null,
            null,
            GutterIconRenderer.Alignment.RIGHT // 上
        ) { mutableListOf(GotoRelatedItem(this)) }
        e.add(info)
    }
}
