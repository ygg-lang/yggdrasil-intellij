package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.language.psi.ValkyrieInlayElement
import valkyrie.ide.hint.ParameterInlayHint
import yggdrasil.antlr.YggdrasilParser

class YggdrasilFunctionStatement(node: CompositeElement) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner, YggdrasilHighlightElement {
    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return YggdrasilParser.getChildOfType<YggdrasilIdentifierNode>(this)
    }

    override fun getName(): String? {
        return nameIdentifier?.name
    }
    override fun setName(p0: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_function(nameIdentifier)
    }
}