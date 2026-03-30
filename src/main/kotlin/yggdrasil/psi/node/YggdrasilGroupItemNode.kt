package yggdrasil.psi.node

import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilDeclaration
import yggdrasil.psi.YggdrasilTypes

class YggdrasilGroupItemNode(node: ASTNode) : YggdrasilDeclaration(node) {
    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return findChildByType(YggdrasilTypes.IDENTIFIER) as? YggdrasilIdentifierNode
    }

    override fun getBaseIcon(): javax.swing.Icon {
        return com.intellij.icons.AllIcons.Nodes.Field
    }
}
