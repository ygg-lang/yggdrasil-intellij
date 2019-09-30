package valkyrie.ide.reference.declaration


//import nexus.language.psi_node.ValkyrieClassStatementNode
import com.intellij.codeInsight.hint.DeclarationRangeHandler
import com.intellij.openapi.util.TextRange
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import yggdrasil.language.ast.classes.YggdrasilClassStatement

@Suppress("UnstableApiUsage")
class ClassDeclarationHandler : DeclarationRangeHandler<YggdrasilClassStatement> {
    override fun getDeclarationRange(container: YggdrasilClassStatement): TextRange {
        val startOffset = container.startOffset
        val endOffset = container.endOffset
        return TextRange(startOffset, endOffset)
    }
}


