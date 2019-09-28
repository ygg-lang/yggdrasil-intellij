package nexus.language.ast


import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiDocCommentBase
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import yggdrasil.antlr.YggdrasilAntlrParser


class ValkyrieCommentDocument(node: CompositeElement) : ASTWrapperPsiElement(node), PsiDocCommentBase {
    private val documentText: String = node.text;

    override fun getTokenType(): IElementType {
        return TokenIElementType(YggdrasilAntlrParser.BLOCK_COMMENT, "CommentBlock", nexus.language.NexusLanguage)
    }
    override fun getOwner(): PsiElement? {
        return PsiTreeUtil.skipWhitespacesAndCommentsForward(this)
    }

    fun render(): String {
        return "<div>$documentText<div>"
    }
}

