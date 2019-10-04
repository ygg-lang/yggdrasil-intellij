package yggdrasil.language.symbol

//import nexus.language.psi_node.ValkyrieClassStatementNode
import com.intellij.model.Pointer
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.classes.YggdrasilClassStatement

//import nexus.language.psi_node.ValkyrieExtendsStatementNode

//import nexus.language.psi_node.ValkyrieTraitStatementNode

@Suppress("UnstableApiUsage")
class ValkyrieSymbol(val packageName: String = "", val namespace: String = "", val name: String = "") : Pointer<ValkyrieSymbol>, Symbol {
    override fun dereference(): ValkyrieSymbol? {
        return this
    }

    override fun createPointer(): Pointer<out Symbol> {
        return this
    }
}
