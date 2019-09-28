// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ygg.intellij.language.psi.YggTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
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
  // PARENTHESIS_L [CHOOSE] expr PARENTHESIS_R | field_mark | function_call | value
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = atom_0(b, l + 1);
    if (!r) r = field_mark(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PARENTHESIS_L [CHOOSE] expr PARENTHESIS_R
  private static boolean atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && atom_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // [CHOOSE]
  private static boolean atom_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0_1")) return false;
    consumeToken(b, CHOOSE);
    return true;
  }

  /* ********************************************************** */
  // HASH identifier ANGLE_R?
  public static boolean branch_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branch_mark")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && identifier(b, l + 1);
    r = r && branch_mark_2(b, l + 1);
    exit_section_(b, m, BRANCH_MARK, r);
    return r;
  }

  // ANGLE_R?
  private static boolean branch_mark_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branch_mark_2")) return false;
    consumeToken(b, ANGLE_R);
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
  // REGEX_RANGE
  public static boolean charset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charset")) return false;
    if (!nextTokenIs(b, REGEX_RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGEX_RANGE);
    exit_section_(b, m, CHARSET, r);
    return r;
  }

  /* ********************************************************** */
  // modifiers KW_CLASS identifier [rule_type] rule_body
  public static boolean class_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement")) return false;
    if (!nextTokenIs(b, "<class statement>", KW_CLASS, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_STATEMENT, "<class statement>");
    r = modifiers(b, l + 1);
    r = r && consumeToken(b, KW_CLASS);
    r = r && identifier(b, l + 1);
    r = r && class_statement_3(b, l + 1);
    r = r && rule_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [rule_type]
  private static boolean class_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_3")) return false;
    rule_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // modifiers KW_CLIMB identifier [rule_type] rule_body
  public static boolean climb_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "climb_statement")) return false;
    if (!nextTokenIs(b, "<climb statement>", KW_CLIMB, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLIMB_STATEMENT, "<climb statement>");
    r = modifiers(b, l + 1);
    r = r && consumeToken(b, KW_CLIMB);
    r = r && identifier(b, l + 1);
    r = r && climb_statement_3(b, l + 1);
    r = r && rule_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [rule_type]
  private static boolean climb_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "climb_statement_3")) return false;
    rule_type(b, l + 1);
    return true;
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
  // identifier [EQ expr]
  public static boolean define_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_pair")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && define_pair_1(b, l + 1);
    exit_section_(b, m, DEFINE_PAIR, r);
    return r;
  }

  // [EQ expr]
  private static boolean define_pair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_pair_1")) return false;
    define_pair_1_0(b, l + 1);
    return true;
  }

  // EQ expr
  private static boolean define_pair_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_pair_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L [define_pair (COMMA define_pair)* COMMA?] PARENTHESIS_R
  public static boolean define_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_parameters")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && define_parameters_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, DEFINE_PARAMETERS, r);
    return r;
  }

  // [define_pair (COMMA define_pair)* COMMA?]
  private static boolean define_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_parameters_1")) return false;
    define_parameters_1_0(b, l + 1);
    return true;
  }

  // define_pair (COMMA define_pair)* COMMA?
  private static boolean define_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = define_pair(b, l + 1);
    r = r && define_parameters_1_0_1(b, l + 1);
    r = r && define_parameters_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA define_pair)*
  private static boolean define_parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_parameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!define_parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "define_parameters_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA define_pair
  private static boolean define_parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && define_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean define_parameters_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_parameters_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // modifiers KW_DEFINE identifier define_parameters [rule_type] rule_body
  public static boolean define_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_statement")) return false;
    if (!nextTokenIs(b, "<define statement>", KW_DEFINE, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINE_STATEMENT, "<define statement>");
    r = modifiers(b, l + 1);
    r = r && consumeToken(b, KW_DEFINE);
    r = r && identifier(b, l + 1);
    r = r && define_parameters(b, l + 1);
    r = r && define_statement_4(b, l + 1);
    r = r && rule_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [rule_type]
  private static boolean define_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_statement_4")) return false;
    rule_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BRACE_R
  static boolean end_brace(PsiBuilder b, int l) {
    return consumeToken(b, BRACE_R);
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
  // "codegen" identifier object
  public static boolean export_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STATEMENT, "<export statement>");
    r = consumeToken(b, "codegen");
    r = r && identifier(b, l + 1);
    p = r; // pin = identifier
    r = r && object(b, l + 1);
    exit_section_(b, l, m, r, p, YggParser::end_brace);
    return r || p;
  }

  /* ********************************************************** */
  // term (infix term | term)*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = term(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (infix term | term)*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  // infix term | term
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_1_0_0(b, l + 1);
    if (!r) r = term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infix term
  private static boolean expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON field_rhs
  public static boolean field_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_mark")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && field_rhs(b, l + 1);
    exit_section_(b, m, FIELD_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | charset | string_literal
  public static boolean field_rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_RHS, "<field rhs>");
    r = identifier(b, l + 1);
    if (!r) r = charset(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AT identifier <<parenthesis expr COMMA>>
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && identifier(b, l + 1);
    r = r && parenthesis(b, l + 1, YggParser::expr, COMMA_parser_);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // "grammar" identifier object
  public static boolean grammar_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GRAMMAR_STATEMENT, "<grammar statement>");
    r = consumeToken(b, "grammar");
    r = r && identifier(b, l + 1);
    p = r; // pin = identifier
    r = r && object(b, l + 1);
    exit_section_(b, l, m, r, p, YggParser::end_brace);
    return r || p;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L [identifier (COMMA identifier)* [COMMA]] BRACE_R
  public static boolean import_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && import_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, IMPORT_BODY, r);
    return r;
  }

  // [identifier (COMMA identifier)* [COMMA]]
  private static boolean import_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1")) return false;
    import_body_1_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)* [COMMA]
  private static boolean import_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && import_body_1_0_1(b, l + 1);
    r = r && import_body_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean import_body_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_body_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_body_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean import_body_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean import_body_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // KW_IMPORT string_literal [import_body]
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, "<import statement>");
    r = consumeToken(b, KW_IMPORT);
    r = r && string_literal(b, l + 1);
    p = r; // pin = string_literal
    r = r && import_statement_2(b, l + 1);
    exit_section_(b, l, m, r, p, YggParser::end_brace);
    return r || p;
  }

  // [import_body]
  private static boolean import_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_2")) return false;
    import_body(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CHOOSE | SOFT_CONNECT
  public static boolean infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix")) return false;
    if (!nextTokenIs(b, "<infix>", CHOOSE, SOFT_CONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX, "<infix>");
    r = consumeToken(b, CHOOSE);
    if (!r) r = consumeToken(b, SOFT_CONNECT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string_literal | key_symbol | INTEGER
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = string_literal(b, l + 1);
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
  // HASH identifier [<<parenthesis atom COMMA>>]
  public static boolean macro_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_call")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && identifier(b, l + 1);
    r = r && macro_call_2(b, l + 1);
    exit_section_(b, m, MACRO_CALL, r);
    return r;
  }

  // [<<parenthesis atom COMMA>>]
  private static boolean macro_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_call_2")) return false;
    parenthesis(b, l + 1, YggParser::atom, COMMA_parser_);
    return true;
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
  // identifier*
  public static boolean modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, MODIFIERS, "<modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!identifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // identifier ((DOUBLE_COLON|DOT) identifier)*
  public static boolean namepath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namepath")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && namepath_1(b, l + 1);
    exit_section_(b, m, NAMEPATH, r);
    return r;
  }

  // ((DOUBLE_COLON|DOT) identifier)*
  private static boolean namepath_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namepath_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namepath_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namepath_1", c)) break;
    }
    return true;
  }

  // (DOUBLE_COLON|DOT) identifier
  private static boolean namepath_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namepath_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namepath_1_0_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOUBLE_COLON|DOT
  private static boolean namepath_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namepath_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, DOUBLE_COLON);
    if (!r) r = consumeToken(b, DOT);
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
  // identifier
  public static boolean number_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_suffix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, NUMBER_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L (object_item [COMMA|SEMICOLON])* BRACE_R
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && object_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  // (object_item [COMMA|SEMICOLON])*
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_1", c)) break;
    }
    return true;
  }

  // object_item [COMMA|SEMICOLON]
  private static boolean object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_item(b, l + 1);
    r = r && object_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA|SEMICOLON]
  private static boolean object_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_1")) return false;
    object_1_0_1_0(b, l + 1);
    return true;
  }

  // COMMA|SEMICOLON
  private static boolean object_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // object_key COLON value
  public static boolean object_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_ITEM, "<object item>");
    r = object_key(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | string_literal
  public static boolean object_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_KEY, "<object key>");
    r = identifier(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // PARENTHESIS_L [<<item>> (<<delimiter>> <<item>>)* <<delimiter>>?] PARENTHESIS_R
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

  // [<<item>> (<<delimiter>> <<item>>)* <<delimiter>>?]
  private static boolean parenthesis_1(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1")) return false;
    parenthesis_1_0(b, l + 1, _item, _delimiter);
    return true;
  }

  // <<item>> (<<delimiter>> <<item>>)* <<delimiter>>?
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

  // <<delimiter>>?
  private static boolean parenthesis_1_0_2(PsiBuilder b, int l, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_2")) return false;
    _delimiter.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // ACCENT | NOT
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    if (!nextTokenIs(b, "<prefix>", ACCENT, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = consumeToken(b, ACCENT);
    if (!r) r = consumeToken(b, NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' range_start? ','? range_end? '}'
  public static boolean range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_1(b, l + 1);
    r = r && range_2(b, l + 1);
    r = r && range_3(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, RANGE, r);
    return r;
  }

  // range_start?
  private static boolean range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_1")) return false;
    range_start(b, l + 1);
    return true;
  }

  // ','?
  private static boolean range_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // range_end?
  private static boolean range_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_3")) return false;
    range_end(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // num
  public static boolean range_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_end")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_END, "<range end>");
    r = num(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // num
  public static boolean range_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_START, "<range start>");
    r = num(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L [CHOOSE] rule_expr PARENTHESIS_R | field_mark | branch_mark | function_call |
  //     num | string_literal | namepath | charset
  public static boolean rule_atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_ATOM, "<rule atom>");
    r = rule_atom_0(b, l + 1);
    if (!r) r = field_mark(b, l + 1);
    if (!r) r = branch_mark(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = num(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = namepath(b, l + 1);
    if (!r) r = charset(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PARENTHESIS_L [CHOOSE] rule_expr PARENTHESIS_R
  private static boolean rule_atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_atom_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && rule_atom_0_1(b, l + 1);
    r = r && rule_expr(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // [CHOOSE]
  private static boolean rule_atom_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_atom_0_1")) return false;
    consumeToken(b, CHOOSE);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L [CHOOSE] [rule_expr] BRACE_R
  public static boolean rule_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && rule_body_1(b, l + 1);
    r = r && rule_body_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, RULE_BODY, r);
    return r;
  }

  // [CHOOSE]
  private static boolean rule_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_body_1")) return false;
    consumeToken(b, CHOOSE);
    return true;
  }

  // [rule_expr]
  private static boolean rule_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_body_2")) return false;
    rule_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // rule_term (infix rule_term | rule_term)*
  public static boolean rule_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_EXPR, "<rule expr>");
    r = rule_term(b, l + 1);
    r = r && rule_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (infix rule_term | rule_term)*
  private static boolean rule_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rule_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule_expr_1", c)) break;
    }
    return true;
  }

  // infix rule_term | rule_term
  private static boolean rule_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_expr_1_0_0(b, l + 1);
    if (!r) r = rule_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infix rule_term
  private static boolean rule_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix(b, l + 1);
    r = r && rule_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (prefix)* rule_atom (suffix| range)*
  public static boolean rule_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_TERM, "<rule term>");
    r = rule_term_0(b, l + 1);
    r = r && rule_atom(b, l + 1);
    r = r && rule_term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (prefix)*
  private static boolean rule_term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_term_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rule_term_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule_term_0", c)) break;
    }
    return true;
  }

  // (prefix)
  private static boolean rule_term_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_term_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (suffix| range)*
  private static boolean rule_term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_term_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rule_term_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule_term_2", c)) break;
    }
    return true;
  }

  // suffix| range
  private static boolean rule_term_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_term_2_0")) return false;
    boolean r;
    r = suffix(b, l + 1);
    if (!r) r = range(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (COLON | ARROW) identifier
  public static boolean rule_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_type")) return false;
    if (!nextTokenIs(b, "<rule type>", ARROW, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_TYPE, "<rule type>");
    r = rule_type_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COLON | ARROW
  private static boolean rule_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_type_0")) return false;
    boolean r;
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, ARROW);
    return r;
  }

  /* ********************************************************** */
  // grammar_statement
  //     | export_statement
  //     | import_statement
  //     | macro_statement
  //     | macro_call
  //     | class_statement
  //     | union_statement
  //     | climb_statement
  //     | define_statement
  //     | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grammar_statement(b, l + 1);
    if (!r) r = export_statement(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = macro_statement(b, l + 1);
    if (!r) r = macro_call(b, l + 1);
    if (!r) r = class_statement(b, l + 1);
    if (!r) r = union_statement(b, l + 1);
    if (!r) r = climb_statement(b, l + 1);
    if (!r) r = define_statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // esc | STRING_SQ char* STRING_SQ | STRING_DQ char* STRING_DQ
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = esc(b, l + 1);
    if (!r) r = string_literal_1(b, l + 1);
    if (!r) r = string_literal_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING_SQ char* STRING_SQ
  private static boolean string_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_SQ);
    r = r && string_literal_1_1(b, l + 1);
    r = r && consumeToken(b, STRING_SQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // char*
  private static boolean string_literal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_literal_1_1", c)) break;
    }
    return true;
  }

  // STRING_DQ char* STRING_DQ
  private static boolean string_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_DQ);
    r = r && string_literal_2_1(b, l + 1);
    r = r && consumeToken(b, STRING_DQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // char*
  private static boolean string_literal_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_literal_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPTIONAL | MANY | MANY1
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = consumeToken(b, OPTIONAL);
    if (!r) r = consumeToken(b, MANY);
    if (!r) r = consumeToken(b, MANY1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // (prefix)* atom (suffix)*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = term_0(b, l + 1);
    r = r && atom(b, l + 1);
    r = r && term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (prefix)*
  private static boolean term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_0", c)) break;
    }
    return true;
  }

  // (prefix)
  private static boolean term_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (suffix)*
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_2", c)) break;
    }
    return true;
  }

  // (suffix)
  private static boolean term_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, TYPE_HINT, r);
    return r;
  }

  /* ********************************************************** */
  // modifiers KW_UNION identifier [rule_type] rule_body
  public static boolean union_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_statement")) return false;
    if (!nextTokenIs(b, "<union statement>", KW_UNION, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_STATEMENT, "<union statement>");
    r = modifiers(b, l + 1);
    r = r && consumeToken(b, KW_UNION);
    r = r && identifier(b, l + 1);
    r = r && union_statement_3(b, l + 1);
    r = r && rule_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [rule_type]
  private static boolean union_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_statement_3")) return false;
    rule_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BOOLEAN | num | string_literal | table | namepath | charset
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, BOOLEAN);
    if (!r) r = num(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = namepath(b, l + 1);
    if (!r) r = charset(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
}
