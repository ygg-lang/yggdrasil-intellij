// This is a generated file. Not intended for manual editing.
package com.github.voml.voml_intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.voml.voml_intellij.language.psi.impl.*;

public interface VomlTypes {

  IElementType ANNOTATION = new VomlElementType("ANNOTATION");
  IElementType ANNOTATION_MARK = new VomlElementType("ANNOTATION_MARK");
  IElementType BACK_TOP = new VomlElementType("BACK_TOP");
  IElementType ESCAPED = new VomlElementType("ESCAPED");
  IElementType EXPORT_STATEMENT = new VomlElementType("EXPORT_STATEMENT");
  IElementType EXPRESSION = new VomlElementType("EXPRESSION");
  IElementType INCLUDE_STATEMENT = new VomlElementType("INCLUDE_STATEMENT");
  IElementType INHERIT_STATEMENT = new VomlElementType("INHERIT_STATEMENT");
  IElementType INSERT_DOT = new VomlElementType("INSERT_DOT");
  IElementType INSERT_ITEM = new VomlElementType("INSERT_ITEM");
  IElementType INSERT_PAIR = new VomlElementType("INSERT_PAIR");
  IElementType INSERT_STAR = new VomlElementType("INSERT_STAR");
  IElementType KEY_SYMBOL = new VomlElementType("KEY_SYMBOL");
  IElementType NUMBER_SUFFIX = new VomlElementType("NUMBER_SUFFIX");
  IElementType PAIR = new VomlElementType("PAIR");
  IElementType PAIRED = new VomlElementType("PAIRED");
  IElementType PREDEFINED_SYMBOL = new VomlElementType("PREDEFINED_SYMBOL");
  IElementType REF = new VomlElementType("REF");
  IElementType SCOPE = new VomlElementType("SCOPE");
  IElementType SCOPE_MARK = new VomlElementType("SCOPE_MARK");
  IElementType SCOPE_SYMBOL = new VomlElementType("SCOPE_SYMBOL");
  IElementType STRING_INLINE = new VomlElementType("STRING_INLINE");
  IElementType STRING_MULTI = new VomlElementType("STRING_MULTI");
  IElementType STRING_PREFIX = new VomlElementType("STRING_PREFIX");
  IElementType SYMBOL_PATH = new VomlElementType("SYMBOL_PATH");
  IElementType TABLE = new VomlElementType("TABLE");
  IElementType TYPE_HINT = new VomlElementType("TYPE_HINT");
  IElementType VALUE = new VomlElementType("VALUE");

  IElementType ACCENT = new VomlTokenType("^");
  IElementType ANGLE_L = new VomlTokenType("<");
  IElementType ANGLE_R = new VomlTokenType(">");
  IElementType AS = new VomlTokenType("as");
  IElementType AT = new VomlTokenType("@");
  IElementType BLOCK_COMMENT = new VomlTokenType("BLOCK_COMMENT");
  IElementType BOOLEAN = new VomlTokenType("BOOLEAN");
  IElementType BRACE_L = new VomlTokenType("{");
  IElementType BRACE_R = new VomlTokenType("}");
  IElementType BRACKET_L = new VomlTokenType("[");
  IElementType BRACKET_R = new VomlTokenType("]");
  IElementType BYTE = new VomlTokenType("BYTE");
  IElementType CITE = new VomlTokenType("$");
  IElementType COLON = new VomlTokenType(":");
  IElementType COMMA = new VomlTokenType(",");
  IElementType COMMENT = new VomlTokenType("COMMENT");
  IElementType DECIMAL = new VomlTokenType("DECIMAL");
  IElementType DOT = new VomlTokenType(".");
  IElementType EQ = new VomlTokenType("=");
  IElementType ESCAPE = new VomlTokenType("\\");
  IElementType EXPORT = new VomlTokenType("@export");
  IElementType IMPORT = new VomlTokenType("@import");
  IElementType INCLUDE = new VomlTokenType("@include");
  IElementType INHERIT = new VomlTokenType("@inherit");
  IElementType INTEGER = new VomlTokenType("INTEGER");
  IElementType NAN = new VomlTokenType("nan");
  IElementType NON_ESCAPE = new VomlTokenType("NON_ESCAPE");
  IElementType NULL = new VomlTokenType("null");
  IElementType PARENTHESIS_L = new VomlTokenType("(");
  IElementType PARENTHESIS_R = new VomlTokenType(")");
  IElementType QUOTATION = new VomlTokenType("\"");
  IElementType SEMICOLON = new VomlTokenType(";");
  IElementType SIGN = new VomlTokenType("SIGN");
  IElementType STAR = new VomlTokenType("*");
  IElementType STRING = new VomlTokenType("STRING");
  IElementType SYMBOL = new VomlTokenType("SYMBOL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new VomlAnnotationImpl(node);
      }
      else if (type == ANNOTATION_MARK) {
        return new VomlAnnotationMarkImpl(node);
      }
      else if (type == BACK_TOP) {
        return new VomlBackTopImpl(node);
      }
      else if (type == ESCAPED) {
        return new VomlEscapedImpl(node);
      }
      else if (type == EXPORT_STATEMENT) {
        return new VomlExportStatementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new VomlExpressionImpl(node);
      }
      else if (type == INCLUDE_STATEMENT) {
        return new VomlIncludeStatementImpl(node);
      }
      else if (type == INHERIT_STATEMENT) {
        return new VomlInheritStatementImpl(node);
      }
      else if (type == INSERT_DOT) {
        return new VomlInsertDotImpl(node);
      }
      else if (type == INSERT_ITEM) {
        return new VomlInsertItemImpl(node);
      }
      else if (type == INSERT_PAIR) {
        return new VomlInsertPairImpl(node);
      }
      else if (type == INSERT_STAR) {
        return new VomlInsertStarImpl(node);
      }
      else if (type == KEY_SYMBOL) {
        return new VomlKeySymbolImpl(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new VomlNumberSuffixImpl(node);
      }
      else if (type == PAIR) {
        return new VomlPairImpl(node);
      }
      else if (type == PAIRED) {
        return new VomlPairedImpl(node);
      }
      else if (type == PREDEFINED_SYMBOL) {
        return new VomlPredefinedSymbolImpl(node);
      }
      else if (type == REF) {
        return new VomlRefImpl(node);
      }
      else if (type == SCOPE) {
        return new VomlScopeImpl(node);
      }
      else if (type == SCOPE_MARK) {
        return new VomlScopeMarkImpl(node);
      }
      else if (type == SCOPE_SYMBOL) {
        return new VomlScopeSymbolImpl(node);
      }
      else if (type == STRING_INLINE) {
        return new VomlStringInlineImpl(node);
      }
      else if (type == STRING_MULTI) {
        return new VomlStringMultiImpl(node);
      }
      else if (type == STRING_PREFIX) {
        return new VomlStringPrefixImpl(node);
      }
      else if (type == SYMBOL_PATH) {
        return new VomlSymbolPathImpl(node);
      }
      else if (type == TABLE) {
        return new VomlTableImpl(node);
      }
      else if (type == TYPE_HINT) {
        return new VomlTypeHintImpl(node);
      }
      else if (type == VALUE) {
        return new VomlValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
