package yggdrasil.language.symbol

//import nexus.language.psi_node.ValkyrieClassStatementNode
import com.intellij.model.Pointer
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import yggdrasil.language.ast.classes.NexusClassStatement

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

object WorkspaceManager {
    private val packages = mutableMapOf<String, PackageManager>()

    fun findDefinition(symbol: ValkyrieSymbol): PsiElement? {
        val packageManager = packages[symbol.packageName]
        return packageManager?.findDefinition(symbol)
    }

    fun defineClass(target: NexusClassStatement, packageName: String, namespace: String) {
        val packageManager = packages.getOrPut(packageName) { PackageManager() }
        val namespaceManager = packageManager.namespace.getOrPut(namespace) { NamespaceManager() }
        val define = namespaceManager.classes[target.name];
        val insert = ValkyrieClassDeclare(target, packageName, namespace);
    }

}

class PackageManager {
    val namespace = mutableMapOf<String, NamespaceManager>()
    fun findDefinition(symbol: ValkyrieSymbol): PsiElement? {
        val namespace = namespace[symbol.namespace]
        return namespace?.findDefinition(symbol)
    }
}

class NamespaceManager {
    val classes = mutableMapOf<String, ValkyrieClassDeclare>()

    fun findDefinition(symbol: ValkyrieSymbol): PsiElement? {
        val findClass = classes[symbol.name];
        if (findClass != null) {
            return findClass.myDefine
        }
        return null
    }
}

@Suppress("UnstableApiUsage")
class ValkyrieClassDeclare : PsiSymbolDeclaration {
    var mySymbol: ValkyrieSymbol;
    var myDefine: PsiElement;

    constructor(classNode: NexusClassStatement, packageName: String, namespace: String) {
        mySymbol = ValkyrieSymbol(packageName, namespace, classNode.name ?: "[Missing]")
        myDefine = classNode
    }


    override fun getDeclaringElement(): NexusClassStatement {
        return myDefine as NexusClassStatement
    }

    override fun getRangeInDeclaringElement(): TextRange {
        return declaringElement.nameIdentifier.textRange ?: declaringElement.textRange
    }

    override fun getSymbol(): ValkyrieSymbol {
        return mySymbol
    }
}