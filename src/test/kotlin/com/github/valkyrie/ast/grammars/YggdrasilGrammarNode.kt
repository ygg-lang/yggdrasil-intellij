package yggdrasil.language.ast.grammars

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import yggdrasil.antlr.YggdrasilAntlrParser
import yggdrasil.language.ast.YggdrasilBlockNode

class YggdrasilGrammarNode(node: CompositeElement) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner, YggdrasilHighlightElement {
    override fun getName(): String? {
        return super.getName()
    }

    override fun setName(p0: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_identifier)
    }


    fun findValue(text: String): PsiElement? {
        val block = YggdrasilParser.getChildOfType(this, YggdrasilAntlrParser.RULE_dict_block) ?: return null
        val pairs = YggdrasilParser.getChildrenOfType<YggdrasilGrammarPair>(block);
        for (pair in pairs) {
            if (pair.containsKey(text)) {
                return pair.children.lastOrNull()
            }
        }
        return null
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, YggdrasilHighlightColor.SYM_MACRO)
        for (pair in parsers()) {
            e.register(pair.key, YggdrasilHighlightColor.SYM_FUNCTION)
            val dict = pair.value as? YggdrasilBlockNode ?: continue
            for (inner in YggdrasilParser.getChildrenOfType<YggdrasilGrammarPair>(dict)) {
                e.register(inner.key, YggdrasilHighlightColor.SYM_MACRO)
            }
        }
    }

    fun parsers(): List<YggdrasilGrammarPair> {
        val parser = findValue("parser") as? YggdrasilBlockNode ?: return emptyList()
        return YggdrasilParser.getChildrenOfType<YggdrasilGrammarPair>(parser)
    }
}