// This is a generated file. Not intended for manual editing.
package yggdrasil.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import yggdrasil.psi.node.*;

public interface YggdrasilTypes {

  IElementType ANNOTATIONS = new YggdrasilElementType("ANNOTATIONS");
  IElementType ARGUMENT = new YggdrasilElementType("ARGUMENT");
  IElementType ATOMIC = new YggdrasilElementType("ATOMIC");
  IElementType ATTRIBUTE = new YggdrasilElementType("ATTRIBUTE");
  IElementType CATEGORY = new YggdrasilElementType("CATEGORY");
  IElementType CLASS = new YggdrasilElementType("CLASS");
  IElementType CLASS_BODY = new YggdrasilElementType("CLASS_BODY");
  IElementType CLASS_CAST = new YggdrasilElementType("CLASS_CAST");
  IElementType ESCAPE = new YggdrasilElementType("ESCAPE");
  IElementType EXPRESSION = new YggdrasilElementType("EXPRESSION");
  IElementType EXPRESSION_CHOICE = new YggdrasilElementType("EXPRESSION_CHOICE");
  IElementType EXPRESSION_GROUP = new YggdrasilElementType("EXPRESSION_GROUP");
  IElementType EXPRESSION_HARD = new YggdrasilElementType("EXPRESSION_HARD");
  IElementType EXPRESSION_SOFT = new YggdrasilElementType("EXPRESSION_SOFT");
  IElementType EXPRESSION_TAG = new YggdrasilElementType("EXPRESSION_TAG");
  IElementType FUNCTION_BLOCK = new YggdrasilElementType("FUNCTION_BLOCK");
  IElementType FUNCTION_CALL = new YggdrasilElementType("FUNCTION_CALL");
  IElementType FUNCTION_DEFINE = new YggdrasilElementType("FUNCTION_DEFINE");
  IElementType FUNCTION_PARAMETER = new YggdrasilElementType("FUNCTION_PARAMETER");
  IElementType GRAMMAR = new YggdrasilElementType("GRAMMAR");
  IElementType GRAMMAR_BODY = new YggdrasilElementType("GRAMMAR_BODY");
  IElementType GRAMMAR_TERM = new YggdrasilElementType("GRAMMAR_TERM");
  IElementType GROUP = new YggdrasilElementType("GROUP");
  IElementType GROUP_BODY = new YggdrasilElementType("GROUP_BODY");
  IElementType GROUP_ITEM = new YggdrasilElementType("GROUP_ITEM");
  IElementType GROUP_TERM = new YggdrasilElementType("GROUP_TERM");
  IElementType IDENTIFIER = new YggdrasilElementType("IDENTIFIER");
  IElementType IDENTIFIER_FREE = new YggdrasilElementType("IDENTIFIER_FREE");
  IElementType NUMBER = new YggdrasilElementType("NUMBER");
  IElementType PAIR = new YggdrasilElementType("PAIR");
  IElementType PARAMETER = new YggdrasilElementType("PARAMETER");
  IElementType PREFIX = new YggdrasilElementType("PREFIX");
  IElementType RANGE = new YggdrasilElementType("RANGE");
  IElementType RANGE_LOWER = new YggdrasilElementType("RANGE_LOWER");
  IElementType RANGE_UPPER = new YggdrasilElementType("RANGE_UPPER");
  IElementType REGEX = new YggdrasilElementType("REGEX");
  IElementType STRING = new YggdrasilElementType("STRING");
  IElementType SUFFIX = new YggdrasilElementType("SUFFIX");
  IElementType TAG_BRANCH = new YggdrasilElementType("TAG_BRANCH");
  IElementType TERM = new YggdrasilElementType("TERM");
  IElementType TUPLE = new YggdrasilElementType("TUPLE");
  IElementType UNION = new YggdrasilElementType("UNION");
  IElementType UNION_BODY = new YggdrasilElementType("UNION_BODY");
  IElementType UNION_TERM = new YggdrasilElementType("UNION_TERM");
  IElementType VALUE = new YggdrasilElementType("VALUE");

