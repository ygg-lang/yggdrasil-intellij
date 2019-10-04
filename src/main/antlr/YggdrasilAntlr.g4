grammar YggdrasilAntlr;
import YggdrasilBasic;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program: (import_statement | define_class | define_union | SEMICOLON)* EOF;

import_statement: KW_IMPORT identifier;

define_class: macro_call* (mods += identifier)* KW_CLASS name = identifier rule_block;
define_union: macro_call* (mods += identifier)* KW_UNION name = identifier rule_block;
rule_block:   BRACE_L OP_OR? expression* BRACE_R;


macro_call: (OP_HASH|OP_AT) identifier tuple_block? ;

function_call: OP_AT identifier tuple_block?;
tuple_block:PARENTHESES_L (expression (COMMA expression)* COMMA?)? PARENTHESES_R;

expression
    : expression MATCH_OPTIONAL                     # Optional
    | expression MATCH_MAYBE MATCH_OPTIONAL?        # Maybe
    | expression MATCH_MANY MATCH_OPTIONAL?         # Many
    | OP_UNTAG expression                           # Untag
    | expression TAG_NODE expression                # NodeTag
    | expression OP_CONCAT expression               # Hard
    | expression expression                         # Soft
    | expression OP_OR expression                   # Pattern
    | PARENTHESES_L OP_OR? expression PARENTHESES_R # Group
    | OP_HASH identifier                         # BranchTag
    | function_call #Call
    | string                                        # EString
    | identifier                                    # EIdentifier
    ;

string:     STRING_SINGLE | STRING_DOUBLE;
identifier: RAW_ID | UNICODE_ID;