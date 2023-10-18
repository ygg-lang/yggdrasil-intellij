// Generated from C:/Users/Dell/IdeaProjects/yggdrasil-intellij/src/main/antlr/YggdrasilAntlr.g4 by ANTLR 4.13.1
package yggdrasil.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YggdrasilAntlrParser}.
 */
public interface YggdrasilAntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YggdrasilAntlrParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YggdrasilAntlrParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(YggdrasilAntlrParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(YggdrasilAntlrParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#import_block}.
	 * @param ctx the parse tree
	 */
	void enterImport_block(YggdrasilAntlrParser.Import_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#import_block}.
	 * @param ctx the parse tree
	 */
	void exitImport_block(YggdrasilAntlrParser.Import_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_grammar}.
	 * @param ctx the parse tree
	 */
	void enterDefine_grammar(YggdrasilAntlrParser.Define_grammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_grammar}.
	 * @param ctx the parse tree
	 */
	void exitDefine_grammar(YggdrasilAntlrParser.Define_grammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#grammar_block}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_block(YggdrasilAntlrParser.Grammar_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#grammar_block}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_block(YggdrasilAntlrParser.Grammar_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#grammar_pair}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_pair(YggdrasilAntlrParser.Grammar_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#grammar_pair}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_pair(YggdrasilAntlrParser.Grammar_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#grammar_key}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_key(YggdrasilAntlrParser.Grammar_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#grammar_key}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_key(YggdrasilAntlrParser.Grammar_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#grammar_value}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_value(YggdrasilAntlrParser.Grammar_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#grammar_value}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_value(YggdrasilAntlrParser.Grammar_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_class}.
	 * @param ctx the parse tree
	 */
	void enterDefine_class(YggdrasilAntlrParser.Define_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_class}.
	 * @param ctx the parse tree
	 */
	void exitDefine_class(YggdrasilAntlrParser.Define_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#class_block}.
	 * @param ctx the parse tree
	 */
	void enterClass_block(YggdrasilAntlrParser.Class_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#class_block}.
	 * @param ctx the parse tree
	 */
	void exitClass_block(YggdrasilAntlrParser.Class_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSuffix}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSuffix(YggdrasilAntlrParser.CSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSuffix}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSuffix(YggdrasilAntlrParser.CSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCETag(YggdrasilAntlrParser.CETagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCETag(YggdrasilAntlrParser.CETagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCUntag(YggdrasilAntlrParser.CUntagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCUntag(YggdrasilAntlrParser.CUntagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCSoft(YggdrasilAntlrParser.CSoftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCSoft(YggdrasilAntlrParser.CSoftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCHard(YggdrasilAntlrParser.CHardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCHard(YggdrasilAntlrParser.CHardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CPattern}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCPattern(YggdrasilAntlrParser.CPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CPattern}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCPattern(YggdrasilAntlrParser.CPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtom(YggdrasilAntlrParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtom(YggdrasilAntlrParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCNot(YggdrasilAntlrParser.CNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCNot(YggdrasilAntlrParser.CNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#class_tag}.
	 * @param ctx the parse tree
	 */
	void enterClass_tag(YggdrasilAntlrParser.Class_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#class_tag}.
	 * @param ctx the parse tree
	 */
	void exitClass_tag(YggdrasilAntlrParser.Class_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_union}.
	 * @param ctx the parse tree
	 */
	void enterDefine_union(YggdrasilAntlrParser.Define_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_union}.
	 * @param ctx the parse tree
	 */
	void exitDefine_union(YggdrasilAntlrParser.Define_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#union_block}.
	 * @param ctx the parse tree
	 */
	void enterUnion_block(YggdrasilAntlrParser.Union_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#union_block}.
	 * @param ctx the parse tree
	 */
	void exitUnion_block(YggdrasilAntlrParser.Union_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#union_term}.
	 * @param ctx the parse tree
	 */
	void enterUnion_term(YggdrasilAntlrParser.Union_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#union_term}.
	 * @param ctx the parse tree
	 */
	void exitUnion_term(YggdrasilAntlrParser.Union_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUHard(YggdrasilAntlrParser.UHardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUHard(YggdrasilAntlrParser.UHardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUUntag(YggdrasilAntlrParser.UUntagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUUntag(YggdrasilAntlrParser.UUntagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USuffix}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUSuffix(YggdrasilAntlrParser.USuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USuffix}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUSuffix(YggdrasilAntlrParser.USuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUETag(YggdrasilAntlrParser.UETagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUETag(YggdrasilAntlrParser.UETagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Utom}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUtom(YggdrasilAntlrParser.UtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Utom}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUtom(YggdrasilAntlrParser.UtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUNot(YggdrasilAntlrParser.UNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUNot(YggdrasilAntlrParser.UNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUSoft(YggdrasilAntlrParser.USoftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUSoft(YggdrasilAntlrParser.USoftContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#union_tag}.
	 * @param ctx the parse tree
	 */
	void enterUnion_tag(YggdrasilAntlrParser.Union_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#union_tag}.
	 * @param ctx the parse tree
	 */
	void exitUnion_tag(YggdrasilAntlrParser.Union_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_climb}.
	 * @param ctx the parse tree
	 */
	void enterDefine_climb(YggdrasilAntlrParser.Define_climbContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_climb}.
	 * @param ctx the parse tree
	 */
	void exitDefine_climb(YggdrasilAntlrParser.Define_climbContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#tag_branch}.
	 * @param ctx the parse tree
	 */
	void enterTag_branch(YggdrasilAntlrParser.Tag_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#tag_branch}.
	 * @param ctx the parse tree
	 */
	void exitTag_branch(YggdrasilAntlrParser.Tag_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_group}.
	 * @param ctx the parse tree
	 */
	void enterDefine_group(YggdrasilAntlrParser.Define_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_group}.
	 * @param ctx the parse tree
	 */
	void exitDefine_group(YggdrasilAntlrParser.Define_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#group_block}.
	 * @param ctx the parse tree
	 */
	void enterGroup_block(YggdrasilAntlrParser.Group_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#group_block}.
	 * @param ctx the parse tree
	 */
	void exitGroup_block(YggdrasilAntlrParser.Group_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#group_pair}.
	 * @param ctx the parse tree
	 */
	void enterGroup_pair(YggdrasilAntlrParser.Group_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#group_pair}.
	 * @param ctx the parse tree
	 */
	void exitGroup_pair(YggdrasilAntlrParser.Group_pairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOr}
	 * labeled alternative in {@link YggdrasilAntlrParser#group_expression}.
	 * @param ctx the parse tree
	 */
	void enterTOr(YggdrasilAntlrParser.TOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOr}
	 * labeled alternative in {@link YggdrasilAntlrParser#group_expression}.
	 * @param ctx the parse tree
	 */
	void exitTOr(YggdrasilAntlrParser.TOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TAtom}
	 * labeled alternative in {@link YggdrasilAntlrParser#group_expression}.
	 * @param ctx the parse tree
	 */
	void enterTAtom(YggdrasilAntlrParser.TAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAtom}
	 * labeled alternative in {@link YggdrasilAntlrParser#group_expression}.
	 * @param ctx the parse tree
	 */
	void exitTAtom(YggdrasilAntlrParser.TAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_external}.
	 * @param ctx the parse tree
	 */
	void enterDefine_external(YggdrasilAntlrParser.Define_externalContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_external}.
	 * @param ctx the parse tree
	 */
	void exitDefine_external(YggdrasilAntlrParser.Define_externalContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#external_block}.
	 * @param ctx the parse tree
	 */
	void enterExternal_block(YggdrasilAntlrParser.External_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#external_block}.
	 * @param ctx the parse tree
	 */
	void exitExternal_block(YggdrasilAntlrParser.External_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#external_pair}.
	 * @param ctx the parse tree
	 */
	void enterExternal_pair(YggdrasilAntlrParser.External_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#external_pair}.
	 * @param ctx the parse tree
	 */
	void exitExternal_pair(YggdrasilAntlrParser.External_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_inspector}.
	 * @param ctx the parse tree
	 */
	void enterDefine_inspector(YggdrasilAntlrParser.Define_inspectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_inspector}.
	 * @param ctx the parse tree
	 */
	void exitDefine_inspector(YggdrasilAntlrParser.Define_inspectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_function}.
	 * @param ctx the parse tree
	 */
	void enterDefine_function(YggdrasilAntlrParser.Define_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_function}.
	 * @param ctx the parse tree
	 */
	void exitDefine_function(YggdrasilAntlrParser.Define_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#function_tuple}.
	 * @param ctx the parse tree
	 */
	void enterFunction_tuple(YggdrasilAntlrParser.Function_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#function_tuple}.
	 * @param ctx the parse tree
	 */
	void exitFunction_tuple(YggdrasilAntlrParser.Function_tupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(YggdrasilAntlrParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(YggdrasilAntlrParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(YggdrasilAntlrParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(YggdrasilAntlrParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#macro_call}.
	 * @param ctx the parse tree
	 */
	void enterMacro_call(YggdrasilAntlrParser.Macro_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#macro_call}.
	 * @param ctx the parse tree
	 */
	void exitMacro_call(YggdrasilAntlrParser.Macro_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#tuple_block}.
	 * @param ctx the parse tree
	 */
	void enterTuple_block(YggdrasilAntlrParser.Tuple_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#tuple_block}.
	 * @param ctx the parse tree
	 */
	void exitTuple_block(YggdrasilAntlrParser.Tuple_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Optional}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterOptional(YggdrasilAntlrParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Optional}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitOptional(YggdrasilAntlrParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterMany(YggdrasilAntlrParser.ManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitMany(YggdrasilAntlrParser.ManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Many1}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterMany1(YggdrasilAntlrParser.Many1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Many1}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitMany1(YggdrasilAntlrParser.Many1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterIndex(YggdrasilAntlrParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitIndex(YggdrasilAntlrParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Range}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterRange(YggdrasilAntlrParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Range}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitRange(YggdrasilAntlrParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(YggdrasilAntlrParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(YggdrasilAntlrParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#peek}.
	 * @param ctx the parse tree
	 */
	void enterPeek(YggdrasilAntlrParser.PeekContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#peek}.
	 * @param ctx the parse tree
	 */
	void exitPeek(YggdrasilAntlrParser.PeekContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAGroup(YggdrasilAntlrParser.AGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAGroup(YggdrasilAntlrParser.AGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACall}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterACall(YggdrasilAntlrParser.ACallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACall}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitACall(YggdrasilAntlrParser.ACallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AString}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAString(YggdrasilAntlrParser.AStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AString}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAString(YggdrasilAntlrParser.AStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AId}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAId(YggdrasilAntlrParser.AIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AId}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAId(YggdrasilAntlrParser.AIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADrop}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterADrop(YggdrasilAntlrParser.ADropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADrop}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitADrop(YggdrasilAntlrParser.ADropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APull}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAPull(YggdrasilAntlrParser.APullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APull}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAPull(YggdrasilAntlrParser.APullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APush}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAPush(YggdrasilAntlrParser.APushContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APush}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAPush(YggdrasilAntlrParser.APushContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APeek}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAPeek(YggdrasilAntlrParser.APeekContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APeek}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAPeek(YggdrasilAntlrParser.APeekContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARe}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterARe(YggdrasilAntlrParser.AReContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARe}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitARe(YggdrasilAntlrParser.AReContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AInt}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAInt(YggdrasilAntlrParser.AIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AInt}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAInt(YggdrasilAntlrParser.AIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ABool}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterABool(YggdrasilAntlrParser.ABoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ABool}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitABool(YggdrasilAntlrParser.ABoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AAny}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAAny(YggdrasilAntlrParser.AAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AAny}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAAny(YggdrasilAntlrParser.AAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AChar}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAChar(YggdrasilAntlrParser.ACharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AChar}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAChar(YggdrasilAntlrParser.ACharContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(YggdrasilAntlrParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(YggdrasilAntlrParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#namepath}.
	 * @param ctx the parse tree
	 */
	void enterNamepath(YggdrasilAntlrParser.NamepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#namepath}.
	 * @param ctx the parse tree
	 */
	void exitNamepath(YggdrasilAntlrParser.NamepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(YggdrasilAntlrParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(YggdrasilAntlrParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#identifier_free}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_free(YggdrasilAntlrParser.Identifier_freeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#identifier_free}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_free(YggdrasilAntlrParser.Identifier_freeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(YggdrasilAntlrParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(YggdrasilAntlrParser.IdentifierContext ctx);
}