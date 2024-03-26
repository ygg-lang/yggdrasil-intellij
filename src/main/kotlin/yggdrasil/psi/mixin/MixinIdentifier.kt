package yggdrasil.psi.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.SharedImplUtil
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.reference.declaration.ValkyrieReference
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilIdentifier
import yggdrasil.psi.node.YggdrasilIdentifierNode
import yggdrasil.psi.node.YggdrasilUnionNode

abstract class MixinIdentifier(node: ASTNode) : YggdrasilElement(node),

    YggdrasilIdentifier {

    override fun getContainingFile(): YggdrasilFileNode {
        return SharedImplUtil.getContainingFile(node) as YggdrasilFileNode
    }

    override fun getName(): String? {
        return this.text.trim('`')
    }


    override fun getReference(): ValkyrieReference? {
        if (this.parent is YggdrasilClassNode) {
            return null
        }
        if (this.parent is YggdrasilUnionNode) {
            return null
        }
        return ValkyrieReference(this as YggdrasilIdentifierNode)
    }


    override fun highlight(highlighter: NodeHighlighter) {
        return when (this.text) {
            "HIDE", "ANY", "INDENT", "DEDENT" -> highlighter.highlight(this, HighlightColor.SYM_MACRO)
            "SOI", "START_OF_INPUT",
            "EOI", "END_OF_INPUT",
            "EOF", "END_OF_FILE",
            "EOL", "END_OF_LINE",
            "ROL", "REST_OF_LINE",
            -> highlighter.highlight(this, HighlightColor.SYM_CONSTANT)

            else -> {
                if (this.reference != null) {
                    this.reference!!.highlight(highlighter)
                } else {

                }


            }
        }
    }


}