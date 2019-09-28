package valkyrie.ide.project.crate

import com.intellij.psi.PsiFile
import com.intellij.psi.PsiTreeChangeEvent
import com.intellij.psi.PsiTreeChangeListener
import nexus.language.file.NexusFileNode


class ValkyrieFileListener : PsiTreeChangeListener {
    private val _cache: MutableMap<String, MutableList<NexusFileNode>> = mutableMapOf()

    init {
        // 初始化缓存, 遍历所有文件


    }


    private fun getNamespace(file: PsiFile): String? {
        // 根据你的实际情况，实现获取文件的 namespace 的逻辑
        // 这可能涉及解析文件内容，查找特定的注释或其他标记
        // 返回文件的 namespace 或 null（如果文件不属于有效的命名空间）
        return null
    }

    override fun beforeChildAddition(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    override fun beforeChildRemoval(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    override fun beforeChildReplacement(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    override fun beforeChildMovement(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    override fun beforeChildrenChange(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    override fun beforePropertyChange(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    override fun childAdded(event: PsiTreeChangeEvent) {
//        handlePsiFileChange(event.file)
    }

    override fun childRemoved(event: PsiTreeChangeEvent) {
//        handlePsiFileChange(event.file)
    }

    override fun childReplaced(event: PsiTreeChangeEvent) {
//        handlePsiFileChange(event.newChild)
    }

    override fun childrenChanged(event: PsiTreeChangeEvent) {
//        handlePsiFileChange(event.file)
    }

    override fun childMoved(event: PsiTreeChangeEvent) {

    }

    override fun propertyChanged(event: PsiTreeChangeEvent) {
        // 不需要在此处执行任何操作
    }

    private fun handlePsiFileChange(file: NexusFileNode) {
//        if (file is PsiFile) {
//            val namespace = getNamespace(file)
//            if (namespace != null) {
//                val filesToUpdate: List<PsiFile?> = _cache[namespace]!!
//                // 执行表的更新操作
//                // ...
//            }
//        }
    }
}