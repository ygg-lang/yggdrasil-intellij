package yggdrasil.antlr

//import nexus.antlr.NexusAntlrParser.*
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.PsiBuilder
import com.intellij.openapi.progress.ProgressIndicatorProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParseTreeToPSIConverter
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import yggdrasil.antlr.YggdrasilAntlrParser.*
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.language.ast.*
import yggdrasil.language.ast.calls.YggdrasilAnnotation
import yggdrasil.language.ast.calls.YggdrasilMacroCall
import yggdrasil.language.ast.calls.YggdrasilModifiers
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.classes.YggdrasilGrammarNode
import yggdrasil.language.ast.external.YggdrasilExternalNode
import yggdrasil.language.ast.external.YggdrasilExternalPair
import yggdrasil.language.ast.external.YggdrasilGrammarPair
import yggdrasil.language.ast.external.YggdrasilInspectorNode
import yggdrasil.language.ast.literals.YggdrasilRegex
import yggdrasil.language.ast.tagged.YggdrasilTagBranch
import yggdrasil.language.ast.tagged.YggdrasilTagNode
import yggdrasil.language.ast.unions.YggdrasilUnionNode
import yggdrasil.language.ast.unions.YggdrasilVariantNode
import yggdrasil.language.psi.types.ValkyrieBlockType


class YggdrasilParser(parser: YggdrasilAntlrParser) : ANTLRParserAdaptor(YggdrasilLanguage, parser) {
    override fun parse(parser: Parser, root: IElementType): ParseTree {
        return (parser as YggdrasilAntlrParser).program()
    }


    override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
        return super.parse(root, builder)
    }

    override fun createListener(parser: Parser?, root: IElementType?, builder: PsiBuilder?): ANTLRParseTreeToPSIConverter {
        return RuleRewriter(language, parser, builder)
    }

    companion object {
        fun extractCompositeNode(node: CompositeElement): PsiElement {
            return RuleRewriter.extract(node)
        }

        inline fun <reified T> getChildOfType(psi: PsiElement?): T? where T : PsiElement {
            if (psi != null) {
                return PsiTreeUtil.getChildOfType(psi, T::class.java)
            }
            return null
        }

        fun getChildOfType(psi: PsiElement?, parserRule: Int): PsiElement? {
            if (psi != null) {
                for (child in psi.children) {
                    val type = child.node.elementType as RuleIElementType;
                    if (type.ruleIndex == parserRule) {
                        return child;
                    }
                }
            }
            return null;
        }

        inline fun <reified T> getChildrenOfType(psi: PsiElement?): List<T> where T : PsiElement {
            if (psi != null) {
                return PsiTreeUtil.getChildrenOfTypeAsList(psi, T::class.java)
            }
            return emptyList()
        }


        fun getChildrenOfType(psi: PsiElement?, parserRule: Int): List<PsiElement> {
            val output = mutableListOf<PsiElement>();
            if (psi != null) {
                for (child in psi.children) {
                    val type = child.node.elementType as RuleIElementType;
                    if (type.ruleIndex == parserRule) {
                        output.add(child)
                    }
                }
            }
            return output;
        }
    }
}


