package valkyrie.ide.project.crate

import com.intellij.openapi.vcs.vfs.VcsFileSystem
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileSystem
import java.io.InputStream
import java.io.OutputStream


class ValkyrieModuleTree(private val display: String) : VirtualFile() {
    override fun getName() = display

    override fun getFileSystem(): VirtualFileSystem {
        return VcsFileSystem.getInstance()
    }

    override fun getPath(): String {
        return "F:\\Python\\vk-intellij\\src\\design\\lang"
    }

    override fun isWritable(): Boolean {
        return false
    }

    override fun isInLocalFileSystem(): Boolean {
        return super.isInLocalFileSystem()
    }

    override fun isDirectory(): Boolean {
        return true
    }

    override fun isValid(): Boolean {
        return true
    }

    override fun getParent(): VirtualFile? {
        return null
    }

    override fun getChildren(): Array<VirtualFile> {
        return arrayOf(ValkyrieModuleTree("child2"))
    }

    override fun getOutputStream(requestor: Any?, newModificationStamp: Long, newTimeStamp: Long): OutputStream {
        TODO("Not yet implemented")
    }

    override fun contentsToByteArray(): ByteArray {
        TODO("Not yet implemented")
    }

    override fun getTimeStamp(): Long {
        return 0
    }

    override fun getLength(): Long {
        return 0
    }

    override fun refresh(asynchronous: Boolean, recursive: Boolean, postRunnable: Runnable?) {
        TODO("Not yet implemented")
    }

    override fun getInputStream(): InputStream {
        TODO("Not yet implemented")
    }

    override fun getPresentableName(): String {
        return "ValkyrieLibraryTree.getPresentableName"
    }
}