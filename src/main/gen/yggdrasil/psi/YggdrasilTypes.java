// This is a generated file. Not intended for manual editing.
package yggdrasil.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import yggdrasil.psi.node.*;

public interface YggdrasilTypes {

  IElementType ALIAS_NAME = new YggdrasilElementType("ALIAS_NAME");
  IElementType ANNOTATIONS = new YggdrasilElementType("ANNOTATIONS");
  IElementType CATEGORY = new YggdrasilElementType("CATEGORY");
  IElementType CLASS = new YggdrasilElementType("CLASS");
  IElementType CLASS_BODY = new YggdrasilElementType("CLASS_BODY");
  IElementType CLASS_TERM = new YggdrasilElementType("CLASS_TERM");
  IElementType ESCAPE = new YggdrasilElementType("ESCAPE");
  IElementType EXPRESSION = new YggdrasilElementType("EXPRESSION");
  IElementType EXPRESSION_ATOM = new YggdrasilElementType("EXPRESSION_ATOM");
  IElementType EXPRESSION_CONCAT = new YggdrasilElementType("EXPRESSION_CONCAT");
  IElementType EXPRESSION_GROUP = new YggdrasilElementType("EXPRESSION_GROUP");
  IElementType EXPRESSION_OR = new YggdrasilElementType("EXPRESSION_OR");
  IElementType EXPRESSION_UNARY = new YggdrasilElementType("EXPRESSION_UNARY");
  IElementType GRAMMAR = new YggdrasilElementType("GRAMMAR");
  IElementType GROUP = new YggdrasilElementType("GROUP");
  IElementType IDENTIFIER = new YggdrasilElementType("IDENTIFIER");
  IElementType INTERFACE_NAME = new YggdrasilElementType("INTERFACE_NAME");
  IElementType KEY = new YggdrasilElementType("KEY");
  IElementType MODIFIERS = new YggdrasilElementType("MODIFIERS");
  IElementType MODULE_NAME = new YggdrasilElementType("MODULE_NAME");
  IElementType NUMBER = new YggdrasilElementType("NUMBER");
  IElementType ORGANIZATION_NAME = new YggdrasilElementType("ORGANIZATION_NAME");
  IElementType PAIR = new YggdrasilElementType("PAIR");
  IElementType RANGE = new YggdrasilElementType("RANGE");
  IElementType RANGE_LOWER = new YggdrasilElementType("RANGE_LOWER");
  IElementType RANGE_UPPER = new YggdrasilElementType("RANGE_UPPER");
  IElementType REGEX = new YggdrasilElementType("REGEX");
  IElementType SEMANTIC_NUMBER = new YggdrasilElementType("SEMANTIC_NUMBER");
  IElementType STRING = new YggdrasilElementType("STRING");
  IElementType UNION = new YggdrasilElementType("UNION");
  IElementType UNION_BODY = new YggdrasilElementType("UNION_BODY");
  IElementType UNION_TERM = new YggdrasilElementType("UNION_TERM");
  IElementType VALUE = new YggdrasilElementType("VALUE");

