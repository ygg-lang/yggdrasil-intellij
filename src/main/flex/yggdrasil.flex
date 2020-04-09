package yggdrasil.psi;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static yggdrasil.psi.YggdrasilTypes.*;

%%

//%{
//public WitLexer() {
//	this((java.io.Reader)null);
//}
//%}

%public
%class _YggdrasilLexer
%implements com.intellij.lexer.FlexLexer
%function advance
%type com.intellij.psi.tree.IElementType
%unicode

//%state TextContextIndent

WHITE_SPACE        = [\s\t]
REGULAR_EXPRESSION = \/([^\/\\]|\\.)+\/
REGULAR_RANGE      = \[[^\]]*\]
COMMENT_LINE       = [/]{2}[^\r\n]*
COMMENT_BLOCK      = [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
TEXT_SINGLE        = '([^'])*'
TEXT_DOUBLE        = \"([^\"]|\\.)*\"

INTEGER = [0-9]+

SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
SYMBOW_RAW = `[^`]*`
ESCAPED = \\.

KW_GRAMMAR = grammar|lexicon
KW_USING   = using
KW_GROUP   = group|token
KW_CLASS   = class|struct
KW_UNION   = union|enum|climb
KW_IMPORT  = import
KW_AS      = as
KW_MACRO   = macro|function|func|fun|fn|def


%%

<YYINITIAL> {
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_LINE}     { return COMMENT_LINE; }
	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
}

<YYINITIAL> {
	"(" { return PARENTHESIS_L; }
    ")" { return PARENTHESIS_R; }
    "[" { return BRACKET_L; }
    "]" { return BRACKET_R; }
	"{" { return BRACE_L; }
	"}" { return BRACE_R; }
	"<" { return ANGLE_L; }
	">" { return ANGLE_R; }
    "->" { return TO; }
    "|" { return OP_OR;}
    "~" { return OP_CONCAT;}

	":" { return COLON; }
	";" { return SEMICOLON; }
	"#" { return HASH; }
	"$" { return DOLLAR; }
	"@" { return AT; }
	"/" { return SLASH; }
	"." { return DOT; }
	"," { return COMMA; }
	"-" { return HYPHEN; }
	"=" { return BIND; }

	"^" { return OP_REMARK; }
    "!" { return OP_NOT; }

    "?" { return OP_OPTIONAL; }
    "*" { return OP_MANY; }
    "+" { return OP_MANY1; }
}

<YYINITIAL> {
    {INTEGER} { return INTEGER; }
    {TEXT_SINGLE} { return TEXT_SINGLE; }
    {TEXT_DOUBLE} { return TEXT_DOUBLE; }
    {REGULAR_RANGE} { return REGULAR_RANGE; }
    {REGULAR_EXPRESSION} { return REGULAR_EXPRESSION;}
}

<YYINITIAL> {
    {KW_GRAMMAR} { return KW_GRAMMAR; }
    {KW_USING} { return KW_USING; }
    {KW_GROUP} { return KW_GROUP; }
    {KW_CLASS} { return KW_CLASS; }
    {KW_UNION} { return KW_UNION; }
    {KW_IMPORT} { return KW_IMPORT; }
    {KW_AS} { return KW_AS; }
    {KW_MACRO} { return KW_MACRO; }

    {ESCAPED} { return ESCAPED; }
    {SYMBOW_RAW} { return SYMBOW_RAW; }
    {SYMBOL}  { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