private class RuleRewriter(language: Language, parser: Parser?, builder: PsiBuilder?) :
    ANTLRParseTreeToPSIConverter(language, parser, builder) {
    override fun enterEveryRule(ctx: ParserRuleContext?) {
        ProgressIndicatorProvider.checkCanceled()
        if (ignoreContext(ctx)) {
            return
        }
        markers.push(getBuilder().mark())
    }

    override fun exitEveryRule(ctx: ParserRuleContext?) {
        ProgressIndicatorProvider.checkCanceled()
        if (ignoreContext(ctx)) {
            return
        }
        val marker = markers.pop()
        val index = getRuleElementTypes()[ctx!!.ruleIndex];
        marker.done(index)
    }

    override fun visitErrorNode(node: ErrorNode?) {
        super.visitErrorNode(node)
    }

    override fun visitTerminal(node: TerminalNode?) {
        builder!!.advanceLexer()
    }


    private fun ignoreContext(ctx: ParserRuleContext?): Boolean {
        return when (ctx) {
            is ProgramContext, is Program_itemContext,
            is Grammar_itemContext,


//            is Class_statemntsContext, is Flags_statementContext, is Union_statementsContext,
//            is Trait_statementContext, is Extends_statementContext,
//            is Function_statementContext, is Return_partContext,
//            is LeadingContext,
//            is NamejoinContext, is Namejoin_freeContext, is Range_joinContext,
            -> true

            null -> true
            else -> false
        }

    }

    companion object {
        fun extract(node: CompositeElement): PsiElement {
            val type: RuleIElementType = node.elementType as RuleIElementType;
            return when (type.ruleIndex) {
                RULE_define_grammar -> YggdrasilGrammarNode(node)
                RULE_grammar_pair -> YggdrasilGrammarPair(node)
                // class
                RULE_define_class -> YggdrasilClassNode(node)
                RULE_class_block -> YggdrasilBlockNode(node, ValkyrieBlockType.Brace)
                RULE_tuple_block -> YggdrasilBlockNode(node, ValkyrieBlockType.Parenthesis)
                // union
                RULE_define_union -> YggdrasilUnionNode(node)
                RULE_union_block -> YggdrasilBlockNode(node, ValkyrieBlockType.Brace)
                RULE_union_item -> YggdrasilVariantNode(node)
                // function
                RULE_define_function -> YggdrasilFunctionStatement(node)
//                RULE_function_parameters -> ValkyrieBlockNode(node, ValkyrieBlockType.Parenthesis)
//                RULE_parameter_item -> ValkyrieFunctionParameter(node)
//                RULE_function_block -> ValkyrieBlockNode(node, ValkyrieBlockType.Brace)
//                // group rule
                RULE_group_block -> YggdrasilBlockNode(node, ValkyrieBlockType.Brace)
                RULE_group_pair -> YggdrasilGroupPair(node)
                // externals
                RULE_define_inspector -> YggdrasilInspectorNode(node)
                RULE_define_external -> YggdrasilExternalNode(node)
                RULE_external_block -> YggdrasilBlockNode(node, ValkyrieBlockType.Brace)
                RULE_external_pair -> YggdrasilExternalPair(node)


////                RULE_while_statement -> ValkyrieWhileStatement(node)
//                // pattern match
//                RULE_match_statement -> {
////                    ValkyrieParser.getChildOfType(node.psi)
//                    ValkyrieMatchStatement(node)
//                    // ValkyrieCatchBlockNode(node)
//                }
////                RULE_match_call -> {
////                    ValkyrieMatchCall(node)
////                }

                // identifier
                RULE_namepath -> YggdrasilNamepathNode(node)
                RULE_identifier_free -> YggdrasilIdentifierNode(node)
                RULE_identifier -> YggdrasilIdentifierNode(node)
                RULE_tag_branch -> YggdrasilTagBranch(node)
                RULE_class_tag -> YggdrasilTagNode(node)
                RULE_union_tag -> YggdrasilTagNode(node)
                // regex
                RULE_regex -> YggdrasilRegex(node)
//
//


//                // expression
                RULE_annotation -> YggdrasilAnnotation(node)
                RULE_modifiers -> YggdrasilModifiers(node)
                RULE_macro_call -> YggdrasilMacroCall(node)
//                RULE_generic_call_in_type -> ValkyrieGenericCall(node, false)
//                RULE_tuple_call_item -> ValkyrieCallArgument(node)
//                RULE_tuple_call_body -> ValkyrieBlockNode(node, ValkyrieBlockType.Parenthesis)
//                // operators
//                RULE_infix_map -> ValkyrieOperatorNode(node, ValkyrieOperatorKind.Infix)
//                RULE_expression -> extractExpression(node)
//                RULE_function_call -> ValkyrieCallFunction(node)
//                // atomic

//                RULE_identifier -> NexusIdentifierNode(node)
//                RULE_string_literal -> ValkyrieStringNode(node)
//                RULE_number -> ValkyrieNumberNode(node)
                // comment


                else -> ASTWrapperPsiElement(node)

            }
        }
    }
}



