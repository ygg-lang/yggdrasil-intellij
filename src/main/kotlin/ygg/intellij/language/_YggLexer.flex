package ygg.intellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ygg.intellij.language.psi.YggTypes.*;

%%

%{
public _YggLexer() {
	this((java.io.Reader)null);
}
%}

%public
%class _YggLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT_LINE=("//"|#)[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
COMMENT_DOC=("//"|#)[^\r\n]*
BOOLEAN=true|false
SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
STRING=\"([^\"\\]|\\.)*\"
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([*][*][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
SIGN=[+-]
NON_ESCAPE=[^\\]

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "@grammar"           { return GRAMMAR; }
  "@fragment"          { return FRAGMENT; }
  "@import"            { return IMPORT; }
  "@ignore"            { return IGNORE; }
  "as"                 { return AS; }
  "null"               { return NULL; }
  "("                  { return PARENTHESIS_L; }
  ")"                  { return PARENTHESIS_R; }
  "["                  { return BRACKET_L; }
  "]"                  { return BRACKET_R; }
  "{"                  { return BRACE_L; }
  "}"                  { return BRACE_R; }
  "^"                  { return ACCENT; }
  "<"                  { return ANGLE_L; }
  ">"                  { return ANGLE_R; }
  "\""                 { return QUOTATION; }
  "\\"                 { return ESCAPE; }
  "="                  { return EQ; }
  ":"                  { return COLON; }
  ";"                  { return SEMICOLON; }
  ","                  { return COMMA; }
  "$"                  { return CITE; }
  "."                  { return DOT; }
  "*"                  { return STAR; }
  "@"                  { return AT; }

  {COMMENT_LINE}       { return COMMENT_LINE; }
  {COMMENT_BLOCK}      { return COMMENT_BLOCK; }
  {BOOLEAN}            { return BOOLEAN; }
  {SYMBOL}             { return SYMBOL; }
  {STRING}             { return STRING; }
  {BYTE}               { return BYTE; }
  {INTEGER}            { return INTEGER; }
  {DECIMAL}            { return DECIMAL; }
  {SIGN}               { return SIGN; }
  {NON_ESCAPE}         { return NON_ESCAPE; }

}

[^] { return BAD_CHARACTER; }
