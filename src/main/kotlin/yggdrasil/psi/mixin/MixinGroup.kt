package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import yggdrasil.psi.YggdrasilDeclaration
import yggdrasil.psi.node.YggdrasilGroup
import yggdrasil.psi.node.YggdrasilGroupItemNode
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon


abstract class MixinGroup(node: ASTNode) : YggdrasilDeclaration(node), YggdrasilGroup {


    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifier as? YggdrasilIdentifierNode
    }



    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.ModuleGroup
    }

    override fun getTokenList(): MutableList<YggdrasilGroupItemNode> {
        if (groupBody == null) {
            return mutableListOf()
        }
        val items = mutableListOf<YggdrasilGroupItemNode>()
        for (item in groupBody!!.groupTermList) {
            val inner = item.groupItem as? YggdrasilGroupItemNode;
            if (inner != null) {
                items.add(inner)
            }
        }
        return items;
    }

}

