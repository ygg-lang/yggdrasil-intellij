package ygg.intellij.ide.assist.fixers


import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import ygg.intellij.language.file.YggFile

class VomlSmartEnterProcessor : SmartEnterProcessorWithFixers() {
    init {
        addFixers(
            CommaFixer()
        )
        addEnterProcessors(
            PlainEnterProcessor()
        )
    }

    override fun doNotStepInto(element: PsiElement): Boolean {
        return true
    }

    override fun processDefaultEnter(project: Project, editor: Editor, file: PsiFile) {
        plainEnter(editor)
    }

    private class PlainEnterProcessor : FixEnterProcessor() {
        override fun doEnter(atCaret: PsiElement, file: PsiFile, editor: Editor, modified: Boolean): Boolean {
            if (file !is YggFile) return false
            plainEnter(editor)
            return true
        }
    }
}

