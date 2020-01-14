package valkyrie.ide.formatter

import com.intellij.formatting.service.AsyncDocumentFormattingService
import com.intellij.formatting.service.AsyncFormattingRequest
import com.intellij.formatting.service.FormattingService
import com.intellij.psi.PsiFile
import yggdrasil.language.file.YggdrasilFileNode

class ValkyrieNativeFormat : AsyncDocumentFormattingService() {
    override fun getFeatures(): MutableSet<FormattingService.Feature> {
        TODO("Not yet implemented")
    }

    override fun canFormat(file: PsiFile): Boolean {
        if (file is YggdrasilFileNode) {
            // TODO: Check if config is true
            return false
        }
        return false
    }

    override fun createFormattingTask(formattingRequest: AsyncFormattingRequest): FormattingTask? {
        TODO("Not yet implemented")
    }

    override fun getNotificationGroupId(): String {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }
}