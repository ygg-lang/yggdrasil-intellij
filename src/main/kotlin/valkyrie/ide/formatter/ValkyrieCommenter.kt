package valkyrie.ide.formatter

import com.intellij.lang.Commenter


class ValkyrieCommenter : Commenter {
    override fun getLineCommentPrefix() = null
    override fun getBlockCommentPrefix() = "<%#"
    override fun getBlockCommentSuffix() = "#%>"
    override fun getCommentedBlockCommentPrefix() = null
    override fun getCommentedBlockCommentSuffix() = null
    override fun getLineCommentPrefixes(): MutableList<String> {
        return super.getLineCommentPrefixes()
    }


    override fun blockCommentRequiresFullLineSelection(): Boolean {
        return false
    }
}
