package valkyrie.ide.actions

import com.intellij.codeInsight.intention.numeric.AbstractNumberConversionIntention
import com.intellij.codeInsight.intention.numeric.NumberConverter
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import yggdrasil.language.psi.ValkyrieFactory
import valkyrie.ide.formatter.ValkyrieNumberConverter

class ConvertNumberBase(private val base: Int) : AbstractNumberConversionIntention() {
    override fun extract(element: PsiElement): NumberConversionContext? {
//        if (element is ValkyrieNumberNode) {
//            element.integer?.let {
//                return NumberConversionContext(element, it, element.text, false)
//            }
//            element.decimal?.let {
//                return NumberConversionContext(element, it, element.text, false)
//            }
//        }
        return null


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

