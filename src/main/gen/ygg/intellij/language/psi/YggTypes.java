// This is a generated file. Not intended for manual editing.
package ygg.intellij.language.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
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
    IElementType COLON = new YggTokenType(":");
    IElementType COMMA = new YggTokenType(",");
    IElementType COMMENT_BLOCK = new YggTokenType("COMMENT_BLOCK");
    IElementType COMMENT_DOC = new YggTokenType("COMMENT_DOC");
    IElementType COMMENT_LINE = new YggTokenType("COMMENT_LINE");
    IElementType DECIMAL = new YggTokenType("DECIMAL");
    IElementType DOLLAR = new YggTokenType("$");
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
    IElementType MANY = new YggTokenType("*");
    IElementType MANY1 = new YggTokenType("+");
    IElementType NOT = new YggTokenType("!");
    IElementType NULL = new YggTokenType("NULL");
    IElementType OPTIONAL = new YggTokenType("?");
    IElementType PARENTHESIS_L = new YggTokenType("(");
    IElementType PARENTHESIS_R = new YggTokenType(")");
    IElementType QUOTATION = new YggTokenType("\"");
    IElementType REGEX_CHARACTER = new YggTokenType("REGEX_CHARACTER");
    IElementType REGEX_QUOTE = new YggTokenType("REGEX_QUOTE");
    IElementType REGEX_RANGE_L = new YggTokenType("REGEX_RANGE_L");
    IElementType REGEX_RANGE_R = new YggTokenType("REGEX_RANGE_R");
    IElementType SEMICOLON = new YggTokenType(";");
    IElementType SIGN = new YggTokenType("SIGN");
    IElementType SOFT_CONNECT = new YggTokenType("~");
    IElementType STRING_DQ = new YggTokenType("STRING_DQ");
    IElementType STRING_SQ = new YggTokenType("STRING_SQ");
    IElementType SYMBOL = new YggTokenType("SYMBOL");
    IElementType TAGGED = new YggTokenType("<-");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == EXPR) {
                return new YggExprNode(node);
            } else if (type == FUNCTION_STATEMENT) {
                return new YggFunctionStatementNode(node);
            } else if (type == GRAMMAR_STATEMENT) {
                return new YggGrammarStatementNode(node);
            } else if (type == GRAMMAR_SYMBOL) {
                return new YggGrammarSymbolNode(node);
            } else if (type == IGNORE_STATEMENT) {
                return new YggIgnoreStatementNode(node);
            } else if (type == IMPORT_STATEMENT) {
                return new YggImportStatementNode(node);
            } else if (type == KEY) {
                return new YggKeyNode(node);
            } else if (type == KEY_SYMBOL) {
                return new YggKeySymbolNode(node);
            } else if (type == MACRO_ARG) {
                return new YggMacroArgNode(node);
            } else if (type == MACRO_STATEMENT) {
                return new YggMacroStatementNode(node);
            } else if (type == NUMBER_SUFFIX) {
                return new YggNumberSuffixNode(node);
            } else if (type == PAIR) {
                return new YggPairNode(node);
            } else if (type == PARENTHESIS) {
                return new YggParenthesisNode(node);
            } else if (type == REGEX) {
                return new YggRegexNode(node);
            } else if (type == REGEX_MODE) {
                return new YggRegexModeNode(node);
            } else if (type == REGEX_RANGE) {
                return new YggRegexRangeNode(node);
            } else if (type == RULE_STATEMENT) {
                return new YggRuleStatementNode(node);
            } else if (type == RULE_SYMBOL) {
                return new YggRuleSymbolNode(node);
            } else if (type == STRING) {
                return new YggStringNode(node);
            } else if (type == SYMBOL_PATH) {
                return new YggSymbolPathNode(node);
            } else if (type == TABLE) {
                return new YggTableNode(node);
            } else if (type == TYPE_HINT) {
                return new YggTypeHintNode(node);
            } else if (type == VALUE) {
                return new YggValueNode(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
