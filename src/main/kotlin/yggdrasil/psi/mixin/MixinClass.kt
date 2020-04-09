package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilDeclaration
import yggdrasil.psi.node.YggdrasilClass
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon


abstract class MixinClass(node: ASTNode) : YggdrasilDeclaration(node), YggdrasilClass {
    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifier as YggdrasilIdentifierNode?
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Class
    }


}

