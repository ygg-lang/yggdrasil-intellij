package valkyrie.ide.goto

import com.intellij.ide.bookmark.BookmarksListProvider
import com.intellij.ide.util.treeView.AbstractTreeNode
import com.intellij.openapi.project.Project
import javax.swing.JComponent


class ValkyrieBookmarkList : BookmarksListProvider {
    override fun getWeight(): Int {
        return 20;
    }

    override fun getProject(): Project {
        TODO("Not yet implemented")
    }

    override fun createNode(): AbstractTreeNode<*>? {
        TODO("Not yet implemented")
    }

    override fun getEditActionText(): String? {
        TODO("Not yet implemented")
    }

    override fun canEdit(selection: Any): Boolean {
        TODO("Not yet implemented")
    }

    override fun performEdit(selection: Any, parent: JComponent) {
        TODO("Not yet implemented")
    }

    override fun getDeleteActionText(): String? {
        TODO("Not yet implemented")
    }

    override fun canDelete(selection: MutableList<*>): Boolean {
        TODO("Not yet implemented")
    }

    override fun performDelete(selection: MutableList<*>, parent: JComponent) {
        TODO("Not yet implemented")
    }

}