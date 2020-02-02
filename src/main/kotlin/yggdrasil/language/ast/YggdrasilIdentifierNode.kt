package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.util.PsiTreeUtil
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.reference.declaration.ValkyrieReference
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.classes.YggdrasilGrammarNode
import yggdrasil.language.ast.group.YggdrasilTagBranch
import yggdrasil.language.ast.unions.YggdrasilUnionNode
import yggdrasil.language.file.YggdrasilFileNode

class YggdrasilIdentifierNode(node: ASTNode) : ASTWrapperPsiElement(node), PsiNamedElement, YggdrasilHighlightElement {
    override fun getName(): String {
        return text.trim('`')
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getContainingFile(): YggdrasilFileNode? {
        return super.getContainingFile() as? YggdrasilFileNode
    }

    /** Create and return a PsiReference object associated with this ID
     * node. The reference object will be asked to resolve this ref
     * by using the text of this node to identify the appropriate definition
     * site. The definition site is typically a subtree for a function
     * or variable definition whereas this reference is just to this ID
     * leaf node.
     *
     * As the AST factory has no context and cannot create different kinds
     * of PsiNamedElement nodes according to context, every ID node
     * in the tree will be of this type. So, we distinguish references
     * from definitions or other uses by looking at context in this method
     * as we have parent (context) information.
     */
    override fun getReference(): ValkyrieReference? {
        when (this.parent) {
            is YggdrasilGrammarNode,
            is YggdrasilClassNode,
            is YggdrasilUnionNode,
            is YggdrasilTagBranch,
            -> return null

            else -> {}
        }
        val target = this.containingFile?.Cache?.find(this) ?: return null
        return ValkyrieReference(this, target)
    }

    companion object {
        fun find(node: PsiElement): YggdrasilIdentifierNode? {
            return PsiTreeUtil.getChildOfType(node, YggdrasilIdentifierNode::class.java)
        }

        fun findMany(node: PsiElement): Array<YggdrasilIdentifierNode> {
            return PsiTreeUtil.getChildrenOfType(node, YggdrasilIdentifierNode::class.java) ?: arrayOf()
        }
    }

    override fun on_highlight(e: NodeHighlighter) {
        when (this.text) {
            "HIDE", "ANY",
            -> e.register(this, YggdrasilHighlightColor.KEYWORD)

            "SOI", "START_OF_INPUT",
            "EOI", "END_OF_INPUT",
            "EOF", "END_OF_FILE",
            "EOL", "END_OF_LINE",
            "ROL", "REST_OF_LINE",
            -> e.register(this, YggdrasilHighlightColor.SYM_CONSTANT)

            else -> {
                e.register(this, this.reference?.highlight())
            }
        }


    }
}

