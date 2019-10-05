grammar YggdrasilAntlr;
import YggdrasilBasic;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program
    : (
        import_statement
        | define_class
        | define_union
        | define_climb
        | define_token
        | SEMICOLON
    )* EOF
    ;

import_statement: KW_IMPORT identifier;

define_class: macro_call* (mods += identifier)* KW_CLASS name = identifier rule_block;
define_union: macro_call* (mods += identifier)* KW_UNION name = identifier rule_block;
define_climb: macro_call* (mods += identifier)* KW_CLIMB name = identifier rule_block;

define_token: macro_call* (mods += identifier)* KW_TOKEN token_block;

rule_block: BRACE_L OP_OR? expression* BRACE_R;

token_block: BRACE_L (token_pair|SEMICOLON)* BRACE_R;

token_pair: identifier COLON token_expression;

token_expression: token_expression OP_OR token_expression # TOr | atomic # TAtom;

macro_call: (OP_HASH | OP_AT) namepath tuple_block?;

function_call: OP_AT namepath tuple_block?;
tuple_block:   PARENTHESES_L (expression (COMMA expression)* COMMA?)? PARENTHESES_R;

expression
    : expression MATCH_OPTIONAL                     # Optional
    | expression MATCH_MAYBE MATCH_OPTIONAL?        # Maybe
    | expression MATCH_MANY MATCH_OPTIONAL?         # Many
    | OP_UNTAG expression                           # Untag
    | OP_NOT expression                             # Not
    | expression COLON expression                   # NodeTag
    | expression OP_CONCAT expression               # Hard
    | expression expression                         # Soft
    | expression OP_OR expression                   # Pattern
    | PARENTHESES_L OP_OR? expression PARENTHESES_R # Group
    | OP_HASH identifier                            # BranchTag
    | function_call                                 # Call
    | atomic                                        # Atom
    ;

atomic: function_call | string | namepath | regex | INTEGER | SPECIAL | ESCAPED;
regex:  REGEX_RANGE | REGEX_FREE;

namepath:   identifier ((OP_PROPORTION | DOT) identifier)*;
string:     STRING_SINGLE | STRING_DOUBLE;
identifier: RAW_ID | UNICODE_ID;