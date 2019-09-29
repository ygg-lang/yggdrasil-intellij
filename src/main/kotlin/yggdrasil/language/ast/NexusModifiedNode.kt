package yggdrasil.language.ast


import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.PsiTreeUtil
import yggdrasil.antlr.childrenWithLeaves
import yggdrasil.language.psi.types.ValkyrieModifiedType
import org.jetbrains.annotations.Unmodifiable

class NexusModifiedNode(node: CompositeElement, val kind: ValkyrieModifiedType) : ASTWrapperPsiElement(node) {
    private fun filterAll(): @Unmodifiable MutableList<NexusIdentifierNode> {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, NexusIdentifierNode::class.java)
    }

    fun findModifiers(): List<NexusIdentifierNode> {
        return when (kind) {
            ValkyrieModifiedType.Pure -> {
                filterAll()
            }

            ValkyrieModifiedType.ModifiedIdentifier -> {
                filterAll().dropLast(1)
            }

            ValkyrieModifiedType.ModifiedNamepath -> {
                val items = mutableListOf<NexusIdentifierNode>();
                for (child in this.childrenWithLeaves) {
                    if (child is PsiWhiteSpace) {
                        continue;
                    } else if (child is NexusIdentifierNode) {
                        items.add(child)
                    } else {
                        break;
                    }
                }
                return items.dropLast(1)
            }
        }
    }

    fun findIdentifier(): NexusIdentifierNode? {
        return if (kind == ValkyrieModifiedType.Pure) {
            null
        } else {
            filterAll().lastOrNull()
        }
    }

    fun findNamepath(): List<NexusIdentifierNode> {
        return emptyList()
    }


    companion object {
        // Need to be lazy, otherwise it will be an infinite loop
        fun findModifiers(node: PsiElement): List<NexusIdentifierNode> {
            val proxy = PsiTreeUtil.getChildOfType(node, NexusModifiedNode::class.java)
            return proxy?.findModifiers() ?: listOf()
        }

        fun findNamepath(node: PsiElement): List<NexusIdentifierNode> {
            val proxy = PsiTreeUtil.getChildOfType(node, NexusModifiedNode::class.java)
            return proxy?.findNamepath() ?: listOf()
        }

        // Need to be lazy, otherwise it will be an infinite loop
        fun findIdentifier(node: PsiElement): NexusIdentifierNode? {
            val proxy = PsiTreeUtil.getChildOfType(node, NexusModifiedNode::class.java)
            return proxy?.findIdentifier()
        }

    }
}

