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

%state StringSQ
%state StringDQ

EOL=\R
WHITE_SPACE=\s+

COMMENT_DOC=("///"|#)[^\r\n]*
COMMENT_LINE=("//"|#)[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
BOOLEAN=true|false
SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
STRING=\"([^\"\\]|\\.)*\"
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([*][*][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
SIGN=[+-]

ESCAPE_SPECIAL = \\[^xuU]
ESCAPE_UNICODE = \\(x{HEX}{2}|u{HEX}{4}|U\{{HEX}+\})
HEX = [0-9a-fA-F]

%%
<YYINITIAL> {
	{WHITE_SPACE}   { return WHITE_SPACE; }
	{COMMENT_DOC}   { return COMMENT_DOC; }
	{COMMENT_LINE}  { return COMMENT_LINE; }
	{COMMENT_BLOCK} { return COMMENT_BLOCK; }
}

<YYINITIAL> {
	//
	"("  { return PARENTHESIS_L; }
	")"  { return PARENTHESIS_R; }
	"["  { return BRACKET_L; }
	"]"  { return BRACKET_R; }
	"{"  { return BRACE_L; }
	"}"  { return BRACE_R; }
	"^"  { return ACCENT; }
	"<"  { return ANGLE_L; }
	">"  { return ANGLE_R; }
	//
	"\"" { return QUOTATION; }
	"\\" { return ESCAPE; }
	"="  { return EQ; }
	":"  { return COLON; }
	";"  { return SEMICOLON; }
	","  { return COMMA; }
	"$"  { return CITE; }
	"."  { return DOT; }
	"*"  { return STAR; }
	"@"  { return AT; }
}

<YYINITIAL> {
	// literal
	{BOOLEAN} { return BOOLEAN; }
	{SYMBOL}  { return SYMBOL; }
	{STRING}  { return STRING; }
	{BYTE}    { return BYTE; }
	{INTEGER} { return INTEGER; }
	{DECIMAL} { return DECIMAL; }
	{SIGN}    { return SIGN; }
}

<YYINITIAL> \' {
	yybegin(StringSQ);
	return STRING_QUOTE;
}
<YYINITIAL> \" {
	yybegin(StringDQ);
	return STRING_QUOTE;
}
<StringSQ, StringDQ> {ESCAPE_SPECIAL} {
	return ESCAPE_SPECIAL;
}
<StringSQ, StringDQ> {ESCAPE_UNICODE} {
	return ESCAPE_UNICODE;
}
<StringSQ> {
	[^\\\'] {return CHARACTER;}
	\' {yybegin(YYINITIAL);}
}
<StringDQ> {
	[^\\\"] {return CHARACTER;}
	\" {yybegin(YYINITIAL);}
}


[^] { return BAD_CHARACTER; }
