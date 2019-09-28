package valkyrie.ide.annotator

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType

private fun PsiElement?.endSemicolon(): PsiElement? {
    val next = PsiTreeUtil.skipWhitespacesAndCommentsForward(this)
    return when (next.elementType) {
//        ValkyrieTypes.SEMICOLON -> next
        else -> null
    }
}

private fun PsiElement?.endComma(): PsiElement? {
    val next = PsiTreeUtil.skipWhitespacesAndCommentsForward(this)
    return when (next.elementType) {
//        ValkyrieTypes.COMMA -> next
        else -> null
    }
}