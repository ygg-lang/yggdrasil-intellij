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
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#rule_block}.
	 * @param ctx the parse tree
	 */
	void enterRule_block(YggdrasilAntlrParser.Rule_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#rule_block}.
	 * @param ctx the parse tree
	 */
	void exitRule_block(YggdrasilAntlrParser.Rule_blockContext ctx);
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
	 * Enter a parse tree produced by the {@code Untag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUntag(YggdrasilAntlrParser.UntagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Untag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUntag(YggdrasilAntlrParser.UntagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Group}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGroup(YggdrasilAntlrParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Group}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGroup(YggdrasilAntlrParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCall(YggdrasilAntlrParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCall(YggdrasilAntlrParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pattern}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPattern(YggdrasilAntlrParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pattern}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPattern(YggdrasilAntlrParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Maybe}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMaybe(YggdrasilAntlrParser.MaybeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Maybe}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMaybe(YggdrasilAntlrParser.MaybeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Optional}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOptional(YggdrasilAntlrParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Optional}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOptional(YggdrasilAntlrParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchTag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBranchTag(YggdrasilAntlrParser.BranchTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchTag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBranchTag(YggdrasilAntlrParser.BranchTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hard}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHard(YggdrasilAntlrParser.HardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hard}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHard(YggdrasilAntlrParser.HardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Soft}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSoft(YggdrasilAntlrParser.SoftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Soft}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSoft(YggdrasilAntlrParser.SoftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtom(YggdrasilAntlrParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtom(YggdrasilAntlrParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(YggdrasilAntlrParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(YggdrasilAntlrParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterETag(YggdrasilAntlrParser.ETagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitETag(YggdrasilAntlrParser.ETagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMany(YggdrasilAntlrParser.ManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
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