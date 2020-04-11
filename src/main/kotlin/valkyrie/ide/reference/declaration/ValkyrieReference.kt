package valkyrie.ide.reference.declaration

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilDefineUnion
import yggdrasil.psi.node.YggdrasilGroupItemNode
import yggdrasil.psi.node.YggdrasilIdentifierNode

open class ValkyrieReference : PsiPolyVariantReference {
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
        return null
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        return resolveSequence()
            .map {
                PsiElementResolveResult(it)
            }
            .toList().toTypedArray()
    }

  private  fun resolveSequence(): Sequence<PsiNameIdentifierOwner> {
        return element.containingFile.definitions.getCache().filter {
            it.name == element.name

        }
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


    fun highlight(highlighter: NodeHighlighter) {
        return when (resolveSequence().first()) {
            is YggdrasilClassNode -> highlighter.highlight(_element, HighlightColor.RULE_CLASS)
            is YggdrasilDefineUnion -> highlighter.highlight(_element, HighlightColor.RULE_UNION)
            is YggdrasilGroupItemNode -> highlighter.highlight(_element, HighlightColor.SYM_CONSTANT)
            else -> {

            }
        }
    }
}