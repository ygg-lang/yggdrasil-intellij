// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ygg.intellij.language.psi_node.*;

public interface YggTypes {

  IElementType ATOM = new YggElementType("ATOM");
  IElementType BRANCH_MARK = new YggElementType("BRANCH_MARK");
  IElementType CHARSET = new YggElementType("CHARSET");
  IElementType DEFINE = new YggElementType("DEFINE");
  IElementType EXPORT_STATEMENT = new YggElementType("EXPORT_STATEMENT");
  IElementType EXPR = new YggElementType("EXPR");
  IElementType FIELD_MARK = new YggElementType("FIELD_MARK");
  IElementType FIELD_RHS = new YggElementType("FIELD_RHS");
  IElementType FUNCTION_CALL = new YggElementType("FUNCTION_CALL");
  IElementType GRAMMAR_STATEMENT = new YggElementType("GRAMMAR_STATEMENT");
  IElementType IDENTIFIER = new YggElementType("IDENTIFIER");
  IElementType IMPORT_STATEMENT = new YggElementType("IMPORT_STATEMENT");
  IElementType INFIX = new YggElementType("INFIX");
  IElementType KEY = new YggElementType("KEY");
  IElementType KEY_SYMBOL = new YggElementType("KEY_SYMBOL");
  IElementType MACRO_ARG = new YggElementType("MACRO_ARG");
  IElementType MACRO_CALL = new YggElementType("MACRO_CALL");
  IElementType MACRO_STATEMENT = new YggElementType("MACRO_STATEMENT");
  IElementType MODIFIERS = new YggElementType("MODIFIERS");
  IElementType NAMESPACE = new YggElementType("NAMESPACE");
  IElementType NUMBER_SUFFIX = new YggElementType("NUMBER_SUFFIX");
  IElementType OBJECT = new YggElementType("OBJECT");
  IElementType OBJECT_ITEM = new YggElementType("OBJECT_ITEM");
  IElementType OBJECT_KEY = new YggElementType("OBJECT_KEY");
  IElementType PAIR = new YggElementType("PAIR");
  IElementType PARENTHESIS = new YggElementType("PARENTHESIS");
  IElementType PREFIX = new YggElementType("PREFIX");
  IElementType RULE_ARGUMENT = new YggElementType("RULE_ARGUMENT");
  IElementType RULE_STATEMENT = new YggElementType("RULE_STATEMENT");
  IElementType RULE_TYPE = new YggElementType("RULE_TYPE");
  IElementType STRING_LITERAL = new YggElementType("STRING_LITERAL");
  IElementType SUFFIX = new YggElementType("SUFFIX");
  IElementType SYMBOL_PATH = new YggElementType("SYMBOL_PATH");
  IElementType TABLE = new YggElementType("TABLE");
  IElementType TERM = new YggElementType("TERM");
  IElementType TYPE_HINT = new YggElementType("TYPE_HINT");
  IElementType VALUE = new YggElementType("VALUE");

