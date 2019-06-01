// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.ygg_lang.ygg_intellij.language.psi.impl.*;
import ygg.intellij.language.psi.impl.*;

public interface YggTypes {

  IElementType ANNOTATION = new YggElementType("ANNOTATION");
  IElementType ANNOTATION_MARK = new YggElementType("ANNOTATION_MARK");
  IElementType BACK_TOP = new YggElementType("BACK_TOP");
  IElementType ESCAPED = new YggElementType("ESCAPED");
  IElementType EXPRESSION = new YggElementType("EXPRESSION");
  IElementType GRAMMAR_STATEMENT = new YggElementType("GRAMMAR_STATEMENT");
  IElementType IGNORE_STATEMENT = new YggElementType("IGNORE_STATEMENT");
  IElementType IMPORT_STATEMENT = new YggElementType("IMPORT_STATEMENT");
  IElementType INSERT_DOT = new YggElementType("INSERT_DOT");
  IElementType INSERT_ITEM = new YggElementType("INSERT_ITEM");
  IElementType INSERT_PAIR = new YggElementType("INSERT_PAIR");
  IElementType INSERT_STAR = new YggElementType("INSERT_STAR");
  IElementType KEY_SYMBOL = new YggElementType("KEY_SYMBOL");
  IElementType NUMBER_SUFFIX = new YggElementType("NUMBER_SUFFIX");
  IElementType PAIR = new YggElementType("PAIR");
  IElementType PAIRED = new YggElementType("PAIRED");
  IElementType PREDEFINED_SYMBOL = new YggElementType("PREDEFINED_SYMBOL");
  IElementType REF = new YggElementType("REF");
  IElementType RULE_SYMBOL = new YggElementType("RULE_SYMBOL");
  IElementType SCOPE = new YggElementType("SCOPE");
  IElementType SCOPE_MARK = new YggElementType("SCOPE_MARK");
  IElementType STRING_INLINE = new YggElementType("STRING_INLINE");
  IElementType STRING_MULTI = new YggElementType("STRING_MULTI");
  IElementType STRING_PREFIX = new YggElementType("STRING_PREFIX");
  IElementType SYMBOL_PATH = new YggElementType("SYMBOL_PATH");
  IElementType TABLE = new YggElementType("TABLE");
  IElementType TYPE_HINT = new YggElementType("TYPE_HINT");
  IElementType VALUE = new YggElementType("VALUE");

  IElementType ACCENT = new YggTokenType("^");
  IElementType ANGLE_L = new YggTokenType("<");
  IElementType ANGLE_R = new YggTokenType(">");
  IElementType AS = new YggTokenType("as");
  IElementType AT = new YggTokenType("@");
  IElementType BLOCK_COMMENT = new YggTokenType("BLOCK_COMMENT");
  IElementType BOOLEAN = new YggTokenType("BOOLEAN");
  IElementType BRACE_L = new YggTokenType("{");
  IElementType BRACE_R = new YggTokenType("}");
  IElementType BRACKET_L = new YggTokenType("[");
  IElementType BRACKET_R = new YggTokenType("]");
  IElementType BYTE = new YggTokenType("BYTE");
  IElementType CITE = new YggTokenType("$");
  IElementType COLON = new YggTokenType(":");
  IElementType COMMA = new YggTokenType(",");
  IElementType COMMENT = new YggTokenType("COMMENT");
  IElementType DECIMAL = new YggTokenType("DECIMAL");
  IElementType DOT = new YggTokenType(".");
  IElementType EQ = new YggTokenType("=");
  IElementType ESCAPE = new YggTokenType("\\");
  IElementType FRAGMENT = new YggTokenType("@fragment");
  IElementType GRAMMAR = new YggTokenType("@grammar");
  IElementType IGNORE = new YggTokenType("@ignore");
  IElementType IMPORT = new YggTokenType("@import");
  IElementType INTEGER = new YggTokenType("INTEGER");
  IElementType NAN = new YggTokenType("nan");
  IElementType NON_ESCAPE = new YggTokenType("NON_ESCAPE");
  IElementType NULL = new YggTokenType("null");
  IElementType PARENTHESIS_L = new YggTokenType("(");
  IElementType PARENTHESIS_R = new YggTokenType(")");
  IElementType QUOTATION = new YggTokenType("\"");
  IElementType SEMICOLON = new YggTokenType(";");
  IElementType SIGN = new YggTokenType("SIGN");
  IElementType STAR = new YggTokenType("*");
  IElementType STRING = new YggTokenType("STRING");
  IElementType SYMBOL = new YggTokenType("SYMBOL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new YggAnnotationImpl(node);
      }
      else if (type == ANNOTATION_MARK) {
        return new YggAnnotationMarkImpl(node);
      }
      else if (type == BACK_TOP) {
        return new YggBackTopImpl(node);
      }
      else if (type == ESCAPED) {
        return new YggEscapedImpl(node);
      }
      else if (type == EXPRESSION) {
        return new YggExpressionImpl(node);
      }
      else if (type == GRAMMAR_STATEMENT) {
        return new YggGrammarStatementImpl(node);
      }
      else if (type == IGNORE_STATEMENT) {
        return new YggIgnoreStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new YggImportStatementImpl(node);
      }
      else if (type == INSERT_DOT) {
        return new YggInsertDotImpl(node);
      }
      else if (type == INSERT_ITEM) {
        return new YggInsertItemImpl(node);
      }
      else if (type == INSERT_PAIR) {
        return new YggInsertPairImpl(node);
      }
      else if (type == INSERT_STAR) {
        return new YggInsertStarImpl(node);
      }
      else if (type == KEY_SYMBOL) {
        return new YggKeySymbolImpl(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new YggNumberSuffixImpl(node);
      }
      else if (type == PAIR) {
        return new YggPairImpl(node);
      }
      else if (type == PAIRED) {
        return new YggPairedImpl(node);
      }
      else if (type == PREDEFINED_SYMBOL) {
        return new YggPredefinedSymbolImpl(node);
      }
      else if (type == REF) {
        return new YggRefImpl(node);
      }
      else if (type == RULE_SYMBOL) {
        return new YggRuleSymbolImpl(node);
      }
      else if (type == SCOPE) {
        return new YggScopeImpl(node);
      }
      else if (type == SCOPE_MARK) {
        return new YggScopeMarkImpl(node);
      }
      else if (type == STRING_INLINE) {
        return new YggStringInlineImpl(node);
      }
      else if (type == STRING_MULTI) {
        return new YggStringMultiImpl(node);
      }
      else if (type == STRING_PREFIX) {
        return new YggStringPrefixImpl(node);
      }
      else if (type == SYMBOL_PATH) {
        return new YggSymbolPathImpl(node);
      }
      else if (type == TABLE) {
        return new YggTableImpl(node);
      }
      else if (type == TYPE_HINT) {
        return new YggTypeHintImpl(node);
      }
      else if (type == VALUE) {
        return new YggValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
