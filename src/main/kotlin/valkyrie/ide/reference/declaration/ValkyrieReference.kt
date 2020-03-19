package valkyrie.ide.reference.declaration

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiReferenceBase
import valkyrie.ide.highlight.YggdrasilHighlightColor
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilIdentifierNode
import yggdrasil.psi.node.YggdrasilUnionNode

open class ValkyrieReference(element: YggdrasilIdentifierNode, private val definition: PsiNameIdentifierOwner) :
    PsiReferenceBase<YggdrasilIdentifierNode>(element, TextRange(0, element.text.length)) {

    override fun getVariants(): Array<Any> {
        return arrayOf()
    }

    /** Change the REFERENCE's ID node (not the targeted def's ID node)
     * to reflect a rename.
     *
     * Without this method, we get an error ("Cannot find manipulator...").
     *
     * getElement() refers to the identifier node that references the definition.
     */

    override fun handleElementRename(newElementName: String): PsiElement {
//        return myElement!!.setName(newElementName)
        throw UnsupportedOperationException("not implemented")
    }

    /** Resolve a reference to the definition subtree (subclass of
     * IdentifierDefSubtree), do not resolve to the ID child of that
     * definition subtree root.
     */
    override fun resolve(): PsiElement? {
        return definition.nameIdentifier
    }


    fun highlight(): YggdrasilHighlightColor? =
        when (definition) {
            is YggdrasilClassNode -> {
                YggdrasilHighlightColor.RULE_CLASS
            }

            is YggdrasilUnionNode -> {
                YggdrasilHighlightColor.RULE_UNION
            }
//            is YggdrasilGroupItem -> {
//                YggdrasilHighlightColor.SYM_CONSTANT
//            }
            else -> {
                null
            }

        }
}