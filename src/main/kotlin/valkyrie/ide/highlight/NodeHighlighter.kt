package valkyrie.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import nexus.language.ast.NexusIdentifierNode

@Suppress("FunctionName")
class NodeHighlighter(private val info: HighlightInfoHolder?) {
    fun register(element: PsiElement?, color: NexusHighlightColor) {
        if (element == null) return
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element.textRange)
        this.info?.add(builder.create())
    }

    fun register_modifiers(modifiers: Collection<NexusIdentifierNode>) {
        for (mod in modifiers) {
            this.register(mod, NexusHighlightColor.MODIFIER)
        }
    }

    fun register_macro(annotation: PsiElement) {
        this.register(annotation, NexusHighlightColor.SYM_MACRO)
    }
}