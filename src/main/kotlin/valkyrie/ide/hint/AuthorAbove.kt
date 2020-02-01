package valkyrie.ide.hint

import com.intellij.codeInsight.hints.VcsCodeVisionLanguageContext
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.external.YggdrasilExternalNode
import yggdrasil.language.ast.external.YggdrasilInspectorNode
import yggdrasil.language.ast.unions.YggdrasilClimbStatement
import yggdrasil.language.ast.unions.YggdrasilUnionNode
import java.awt.event.MouseEvent

@Suppress("UnstableApiUsage")
class AuthorAbove : VcsCodeVisionLanguageContext {
    /// 额外的点击事件
    /// 本身会打开 Git Blame
    override fun handleClick(mouseEvent: MouseEvent, editor: Editor, element: PsiElement) {

    }

    override fun isAccepted(element: PsiElement): Boolean {
        return element is YggdrasilClassNode
            || element is YggdrasilUnionNode
            || element is YggdrasilClimbStatement
            || element is YggdrasilExternalNode
            || element is YggdrasilInspectorNode

    }

    override fun isCustomFileAccepted(file: PsiFile): Boolean {
        return false
    }
}


