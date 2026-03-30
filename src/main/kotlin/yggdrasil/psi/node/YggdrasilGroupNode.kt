package yggdrasil.psi.node

import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.YggdrasilDeclaration

class YggdrasilGroupNode(node: ASTNode) : YggdrasilElement(node) {
    val tokenList: List<YggdrasilDeclaration>
        get() = children.filterIsInstance<YggdrasilDeclaration>()
}
