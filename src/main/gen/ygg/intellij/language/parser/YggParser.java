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
  // statements*
  static boolean Ygg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ygg")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Ygg", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CHARACTER | esc
  static boolean char_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_$")) return false;
    boolean r;
    r = consumeToken(b, CHARACTER);
    if (!r) r = esc(b, l + 1);
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
  // ESCAPE_UNICODE | ESCAPE_SPECIAL
  static boolean esc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "esc")) return false;
    if (!nextTokenIs(b, "", ESCAPE_SPECIAL, ESCAPE_UNICODE)) return false;
    boolean r;
    r = consumeToken(b, ESCAPE_UNICODE);
    if (!r) r = consumeToken(b, ESCAPE_SPECIAL);
    return r;
  }

  /* ********************************************************** */
  // function_statement | value
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = function_statement(b, l + 1);
    if (!r) r = value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOLLAR rule_symbol <<parenthesis expr COMMA>>
  public static boolean function_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_statement")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLAR);
    r = r && rule_symbol(b, l + 1);
    r = r && parenthesis(b, l + 1, YggParser::expr, COMMA_parser_);
    exit_section_(b, m, FUNCTION_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // string (COMMA string)* [COMMA]
  static boolean grammar_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string(b, l + 1);
    r = r && grammar_inner_1(b, l + 1);
    r = r && grammar_inner_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA string)*
  private static boolean grammar_inner_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!grammar_inner_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "grammar_inner_1", c)) break;
    }
    return true;
  }

  // COMMA string
  private static boolean grammar_inner_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean grammar_inner_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_inner_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // GRAMMAR grammar_symbol [<<paired grammar_inner>>]
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
  // IGNORE (rule_symbol | <<paired ignore_inner>>)
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
  // IMPORT string [rule_symbol | <<paired include_inner>>]
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
  // string | key_symbol | INTEGER
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = string(b, l + 1);
    if (!r) r = key_symbol(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, l, m, r, false, null);
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
  // value | macro_statement
  public static boolean macro_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_ARG, "<macro arg>");
    r = value(b, l + 1);
    if (!r) r = macro_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AT SYMBOL <<parenthesis macro_arg COMMA>>
  public static boolean macro_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_statement")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, SYMBOL);
    r = r && parenthesis(b, l + 1, YggParser::macro_arg, COMMA_parser_);
    exit_section_(b, m, MACRO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) [number_suffix] | [SIGN] BYTE
  static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
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
  // PARENTHESIS_L [<<item>> (<<delimiter>> <<item>>)* [<<delimiter>>]] PARENTHESIS_R
  public static boolean parenthesis(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && parenthesis_1(b, l + 1, _item, _delimiter);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, PARENTHESIS, r);
    return r;
  }

  // [<<item>> (<<delimiter>> <<item>>)* [<<delimiter>>]]
  private static boolean parenthesis_1(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1")) return false;
    parenthesis_1_0(b, l + 1, _item, _delimiter);
    return true;
  }

  // <<item>> (<<delimiter>> <<item>>)* [<<delimiter>>]
  private static boolean parenthesis_1_0(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _item.parse(b, l);
    r = r && parenthesis_1_0_1(b, l + 1, _delimiter, _item);
    r = r && parenthesis_1_0_2(b, l + 1, _delimiter);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<delimiter>> <<item>>)*
  private static boolean parenthesis_1_0_1(PsiBuilder b, int l, Parser _delimiter, Parser _item) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parenthesis_1_0_1_0(b, l + 1, _delimiter, _item)) break;
      if (!empty_element_parsed_guard_(b, "parenthesis_1_0_1", c)) break;
    }
    return true;
  }

  // <<delimiter>> <<item>>
  private static boolean parenthesis_1_0_1_0(PsiBuilder b, int l, Parser _delimiter, Parser _item) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _delimiter.parse(b, l);
    r = r && _item.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<delimiter>>]
  private static boolean parenthesis_1_0_2(PsiBuilder b, int l, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_2")) return false;
    _delimiter.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // REGEX_QUOTE char* REGEX_QUOTE regex_mode
  public static boolean regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex")) return false;
    if (!nextTokenIs(b, REGEX_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGEX_QUOTE);
    r = r && regex_1(b, l + 1);
    r = r && consumeToken(b, REGEX_QUOTE);
    r = r && regex_mode(b, l + 1);
    exit_section_(b, m, REGEX, r);
    return r;
  }

  // char*
  private static boolean regex_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "regex_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean regex_mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_mode")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, REGEX_MODE, r);
    return r;
  }

  /* ********************************************************** */
  // REGEX_RANGE_L REGEX_CHARACTER* REGEX_RANGE_R
  public static boolean regex_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_range")) return false;
    if (!nextTokenIs(b, REGEX_RANGE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGEX_RANGE_L);
    r = r && regex_range_1(b, l + 1);
    r = r && consumeToken(b, REGEX_RANGE_R);
    exit_section_(b, m, REGEX_RANGE, r);
    return r;
  }

  // REGEX_CHARACTER*
  private static boolean regex_range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_range_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, REGEX_CHARACTER)) break;
      if (!empty_element_parsed_guard_(b, "regex_range_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SYMBOL EQ expr
  public static boolean rule_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYMBOL, EQ);
    r = r && expr(b, l + 1);
    exit_section_(b, m, RULE_STATEMENT, r);
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
  // grammar_statement
  //     | ignore_statement
  //     | import_statement
  //     | macro_statement
  //     | rule_statement
  //     | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    r = grammar_statement(b, l + 1);
    if (!r) r = ignore_statement(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = macro_statement(b, l + 1);
    if (!r) r = rule_statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // esc | STRING_SQ char* STRING_SQ | STRING_DQ char* STRING_DQ
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = esc(b, l + 1);
    if (!r) r = string_1(b, l + 1);
    if (!r) r = string_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING_SQ char* STRING_SQ
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_SQ);
    r = r && string_1_1(b, l + 1);
    r = r && consumeToken(b, STRING_SQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // char*
  private static boolean string_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_1_1", c)) break;
    }
    return true;
  }

  // STRING_DQ char* STRING_DQ
  private static boolean string_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_DQ);
    r = r && string_2_1(b, l + 1);
    r = r && consumeToken(b, STRING_DQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // char*
  private static boolean string_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_2_1", c)) break;
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
  // NULL | BOOLEAN | num | string | regex | table | regex_range
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = num(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = regex(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = regex_range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
}