  IElementType ACCENT = new YggElementType("^");
  IElementType ANGLE_L = new YggElementType("<");
  IElementType ANGLE_R = new YggElementType(">");
  IElementType ARROW = new YggElementType("ARROW");
  IElementType AS = new YggElementType("as");
  IElementType AT = new YggElementType("@");
  IElementType BOOLEAN = new YggElementType("BOOLEAN");
  IElementType BRACE_L = new YggElementType("{");
  IElementType BRACE_R = new YggElementType("}");
  IElementType BRACKET_L = new YggElementType("[");
  IElementType BRACKET_R = new YggElementType("]");
  IElementType BYTE = new YggElementType("BYTE");
  IElementType CHARACTER = new YggElementType("CHARACTER");
  IElementType CHOOSE = new YggElementType("|");
  IElementType COLON = new YggElementType(":");
  IElementType COMMA = new YggElementType(",");
  IElementType COMMENT_BLOCK = new YggElementType("COMMENT_BLOCK");
  IElementType COMMENT_DOC = new YggElementType("COMMENT_DOC");
  IElementType COMMENT_LINE = new YggElementType("COMMENT_LINE");
  IElementType DECIMAL = new YggElementType("DECIMAL");
  IElementType DOLLAR = new YggElementType("$");
  IElementType DOT = new YggElementType(".");
  IElementType DOUBLE_COLON = new YggElementType("DOUBLE_COLON");
  IElementType EQ = new YggElementType("=");
  IElementType ESCAPE = new YggElementType("\\");
  IElementType ESCAPE_SPECIAL = new YggElementType("ESCAPE_SPECIAL");
  IElementType ESCAPE_UNICODE = new YggElementType("ESCAPE_UNICODE");
  IElementType HASH = new YggElementType("HASH");
  IElementType HYPHEN = new YggElementType("-");
  IElementType INTEGER = new YggElementType("INTEGER");
  IElementType MANY = new YggElementType("*");
  IElementType MANY1 = new YggElementType("+");
  IElementType NOT = new YggElementType("!");
  IElementType NULL = new YggElementType("NULL");
  IElementType OPTIONAL = new YggElementType("?");
  IElementType PARENTHESIS_L = new YggElementType("(");
  IElementType PARENTHESIS_R = new YggElementType(")");
  IElementType QUOTATION = new YggElementType("\"");
  IElementType REGEX_RANGE = new YggElementType("REGEX_RANGE");
  IElementType SEMICOLON = new YggElementType(";");
  IElementType SIGN = new YggElementType("SIGN");
  IElementType SOFT_CONNECT = new YggElementType("~");
  IElementType STRING_DQ = new YggElementType("STRING_DQ");
  IElementType STRING_SQ = new YggElementType("STRING_SQ");
  IElementType SYMBOL = new YggElementType("SYMBOL");
  IElementType TAGGED = new YggElementType("<-");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new YggAtomNode(node);
      }
      else if (type == BRANCH_MARK) {
        return new YggBranchMarkNode(node);
      }
      else if (type == CHARSET) {
        return new YggCharsetNode(node);
      }
      else if (type == DEFINE) {
        return new YggDefineNode(node);
      }
      else if (type == EXPORT_STATEMENT) {
        return new YggExportStatementNode(node);
      }
      else if (type == EXPR) {
        return new YggExprNode(node);
      }
      else if (type == FIELD_MARK) {
        return new YggFieldMarkNode(node);
      }
      else if (type == FIELD_RHS) {
        return new YggFieldRhsNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new YggFunctionCallNode(node);
      }
      else if (type == GRAMMAR_STATEMENT) {
        return new YggGrammarStatementNode(node);
      }
      else if (type == IDENTIFIER) {
        return new YggIdentifierNode(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new YggImportStatementNode(node);
      }
      else if (type == INFIX) {
        return new YggInfixNode(node);
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
      else if (type == MACRO_CALL) {
        return new YggMacroCallNode(node);
      }
      else if (type == MACRO_STATEMENT) {
        return new YggMacroStatementNode(node);
      }
      else if (type == MODIFIERS) {
        return new YggModifiersNode(node);
      }
      else if (type == NAMESPACE) {
        return new YggNamespaceNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new YggNumberSuffixNode(node);
      }
      else if (type == OBJECT) {
        return new YggObjectNode(node);
      }
      else if (type == OBJECT_ITEM) {
        return new YggObjectItemNode(node);
      }
      else if (type == OBJECT_KEY) {
        return new YggObjectKeyNode(node);
      }
      else if (type == PAIR) {
        return new YggPairNode(node);
      }
      else if (type == PARENTHESIS) {
        return new YggParenthesisNode(node);
      }
      else if (type == PREFIX) {
        return new YggPrefixNode(node);
      }
      else if (type == RULE_ARGUMENT) {
        return new YggRuleArgumentNode(node);
      }
      else if (type == RULE_STATEMENT) {
        return new YggRuleStatementNode(node);
      }
      else if (type == RULE_TYPE) {
        return new YggRuleTypeNode(node);
      }
      else if (type == STRING_LITERAL) {
        return new YggStringLiteralNode(node);
      }
      else if (type == SUFFIX) {
        return new YggSuffixNode(node);
      }
      else if (type == SYMBOL_PATH) {
        return new YggSymbolPathNode(node);
      }
      else if (type == TABLE) {
        return new YggTableNode(node);
      }
      else if (type == TERM) {
        return new YggTermNode(node);
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
