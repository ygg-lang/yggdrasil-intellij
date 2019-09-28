package nexus.language.psi

import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode

interface ValkyrieIndentElement {
    @Suppress("FunctionName")
    fun on_indent(child: ASTNode): Indent;
}