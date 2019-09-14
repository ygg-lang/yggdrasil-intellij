package ygg.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import ygg.intellij.language.psi.YggIdentifier
import ygg.intellij.language.psi.YggRuleExpr
import ygg.intellij.language.psi_node.YggIdentifierNode
import ygg.intellij.language.psi_node.YggRuleBodyNode



open class MixinRuleBody(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement() = this as YggRuleBodyNode;

    val identifiers: Array<YggIdentifierNode>
        get() {
            val list = mutableListOf<YggIdentifierNode>();
            originalElement.ruleExpr.visitIdentifier(list)
            return list.toTypedArray()
        }
}

private fun YggRuleExpr?.visitIdentifier(list: MutableList<YggIdentifierNode>) {
    if (this == null) return
    for (term in this.ruleTermList) {
        when (term.ruleAtom) {
            is YggIdentifier -> list.add(term.ruleAtom as YggIdentifierNode)
        }
    }
}
