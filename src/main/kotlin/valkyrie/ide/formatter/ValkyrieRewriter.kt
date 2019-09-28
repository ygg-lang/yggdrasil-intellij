package valkyrie.ide.formatter

import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.TokenSet
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.psi.util.nextLeaf
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import nexus.antlr.NexusLexer
import nexus.antlr.childrenWithLeaves
import valkyrie.ide.codeStyle.ValkyrieCodeStyleSettings

class ValkyrieRewriter {
    private var offsetDelta: Int = 0
    private val text: Document
    val settings: ValkyrieCodeStyleSettings

    constructor(text: Document, settings: ValkyrieCodeStyleSettings) : super() {
        this.text = text
        this.settings = settings
    }

//    override fun visitReturnType(o: ValkyrieReturnType) {
//        val delimiter = o.firstChild;
//        when (settings.return_type) {
//            ReturnType.Ignore -> return
//            ReturnType.Colon -> replaceNode(delimiter, ":")
//            ReturnType.Arrow -> replaceNode(delimiter, "->")
//            ReturnType.UnicodeArrow -> replaceNode(delimiter, "⟶")
//        }
//    }

    fun rewriteGeneric(o: PsiElement) {
        for (leaf in o.childrenWithLeaves) {
            when (leaf.text) {
                "<" -> replaceNode(leaf, "⟨")
                ">" -> replaceNode(leaf, "⟩")
                "::" -> deleteNode(leaf)
            }
        }
    }

    fun deleteDelimiterAfter(node: PsiElement) {
        val both = TokenSet.orSet(NexusLexer.Comma, NexusLexer.Semicolon);
        var leaf = PsiTreeUtil.skipWhitespacesForward(node)
        while (true) {
            when {
                leaf == null -> break
                both.contains(leaf.elementType) -> {
                    deleteNode(leaf)
                    leaf = PsiTreeUtil.skipWhitespacesForward(leaf)
                }

                else -> break
            }
        }
    }

    fun deleteNode(node: PsiElement?) {
        if (node == null) return
        val delta = node.textLength
        text.deleteString(node.startOffset + offsetDelta, node.endOffset + offsetDelta)
        offsetDelta -= delta
    }

    fun replaceNode(node: PsiElement?, replace: String) {
        if (node == null) return
        val delta = replace.length - node.textLength
        text.replaceString(node.startOffset + offsetDelta, node.endOffset + offsetDelta, replace)
        offsetDelta += delta
    }

    fun insertBefore(node: PsiElement, insert: String) {
        val delta = insert.length
        text.insertString(node.startOffset + offsetDelta, insert)
        offsetDelta += delta
    }

    fun insertAfter(node: PsiElement, insert: String) {
        val delta = insert.length
        text.insertString(node.endOffset + offsetDelta, insert)
        offsetDelta += delta
    }

    fun fixDelimiter(element: PsiElement, config: ValkyrieCodeStyleSettings.CommaOrSemicolon) {
        val delimiter = element.nextLeaf(true) ?: return;
        val both = TokenSet.orSet(NexusLexer.Comma, NexusLexer.Semicolon);

        when (config) {
            ValkyrieCodeStyleSettings.CommaOrSemicolon.Ignore -> return
            ValkyrieCodeStyleSettings.CommaOrSemicolon.Nothing -> {
                if (both.contains(delimiter.elementType)) {
                    deleteNode(delimiter)
                }
            }

            ValkyrieCodeStyleSettings.CommaOrSemicolon.Comma -> when {
                NexusLexer.Semicolon.contains(delimiter.elementType) -> replaceNode(delimiter, ",")
                !NexusLexer.Comma.contains(delimiter.elementType) -> insertAfter(element, ",")
            }

            ValkyrieCodeStyleSettings.CommaOrSemicolon.Semicolon -> when {
                NexusLexer.Comma.contains(delimiter.elementType) -> replaceNode(delimiter, ";")
                !NexusLexer.Semicolon.contains(delimiter.elementType) -> insertAfter(element, ";")
            }
        }
        deleteDelimiterAfter(delimiter)
    }


}