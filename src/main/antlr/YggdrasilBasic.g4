lexer grammar YggdrasilBasic;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
DOT:       '.';
COMMA:     ',';
SEMICOLON: ';';

MATCH_MAYBE:    '*';
MATCH_MANY:     '+';
MATCH_OPTIONAL: '?';

OP_NOT:    '!';
OP_AT:     '@';
OP_HASH:   '#';
OP_CONCAT: '~';
OP_OR:     '|';

OP_UNTAG:  '^';
COLON:  ':';

KW_GRAMMAR: 'grammar';

KW_IMPORT: 'using';
KW_CLASS:  'class';
KW_UNION:  'union';
KW_CLIMB:  'climb';
KW_TOKEN: 'token';
KW_AS:     'as';

OP_PROPORTION: '::';

PARENTHESES_L: '(';
PARENTHESES_R: ')';
BRACKET_L:     '[';
BRACKET_R:     ']';
BRACE_L:       '{';
BRACE_R:       '}';
GENERIC_L:     '⟨';
GENERIC_R:     '⟩';

INTEGER: '0' | [1-9][0-9]*;
SPECIAL: [Tt][Rr][Uu][Ee] | [Ff][Aa][Ll][Ss][Ee] | [Aa][Nn][Yy];
ESCAPED: '\\' .;
REGEX_RANGE: '[' ~[\]]* ']';
REGEX_FREE: '/' ~[/]* '/';

STRING_SINGLE: '\'' ~[']* '\'';
STRING_DOUBLE: '"' ~["]* '"';
// identifier
RAW_ID:     '`' ~[`]* '`';
UNICODE_ID: [_\p{XID_start}] [\p{XID_continue}]*;
// skip
WHITE_SPACE:     [\p{White_Space}]+ -> channel(HIDDEN);
LINE_COMMENT:    '//' ~[\n\r]* -> channel(HIDDEN);
BLOCK_COMMENT:   '/*' ~[*]+? '*/' -> channel(HIDDEN);
ERROR_CHARACTAR: . -> channel(HIDDEN);
