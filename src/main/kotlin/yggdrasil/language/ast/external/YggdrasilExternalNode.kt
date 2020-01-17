package yggdrasil.language.ast.external

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilIdentifierNode

class YggdrasilExternalNode(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement, PsiNameIdentifierOwner {
    private val _name by lazy {
        YggdrasilParser.getChildOfType<YggdrasilIdentifierNode>(this)
    }

    override fun getName(): String? {
        return _name?.name
    }

    override fun setName(p0: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return _name
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_function(_name)
    }
}