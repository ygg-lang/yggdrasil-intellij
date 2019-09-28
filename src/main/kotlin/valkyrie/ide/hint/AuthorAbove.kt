package valkyrie.ide.hint

//import nexus.language.psi_node.ValkyrieDefineStatementNode
//import nexus.language.psi_node.ValkyrieExtendsStatementNode
//import nexus.language.psi_node.ValkyrieUnionStatementNode
import com.intellij.codeInsight.hints.VcsCodeVisionLanguageContext
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import nexus.language.ast.NexusFunctionStatement
import nexus.language.ast.classes.NexusClassMethodNode
import nexus.language.ast.classes.NexusClassStatement
import java.awt.event.MouseEvent

@Suppress("UnstableApiUsage")
class AuthorAbove : VcsCodeVisionLanguageContext {
    /// 额外的点击事件
    /// 本身会打开 Git Blame
    override fun handleClick(mouseEvent: MouseEvent, editor: Editor, element: PsiElement) {

    }

    override fun isAccepted(element: PsiElement): Boolean {
        return element is NexusClassStatement
            || element is NexusFunctionStatement
            || element is NexusClassMethodNode
    }

    override fun isCustomFileAccepted(file: PsiFile): Boolean {
        return false
    }
}


