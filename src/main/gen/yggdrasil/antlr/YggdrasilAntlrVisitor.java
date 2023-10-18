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
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#import_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_block(YggdrasilAntlrParser.Import_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_grammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_grammar(YggdrasilAntlrParser.Define_grammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#grammar_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_block(YggdrasilAntlrParser.Grammar_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#grammar_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_pair(YggdrasilAntlrParser.Grammar_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#grammar_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_key(YggdrasilAntlrParser.Grammar_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#grammar_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_value(YggdrasilAntlrParser.Grammar_valueContext ctx);
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
	 * Visit a parse tree produced by the {@code CSuffix}
	 * labeled alternative in {@link YggdrasilAntlrParser#class_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSuffix(YggdrasilAntlrParser.CSuffixContext ctx);
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
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#class_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_tag(YggdrasilAntlrParser.Class_tagContext ctx);
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
	 * Visit a parse tree produced by the {@code UHard}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUHard(YggdrasilAntlrParser.UHardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UUntag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUUntag(YggdrasilAntlrParser.UUntagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code USuffix}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUSuffix(YggdrasilAntlrParser.USuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UETag}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUETag(YggdrasilAntlrParser.UETagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Utom}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtom(YggdrasilAntlrParser.UtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNot}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNot(YggdrasilAntlrParser.UNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code USoft}
	 * labeled alternative in {@link YggdrasilAntlrParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUSoft(YggdrasilAntlrParser.USoftContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#union_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_tag(YggdrasilAntlrParser.Union_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_climb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_climb(YggdrasilAntlrParser.Define_climbContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#tag_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_branch(YggdrasilAntlrParser.Tag_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_group(YggdrasilAntlrParser.Define_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#group_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_block(YggdrasilAntlrParser.Group_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#group_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_pair(YggdrasilAntlrParser.Group_pairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TOr}
	 * labeled alternative in {@link YggdrasilAntlrParser#group_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTOr(YggdrasilAntlrParser.TOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TAtom}
	 * labeled alternative in {@link YggdrasilAntlrParser#group_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAtom(YggdrasilAntlrParser.TAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_external}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_external(YggdrasilAntlrParser.Define_externalContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#external_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_block(YggdrasilAntlrParser.External_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#external_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_pair(YggdrasilAntlrParser.External_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_inspector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_inspector(YggdrasilAntlrParser.Define_inspectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#define_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_function(YggdrasilAntlrParser.Define_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#function_tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_tuple(YggdrasilAntlrParser.Function_tupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(YggdrasilAntlrParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(YggdrasilAntlrParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#macro_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_call(YggdrasilAntlrParser.Macro_callContext ctx);
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
	 * Visit a parse tree produced by the {@code Many}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany(YggdrasilAntlrParser.ManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Many1}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany1(YggdrasilAntlrParser.Many1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(YggdrasilAntlrParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Range}
	 * labeled alternative in {@link YggdrasilAntlrParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(YggdrasilAntlrParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#ucc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUcc(YggdrasilAntlrParser.UccContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(YggdrasilAntlrParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#peek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeek(YggdrasilAntlrParser.PeekContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AGroup}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAGroup(YggdrasilAntlrParser.AGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACall}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACall(YggdrasilAntlrParser.ACallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AString}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAString(YggdrasilAntlrParser.AStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AId}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAId(YggdrasilAntlrParser.AIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADrop}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADrop(YggdrasilAntlrParser.ADropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APull}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPull(YggdrasilAntlrParser.APullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APush}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPush(YggdrasilAntlrParser.APushContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APeek}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPeek(YggdrasilAntlrParser.APeekContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARe}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARe(YggdrasilAntlrParser.AReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AUcc}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAUcc(YggdrasilAntlrParser.AUccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AInt}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAInt(YggdrasilAntlrParser.AIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ABool}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitABool(YggdrasilAntlrParser.ABoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AAny}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAAny(YggdrasilAntlrParser.AAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AChar}
	 * labeled alternative in {@link YggdrasilAntlrParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAChar(YggdrasilAntlrParser.ACharContext ctx);
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
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#identifier_free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_free(YggdrasilAntlrParser.Identifier_freeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YggdrasilAntlrParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(YggdrasilAntlrParser.IdentifierContext ctx);
}