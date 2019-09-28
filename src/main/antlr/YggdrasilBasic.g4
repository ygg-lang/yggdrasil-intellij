lexer grammar YggdrasilBasic;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
DOT:   '.';
COMMA: ',';

KW_IMPORT: 'using';
KW_CLASS:  'class';
KW_AS:     'as';
KW_IN:     'in';

// conditional
KW_IF:   'if';
KW_ELSE: 'else';
KW_END:  'end';
// loop
KW_FOR: 'for';

OP_PROPORTION: '::';

PARENTHESES_L: '(';
PARENTHESES_R: ')';
BRACKET_L:     '[';
BRACKET_R:     ']';
BRACE_L:       '{';
BRACE_R:       '}';
GENERIC_L:     '⟨';
GENERIC_R:     '⟩';

// identifier
RAW_ID:     '`' ~[`]+ '`';
UNICODE_ID: [_\p{XID_start}] [\p{XID_continue}]*;
// skip
WHITE_SPACE:     [\p{White_Space}]+ -> channel(HIDDEN);
LINE_COMMENT: '//' [^\n\r]*;
BLOCK_COMMENT:   '#' [^%]+?;
ERROR_CHARACTAR: . -> channel(HIDDEN);
