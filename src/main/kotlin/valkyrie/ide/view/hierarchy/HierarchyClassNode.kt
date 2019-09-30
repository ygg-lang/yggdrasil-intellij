package valkyrie.ide.view.hierarchy

import com.intellij.ide.hierarchy.HierarchyNodeDescriptor
import com.intellij.ide.util.treeView.NodeDescriptor
import com.intellij.openapi.roots.ui.util.CompositeAppearance
import com.intellij.ui.SimpleTextAttributes
import yggdrasil.language.ast.classes.YggdrasilClassStatement

class HierarchyClassNode : HierarchyNodeDescriptor {
    val node: YggdrasilClassStatement

    constructor(node: YggdrasilClassStatement) : super(node.project, null, node, false) {
        this.node = node
        cachedChildren = arrayOf(this, this)
    }


    override fun getParentDescriptor(): NodeDescriptor<*> {
        return this
    }

    override fun update(): Boolean {
        myName = node.name;
        myHighlightedText = CompositeAppearance()
        myHighlightedText.beginning.addText(node.name, SimpleTextAttributes.REGULAR_ATTRIBUTES)
        myHighlightedText.ending.addText(" (std.test)", SimpleTextAttributes.GRAY_ATTRIBUTES)
//        myHighlightedText.suffix.addText(" inline", SimpleTextAttributes.GRAY_ATTRIBUTES)
        return super.update()
    }
}


