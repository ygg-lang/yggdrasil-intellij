package yggdrasil.language.ast.group

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilIdentifierNode
import javax.swing.Icon

class YggdrasilTagNode(node: CompositeElement) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner, YggdrasilHighlightElement {
    private val _name by lazy {
        YggdrasilParser.getChildOfType<YggdrasilIdentifierNode>(this)
    }

    override fun getName(): String? {
        return super.getName()
    }

    override fun setName(p0: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return _name
    }

    override fun getBaseIcon(): Icon? {
        return super.getBaseIcon()
    }

    override fun on_highlight(e: NodeHighlighter) {
        if (nameIdentifier != null) {
            e.register(nameIdentifier, YggdrasilHighlightColor.TAG_NODE)
        }
    }
}

