package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilDeclaration
import yggdrasil.psi.node.YggdrasilIdentifierNode
import yggdrasil.psi.node.YggdrasilUnionVariant
import javax.swing.Icon

abstract class MixinUnionItem : YggdrasilDeclaration,  YggdrasilUnionVariant {
    constructor(node: ASTNode) : super(node)


    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.tagBranch?.identifier as? YggdrasilIdentifierNode
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Variable
    }
}