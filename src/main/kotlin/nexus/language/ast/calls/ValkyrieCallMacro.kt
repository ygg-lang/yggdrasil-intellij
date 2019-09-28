package nexus.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.psi.ValkyrieIndentElement

class ValkyrieCallMacro(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieIndentElement {
    override fun on_indent(child: ASTNode): Indent {
        return Indent.getNormalIndent()
    }

}


