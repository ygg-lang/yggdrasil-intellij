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
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_grammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_grammar(YggdrasilAntlrParser.Define_grammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_class(YggdrasilAntlrParser.Define_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#class_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_block(YggdrasilAntlrParser.Class_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CCall}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCCall(YggdrasilAntlrParser.CCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CMany}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCMany(YggdrasilAntlrParser.CManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCETag(YggdrasilAntlrParser.CETagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCUntag(YggdrasilAntlrParser.CUntagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSoft(YggdrasilAntlrParser.CSoftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHard(YggdrasilAntlrParser.CHardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CPattern}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCPattern(YggdrasilAntlrParser.CPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCGroup(YggdrasilAntlrParser.CGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(YggdrasilAntlrParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCNot(YggdrasilAntlrParser.CNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_union(YggdrasilAntlrParser.Define_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#union_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_block(YggdrasilAntlrParser.Union_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#union_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_term(YggdrasilAntlrParser.Union_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UMany}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUMany(YggdrasilAntlrParser.UManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUETag(YggdrasilAntlrParser.UETagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUUntag(YggdrasilAntlrParser.UUntagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNot(YggdrasilAntlrParser.UNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUHard(YggdrasilAntlrParser.UHardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code USoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUSoft(YggdrasilAntlrParser.USoftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUGroup(YggdrasilAntlrParser.UGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UCall}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUCall(YggdrasilAntlrParser.UCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Utom}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtom(YggdrasilAntlrParser.UtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_climb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_climb(YggdrasilAntlrParser.Define_climbContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_token(YggdrasilAntlrParser.Define_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#token_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_block(YggdrasilAntlrParser.Token_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#token_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_pair(YggdrasilAntlrParser.Token_pairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TOr}
	 * labeled alternative in {@link YggdrasilAntlrParser#token_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTOr(YggdrasilAntlrParser.TOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TAtom}
	 * labeled alternative in {@link YggdrasilAntlrParser#token_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAtom(YggdrasilAntlrParser.TAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#tag_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_pair(YggdrasilAntlrParser.Tag_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#macro_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_call(YggdrasilAntlrParser.Macro_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#tuple_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_call(YggdrasilAntlrParser.Tuple_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#tuple_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_block(YggdrasilAntlrParser.Tuple_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Optional}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(YggdrasilAntlrParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaybeGreedy}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybeGreedy(YggdrasilAntlrParser.MaybeGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Maybe}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe(YggdrasilAntlrParser.MaybeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyGreedy}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyGreedy(YggdrasilAntlrParser.ManyGreedyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
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