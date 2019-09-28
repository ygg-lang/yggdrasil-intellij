package valkyrie.ide.project.crate

import com.intellij.openapi.vcs.vfs.VcsFileSystem
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileSystem
import java.io.File
import java.io.InputStream
import java.io.OutputStream


class ValkyrieModuleFile(private val file: File) : VirtualFile() {
    override fun isDirectory(): Boolean {
        return false
    }

    override fun getName(): String {
        return file.name
    }

    override fun getFileSystem(): VirtualFileSystem {
        return VcsFileSystem.getInstance()
    }

    override fun getPath(): String {
        return file.absolutePath
    }

    override fun isWritable(): Boolean {
        return false
    }

    override fun isInLocalFileSystem(): Boolean {
        return super.isInLocalFileSystem()
    }


    override fun isValid(): Boolean {
        return true
    }

    override fun getParent(): VirtualFile? {
        return null
    }

    override fun getChildren(): Array<VirtualFile> {
        return arrayOf()
    }

    override fun getOutputStream(requestor: Any?, newModificationStamp: Long, newTimeStamp: Long): OutputStream {
        return file.outputStream()
    }

    override fun contentsToByteArray(): ByteArray {
        return file.readBytes()
    }

    override fun getModificationStamp(): Long {
        return file.lastModified()
    }

    override fun getTimeStamp(): Long {
        return file.lastModified()
    }

    override fun getLength(): Long {
        return file.length()
    }

    override fun refresh(asynchronous: Boolean, recursive: Boolean, postRunnable: Runnable?) {
        if (asynchronous) {
            postRunnable?.run()
        } else {
            postRunnable?.run()
        }
    }

    override fun getInputStream(): InputStream {
        return file.inputStream()
    }

    override fun getPresentableName(): String {
        return "ValkyrieLibraryTree.getPresentableName"
    }
}