  IElementType ACCENT = new YggdrasilElementType("^");
  IElementType ANGLE_L = new YggdrasilElementType("<");
  IElementType ANGLE_R = new YggdrasilElementType(">");
  IElementType AT = new YggdrasilElementType("@");
  IElementType BRACE_L = new YggdrasilElementType("{");
  IElementType BRACE_R = new YggdrasilElementType("}");
  IElementType BRACKET_L = new YggdrasilElementType("[");
  IElementType BRACKET_R = new YggdrasilElementType("]");
  IElementType COLON = new YggdrasilElementType(":");
  IElementType COMMA = new YggdrasilElementType(",");
  IElementType COMMENT_BLOCK = new YggdrasilElementType("Comment Block");
  IElementType COMMENT_LINE = new YggdrasilElementType("Comment");
  IElementType DOLLAR = new YggdrasilElementType("$");
  IElementType DOT = new YggdrasilElementType(".");
  IElementType EQ = new YggdrasilElementType("=");
  IElementType ESCAPED = new YggdrasilElementType("\\escaped");
  IElementType HYPHEN = new YggdrasilElementType("-");
  IElementType INTEGER = new YggdrasilElementType("<<INTEGER>>");
  IElementType KW_ANY = new YggdrasilElementType("<<ANY>>");
  IElementType KW_AS = new YggdrasilElementType("as");
  IElementType KW_BOOLEAN = new YggdrasilElementType("true|false");
  IElementType KW_CLASS = new YggdrasilElementType("class");
  IElementType KW_CLIMB = new YggdrasilElementType("climb");
  IElementType KW_GRAMMAR = new YggdrasilElementType("grammar");
  IElementType KW_GROUP = new YggdrasilElementType("group");
  IElementType KW_IMPORT = new YggdrasilElementType("import");
  IElementType KW_MACRO = new YggdrasilElementType("macro");
  IElementType KW_UNION = new YggdrasilElementType("union");
  IElementType OP_CONCAT = new YggdrasilElementType("~");
  IElementType OP_OR = new YggdrasilElementType("|");
  IElementType PARENTHESIS_L = new YggdrasilElementType("(");
  IElementType PARENTHESIS_R = new YggdrasilElementType(")");
  IElementType PLACE_HOLDER = new YggdrasilElementType("_");
  IElementType REFERENCE = new YggdrasilElementType("$Symbol");
  IElementType SELECTION_LINE = new YggdrasilElementType("SELECTION_LINE");
  IElementType SEMICOLON = new YggdrasilElementType(";");
  IElementType SLASH = new YggdrasilElementType("/");
  IElementType STAR = new YggdrasilElementType("*");
  IElementType STRING_CHAR = new YggdrasilElementType("String Character");
  IElementType STRING_ESCAPE = new YggdrasilElementType("String Escaped");
  IElementType STRING_QUOTE = new YggdrasilElementType("String Quote");
  IElementType SYMBOL = new YggdrasilElementType("Symbol");
  IElementType TO = new YggdrasilElementType("->");
  IElementType URL = new YggdrasilElementType("Url");
  IElementType VERSION = new YggdrasilElementType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_NAME) {
        return new YggdrasilAliasNameNode(node);
      }
      else if (type == ANNOTATIONS) {
        return new YggdrasilAnnotationsNode(node);
      }
      else if (type == CATEGORY) {
        return new YggdrasilCategoryNode(node);
      }
      else if (type == CLASS) {
        return new YggdrasilClassNode(node);
      }
      else if (type == CLASS_BODY) {
        return new YggdrasilClassBodyNode(node);
      }
      else if (type == CLASS_TERM) {
        return new YggdrasilClassTermNode(node);
      }
      else if (type == ESCAPE) {
        return new YggdrasilEscapeNode(node);
      }
      else if (type == EXPRESSION_ATOM) {
        return new YggdrasilExpressionAtomNode(node);
      }
      else if (type == EXPRESSION_CONCAT) {
        return new YggdrasilExpressionConcatNode(node);
      }
      else if (type == EXPRESSION_GROUP) {
        return new YggdrasilExpressionGroupNode(node);
      }
      else if (type == EXPRESSION_OR) {
        return new YggdrasilExpressionOrNode(node);
      }
      else if (type == EXPRESSION_UNARY) {
        return new YggdrasilExpressionUnaryNode(node);
      }
      else if (type == GRAMMAR) {
        return new YggdrasilGrammarNode(node);
      }
      else if (type == GROUP) {
        return new YggdrasilGroupNode(node);
      }
      else if (type == IDENTIFIER) {
        return new YggdrasilIdentifierNode(node);
      }
      else if (type == INTERFACE_NAME) {
        return new YggdrasilInterfaceNameNode(node);
      }
      else if (type == KEY) {
        return new YggdrasilKeyNode(node);
      }
      else if (type == MODIFIERS) {
        return new YggdrasilModifiersNode(node);
      }
      else if (type == MODULE_NAME) {
        return new YggdrasilModuleNameNode(node);
      }
      else if (type == NUMBER) {
        return new YggdrasilNumberNode(node);
      }
      else if (type == ORGANIZATION_NAME) {
        return new YggdrasilOrganizationNameNode(node);
      }
      else if (type == PAIR) {
        return new YggdrasilPairNode(node);
      }
      else if (type == RANGE) {
        return new YggdrasilRangeNode(node);
      }
      else if (type == RANGE_LOWER) {
        return new YggdrasilRangeLowerNode(node);
      }
      else if (type == RANGE_UPPER) {
        return new YggdrasilRangeUpperNode(node);
      }
      else if (type == REGEX) {
        return new YggdrasilRegexNode(node);
      }
      else if (type == SEMANTIC_NUMBER) {
        return new YggdrasilSemanticNumberNode(node);
      }
      else if (type == STRING) {
        return new YggdrasilStringNode(node);
      }
      else if (type == UNION) {
        return new YggdrasilUnionNode(node);
      }
      else if (type == UNION_BODY) {
        return new YggdrasilUnionBodyNode(node);
      }
      else if (type == UNION_TERM) {
        return new YggdrasilUnionTermNode(node);
      }
      else if (type == VALUE) {
        return new YggdrasilValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
