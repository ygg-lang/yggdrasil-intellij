package valkyrie.ide.view.hierarchy

import com.intellij.ide.hierarchy.HierarchyNodeDescriptor
import com.intellij.ide.hierarchy.HierarchyTreeStructure

class TypeHierarchyTree : HierarchyTreeStructure {
    constructor(descriptor: HierarchyNodeDescriptor) : super(descriptor.project, descriptor) {

    }

    override fun buildChildren(parent: HierarchyNodeDescriptor): Array<Any> {
        println("buildChildren ${parent.toString()}")
        println("buildChildren: ${parent.highlightedText}")
        return parent.cachedChildren
    }

    override fun isAlwaysShowPlus(): Boolean {
        return false
    }

    override fun isAlwaysLeaf(element: Any): Boolean {
        return false
    }

    override fun formatBaseElementText(): String {
        return "super.formatBaseElementText()"
    }

    override fun toString(): String {
        return "super.toString()"
    }
}