package valkyrie.ide.matcher

import com.intellij.codeInsight.editorActions.CodeBlockProvider
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiFile


/**
 * Alt + Up/Down
 */
class ValkyrieCodeBlockProvider : CodeBlockProvider {
    override fun getCodeBlockRange(editor: Editor?, psiFile: PsiFile?): TextRange? {
        print("getCodeBlockRange $editor $psiFile")
        return null
    }
}


