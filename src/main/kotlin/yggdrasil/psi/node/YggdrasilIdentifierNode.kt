package yggdrasil.psi.node

import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilElement

class YggdrasilIdentifierNode(node: ASTNode) : YggdrasilElement(node) {
    val text: String
        get() = node.text
}
