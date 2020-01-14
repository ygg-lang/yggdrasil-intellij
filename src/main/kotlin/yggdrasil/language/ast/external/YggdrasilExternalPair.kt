package yggdrasil.language.ast.external

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.YggdrasilNamepathNode

class YggdrasilExternalPair(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    private val language by lazy {
        YggdrasilParser.getChildOfType<YggdrasilIdentifierNode>(this)
    }
    private val external by lazy {
        YggdrasilParser.getChildOfType<YggdrasilNamepathNode>(this)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register_language(language)
        e.register_function(external?.identifier)
        val head = external?.namespace?.firstOrNull()
        when (head?.name) {
            "package", "super", "crate" -> {
                e.register_keyword(head)
            }
        }
    }
}