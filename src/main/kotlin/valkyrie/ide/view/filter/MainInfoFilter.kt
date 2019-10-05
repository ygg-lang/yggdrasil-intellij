package valkyrie.ide.view.filter


import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement
import yggdrasil.language.ast.classes.YggdrasilClassFieldNode
import yggdrasil.language.ast.classes.YggdrasilClassMethodNode
import yggdrasil.language.ast.classes.YggdrasilClassStatement
import valkyrie.ide.view.ValkyrieStructureItem


class MainInfoFilter : Filter {
    override fun getName() = "view.MainInfoFilter"

    override fun isReverted() = false
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        yggdrasil.language.NexusBundle.message(this.name),
        null,
        AllIcons.Nodes.Favorite
    )

    override fun isVisible(node: TreeElement): Boolean {
        if (node is ValkyrieStructureItem) {
            when (node.node) {
                // class
                is YggdrasilClassStatement -> return true
                is YggdrasilClassFieldNode -> return true
                is YggdrasilClassMethodNode -> return true
            }
        }
        return false;
    }
}
