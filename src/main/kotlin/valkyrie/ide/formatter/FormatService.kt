package valkyrie.ide.formatter

import com.intellij.formatting.FormattingRangesInfo
import com.intellij.formatting.service.FormattingService
import com.intellij.lang.ImportOptimizer
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class FormatService : FormattingService {
    override fun getFeatures(): MutableSet<FormattingService.Feature> {
        TODO("Not yet implemented")
    }

    override fun canFormat(file: PsiFile): Boolean {
        TODO("Not yet implemented")
    }

    override fun formatElement(element: PsiElement, canChangeWhiteSpaceOnly: Boolean): PsiElement {
        TODO("Not yet implemented")
    }

    override fun formatElement(element: PsiElement, range: TextRange, canChangeWhiteSpaceOnly: Boolean): PsiElement {
        TODO("Not yet implemented")
    }

    override fun formatRanges(file: PsiFile, rangesInfo: FormattingRangesInfo?, canChangeWhiteSpaceOnly: Boolean, quickFormat: Boolean) {
        TODO("Not yet implemented")
    }

    override fun getImportOptimizers(file: PsiFile): MutableSet<ImportOptimizer> {
        TODO("Not yet implemented")
    }

}