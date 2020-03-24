package yggdrasil.psi.mixin

import com.intellij.lang.ASTNode
import valkyrie.ide.highlight.HighlightColor
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilIdentifier

abstract class MixinIdentifier(node: ASTNode) : YggdrasilElement(node),

    YggdrasilIdentifier {

    override fun getName(): String? {
        return this.text.trim('`')
    }


    fun getHighlight(): HighlightColor? {
        return when (this.text) {
            "HIDE", "ANY",
            -> HighlightColor.KEYWORD

            "SOI", "START_OF_INPUT",
            "EOI", "END_OF_INPUT",
            "EOF", "END_OF_FILE",
            "EOL", "END_OF_LINE",
            "ROL", "REST_OF_LINE",
            -> HighlightColor.SYM_CONSTANT

            else -> {
                null
            }
        }
    }

}