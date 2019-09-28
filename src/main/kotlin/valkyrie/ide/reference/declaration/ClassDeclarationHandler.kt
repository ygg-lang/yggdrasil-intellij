package valkyrie.ide.reference.declaration


//import nexus.language.psi_node.ValkyrieClassStatementNode
import com.intellij.codeInsight.hint.DeclarationRangeHandler
import com.intellij.openapi.util.TextRange
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import nexus.language.ast.classes.NexusClassStatement

@Suppress("UnstableApiUsage")
class ClassDeclarationHandler : DeclarationRangeHandler<NexusClassStatement> {
    override fun getDeclarationRange(container: NexusClassStatement): TextRange {
        val startOffset = container.startOffset
        val endOffset = container.endOffset
        return TextRange(startOffset, endOffset)
    }
}


