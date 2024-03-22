// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static yggdrasil.psi.YggdrasilTypes.*;
import static yggdrasil.psi.ParserExtension.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YggdrasilParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ATOMIC, EXPRESSION, EXPRESSION_GROUP, EXPRESSION_HARD,
      EXPRESSION_SOFT, EXPRESSION_TAG, TERM),
  };

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean alias_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_name")) return false;
    if (!nextTokenIs(b, "<alias name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_NAME, "<alias name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // modifiers?
  public static boolean annotations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotations")) return false;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATIONS, "<annotations>");
    modifiers(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // expression-group | identifier | category | string | regex
  public static boolean atomic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomic")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ATOMIC, "<atomic>");
    r = expression_group(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    if (!r) r = category(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = regex(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // escape (BRACE_L identifier (EQ identifier)? BRACE_R)? {
  // }
  public static boolean category(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category")) return false;
    if (!nextTokenIs(b, ESCAPED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = escape(b, l + 1);
    r = r && category_1(b, l + 1);
    r = r && category_2(b, l + 1);
    exit_section_(b, m, CATEGORY, r);
    return r;
  }

  // (BRACE_L identifier (EQ identifier)? BRACE_R)?
  private static boolean category_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category_1")) return false;
    category_1_0(b, l + 1);
    return true;
  }

  // BRACE_L identifier (EQ identifier)? BRACE_R
  private static boolean category_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && identifier(b, l + 1);
    r = r && category_1_0_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ identifier)?
  private static boolean category_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category_1_0_2")) return false;
    category_1_0_2_0(b, l + 1);
    return true;
  }

  // EQ identifier
  private static boolean category_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "category_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean category_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // annotations KW_CLASS identifier class-cast? class-body
  public static boolean class_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_$")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS, "<class $>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_CLASS);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, class_3(b, l + 1)) && r;
    r = p && class_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // class-cast?
  private static boolean class_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_3")) return false;
    class_cast(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L OP_OR? class-term* BRACE_R
  public static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && class_body_1(b, l + 1);
    r = r && class_body_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // OP_OR?
  private static boolean class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_1")) return false;
    consumeToken(b, OP_OR);
    return true;
  }

  // class-term*
  private static boolean class_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_body_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TO identifier
  public static boolean class_cast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_cast")) return false;
    if (!nextTokenIs(b, TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, CLASS_CAST, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean class_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_TERM, "<class term>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ESCAPED
  public static boolean escape(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escape")) return false;
    if (!nextTokenIs(b, ESCAPED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ESCAPED);
    exit_section_(b, m, ESCAPE, r);
    return r;
  }

  /* ********************************************************** */
  // expression-hard (OP_OR expression-hard)* {
  // }
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_hard(b, l + 1);
    r = r && expression_1(b, l + 1);
    r = r && expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP_OR expression-hard)*
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1", c)) break;
    }
    return true;
  }

  // OP_OR expression-hard
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && expression_hard(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean expression_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // PARENTHESIS_L OP_OR? expression PARENTHESIS_R
  public static boolean expression_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && expression_group_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, EXPRESSION_GROUP, r);
    return r;
  }

  // OP_OR?
  private static boolean expression_group_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group_1")) return false;
    consumeToken(b, OP_OR);
    return true;
  }

  /* ********************************************************** */
  // expression-soft (OP_CONCAT expression-soft)*
  public static boolean expression_hard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_hard")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_HARD, "<expression hard>");
    r = expression_soft(b, l + 1);
    r = r && expression_hard_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OP_CONCAT expression-soft)*
  private static boolean expression_hard_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_hard_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_hard_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_hard_1", c)) break;
    }
    return true;
  }

  // OP_CONCAT expression-soft
  private static boolean expression_hard_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_hard_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_CONCAT);
    r = r && expression_soft(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression-tag expression-tag*
  public static boolean expression_soft(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_soft")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_SOFT, "<expression soft>");
    r = expression_tag(b, l + 1);
    r = r && expression_soft_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression-tag*
  private static boolean expression_soft_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_soft_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_tag(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_soft_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (identifier COLON)? term
  public static boolean expression_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_TAG, "<expression tag>");
    r = expression_tag_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identifier COLON)?
  private static boolean expression_tag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tag_0")) return false;
    expression_tag_0_0(b, l + 1);
    return true;
  }

  // identifier COLON
  private static boolean expression_tag_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_tag_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotations KW_GRAMMAR identifier BRACE_L BRACE_R
  public static boolean grammar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GRAMMAR, "<grammar>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_GRAMMAR);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, BRACE_L, BRACE_R)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SYMBOL | SYMBOW_RAW
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, SYMBOW_RAW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean interface_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_name")) return false;
    if (!nextTokenIs(b, "<interface name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_NAME, "<interface name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    if (!nextTokenIs(b, "<key>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier+
  public static boolean modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers")) return false;
    if (!nextTokenIs(b, "<modifiers>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIERS, "<modifiers>");
    r = identifier(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!identifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modifiers", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean module_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name")) return false;
    if (!nextTokenIs(b, "<module name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_NAME, "<module name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTEGER {
  // //    mixin = "yggdrasil.psi.mixin.MixinNumber"
  // }
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    r = r && number_1(b, l + 1);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  // {
  // //    mixin = "yggdrasil.psi.mixin.MixinNumber"
  // }
  private static boolean number_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean organization_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "organization_name")) return false;
    if (!nextTokenIs(b, "<organization name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORGANIZATION_NAME, "<organization name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // key COLON value
  public static boolean pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair")) return false;
    if (!nextTokenIs(b, "<pair>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
    r = key(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_NOT | OP_AND | OP_REMARK {
  // }
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, OP_AND);
    if (!r) r = prefix_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP_REMARK {
  // }
  private static boolean prefix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_REMARK);
    r = r && prefix_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean prefix_2_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // BRACE_L COMMA? BRACE_R
  //            | BRACE_L range-lower COMMA? BRACE_R
  //            | BRACE_L COMMA range-upper BRACE_R
  //            | BRACE_L range-upper COMMA range-upper BRACE_R
  public static boolean range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range_0(b, l + 1);
    if (!r) r = range_1(b, l + 1);
    if (!r) r = range_2(b, l + 1);
    if (!r) r = range_3(b, l + 1);
    exit_section_(b, m, RANGE, r);
    return r;
  }

  // BRACE_L COMMA? BRACE_R
  private static boolean range_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_0_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean range_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // BRACE_L range-lower COMMA? BRACE_R
  private static boolean range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_lower(b, l + 1);
    r = r && range_1_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean range_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_1_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // BRACE_L COMMA range-upper BRACE_R
  private static boolean range_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BRACE_L, COMMA);
    r = r && range_upper(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACE_L range-upper COMMA range-upper BRACE_R
  private static boolean range_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && range_upper(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && range_upper(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER
  public static boolean range_lower(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_lower")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    exit_section_(b, m, RANGE_LOWER, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER
  public static boolean range_upper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_upper")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    exit_section_(b, m, RANGE_UPPER, r);
    return r;
  }

  /* ********************************************************** */
  // REGULAR_EXPRESSION {
  // }
  public static boolean regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex")) return false;
    if (!nextTokenIs(b, REGULAR_EXPRESSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGULAR_EXPRESSION);
    r = r && regex_1(b, l + 1);
    exit_section_(b, m, REGEX, r);
    return r;
  }

  // {
  // }
  private static boolean regex_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // statements*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean semantic_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semantic_number")) return false;
    if (!nextTokenIs(b, "<semantic number>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMANTIC_NUMBER, "<semantic number>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // grammar
  //   | class
  //   | union
  //   | token
  //   | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    r = grammar(b, l + 1);
    if (!r) r = class_$(b, l + 1);
    if (!r) r = union(b, l + 1);
    if (!r) r = token(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // TEXT_SINGLE | TEXT_DOUBLE
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", TEXT_DOUBLE, TEXT_SINGLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, TEXT_SINGLE);
    if (!r) r = consumeToken(b, TEXT_DOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_OPTIONAL | OP_MANY | OP_MANY1 | range {
  // }
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = consumeToken(b, OP_OPTIONAL);
    if (!r) r = consumeToken(b, OP_MANY);
    if (!r) r = consumeToken(b, OP_MANY1);
    if (!r) r = suffix_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // range {
  // }
  private static boolean suffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = range(b, l + 1);
    r = r && suffix_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean suffix_3_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // HASH identifier
  public static boolean tag_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_branch")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, TAG_BRANCH, r);
    return r;
  }

  /* ********************************************************** */
  // prefix* atomic suffix*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TERM, "<term>");
    r = term_0(b, l + 1);
    r = r && atomic(b, l + 1);
    r = r && term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // prefix*
  private static boolean term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prefix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_0", c)) break;
    }
    return true;
  }

  // suffix*
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!suffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotations KW_GROUP token-body
  public static boolean token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TOKEN, "<token>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_GROUP);
    p = r; // pin = 2
    r = r && token_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BRACE_L token-term* BRACE_R
  public static boolean token_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && token_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, TOKEN_BODY, r);
    return r;
  }

  // token-term*
  private static boolean token_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!token_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier COLON expression | SEMICOLON
  public static boolean token_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_TERM, "<token term>");
    r = token_term_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier COLON expression
  private static boolean token_term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_term_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotations KW_UNION identifier union-body
  public static boolean union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, UNION, "<union>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_UNION);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && union_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BRACE_L union-term* BRACE_R
  public static boolean union_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && union_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, UNION_BODY, r);
    return r;
  }

  // union-term*
  private static boolean union_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!union_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OP_OR expression-hard tag-branch?
  public static boolean union_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_term")) return false;
    if (!nextTokenIs(b, OP_OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && expression_hard(b, l + 1);
    r = r && union_term_2(b, l + 1);
    exit_section_(b, m, UNION_TERM, r);
    return r;
  }

  // tag-branch?
  private static boolean union_term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_term_2")) return false;
    tag_branch(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier | ESCAPED
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
