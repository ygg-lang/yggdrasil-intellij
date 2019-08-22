// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ygg.intellij.language.psi_node.*;

public interface YggTypes {

  IElementType EXPR = new YElementType("EXPR");
  IElementType FUNCTION_STATEMENT = new YElementType("FUNCTION_STATEMENT");
  IElementType GRAMMAR_STATEMENT = new YElementType("GRAMMAR_STATEMENT");
  IElementType GRAMMAR_SYMBOL = new YElementType("GRAMMAR_SYMBOL");
  IElementType IGNORE_STATEMENT = new YElementType("IGNORE_STATEMENT");
  IElementType IMPORT_STATEMENT = new YElementType("IMPORT_STATEMENT");
  IElementType KEY = new YElementType("KEY");
  IElementType KEY_SYMBOL = new YElementType("KEY_SYMBOL");
  IElementType MACRO_ARG = new YElementType("MACRO_ARG");
  IElementType MACRO_STATEMENT = new YElementType("MACRO_STATEMENT");
  IElementType NUMBER_SUFFIX = new YElementType("NUMBER_SUFFIX");
  IElementType PAIR = new YElementType("PAIR");
  IElementType PARENTHESIS = new YElementType("PARENTHESIS");
  IElementType REGEX = new YElementType("REGEX");
  IElementType REGEX_MODE = new YElementType("REGEX_MODE");
  IElementType REGEX_RANGE = new YElementType("REGEX_RANGE");
  IElementType RULE_STATEMENT = new YElementType("RULE_STATEMENT");
  IElementType RULE_SYMBOL = new YElementType("RULE_SYMBOL");
  IElementType STRING = new YElementType("STRING");
  IElementType SYMBOL_PATH = new YElementType("SYMBOL_PATH");
  IElementType TABLE = new YElementType("TABLE");
  IElementType TYPE_HINT = new YElementType("TYPE_HINT");
  IElementType VALUE = new YElementType("VALUE");

  IElementType ACCENT = new YElementType("^");
  IElementType ANGLE_L = new YElementType("<");
  IElementType ANGLE_R = new YElementType(">");
  IElementType AS = new YElementType("as");
  IElementType AT = new YElementType("@");
  IElementType BOOLEAN = new YElementType("BOOLEAN");
  IElementType BRACE_L = new YElementType("{");
  IElementType BRACE_R = new YElementType("}");
  IElementType BRACKET_L = new YElementType("[");
  IElementType BRACKET_R = new YElementType("]");
  IElementType BYTE = new YElementType("BYTE");
  IElementType CHARACTER = new YElementType("CHARACTER");
  IElementType CHOOSE = new YElementType("|");
  IElementType COLON = new YElementType(":");
  IElementType COMMA = new YElementType(",");
  IElementType COMMENT_BLOCK = new YElementType("COMMENT_BLOCK");
  IElementType COMMENT_DOC = new YElementType("COMMENT_DOC");
  IElementType COMMENT_LINE = new YElementType("COMMENT_LINE");
  IElementType DECIMAL = new YElementType("DECIMAL");
  IElementType DOLLAR = new YElementType("$");
  IElementType DOT = new YElementType(".");
  IElementType EQ = new YElementType("=");
  IElementType ESCAPE = new YElementType("\\");
  IElementType ESCAPE_SPECIAL = new YElementType("ESCAPE_SPECIAL");
  IElementType ESCAPE_UNICODE = new YElementType("ESCAPE_UNICODE");
  IElementType FRAGMENT = new YElementType("@fragment");
  IElementType GRAMMAR = new YElementType("@grammar");
  IElementType IGNORE = new YElementType("@ignore");
  IElementType IMPORT = new YElementType("@import");
  IElementType INTEGER = new YElementType("INTEGER");
  IElementType MANY = new YElementType("*");
  IElementType MANY1 = new YElementType("+");
  IElementType NOT = new YElementType("!");
  IElementType NULL = new YElementType("NULL");
  IElementType OPTIONAL = new YElementType("?");
  IElementType PARENTHESIS_L = new YElementType("(");
  IElementType PARENTHESIS_R = new YElementType(")");
  IElementType QUOTATION = new YElementType("\"");
  IElementType REGEX_CHARACTER = new YElementType("REGEX_CHARACTER");
  IElementType REGEX_QUOTE = new YElementType("REGEX_QUOTE");
  IElementType REGEX_RANGE_L = new YElementType("REGEX_RANGE_L");
  IElementType REGEX_RANGE_R = new YElementType("REGEX_RANGE_R");
  IElementType SEMICOLON = new YElementType(";");
  IElementType SIGN = new YElementType("SIGN");
  IElementType SOFT_CONNECT = new YElementType("~");
  IElementType STRING_DQ = new YElementType("STRING_DQ");
  IElementType STRING_SQ = new YElementType("STRING_SQ");
  IElementType SYMBOL = new YElementType("SYMBOL");
  IElementType TAGGED = new YElementType("<-");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXPR) {
        return new YggExprNode(node);
      }
      else if (type == FUNCTION_STATEMENT) {
        return new YggFunctionStatementNode(node);
      }
      else if (type == GRAMMAR_STATEMENT) {
        return new YggGrammarStatementNode(node);
      }
      else if (type == GRAMMAR_SYMBOL) {
        return new YggGrammarSymbolNode(node);
      }
      else if (type == IGNORE_STATEMENT) {
        return new YggIgnoreStatementNode(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new YggImportStatementNode(node);
      }
      else if (type == KEY) {
        return new YggKeyNode(node);
      }
      else if (type == KEY_SYMBOL) {
        return new YggKeySymbolNode(node);
      }
      else if (type == MACRO_ARG) {
        return new YggMacroArgNode(node);
      }
      else if (type == MACRO_STATEMENT) {
        return new YggMacroStatementNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new YggNumberSuffixNode(node);
      }
      else if (type == PAIR) {
        return new YggPairNode(node);
      }
      else if (type == PARENTHESIS) {
        return new YggParenthesisNode(node);
      }
      else if (type == REGEX) {
        return new YggRegexNode(node);
      }
      else if (type == REGEX_MODE) {
        return new YggRegexModeNode(node);
      }
      else if (type == REGEX_RANGE) {
        return new YggRegexRangeNode(node);
      }
      else if (type == RULE_STATEMENT) {
        return new YggRuleStatementNode(node);
      }
      else if (type == RULE_SYMBOL) {
        return new YggRuleSymbolNode(node);
      }
      else if (type == STRING) {
        return new YggStringNode(node);
      }
      else if (type == SYMBOL_PATH) {
        return new YggSymbolPathNode(node);
      }
      else if (type == TABLE) {
        return new YggTableNode(node);
      }
      else if (type == TYPE_HINT) {
        return new YggTypeHintNode(node);
      }
      else if (type == VALUE) {
        return new YggValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
