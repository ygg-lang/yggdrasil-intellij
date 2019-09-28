package valkyrie.ide.goto

import com.intellij.ide.bookmark.Bookmark
import com.intellij.ide.bookmark.BookmarkProvider
import com.intellij.ide.bookmark.FileBookmark
import com.intellij.ide.util.treeView.AbstractTreeNode
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile


class ValkyrieBookmark : BookmarkProvider {
    override fun compare(o1: Bookmark?, o2: Bookmark?): Int {
        TODO("Not yet implemented")
    }

    override fun getWeight(): Int {
        return 100;
    }

    override fun getProject(): Project {
        TODO("Not yet implemented")
    }

    override fun createBookmark(map: MutableMap<String, String>): Bookmark? {
        return object : FileBookmark {
            override val attributes: Map<String, String>
                get() = TODO("Not yet implemented")
            override val file: VirtualFile
                get() = TODO("Not yet implemented")
            override val provider: BookmarkProvider
                get() = TODO("Not yet implemented")

            override fun canNavigate(): Boolean {
                TODO("Not yet implemented")
            }

            override fun canNavigateToSource(): Boolean {
                TODO("Not yet implemented")
            }

            override fun createNode(): AbstractTreeNode<*> {
                TODO("Not yet implemented")
            }

            override fun equals(other: Any?): Boolean {
                TODO("Not yet implemented")
            }

            override fun hashCode(): Int {
                TODO("Not yet implemented")
            }

            override fun navigate(requestFocus: Boolean) {
                TODO("Not yet implemented")
            }

        }
    }

    override fun createBookmark(context: Any?): Bookmark? {
        TODO("Not yet implemented")
    }

}