package yggdrasil.psi.node

import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilElement

class YggdrasilNumberNode(node: ASTNode) : YggdrasilElement(node) {
    val text: String
        get() = node.text
}
