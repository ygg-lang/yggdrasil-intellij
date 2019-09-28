package nexus.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter


class NexusFunctionParameter(node: ASTNode) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner, NexusHighlightElement {
    val parameter by lazy { NexusModifiedNode.findIdentifier(this)!! }
    val modifiers by lazy { NexusModifiedNode.findModifiers(this) };

    override fun getName(): String {
        return this.parameter.text
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): NexusIdentifierNode {
        return this.parameter
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, NexusHighlightColor.SYM_ARG)
        e.register_modifiers(modifiers)
    }

}


