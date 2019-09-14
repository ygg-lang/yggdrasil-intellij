package ygg.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import ygg.intellij.language.file.YggdrasilIcon
import ygg.intellij.language.psi_node.YggDefineStatementNode
import ygg.intellij.language.psi_node.YggIdentifierNode
import ygg.intellij.language.psi_node.YggRuleBodyNode

open class MixinDefineStatement(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement() = this as YggDefineStatementNode

    override fun getNameIdentifier() = originalElement.identifier as YggIdentifierNode

    override fun getIcon(flags: Int) = YggdrasilIcon.KEYWORD

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    val parameterNodes: Array<YggIdentifierNode>
        get() {
            val list = mutableListOf<YggIdentifierNode>();
            val names = mutableListOf<String>()
            if (originalElement.defineParameters != null) {
                for (pair in originalElement.defineParameters!!.definePairList) {
                    list.add(pair.identifier as YggIdentifierNode)
                    names.add(pair.identifier.text)
                }
            }
            for (node in (originalElement.ruleBody as YggRuleBodyNode).identifiers) {
                if (node.name in names) {
                    list.add(node)
                }
            }
            return list.toTypedArray()
        }
}