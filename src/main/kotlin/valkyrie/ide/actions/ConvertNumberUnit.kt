package valkyrie.ide.actions

import com.intellij.codeInsight.intention.numeric.AbstractNumberConversionIntention
import com.intellij.codeInsight.intention.numeric.NumberConverter
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import nexus.language.psi.ValkyrieFactory
import valkyrie.ide.formatter.ValkyrieNumberConverter

class ConvertNumberUnit(private val display: String, private val base: Int) : AbstractNumberConversionIntention() {


    override fun extract(element: PsiElement): NumberConversionContext? {
        return NumberConversionContext(element, 0, element.text, true)
    }

    override fun getConverters(file: PsiFile): MutableList<NumberConverter> {
        return mutableListOf(ValkyrieNumberConverter())
    }

    override fun replace(sourceElement: PsiElement?, replacement: String?) {
        if (sourceElement == null || replacement == null) {
            return
        }
        val target = ValkyrieFactory(sourceElement).createNumberLiteral(replacement, "");
        sourceElement.replace(target)
    }
}

