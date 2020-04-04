package valkyrie.ide.reference.declaration

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiQualifiedReference
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilGroupItemNode
import yggdrasil.psi.node.YggdrasilIdentifierNode

import yggdrasil.psi.node.YggdrasilUnionNode

open class ValkyrieReference : PsiQualifiedReference {
    private val _element: YggdrasilIdentifierNode

    constructor(element: YggdrasilIdentifierNode) {
        this._element = element
    }

    override fun getElement(): YggdrasilIdentifierNode {
        return _element
    }

    override fun getRangeInElement(): TextRange {
        return TextRange(0, _element.text.length)
    }

    override fun resolve(): PsiElement? {
        return _element.containingFile.definitions.cache[_element.name]
    }

    override fun getCanonicalText(): String {
        TODO("Not yet implemented")
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun bindToElement(element: PsiElement): PsiElement {
        TODO("Not yet implemented")
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return resolve() == element
    }

    override fun isSoft(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getQualifier(): PsiElement? {
        TODO("Not yet implemented")
    }

    override fun getReferenceName(): String? {
        TODO("Not yet implemented")
    }

    fun highlight(highlighter: NodeHighlighter) {
        return when (this.resolve()) {
            is YggdrasilClassNode -> highlighter.highlight(_element, HighlightColor.RULE_CLASS)
            is YggdrasilUnionNode -> highlighter.highlight(_element, HighlightColor.RULE_UNION)
            is YggdrasilGroupItemNode -> highlighter.highlight(_element, HighlightColor.SYM_CONSTANT)
            else -> {

            }
        }
    }
}