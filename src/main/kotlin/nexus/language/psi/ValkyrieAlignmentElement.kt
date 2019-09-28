package nexus.language.psi

import com.intellij.formatting.Alignment
import com.intellij.lang.ASTNode

interface ValkyrieAlignmentElement {
    @Suppress("FunctionName")
    fun on_alignment(child: ASTNode): Alignment?;
}