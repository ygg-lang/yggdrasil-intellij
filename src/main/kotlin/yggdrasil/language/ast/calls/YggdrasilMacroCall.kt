package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilNamepathNode
import yggdrasil.language.psi.YggdrasilIndentElement

class YggdrasilMacroCall(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilIndentElement {
    private val namepath by lazy {
        YggdrasilParser.getChildOfType<YggdrasilNamepathNode>(this)
    }

    override fun on_indent(child: ASTNode): Indent {
        return Indent.getNormalIndent()
    }
}


