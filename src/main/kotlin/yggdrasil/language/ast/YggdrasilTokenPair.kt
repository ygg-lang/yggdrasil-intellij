package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.antlr.YggdrasilParser

class YggdrasilTokenPair : ASTWrapperPsiElement, PsiNameIdentifierOwner, YggdrasilHighlightElement {
    constructor(node: CompositeElement) : super(node) {

    }

    override fun getName(): String? {
        return super.getName()
    }

    override fun setName(p0: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_identifier)
    }

    override fun on_highlight(e: NodeHighlighter) {
        if (nameIdentifier != null) {
            e.register(nameIdentifier, YggdrasilHighlightColor.SYM_CONSTANT)
        }
    }
}

