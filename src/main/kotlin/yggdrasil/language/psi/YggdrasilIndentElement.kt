package yggdrasil.language.psi

import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode

interface YggdrasilIndentElement {
    @Suppress("FunctionName")
    fun on_indent(child: ASTNode): Indent;
}