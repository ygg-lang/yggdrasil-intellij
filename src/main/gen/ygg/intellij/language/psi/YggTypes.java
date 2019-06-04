// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ygg.intellij.language.psi_node.*;

public interface YggTypes {

  IElementType ANNOTATION = new IElementType("ANNOTATION", null);
  IElementType ANNOTATION_MARK = new IElementType("ANNOTATION_MARK", null);
  IElementType BACK_TOP = new IElementType("BACK_TOP", null);
  IElementType EXPRESSION = new IElementType("EXPRESSION", null);
  IElementType GRAMMAR_STATEMENT = new IElementType("GRAMMAR_STATEMENT", null);
  IElementType GRAMMAR_SYMBOL = new IElementType("GRAMMAR_SYMBOL", null);
  IElementType IGNORE_STATEMENT = new IElementType("IGNORE_STATEMENT", null);
  IElementType IMPORT_STATEMENT = new IElementType("IMPORT_STATEMENT", null);
  IElementType INSERT_DOT = new IElementType("INSERT_DOT", null);
  IElementType INSERT_ITEM = new IElementType("INSERT_ITEM", null);
  IElementType INSERT_PAIR = new IElementType("INSERT_PAIR", null);
  IElementType INSERT_STAR = new IElementType("INSERT_STAR", null);
  IElementType KEY_SYMBOL = new IElementType("KEY_SYMBOL", null);
  IElementType NUMBER_SUFFIX = new IElementType("NUMBER_SUFFIX", null);
  IElementType PAIR = new IElementType("PAIR", null);
  IElementType REF = new IElementType("REF", null);
  IElementType RULE_SYMBOL = new IElementType("RULE_SYMBOL", null);
  IElementType SCOPE = new IElementType("SCOPE", null);
  IElementType SCOPE_MARK = new IElementType("SCOPE_MARK", null);
  IElementType STRING = new IElementType("STRING", null);
  IElementType SYMBOL_PATH = new IElementType("SYMBOL_PATH", null);
  IElementType TABLE = new IElementType("TABLE", null);
  IElementType TYPE_HINT = new IElementType("TYPE_HINT", null);
  IElementType VALUE = new IElementType("VALUE", null);

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
  IElementType NAN = new YggTokenType("nan");
  IElementType NON_ESCAPE = new YggTokenType("NON_ESCAPE");
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
