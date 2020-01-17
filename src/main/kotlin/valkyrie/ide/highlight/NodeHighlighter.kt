package valkyrie.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.YggdrasilIdentifierNode

@Suppress("FunctionName")
class NodeHighlighter(private val info: HighlightInfoHolder?) {
    fun register(element: PsiElement?, color: YggdrasilHighlightColor) {
        if (element == null) return
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element.textRange)
        this.info?.add(builder.create())
    }

    fun register_modifiers(modifiers: Collection<YggdrasilIdentifierNode>) {
        for (mod in modifiers) {
            this.register(mod, YggdrasilHighlightColor.MODIFIER)
        }
    }
    fun register_keyword(annotation: PsiElement?) {
        this.register(annotation, YggdrasilHighlightColor.KEYWORD)
    }
    fun register_language(annotation: PsiElement?) {
        this.register(annotation, YggdrasilHighlightColor.SYM_LANGUAGE)
    }
    fun register_function(annotation: PsiElement?) {
        this.register(annotation, YggdrasilHighlightColor.SYM_FUNCTION)
    }
    fun register_macro(annotation: PsiElement?) {
        this.register(annotation, YggdrasilHighlightColor.SYM_MACRO)
    }
}