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
    create_token_set_(EXPRESSION, EXPRESSION_ATOM, EXPRESSION_CONCAT, EXPRESSION_GROUP,
      EXPRESSION_OR, EXPRESSION_UNARY),
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
  // annotations KW_CLASS identifier class-body
  public static boolean class_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_$")) return false;
    if (!nextTokenIs(b, "<class $>", KW_CLASS, SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS, "<class $>");
    r = annotations(b, l + 1);
    r = r && consumeToken(b, KW_CLASS);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && class_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BRACE_L class-term* BRACE_R
  public static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && class_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // class-term*
  private static boolean class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_term(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression
  public static boolean class_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_term")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    exit_section_(b, m, CLASS_TERM, r);
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
  // identifier | category | regex | range
  public static boolean expression_atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_ATOM, "<expression atom>");
    r = identifier(b, l + 1);
    if (!r) r = category(b, l + 1);
    if (!r) r = regex(b, l + 1);
    if (!r) r = range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression-unary OP_CONCAT expression-unary
  public static boolean expression_concat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_concat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_CONCAT, "<expression concat>");
    r = expression_unary(b, l + 1);
    r = r && consumeToken(b, OP_CONCAT);
    r = r && expression_unary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression-atom STAR*
  public static boolean expression_unary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_unary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION_UNARY, "<expression unary>");
    r = expression_atom(b, l + 1);
    r = r && expression_unary_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STAR*
  private static boolean expression_unary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_unary_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "expression_unary_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // annotations KW_GRAMMAR identifier BRACE_L BRACE_R
  public static boolean grammar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar")) return false;
    if (!nextTokenIs(b, "<grammar>", KW_GRAMMAR, SYMBOL)) return false;
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
  // annotations KW_GROUP SYMBOL
  public static boolean group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group")) return false;
    if (!nextTokenIs(b, "<group>", KW_GROUP, SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GROUP, "<group>");
    r = annotations(b, l + 1);
    r = r && consumeTokens(b, 1, KW_GROUP, SYMBOL);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
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
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, KEY, r);
    return r;
  }

  /* ********************************************************** */
  // identifier+
  public static boolean modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!identifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modifiers", c)) break;
    }
    exit_section_(b, m, MODIFIERS, r);
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
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, PAIR, r);
    return r;
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
  // SYMBOL {
  // }
  public static boolean regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
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
  //   | group
  //   | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    r = grammar(b, l + 1);
    if (!r) r = class_$(b, l + 1);
    if (!r) r = union(b, l + 1);
    if (!r) r = group(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // INTEGER
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    exit_section_(b, m, STRING, r);
    return r;
  }

  /* ********************************************************** */
  // annotations KW_UNION identifier union-body
  public static boolean union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union")) return false;
    if (!nextTokenIs(b, "<union>", KW_UNION, SYMBOL)) return false;
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
  // OP_OR expression
  public static boolean union_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_term")) return false;
    if (!nextTokenIs(b, OP_OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_OR);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, UNION_TERM, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | ESCAPED
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "<value>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: PREFIX(expression_group)
  // 1: BINARY(expression-or)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    if (!nextTokenIsSmart(b, PARENTHESIS_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = expression_group(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && consumeTokenSmart(b, OP_OR)) {
        r = expression(b, l, 1);
        exit_section_(b, l, m, EXPRESSION_OR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean expression_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group")) return false;
    if (!nextTokenIsSmart(b, PARENTHESIS_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = expression_group_0(b, l + 1);
    p = r;
    r = p && expression(b, l, 0);
    r = p && report_error_(b, consumeToken(b, PARENTHESIS_R)) && r;
    exit_section_(b, l, m, EXPRESSION_GROUP, r, p, null);
    return r || p;
  }

  // PARENTHESIS_L OP_OR?
  private static boolean expression_group_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PARENTHESIS_L);
    r = r && expression_group_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_OR?
  private static boolean expression_group_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_group_0_1")) return false;
    consumeTokenSmart(b, OP_OR);
    return true;
  }

}
