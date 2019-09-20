package ygg.intellij.language.mixin

import ygg.intellij.ide.highlight.HighlightColor
import ygg.intellij.language.psi.YggIdentifier
import ygg.intellij.language.psi_node.YggClassStatementNode
import ygg.intellij.language.psi_node.YggDefineStatementNode
import ygg.intellij.language.psi_node.YggUnionStatementNode

enum class IdentifierKind {
    Normal,
    Class,
    Union,
    Function,
    Self,
    Builtin;

    companion object {
        fun getKind(psi: YggIdentifier): IdentifierKind {
            return when (psi.reference?.resolve()) {
                is YggClassStatementNode -> Class
                is YggUnionStatementNode -> Union
                is YggDefineStatementNode -> Function
                else -> Normal
            }
        }
    }

    fun getColor(): HighlightColor? {
        return when (this) {
            Self -> HighlightColor.KEYWORD
            Class -> return HighlightColor.SYM_CLASS
            else -> {
                null
            }
        }
    }

}