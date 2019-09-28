package valkyrie.ide.hint

import com.intellij.lang.ExpressionTypeProvider
import com.intellij.psi.PsiElement

/// unknown usage
class TypeInfoHint : ExpressionTypeProvider<PsiElement>() {
    override fun getInformationHint(element: PsiElement): String {
        return "TypeInfoHint.getInformationHint"
    }

    override fun getErrorHint(): String {
        return "TypeInfoHint.getErrorHint"
    }

    override fun getExpressionsAt(elementAt: PsiElement): MutableList<PsiElement> {
        return mutableListOf(elementAt)
    }
}

