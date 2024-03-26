package yggdrasil.psi.mixin

import com.intellij.lang.ASTNode
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilIdentifier

abstract class MixinIdentifier(node: ASTNode) : YggdrasilElement(node),

    YggdrasilIdentifier {

    override fun getName(): String? {
        return this.text.trim('`')
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

            }
        }
    }


}