// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ygg.intellij.language.psi_node.*;

public interface YggTypes {

  IElementType ANNOTATION = new YggElementType("ANNOTATION");
  IElementType ANNOTATION_MARK = new YggElementType("ANNOTATION_MARK");
  IElementType BACK_TOP = new YggElementType("BACK_TOP");
  IElementType EXPRESSION = new YggElementType("EXPRESSION");
  IElementType GRAMMAR_STATEMENT = new YggElementType("GRAMMAR_STATEMENT");
  IElementType GRAMMAR_SYMBOL = new YggElementType("GRAMMAR_SYMBOL");
  IElementType IGNORE_STATEMENT = new YggElementType("IGNORE_STATEMENT");
  IElementType IMPORT_STATEMENT = new YggElementType("IMPORT_STATEMENT");
  IElementType INSERT_DOT = new YggElementType("INSERT_DOT");
  IElementType INSERT_ITEM = new YggElementType("INSERT_ITEM");
  IElementType INSERT_PAIR = new YggElementType("INSERT_PAIR");
  IElementType INSERT_STAR = new YggElementType("INSERT_STAR");
  IElementType KEY_SYMBOL = new YggElementType("KEY_SYMBOL");
  IElementType NUMBER_SUFFIX = new YggElementType("NUMBER_SUFFIX");
  IElementType PAIR = new YggElementType("PAIR");
  IElementType REF = new YggElementType("REF");
  IElementType RULE_SYMBOL = new YggElementType("RULE_SYMBOL");
  IElementType SCOPE = new YggElementType("SCOPE");
  IElementType SCOPE_MARK = new YggElementType("SCOPE_MARK");
  IElementType STRING = new YggElementType("STRING");
  IElementType SYMBOL_PATH = new YggElementType("SYMBOL_PATH");
  IElementType TABLE = new YggElementType("TABLE");
  IElementType TYPE_HINT = new YggElementType("TYPE_HINT");
  IElementType VALUE = new YggElementType("VALUE");

  IElementType ACCENT = new YggTokenType("^");
  IElementType ANGLE_L = new YggTokenType("<");
  IElementType ANGLE_R = new YggTokenType(">");
  IElementType AS = new YggTokenType("as");
  IElementType AT = new YggTokenType("@");
  IElementType BOOLEAN = new YggTokenType("BOOLEAN");
  IElementType BRACE_L = new YggTokenType("{");
  IElementType BRACE_R = new YggTokenType("}");
  IElementType BRACKET_L = new YggTokenType("[");
  IElementType BRACKET_R = new YggTokenType("]");
  IElementType BYTE = new YggTokenType("BYTE");
  IElementType CHARACTER = new YggTokenType("CHARACTER");
  IElementType CHOOSE = new YggTokenType("|");
  IElementType CITE = new YggTokenType("$");
  IElementType COLON = new YggTokenType(":");
  IElementType COMMA = new YggTokenType(",");
  IElementType COMMENT_BLOCK = new YggTokenType("COMMENT_BLOCK");
  IElementType COMMENT_DOC = new YggTokenType("COMMENT_DOC");
  IElementType COMMENT_LINE = new YggTokenType("COMMENT_LINE");
  IElementType DECIMAL = new YggTokenType("DECIMAL");
  IElementType DOT = new YggTokenType(".");
  IElementType EQ = new YggTokenType("=");
  IElementType ESCAPE = new YggTokenType("\\");
  IElementType ESCAPE_SPECIAL = new YggTokenType("ESCAPE_SPECIAL");
  IElementType ESCAPE_UNICODE = new YggTokenType("ESCAPE_UNICODE");
  IElementType FRAGMENT = new YggTokenType("@fragment");
  IElementType GRAMMAR = new YggTokenType("@grammar");
  IElementType IGNORE = new YggTokenType("@ignore");
  IElementType IMPORT = new YggTokenType("@import");
  IElementType INTEGER = new YggTokenType("INTEGER");
  IElementType NAN = new YggTokenType("NAN");
  IElementType NULL = new YggTokenType("NULL");
  IElementType OPTIONAL = new YggTokenType("?");
  IElementType PARENTHESIS_L = new YggTokenType("(");
  IElementType PARENTHESIS_R = new YggTokenType(")");
  IElementType QUOTATION = new YggTokenType("\"");
  IElementType SEMICOLON = new YggTokenType(";");
  IElementType SIGN = new YggTokenType("SIGN");
  IElementType SOFT_CONNECT = new YggTokenType("~");
  IElementType STAR = new YggTokenType("*");
  IElementType STRING_QUOTE = new YggTokenType("STRING_QUOTE");
  IElementType SYMBOL = new YggTokenType("SYMBOL");
  IElementType TAGGED = new YggTokenType("<-");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new YggAnnotationNode(node);
      }
      else if (type == ANNOTATION_MARK) {
        return new YggAnnotationMarkNode(node);
      }
      else if (type == BACK_TOP) {
        return new YggBackTopNode(node);
      }
      else if (type == EXPRESSION) {
        return new YggExpressionNode(node);
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
      else if (type == INSERT_DOT) {
        return new YggInsertDotNode(node);
      }
      else if (type == INSERT_ITEM) {
        return new YggInsertItemNode(node);
      }
      else if (type == INSERT_PAIR) {
        return new YggInsertPairNode(node);
      }
      else if (type == INSERT_STAR) {
        return new YggInsertStarNode(node);
      }
      else if (type == KEY_SYMBOL) {
        return new YggKeySymbolNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new YggNumberSuffixNode(node);
      }
      else if (type == PAIR) {
        return new YggPairNode(node);
      }
      else if (type == REF) {
        return new YggRefNode(node);
      }
      else if (type == RULE_SYMBOL) {
        return new YggRuleSymbolNode(node);
      }
      else if (type == SCOPE) {
        return new YggScopeNode(node);
      }
      else if (type == SCOPE_MARK) {
        return new YggScopeMarkNode(node);
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
