// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ygg.intellij.language.psi.YggTypes.*;
import static ygg.intellij.language.psi.YggParserExtension.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YggParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Ygg(b, l + 1);
  }

  /* ********************************************************** */
  // expression*
  static boolean Ygg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ygg")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Ygg", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotation_mark <<paired table_inner>>
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_mark(b, l + 1);
    r = r && paired(b, l + 1, YggParser::table_inner);
    exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // AT SYMBOL
  public static boolean annotation_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_mark")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, SYMBOL);
    exit_section_(b, m, ANNOTATION_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // "---"
  public static boolean back_top(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "back_top")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BACK_TOP, "<back top>");
    r = consumeToken(b, "---");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER | ESCAPE_UNICODE | ESCAPE_SPECIAL
  static boolean char_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_$")) return false;
    boolean r;
    r = consumeToken(b, CHARACTER);
    if (!r) r = consumeToken(b, ESCAPE_UNICODE);
    if (!r) r = consumeToken(b, ESCAPE_SPECIAL);
    return r;
  }

  /* ********************************************************** */
  // COMMENT_LINE | COMMENT_BLOCK | COMMENT_DOC
  static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    boolean r;
    r = consumeToken(b, COMMENT_LINE);
    if (!r) r = consumeToken(b, COMMENT_BLOCK);
    if (!r) r = consumeToken(b, COMMENT_DOC);
    return r;
  }

  /* ********************************************************** */
  // EQ | COLON
  static boolean eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq")) return false;
    if (!nextTokenIs(b, "", COLON, EQ)) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
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
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = scope(b, l + 1);
    if (!r) r = back_top(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = grammar_statement(b, l + 1);
    if (!r) r = ignore_statement(b, l + 1);
    if (!r) r = insert_pair(b, l + 1);
    if (!r) r = insert_item(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [string (COMMA string)* [COMMA]]
  static boolean grammar_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner")) return false;
    grammar_inner_0(b, l + 1);
    return true;
  }

  // string (COMMA string)* [COMMA]
  private static boolean grammar_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string(b, l + 1);
    r = r && grammar_inner_0_1(b, l + 1);
    r = r && grammar_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA string)*
  private static boolean grammar_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!grammar_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "grammar_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA string
  private static boolean grammar_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean grammar_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // "@grammar" grammar_symbol [<<paired grammar_inner>>]
  public static boolean grammar_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_statement")) return false;
    if (!nextTokenIs(b, GRAMMAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GRAMMAR);
    r = r && grammar_symbol(b, l + 1);
    r = r && grammar_statement_2(b, l + 1);
    exit_section_(b, m, GRAMMAR_STATEMENT, r);
    return r;
  }

  // [<<paired grammar_inner>>]
  private static boolean grammar_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_statement_2")) return false;
    paired(b, l + 1, YggParser::grammar_inner);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean grammar_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, GRAMMAR_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // [rule_symbol (COMMA rule_symbol)* [COMMA]]
  static boolean ignore_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_inner")) return false;
    ignore_inner_0(b, l + 1);
    return true;
  }

  // rule_symbol (COMMA rule_symbol)* [COMMA]
  private static boolean ignore_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_symbol(b, l + 1);
    r = r && ignore_inner_0_1(b, l + 1);
    r = r && ignore_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA rule_symbol)*
  private static boolean ignore_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ignore_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ignore_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA rule_symbol
  private static boolean ignore_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && rule_symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean ignore_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // "@ignore" (rule_symbol | <<paired ignore_inner>>)
  public static boolean ignore_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_statement")) return false;
    if (!nextTokenIs(b, IGNORE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IGNORE);
    r = r && ignore_statement_1(b, l + 1);
    exit_section_(b, m, IGNORE_STATEMENT, r);
    return r;
  }

  // rule_symbol | <<paired ignore_inner>>
  private static boolean ignore_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_symbol(b, l + 1);
    if (!r) r = paired(b, l + 1, YggParser::ignore_inner);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "@import" string [rule_symbol | <<paired include_inner>>]
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && string(b, l + 1);
    r = r && import_statement_2(b, l + 1);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  // [rule_symbol | <<paired include_inner>>]
  private static boolean import_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_2")) return false;
    import_statement_2_0(b, l + 1);
    return true;
  }

  // rule_symbol | <<paired include_inner>>
  private static boolean import_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_symbol(b, l + 1);
    if (!r) r = paired(b, l + 1, YggParser::include_inner);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [rule_symbol (COMMA rule_symbol)* [COMMA]]
  static boolean include_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_inner")) return false;
    include_inner_0(b, l + 1);
    return true;
  }

  // rule_symbol (COMMA rule_symbol)* [COMMA]
  private static boolean include_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_symbol(b, l + 1);
    r = r && include_inner_0_1(b, l + 1);
    r = r && include_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA rule_symbol)*
  private static boolean include_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!include_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "include_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA rule_symbol
  private static boolean include_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && rule_symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean include_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // DOT
  public static boolean insert_dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_dot")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    exit_section_(b, m, INSERT_DOT, r);
    return r;
  }

  /* ********************************************************** */
  // insert_star value
  public static boolean insert_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_item")) return false;
    if (!nextTokenIs(b, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = insert_star(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, INSERT_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // [insert_dot] pair
  public static boolean insert_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_PAIR, "<insert pair>");
    r = insert_pair_0(b, l + 1);
    r = r && pair(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [insert_dot]
  private static boolean insert_pair_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_pair_0")) return false;
    insert_dot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STAR
  public static boolean insert_star(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_star")) return false;
    if (!nextTokenIs(b, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    exit_section_(b, m, INSERT_STAR, r);
    return r;
  }

  /* ********************************************************** */
  // string | key_symbol | INTEGER
  static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    r = string(b, l + 1);
    if (!r) r = key_symbol(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean key_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, KEY_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // GRAMMAR
  static boolean keywords(PsiBuilder b, int l) {
    return consumeToken(b, GRAMMAR);
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) [number_suffix] | [SIGN] BYTE | other_num
  static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    if (!r) r = other_num(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL) [number_suffix]
  private static boolean num_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    r = r && num_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // INTEGER | DECIMAL
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    return r;
  }

  // [number_suffix]
  private static boolean num_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_2")) return false;
    number_suffix(b, l + 1);
    return true;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && consumeToken(b, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean number_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_suffix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, NUMBER_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // NAN
  static boolean other_num(PsiBuilder b, int l) {
    return consumeToken(b, NAN);
  }

  /* ********************************************************** */
  // symbol_path eq value
  public static boolean pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
    r = symbol_path(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  //   | BRACKET_L <<param>> BRACKET_R
  //   | BRACE_L <<param>> BRACE_R
  static boolean paired(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paired_0(b, l + 1, _param);
    if (!r) r = paired_1(b, l + 1, _param);
    if (!r) r = paired_2(b, l + 1, _param);
    exit_section_(b, m, null, r);
    return r;
  }

  // PARENTHESIS_L <<param>> PARENTHESIS_R
  private static boolean paired_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACKET_L <<param>> BRACKET_R
  private static boolean paired_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACE_L <<param>> BRACE_R
  private static boolean paired_2(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CITE symbol_path
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, CITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CITE);
    r = r && symbol_path(b, l + 1);
    exit_section_(b, m, REF, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean rule_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, RULE_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // <<paired scope_inner>>
  public static boolean scope(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPE, "<scope>");
    r = paired(b, l + 1, YggParser::scope_inner);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [scope_mark] scope_path
  static boolean scope_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_inner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scope_inner_0(b, l + 1);
    r = r && scope_path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [scope_mark]
  private static boolean scope_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_inner_0")) return false;
    scope_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // string | rule_symbol | INTEGER
  static boolean scope_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_key")) return false;
    boolean r;
    r = string(b, l + 1);
    if (!r) r = rule_symbol(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    return r;
  }

  /* ********************************************************** */
  // ACCENT | ANGLE_L+ | ANGLE_R
  public static boolean scope_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPE_MARK, "<scope mark>");
    r = consumeToken(b, ACCENT);
    if (!r) r = scope_mark_1(b, l + 1);
    if (!r) r = consumeToken(b, ANGLE_R);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ANGLE_L+
  private static boolean scope_mark_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_mark_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANGLE_L);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, ANGLE_L)) break;
      if (!empty_element_parsed_guard_(b, "scope_mark_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // scope_key (DOT scope_key)*
  static boolean scope_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_path")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scope_key(b, l + 1);
    r = r && scope_path_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT scope_key)*
  private static boolean scope_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!scope_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "scope_path_1", c)) break;
    }
    return true;
  }

  // DOT scope_key
  private static boolean scope_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && scope_key(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_QUOTE char* STRING_QUOTE
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, STRING_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_QUOTE);
    r = r && string_1(b, l + 1);
    r = r && consumeToken(b, STRING_QUOTE);
    exit_section_(b, m, STRING, r);
    return r;
  }

  // char*
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // key (DOT key)*
  public static boolean symbol_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_PATH, "<symbol path>");
    r = key(b, l + 1);
    r = r && symbol_path_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT key)*
  private static boolean symbol_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_path_1", c)) break;
    }
    return true;
  }

  // DOT key
  private static boolean symbol_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && key(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [type_hint] <<paired table_inner>>
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    r = table_0(b, l + 1);
    r = r && paired(b, l + 1, YggParser::table_inner);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_hint]
  private static boolean table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0")) return false;
    type_hint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [table_item (COMMA table_item)* [COMMA]]
  static boolean table_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner")) return false;
    table_inner_0(b, l + 1);
    return true;
  }

  // table_item (COMMA table_item)* [COMMA]
  private static boolean table_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_item(b, l + 1);
    r = r && table_inner_0_1(b, l + 1);
    r = r && table_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA table_item)*
  private static boolean table_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!table_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA table_item
  private static boolean table_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && table_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean table_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // pair | value
  static boolean table_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_item")) return false;
    boolean r;
    r = pair(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, TYPE_HINT, r);
    return r;
  }

  /* ********************************************************** */
  // NULL | BOOLEAN | num | ref | string | table | annotation
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = num(b, l + 1);
    if (!r) r = ref(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
