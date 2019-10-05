// Generated from C:/Users/Dell/IdeaProjects/yggdrasil-intellij/src/main/antlr/YggdrasilAntlr.g4 by ANTLR 4.13.1
package yggdrasil.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YggdrasilAntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YggdrasilAntlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(YggdrasilAntlrParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(YggdrasilAntlrParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_class(YggdrasilAntlrParser.Define_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_union(YggdrasilAntlrParser.Define_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_climb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_climb(YggdrasilAntlrParser.Define_climbContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#rule_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_block(YggdrasilAntlrParser.Rule_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#macro_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_call(YggdrasilAntlrParser.Macro_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(YggdrasilAntlrParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#tuple_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_block(YggdrasilAntlrParser.Tuple_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Untag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntag(YggdrasilAntlrParser.UntagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Group}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(YggdrasilAntlrParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(YggdrasilAntlrParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pattern}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(YggdrasilAntlrParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Maybe}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe(YggdrasilAntlrParser.MaybeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Optional}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(YggdrasilAntlrParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BranchTag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchTag(YggdrasilAntlrParser.BranchTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Hard}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHard(YggdrasilAntlrParser.HardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Soft}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoft(YggdrasilAntlrParser.SoftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(YggdrasilAntlrParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(YggdrasilAntlrParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeTag}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeTag(YggdrasilAntlrParser.NodeTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany(YggdrasilAntlrParser.ManyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(YggdrasilAntlrParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(YggdrasilAntlrParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#namepath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamepath(YggdrasilAntlrParser.NamepathContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(YggdrasilAntlrParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(YggdrasilAntlrParser.IdentifierContext ctx);
}