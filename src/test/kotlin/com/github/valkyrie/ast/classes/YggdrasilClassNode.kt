package yggdrasil.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
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
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.calls.YggdrasilModifiers
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.language.psi.ValkyrieLineMarkElement
import yggdrasil.language.psi.YggdrasilScopeNode
import javax.swing.Icon


class YggdrasilClassNode(node: CompositeElement) : YggdrasilScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
    YggdrasilHighlightElement {
    val modifiers by lazy {
        YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_modifiers) as? YggdrasilModifiers
    }
    val _identifier by lazy {
        YggdrasilParser.getChildOfType<YggdrasilIdentifierNode>(this)
    }


    override fun getName(): String {
        return nameIdentifier?.text ?: ""
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return _identifier;
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Class
    }

    override fun getContainingFile(): YggdrasilFileNode {
        return super.getContainingFile() as YggdrasilFileNode
    }


    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(nameIdentifier!!, this.baseIcon)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_modifiers(modifiers?.modifiers)
        e.register(nameIdentifier, YggdrasilHighlightColor.RULE_CLASS)
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

    fun createLookup(list: MutableCollection<LookupElement>) {
        if (name.isEmpty()) {
            return
        }
        val item = LookupElementBuilder.create(name!!).bold()
            .withLookupStrings(listOf(name))
            .withTailText(previewText(), true)
            .withIcon(baseIcon)
        list.add(item)
    }

    private fun previewText(): String {
        val block = YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_class_block) ?: return ""
        return block.text.trim('{', '}').trim()
    }
}
