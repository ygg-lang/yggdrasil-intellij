package valkyrie.ide.view.filter


import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement
import valkyrie.ide.view.ValkyrieStructureItem
import valkyrie.ide.view.ValkyrieVisibility


class PublicElementsFilter : Filter {

    override fun getName() = "view.PublicElementsFilter"

    override fun isReverted() = false
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        yggdrasil.language.YggdrasilBundle.message(name),
        null,
        AllIcons.Nodes.Public
    )

    override fun isVisible(node: TreeElement): Boolean {
        return (node as? ValkyrieStructureItem)?.visibility == ValkyrieVisibility.Public
    }
}
