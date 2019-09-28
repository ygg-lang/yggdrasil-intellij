package valkyrie.ide.reference

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiCompletableReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement


@Suppress("UnstableApiUsage", "ConvertSecondaryConstructorToPrimary")
class ValkyrieReference : PsiCompletableReference {
    private val range: TextRange
    private val source: PsiElement
    private val target: PsiElement

    constructor(source: PsiElement, target: PsiElement, range: TextRange? = null) {
        when {
            range != null -> this.range = range
            else -> this.range = TextRange(0, source.textLength)
        }
        this.source = source
        this.target = target
    }

    override fun getElement(): PsiElement {
        return source
    }

    override fun getRangeInElement(): TextRange {
        return range
    }

    override fun resolveReference(): MutableCollection<out Symbol> {
        TODO("Not yet implemented")
    }

    override fun getCompletionVariants(): MutableCollection<LookupElement> {
        TODO("Not yet implemented")
    }
}

