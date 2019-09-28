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
	 * Enter a parse tree produced by {@link YggdrasilAntlrParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(YggdrasilAntlrParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link YggdrasilAntlrParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(YggdrasilAntlrParser.IdContext ctx);
}