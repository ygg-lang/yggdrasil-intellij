package yggdrasil.psi.node

import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.YggdrasilTypes

class YggdrasilGrammarNode(node: ASTNode) : YggdrasilElement(node) {
    val grammarName: String?
        get() = node.findChildByType(YggdrasilTypes.IDENTIFIER)?.text
}
