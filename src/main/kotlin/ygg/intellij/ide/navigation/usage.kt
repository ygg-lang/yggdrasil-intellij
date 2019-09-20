package ygg.intellij.ide.navigation

import com.intellij.psi.PsiReference
import com.intellij.usages.Usage
import com.intellij.usages.impl.UsageReferenceClassProvider

class usageReferenceClassProvider : UsageReferenceClassProvider {
    override fun getReferenceClass(usage: Usage): Class<out PsiReference>? {
        println("usageReferenceClassProvider.getReferenceClass(usage)")
        TODO("Not yet implemented")
    }
}