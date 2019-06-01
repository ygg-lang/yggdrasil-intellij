// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ygg.intellij.language.psi.YggTypes.*;
import static com.github.ygg_lang.ygg_intellij.language.psi.YggParserUtil.*;

import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;
import ygg.intellij.language.psi.YggTypes;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YggParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = GeneratedParserUtilBase.adapt_builder_(t, b, this, null);
    Marker m = GeneratedParserUtilBase.enter_section_(b, 0, GeneratedParserUtilBase._COLLAPSE_, null);
    r = parse_root_(t, b);
    GeneratedParserUtilBase.exit_section_(b, 0, m, t, r, true, GeneratedParserUtilBase.TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Voml(b, l + 1);
  }

  /* ********************************************************** */
  // expression*
  static boolean Voml(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "Voml")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "Voml", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotation_mark <<paired table_inner>>
  public static boolean annotation(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "annotation")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.AT)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = annotation_mark(b, l + 1);
    r = r && paired(b, l + 1, YggParser::table_inner);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // AT SYMBOL
  public static boolean annotation_mark(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "annotation_mark")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.AT)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeTokens(b, 0, YggTypes.AT, YggTypes.SYMBOL);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.ANNOTATION_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // "---"
  public static boolean back_top(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "back_top")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, YggTypes.BACK_TOP, "<back top>");
    r = GeneratedParserUtilBase.consumeToken(b, "---");
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // escaped | NON_ESCAPE
  static boolean char_$(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "char_$")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, "", YggTypes.ESCAPE, YggTypes.NON_ESCAPE)) return false;
    boolean r;
    r = escaped(b, l + 1);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, YggTypes.NON_ESCAPE);
    return r;
  }

  /* ********************************************************** */
  // EQ | COLON
  static boolean eq(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "eq")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, "", YggTypes.COLON, YggTypes.EQ)) return false;
    boolean r;
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.EQ);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, YggTypes.COLON);
    return r;
  }

  /* ********************************************************** */
  // ESCAPE (ESCAPE|NON_ESCAPE)
  public static boolean escaped(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "escaped")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.ESCAPE)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.ESCAPE);
    r = r && escaped_1(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.ESCAPED, r);
    return r;
  }

  // ESCAPE|NON_ESCAPE
  private static boolean escaped_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "escaped_1")) return false;
    boolean r;
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.ESCAPE);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, YggTypes.NON_ESCAPE);
    return r;
  }

  /* ********************************************************** */
  // scope
  //     | back_top
  //     | import_statement
  //     | grammar_statement
  //     | ignore_statement
  //     | insert_pair
  //     | insert_item
  //     | annotation
  //     | SEMICOLON
  public static boolean expression(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, YggTypes.EXPRESSION, "<expression>");
    r = scope(b, l + 1);
    if (!r) r = back_top(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = grammar_statement(b, l + 1);
    if (!r) r = ignore_statement(b, l + 1);
    if (!r) r = insert_pair(b, l + 1);
    if (!r) r = insert_item(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, YggTypes.SEMICOLON);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [string_inline (COMMA string_inline)* [COMMA]]
  static boolean grammar_inner(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_inner")) return false;
    grammar_inner_0(b, l + 1);
    return true;
  }

  // string_inline (COMMA string_inline)* [COMMA]
  private static boolean grammar_inner_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_inner_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = string_inline(b, l + 1);
    r = r && grammar_inner_0_1(b, l + 1);
    r = r && grammar_inner_0_2(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA string_inline)*
  private static boolean grammar_inner_0_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_inner_0_1")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!grammar_inner_0_1_0(b, l + 1)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "grammar_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA string_inline
  private static boolean grammar_inner_0_1_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_inner_0_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.COMMA);
    r = r && string_inline(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean grammar_inner_0_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_inner_0_2")) return false;
    GeneratedParserUtilBase.consumeToken(b, YggTypes.COMMA);
    return true;
  }

  /* ********************************************************** */
  // GRAMMAR predefined_symbol [<<paired grammar_inner>>]
  public static boolean grammar_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_statement")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.GRAMMAR)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.GRAMMAR);
    r = r && predefined_symbol(b, l + 1);
    r = r && grammar_statement_2(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.GRAMMAR_STATEMENT, r);
    return r;
  }

  // [<<paired grammar_inner>>]
  private static boolean grammar_statement_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "grammar_statement_2")) return false;
    paired(b, l + 1, YggParser::grammar_inner);
    return true;
  }

  /* ********************************************************** */
  // [rule_symbol (COMMA rule_symbol)* [COMMA]]
  static boolean ignore_inner(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_inner")) return false;
    ignore_inner_0(b, l + 1);
    return true;
  }

  // rule_symbol (COMMA rule_symbol)* [COMMA]
  private static boolean ignore_inner_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_inner_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = rule_symbol(b, l + 1);
    r = r && ignore_inner_0_1(b, l + 1);
    r = r && ignore_inner_0_2(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA rule_symbol)*
  private static boolean ignore_inner_0_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_inner_0_1")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!ignore_inner_0_1_0(b, l + 1)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "ignore_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA rule_symbol
  private static boolean ignore_inner_0_1_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_inner_0_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.COMMA);
    r = r && rule_symbol(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean ignore_inner_0_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_inner_0_2")) return false;
    GeneratedParserUtilBase.consumeToken(b, YggTypes.COMMA);
    return true;
  }

  /* ********************************************************** */
  // IGNORE (rule_symbol | <<paired ignore_inner>>)
  public static boolean ignore_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_statement")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.IGNORE)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.IGNORE);
    r = r && ignore_statement_1(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.IGNORE_STATEMENT, r);
    return r;
  }

  // rule_symbol | <<paired ignore_inner>>
  private static boolean ignore_statement_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore_statement_1")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = rule_symbol(b, l + 1);
    if (!r) r = paired(b, l + 1, YggParser::ignore_inner);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT string_inline [rule_symbol | <<paired include_inner>>]
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "import_statement")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.IMPORT)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.IMPORT);
    r = r && string_inline(b, l + 1);
    r = r && import_statement_2(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.IMPORT_STATEMENT, r);
    return r;
  }

  // [rule_symbol | <<paired include_inner>>]
  private static boolean import_statement_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "import_statement_2")) return false;
    import_statement_2_0(b, l + 1);
    return true;
  }

  // rule_symbol | <<paired include_inner>>
  private static boolean import_statement_2_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "import_statement_2_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = rule_symbol(b, l + 1);
    if (!r) r = paired(b, l + 1, YggParser::include_inner);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [rule_symbol (COMMA rule_symbol)* [COMMA]]
  static boolean include_inner(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "include_inner")) return false;
    include_inner_0(b, l + 1);
    return true;
  }

  // rule_symbol (COMMA rule_symbol)* [COMMA]
  private static boolean include_inner_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "include_inner_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = rule_symbol(b, l + 1);
    r = r && include_inner_0_1(b, l + 1);
    r = r && include_inner_0_2(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA rule_symbol)*
  private static boolean include_inner_0_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "include_inner_0_1")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!include_inner_0_1_0(b, l + 1)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "include_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA rule_symbol
  private static boolean include_inner_0_1_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "include_inner_0_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.COMMA);
    r = r && rule_symbol(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean include_inner_0_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "include_inner_0_2")) return false;
    GeneratedParserUtilBase.consumeToken(b, YggTypes.COMMA);
    return true;
  }

  /* ********************************************************** */
  // DOT
  public static boolean insert_dot(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "insert_dot")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.DOT)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.DOT);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.INSERT_DOT, r);
    return r;
  }

  /* ********************************************************** */
  // insert_star value
  public static boolean insert_item(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "insert_item")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.STAR)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = insert_star(b, l + 1);
    r = r && value(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.INSERT_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // [insert_dot] pair
  public static boolean insert_pair(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "insert_pair")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, YggTypes.INSERT_PAIR, "<insert pair>");
    r = insert_pair_0(b, l + 1);
    r = r && pair(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [insert_dot]
  private static boolean insert_pair_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "insert_pair_0")) return false;
    insert_dot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STAR
  public static boolean insert_star(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "insert_star")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.STAR)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.STAR);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.INSERT_STAR, r);
    return r;
  }

  /* ********************************************************** */
  // string_inline | key_symbol | INTEGER
  static boolean key(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "key")) return false;
    boolean r;
    r = string_inline(b, l + 1);
    if (!r) r = key_symbol(b, l + 1);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, YggTypes.INTEGER);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean key_symbol(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "key_symbol")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.SYMBOL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.SYMBOL);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.KEY_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) [number_suffix] | [SIGN] BYTE | other_num
  static boolean num(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    if (!r) r = other_num(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL) [number_suffix]
  private static boolean num_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    r = r && num_0_2(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0_0")) return false;
    GeneratedParserUtilBase.consumeToken(b, YggTypes.SIGN);
    return true;
  }

  // INTEGER | DECIMAL
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.INTEGER);
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, YggTypes.DECIMAL);
    return r;
  }

  // [number_suffix]
  private static boolean num_0_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0_2")) return false;
    number_suffix(b, l + 1);
    return true;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && GeneratedParserUtilBase.consumeToken(b, YggTypes.BYTE);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_1_0")) return false;
    GeneratedParserUtilBase.consumeToken(b, YggTypes.SIGN);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean number_suffix(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "number_suffix")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, YggTypes.SYMBOL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = GeneratedParserUtilBase.consumeToken(b, YggTypes.SYMBOL);
    GeneratedParserUtilBase.exit_section_(b, m, YggTypes.NUMBER_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // NAN
  static boolean other_num(PsiBuilder b, int l) {
    return GeneratedParserUtilBase.consumeToken(b, YggTypes.NAN);
  }

  /* ********************************************************** */
  // symbol_path eq value
  public static boolean pair(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "pair")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, YggTypes.PAIR, "<pair>");
    r = symbol_path(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && value(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
