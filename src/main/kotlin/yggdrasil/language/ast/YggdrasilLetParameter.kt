package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.icons.AllIcons
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.PsiTreeUtil
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon

class YggdrasilLetParameter(node: CompositeElement) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner, YggdrasilHighlightElement {
    private val _identifier by lazy { findIdentifier() }
    val modifiers by lazy { findModifiers() };
    val mutable by lazy { isMutable() };
    override fun getName(): String {
        return _identifier.text
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode {
        return _identifier
    }

    override fun getIcon(flags: Int): Icon {
        return AllIcons.Nodes.Parameter
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(_identifier, this.getIcon(0))
    }

    private fun findModifiers(): List<YggdrasilIdentifierNode> {
        val all = PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilIdentifierNode::class.java);
        return all.dropLast(1);
    }

    // Need to be lazy, otherwise it will be an infinite loop
    private fun findIdentifier(): YggdrasilIdentifierNode {
        val all = PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilIdentifierNode::class.java);
        return all.last()
    }

    private fun isMutable(): Boolean {
        for (m in modifiers) {
            if (m.name == "mut" || m.name == "mutable") {
                return true
            }
        }
        return false
    }


    override fun on_highlight(e: NodeHighlighter) {
        if (mutable) {
            e.register(nameIdentifier, YggdrasilHighlightColor.SYM_LOCAL_MUT)
        } else {
            e.register(nameIdentifier, YggdrasilHighlightColor.SYM_LOCAL)
        }
        e.register_modifiers(modifiers)
    }
}