  IElementType ANGLE_L = new YggdrasilTokenType("<");
  IElementType ANGLE_R = new YggdrasilTokenType(">");
  IElementType AT = new YggdrasilTokenType("@");
  IElementType BRACE_L = new YggdrasilTokenType("{");
  IElementType BRACE_R = new YggdrasilTokenType("}");
  IElementType BRACKET_L = new YggdrasilTokenType("[");
  IElementType BRACKET_R = new YggdrasilTokenType("]");
  IElementType COLON = new YggdrasilTokenType(":");
  IElementType COMMA = new YggdrasilTokenType(",");
  IElementType COMMENT_BLOCK = new YggdrasilTokenType("Comment Block");
  IElementType COMMENT_LINE = new YggdrasilTokenType("Comment");
  IElementType DOLLAR = new YggdrasilTokenType("$");
  IElementType DOT = new YggdrasilTokenType(".");
  IElementType EQ = new YggdrasilTokenType("=");
  IElementType ESCAPED = new YggdrasilTokenType("\\escaped");
  IElementType HASH = new YggdrasilTokenType("HASH");
  IElementType HYPHEN = new YggdrasilTokenType("-");
  IElementType INTEGER = new YggdrasilTokenType("<<INTEGER>>");
  IElementType KW_AS = new YggdrasilTokenType("as");
  IElementType KW_CLASS = new YggdrasilTokenType("class");
  IElementType KW_CLIMB = new YggdrasilTokenType("climb");
  IElementType KW_GRAMMAR = new YggdrasilTokenType("grammar");
  IElementType KW_GROUP = new YggdrasilTokenType("group");
  IElementType KW_IMPORT = new YggdrasilTokenType("import");
  IElementType KW_MACRO = new YggdrasilTokenType("macro");
  IElementType KW_UNION = new YggdrasilTokenType("union");
  IElementType OP_AND = new YggdrasilTokenType("OP_AND");
  IElementType OP_CONCAT = new YggdrasilTokenType("~");
  IElementType OP_MANY = new YggdrasilTokenType("OP_MANY");
  IElementType OP_MANY1 = new YggdrasilTokenType("OP_MANY1");
  IElementType OP_NOT = new YggdrasilTokenType("OP_NOT");
  IElementType OP_OPTIONAL = new YggdrasilTokenType("OP_OPTIONAL");
  IElementType OP_OR = new YggdrasilTokenType("|");
  IElementType OP_REMARK = new YggdrasilTokenType("^");
  IElementType PARENTHESIS_L = new YggdrasilTokenType("(");
  IElementType PARENTHESIS_R = new YggdrasilTokenType(")");
  IElementType PLACE_HOLDER = new YggdrasilTokenType("_");
  IElementType REFERENCE = new YggdrasilTokenType("$Symbol");
  IElementType REGULAR_EXPRESSION = new YggdrasilTokenType("REGULAR_EXPRESSION");
  IElementType REGULAR_RANGE = new YggdrasilTokenType("REGULAR_RANGE");
  IElementType SELECTION_LINE = new YggdrasilTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new YggdrasilTokenType(";");
  IElementType SLASH = new YggdrasilTokenType("/");
  IElementType STAR = new YggdrasilTokenType("*");
  IElementType SYMBOL = new YggdrasilTokenType("Symbol");
  IElementType SYMBOW_RAW = new YggdrasilTokenType("SYMBOW_RAW");
  IElementType TEXT_DOUBLE = new YggdrasilTokenType("TEXT_DOUBLE");
  IElementType TEXT_SINGLE = new YggdrasilTokenType("TEXT_SINGLE");
  IElementType TO = new YggdrasilTokenType("->");
  IElementType URL = new YggdrasilTokenType("Url");
  IElementType VERSION = new YggdrasilTokenType("<<semver>>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATIONS) {
        return new YggdrasilAnnotationsNode(node);
      }
      else if (type == ARGUMENT) {
        return new YggdrasilArgumentNode(node);
      }
      else if (type == ATOMIC) {
        return new YggdrasilAtomicNode(node);
      }
      else if (type == ATTRIBUTE) {
        return new YggdrasilAttributeNode(node);
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
      else if (type == ESCAPE) {
        return new YggdrasilEscapeNode(node);
      }
      else if (type == EXPRESSION_CHOICE) {
        return new YggdrasilExpressionChoiceNode(node);
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
      else if (type == FUNCTION_BLOCK) {
        return new YggdrasilFunctionBlockNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new YggdrasilFunctionCallNode(node);
      }
      else if (type == FUNCTION_DEFINE) {
        return new YggdrasilFunctionDefineNode(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new YggdrasilFunctionParameterNode(node);
      }
      else if (type == GRAMMAR) {
        return new YggdrasilGrammarNode(node);
      }
      else if (type == GRAMMAR_BODY) {
        return new YggdrasilGrammarBodyNode(node);
      }
      else if (type == GRAMMAR_TERM) {
        return new YggdrasilGrammarTermNode(node);
      }
      else if (type == GROUP) {
        return new YggdrasilGroupNode(node);
      }
      else if (type == GROUP_BODY) {
        return new YggdrasilGroupBodyNode(node);
      }
      else if (type == GROUP_ITEM) {
        return new YggdrasilGroupItemNode(node);
      }
      else if (type == GROUP_TERM) {
        return new YggdrasilGroupTermNode(node);
      }
      else if (type == IDENTIFIER) {
        return new YggdrasilIdentifierNode(node);
      }
      else if (type == IDENTIFIER_FREE) {
        return new YggdrasilIdentifierFreeNode(node);
      }
      else if (type == NUMBER) {
        return new YggdrasilNumberNode(node);
      }
      else if (type == PAIR) {
        return new YggdrasilPairNode(node);
      }
      else if (type == PARAMETER) {
        return new YggdrasilParameterNode(node);
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
      else if (type == TUPLE) {
        return new YggdrasilTupleNode(node);
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
