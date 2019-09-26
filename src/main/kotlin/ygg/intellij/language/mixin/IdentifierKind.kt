package ygg.intellij.language.mixin

import ygg.intellij.ide.highlight.HighlightColor
import ygg.intellij.language.psi.YggIdentifier
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggClimbStatementNode
import ygg.intellij.language.psi_node.YggDefineStatementNode
import ygg.intellij.language.psi_node.YggUnionStatementNode

enum class IdentifierKind {
    Normal,
    Class,
    Union,
    Function,
    Constant,
    Self,
    Builtin;

    companion object {
        fun getKind(psi: YggIdentifier): IdentifierKind {
            if (psi.text == "Self") return Self
            // if text all uppercase
            if (psi.text.all { it.isUpperCase() || it == '_' }) {
                return Constant
            }
            return when (psi.reference?.resolve()) {
                is YggClassStatementNode -> Class
                is YggUnionStatementNode, is YggClimbStatementNode -> Union
                is YggDefineStatementNode -> Function
                else -> Normal
            }
        }
    }

    fun getColor(): HighlightColor? = when (this) {
        Self -> HighlightColor.KEYWORD
        Class -> HighlightColor.SYM_CLASS
        Union -> HighlightColor.SYM_UNION
        Function -> HighlightColor.SYM_FUNCTION
        Constant -> HighlightColor.SYM_CONSTANT
        else -> null
    }
}


private fun isConstant(text: String): Boolean {
    // all uppercase or _
    return text.all { it.isUpperCase() || it == '_' }
}