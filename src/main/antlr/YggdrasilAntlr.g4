grammar YggdrasilAntlr;
import YggdrasilBasic;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program: (import_statement | define_class | define_union | SEMICOLON)* EOF;

import_statement: KW_IMPORT identifier;

define_class: (mods += identifier)* KW_CLASS name = identifier rule_block;
define_union: (mods += identifier)* KW_CLASS name = identifier rule_block;
rule_block:   BRACE_L expression* BRACE_R;

expression
    : expression MATCH_OPTIONAL              # Optional
    | expression MATCH_MAYBE MATCH_OPTIONAL? # Maybe
    | expression MATCH_MANY MATCH_OPTIONAL?  # Many
    | expression OP_TAG expression           # TAG
    | expression OP_CONCAT expression        # Hard
    | expression expression                  # Soft
    | expression OP_OR expression            # Pattern
    | PARENTHESES_L expression PARENTHESES_R # Group
    | identifier                             # Named
    ;

identifier: RAW_ID | UNICODE_ID;