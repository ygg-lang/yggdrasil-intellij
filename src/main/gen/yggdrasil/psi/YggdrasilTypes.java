// This is a generated file. Not intended for manual editing.
package yggdrasil.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import yggdrasil.psi.node.*;

public interface YggdrasilTypes {

  IElementType ALIAS_NAME = new YggdrasilElementType("ALIAS_NAME");
  IElementType ANNOTATIONS = new YggdrasilElementType("ANNOTATIONS");
  IElementType ATOMIC = new YggdrasilElementType("ATOMIC");
  IElementType CATEGORY = new YggdrasilElementType("CATEGORY");
  IElementType CLASS = new YggdrasilElementType("CLASS");
  IElementType CLASS_BODY = new YggdrasilElementType("CLASS_BODY");
  IElementType CLASS_CAST = new YggdrasilElementType("CLASS_CAST");
  IElementType CLASS_TERM = new YggdrasilElementType("CLASS_TERM");
  IElementType ESCAPE = new YggdrasilElementType("ESCAPE");
  IElementType EXPRESSION = new YggdrasilElementType("EXPRESSION");
  IElementType EXPRESSION_GROUP = new YggdrasilElementType("EXPRESSION_GROUP");
  IElementType EXPRESSION_HARD = new YggdrasilElementType("EXPRESSION_HARD");
  IElementType EXPRESSION_SOFT = new YggdrasilElementType("EXPRESSION_SOFT");
  IElementType EXPRESSION_TAG = new YggdrasilElementType("EXPRESSION_TAG");
  IElementType GRAMMAR = new YggdrasilElementType("GRAMMAR");
  IElementType IDENTIFIER = new YggdrasilElementType("IDENTIFIER");
  IElementType INTERFACE_NAME = new YggdrasilElementType("INTERFACE_NAME");
  IElementType KEY = new YggdrasilElementType("KEY");
  IElementType MODIFIERS = new YggdrasilElementType("MODIFIERS");
  IElementType MODULE_NAME = new YggdrasilElementType("MODULE_NAME");
  IElementType NUMBER = new YggdrasilElementType("NUMBER");
  IElementType ORGANIZATION_NAME = new YggdrasilElementType("ORGANIZATION_NAME");
  IElementType PAIR = new YggdrasilElementType("PAIR");
  IElementType PREFIX = new YggdrasilElementType("PREFIX");
  IElementType RANGE = new YggdrasilElementType("RANGE");
  IElementType RANGE_LOWER = new YggdrasilElementType("RANGE_LOWER");
  IElementType RANGE_UPPER = new YggdrasilElementType("RANGE_UPPER");
  IElementType REGEX = new YggdrasilElementType("REGEX");
  IElementType SEMANTIC_NUMBER = new YggdrasilElementType("SEMANTIC_NUMBER");
  IElementType STRING = new YggdrasilElementType("STRING");
  IElementType SUFFIX = new YggdrasilElementType("SUFFIX");
  IElementType TAG_BRANCH = new YggdrasilElementType("TAG_BRANCH");
  IElementType TERM = new YggdrasilElementType("TERM");
  IElementType TOKEN = new YggdrasilElementType("TOKEN");
  IElementType TOKEN_BODY = new YggdrasilElementType("TOKEN_BODY");
  IElementType TOKEN_TERM = new YggdrasilElementType("TOKEN_TERM");
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
  IElementType HASH = new YggdrasilElementType("HASH");
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
  IElementType OP_AND = new YggdrasilElementType("OP_AND");
  IElementType OP_CONCAT = new YggdrasilElementType("~");
  IElementType OP_MANY = new YggdrasilElementType("OP_MANY");
  IElementType OP_MANY1 = new YggdrasilElementType("OP_MANY1");
  IElementType OP_NOT = new YggdrasilElementType("OP_NOT");
  IElementType OP_OPTIONAL = new YggdrasilElementType("OP_OPTIONAL");
  IElementType OP_OR = new YggdrasilElementType("|");
  IElementType OP_REMARK = new YggdrasilElementType("OP_REMARK");
  IElementType PARENTHESIS_L = new YggdrasilElementType("(");
  IElementType PARENTHESIS_R = new YggdrasilElementType(")");
  IElementType PLACE_HOLDER = new YggdrasilElementType("_");
  IElementType REFERENCE = new YggdrasilElementType("$Symbol");
  IElementType REGULAR_EXPRESSION = new YggdrasilElementType("REGULAR_EXPRESSION");
  IElementType SELECTION_LINE = new YggdrasilElementType("SELECTION_LINE");
  IElementType SEMICOLON = new YggdrasilElementType(";");
  IElementType SLASH = new YggdrasilElementType("/");
  IElementType STAR = new YggdrasilElementType("*");
  IElementType STRING_CHAR = new YggdrasilElementType("String Character");
  IElementType STRING_ESCAPE = new YggdrasilElementType("String Escaped");
  IElementType STRING_QUOTE = new YggdrasilElementType("String Quote");
  IElementType SYMBOL = new YggdrasilElementType("Symbol");
  IElementType SYMBOW_RAW = new YggdrasilElementType("SYMBOW_RAW");
  IElementType TEXT_DOUBLE = new YggdrasilElementType("TEXT_DOUBLE");
  IElementType TEXT_SINGLE = new YggdrasilElementType("TEXT_SINGLE");
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
      else if (type == ATOMIC) {
        return new YggdrasilAtomicNode(node);
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
      else if (type == CLASS_CAST) {
        return new YggdrasilClassCastNode(node);
      }
      else if (type == CLASS_TERM) {
        return new YggdrasilClassTermNode(node);
      }
      else if (type == ESCAPE) {
        return new YggdrasilEscapeNode(node);
      }
      else if (type == EXPRESSION) {
        return new YggdrasilExpressionNode(node);
      }
      else if (type == EXPRESSION_GROUP) {
        return new YggdrasilExpressionGroupNode(node);
      }
      else if (type == EXPRESSION_HARD) {
        return new YggdrasilExpressionHardNode(node);
      }
      else if (type == EXPRESSION_SOFT) {
        return new YggdrasilExpressionSoftNode(node);
      }
      else if (type == EXPRESSION_TAG) {
        return new YggdrasilExpressionTagNode(node);
      }
      else if (type == GRAMMAR) {
        return new YggdrasilGrammarNode(node);
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
      else if (type == PREFIX) {
        return new YggdrasilPrefixNode(node);
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
      else if (type == SUFFIX) {
        return new YggdrasilSuffixNode(node);
      }
      else if (type == TAG_BRANCH) {
        return new YggdrasilTagBranchNode(node);
      }
      else if (type == TERM) {
        return new YggdrasilTermNode(node);
      }
      else if (type == TOKEN) {
        return new YggdrasilTokenNode(node);
      }
      else if (type == TOKEN_BODY) {
        return new YggdrasilTokenBodyNode(node);
      }
      else if (type == TOKEN_TERM) {
        return new YggdrasilTokenTermNode(node);
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
