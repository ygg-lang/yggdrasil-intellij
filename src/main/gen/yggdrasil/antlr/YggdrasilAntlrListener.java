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
	 * Enter a parse tree produced by the {@code Named}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNamed(YggdrasilAntlrParser.NamedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Named}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNamed(YggdrasilAntlrParser.NamedContext ctx);
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
	 * Enter a parse tree produced by the {@code TAG}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTAG(YggdrasilAntlrParser.TAGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAG}
	 * labeled alternative in {@link YggdrasilAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTAG(YggdrasilAntlrParser.TAGContext ctx);
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