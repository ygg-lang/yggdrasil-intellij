package valkyrie.ide.formatter

import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.EditorActionHandler
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class SmartEnter : SmartEnterProcessorWithFixers() {
    init {
        addFixers(
            CommaFixer()
        )
        addEnterProcessors(
            PlainEnterProcessor(getEnterHandler())
        )
    }

    override fun doNotStepInto(element: PsiElement): Boolean {
        return true
    }

    override fun processDefaultEnter(project: Project, editor: Editor, file: PsiFile) {
        plainEnter(editor)
    }
}

private class PlainEnterProcessor(val handler: EditorActionHandler) : SmartEnterProcessorWithFixers.FixEnterProcessor() {
    override fun doEnter(atCaret: PsiElement, file: PsiFile, editor: Editor, modified: Boolean): Boolean {
//        if (file !is ValkyrieFileNode) return false
        plainEnter(editor)
        return true
    }

//    override fun plainEnter(editor: Editor) {
//        handler.execute(editor, editor.caretModel.currentCaret, EditorUtil.getEditorDataContext(editor));
//    }
}