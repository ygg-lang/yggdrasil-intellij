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
	 * Enter a parse tree produced by the {@code CCall}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCCall(YggdrasilAntlrParser.CCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CCall}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCCall(YggdrasilAntlrParser.CCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CMany}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCMany(YggdrasilAntlrParser.CManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CMany}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCMany(YggdrasilAntlrParser.CManyContext ctx);
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
	 * Enter a parse tree produced by the {@code CGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void enterCGroup(YggdrasilAntlrParser.CGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 */
	void exitCGroup(YggdrasilAntlrParser.CGroupContext ctx);
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
	 * Enter a parse tree produced by the {@code UMany}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUMany(YggdrasilAntlrParser.UManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UMany}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUMany(YggdrasilAntlrParser.UManyContext ctx);
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
	 * Enter a parse tree produced by the {@code UGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUGroup(YggdrasilAntlrParser.UGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUGroup(YggdrasilAntlrParser.UGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UCall}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUCall(YggdrasilAntlrParser.UCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UCall}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUCall(YggdrasilAntlrParser.UCallContext ctx);
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
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#define_token}.
	 * @param ctx the parse tree
	 */
	void enterDefine_token(YggdrasilAntlrParser.Define_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#define_token}.
	 * @param ctx the parse tree
	 */
	void exitDefine_token(YggdrasilAntlrParser.Define_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#token_block}.
	 * @param ctx the parse tree
	 */
	void enterToken_block(YggdrasilAntlrParser.Token_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#token_block}.
	 * @param ctx the parse tree
	 */
	void exitToken_block(YggdrasilAntlrParser.Token_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#token_pair}.
	 * @param ctx the parse tree
	 */
	void enterToken_pair(YggdrasilAntlrParser.Token_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#token_pair}.
	 * @param ctx the parse tree
	 */
	void exitToken_pair(YggdrasilAntlrParser.Token_pairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TOr}
	 * labeled alternative in {@link YggdrasilAntlrParser#token_expression}.
	 * @param ctx the parse tree
	 */
	void enterTOr(YggdrasilAntlrParser.TOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TOr}
	 * labeled alternative in {@link YggdrasilAntlrParser#token_expression}.
	 * @param ctx the parse tree
	 */
	void exitTOr(YggdrasilAntlrParser.TOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TAtom}
	 * labeled alternative in {@link YggdrasilAntlrParser#token_expression}.
	 * @param ctx the parse tree
	 */
	void enterTAtom(YggdrasilAntlrParser.TAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAtom}
	 * labeled alternative in {@link YggdrasilAntlrParser#token_expression}.
	 * @param ctx the parse tree
	 */
	void exitTAtom(YggdrasilAntlrParser.TAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void enterTag_pair(YggdrasilAntlrParser.Tag_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void exitTag_pair(YggdrasilAntlrParser.Tag_pairContext ctx);
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
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#tuple_call}.
	 * @param ctx the parse tree
	 */
	void enterTuple_call(YggdrasilAntlrParser.Tuple_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#tuple_call}.
	 * @param ctx the parse tree
	 */
	void exitTuple_call(YggdrasilAntlrParser.Tuple_callContext ctx);
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
	 * Enter a parse tree produced by the {@code MaybeGreedy}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterMaybeGreedy(YggdrasilAntlrParser.MaybeGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaybeGreedy}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitMaybeGreedy(YggdrasilAntlrParser.MaybeGreedyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Maybe}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterMaybe(YggdrasilAntlrParser.MaybeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Maybe}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitMaybe(YggdrasilAntlrParser.MaybeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ManyGreedy}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterManyGreedy(YggdrasilAntlrParser.ManyGreedyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ManyGreedy}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitManyGreedy(YggdrasilAntlrParser.ManyGreedyContext ctx);
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
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(YggdrasilAntlrParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(YggdrasilAntlrParser.AtomicContext ctx);
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