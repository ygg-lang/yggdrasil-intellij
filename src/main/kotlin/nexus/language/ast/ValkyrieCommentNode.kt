package nexus.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiComment
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType

class ValkyrieCommentNode : ASTWrapperPsiElement, PsiComment {
    private val _token: IElementType

    constructor(node: CompositeElement, token: IElementType) : super(node) {
        this._token = token
    }

    override fun getTokenType(): IElementType {
        return _token;
    }
}

