package yggdrasil.language.ast.group

import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.antlr.YggdrasilParser
import yggdrasil.language.ast.YggdrasilIdentifierNode

class YggdrasilGroupItem : ASTWrapperPsiElement, PsiNameIdentifierOwner, YggdrasilHighlightElement {
    constructor(node: CompositeElement) : super(node) {

    }

    override fun getName(): String {
        return nameIdentifier?.text ?: ""
    }

    override fun setName(p0: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_identifier) as? YggdrasilIdentifierNode
    }

    override fun on_highlight(e: NodeHighlighter) {
        if (nameIdentifier != null) {
            e.register(nameIdentifier, YggdrasilHighlightColor.SYM_CONSTANT)
        }
    }

    fun lookUp(): LookupElementBuilder {
        return LookupElementBuilder.create(text).bold()
            .withLookupStrings(listOf(text))
            .withIcon(baseIcon)
//            .withInsertHandler { context, _ ->
//                val document = context.document
//                document.replaceString(context.startOffset, context.tailOffset, replace)
//                context.editor.caretModel.moveToOffset(context.tailOffset - offset)
//            }
    }
}

