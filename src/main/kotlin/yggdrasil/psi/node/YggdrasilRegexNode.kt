package yggdrasil.psi.node

import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilElement

class YggdrasilRegexNode(node: ASTNode) : YggdrasilElement(node) {
    val regexText: String
        get() = node.text
}
