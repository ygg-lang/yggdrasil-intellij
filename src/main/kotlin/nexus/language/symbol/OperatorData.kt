package nexus.language.symbol

import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import valkyrie.ide.doc.DocumentationRenderer
import valkyrie.ide.highlight.NexusHighlightColor

//import nexus.language.psi.ValkyrieTypes

@Suppress("MemberVisibilityCanBePrivate")
class OperatorData(
    val name: String,
    val symbol: String,
    val detail: String = "",
    val associative: OperatorAssociativity = OperatorAssociativity.NONE,
    val priority: Int = 100,
) {
    fun documentation(doc: DocumentationRenderer) {
        doc.append(NexusHighlightColor.KEYWORD, "operator ")
        doc.append(NexusHighlightColor.SYM_MACRO, symbol)
        doc.append(NexusHighlightColor.KEYWORD, " de-sugars ")
        doc.append(NexusHighlightColor.SYM_FUNCTION_FREE, name)
        doc.append("<br/>")
        doc.append(NexusHighlightColor.KEYWORD, "associative ")
        doc.append(NexusHighlightColor.SYM_MACRO, associative.toString())
        doc.append("<br/>")
        doc.append(NexusHighlightColor.KEYWORD, "priority ")
        doc.append(NexusHighlightColor.SYM_CONSTANT, priority.toString())
        doc.append("<hr/>")
        doc.append(detail)
    }

    companion object {
        fun builtinData(name: PsiElement): OperatorData? = when (name.elementType) {
//            ValkyrieTypes.OP_ADD -> OperatorData(
//                "add",
//                "+",
//                """
//                a + b
//                """.trimIndent()
//            )
//            ValkyrieTypes.OP_INC -> OperatorData(
//                "++",
//                "increase",
//                """
//                a ++ b
//                ++a
//                """.trimIndent()
//            )
            else -> null
        }
    }
}