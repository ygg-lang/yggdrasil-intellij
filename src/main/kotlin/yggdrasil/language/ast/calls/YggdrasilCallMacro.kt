package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.psi.YggdrasilIndentElement

class YggdrasilCallMacro(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilIndentElement {
    override fun on_indent(child: ASTNode): Indent {
        return Indent.getNormalIndent()
    }

}


