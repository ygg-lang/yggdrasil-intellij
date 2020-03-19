package yggdrasil.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.language.ast.YggdrasilNamepathNode
import yggdrasil.language.psi.YggdrasilIndentElement

class YggdrasilMacroCall(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilIndentElement, YggdrasilHighlightElement {
    private val namepath by lazy {
        YggdrasilParser.getChildOfType<YggdrasilNamepathNode>(this)
    }

    override fun on_indent(child: ASTNode): Indent {
        return Indent.getNormalIndent()
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_function(this.firstChild)
        e.register_function(namepath)
    }
}


