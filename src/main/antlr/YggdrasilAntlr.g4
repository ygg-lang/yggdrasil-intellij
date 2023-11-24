grammar YggdrasilAntlr;
import YggdrasilBasic;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program
    : program_item* EOF
    ;
program_item:
        define_grammar
        | import_statement
        | define_class
        | define_union
        | define_climb
        | define_group
        | define_external
        | define_inspector
        | define_function
        | SEMICOLON;

// =================================================================================================
import_statement: KW_IMPORT (identifier | string) import_block?;
import_block:     BRACE_L identifier* BRACE_R;
// =================================================================================================
define_grammar: KW_GRAMMAR identifier (COLON parent = identifier)? grammar_block;
grammar_block:  BRACE_L grammar_item* BRACE_R;
grammar_item:   grammar_pair | SEMICOLON | COMMA;
grammar_pair:   grammar_key COLON grammar_value;
grammar_key:    string | identifier;
grammar_value:  string | namepath | BOOLEAN;
// =================================================================================================
define_class
    : annotation* modifiers KW_CLASS name = identifier class_redict? OP_UNTAG? class_block
    ;
class_redict: OP_TO cast = identifier;
class_block: BRACE_L OP_OR? class_expression* BRACE_R;
class_expression
    : class_tag                                               # CETag
    | class_expression suffix                                 # CSuffix
    | OP_UNTAG class_expression                               # CUntag
    | OP_NOT class_expression                                 # CNot
    | lhs = class_expression OP_CONCAT rhs = class_expression # CHard
    | lhs = class_expression rhs = class_expression           # CSoft
    | lhs = class_expression OP_OR rhs = class_expression     # CPattern
    | atomic                                                  # Atom
    ;
class_tag: identifier_free COLON class_expression;
// =================================================================================================
define_union
    : annotation* modifiers KW_UNION name = identifier (OP_TO cast = identifier)? OP_UNTAG? union_block
    ;
union_block: BRACE_L union_item* BRACE_R;
union_item:  OP_OR union_expression* tag_branch?;
union_expression
    : union_tag                                               # UETag
    | union_expression suffix                                 # USuffix
    | OP_UNTAG union_expression                               # UUntag
    | OP_NOT union_expression                                 # UNot
    | lhs = union_expression OP_CONCAT rhs = union_expression # UHard
    | lhs = union_expression rhs = union_expression           # USoft
    | atomic                                                  # Utom
    ;
union_tag: identifier_free COLON union_expression;
// =================================================================================================
define_climb: annotation* modifiers KW_CLIMB name = identifier union_block;
tag_branch:   OP_HASH identifier OP_GT?;
// =================================================================================================
define_group:     annotation* modifiers KW_GROUP name = identifier? group_block;
group_block:      BRACE_L (group_pair | SEMICOLON)* BRACE_R;
group_pair:       annotation* modifiers identifier COLON atomic;
group_expression: group_expression OP_OR group_expression # TOr | atomic # TAtom;
// =================================================================================================
define_function: KW_MACRO identifier function_tuple class_block;
function_tuple:  PARENTHESES_L (identifier (COMMA identifier)* COMMA?)? PARENTHESES_R;
// =================================================================================================
annotation: (OP_HASH | OP_AT) namepath tuple_block?;
modifiers:  identifier*;
// =================================================================================================
macro_call:  OP_AT namepath tuple_block?;
tuple_block: PARENTHESES_L (class_expression (COMMA class_expression)* COMMA?)? PARENTHESES_R;
// =================================================================================================
suffix
    : MATCH_OPTIONAL                                          # Optional
    | MATCH_MANY                               # Many
    | MATCH_MANY1                              # Many1
    | BRACE_L INTEGER? BRACE_R                 # Index
    | BRACE_L INTEGER? COMMA INTEGER? BRACE_R  # Range
    ;
ucc: OP_CATEGORY BRACE_L (UNICODE_ID OP_ASSIGN)? UNICODE_ID BRACE_R;
// =================================================================================================
push: KW_PUSH tuple_block;
peek: KW_PEEK PARENTHESES_L INTEGER? OP_SLICE? INTEGER? PARENTHESES_R | KW_PEEK PARENTHESES_L OP_PEEK_ALL PARENTHESES_R;
// =================================================================================================
atomic
    : priority_block # AGroup
    | macro_call                                          # ACall
    | string                                              # AString
    | identifier                                          # AId
    | KW_DROP                                             # ADrop
    | KW_PULL                                             # APull
    | push                                                # APush
    | peek                                                # APeek
    | regex                                               # ARe
    | ucc                                                 # AUcc
    | INTEGER                                             # AInt
    | BOOLEAN                                             # ABool
    | KW_ANY                                              # AAny
    | ESCAPED                                             # AChar
    ;
priority_block: PARENTHESES_L OP_OR? class_expression PARENTHESES_R;

regex:           REGEX_RANGE | REGEX_FREE;
namepath:        identifier ((OP_PROPORTION | DOT) identifier)*;
string:          STRING_SINGLE | STRING_DOUBLE;
identifier_free: identifier | KW_CLASS | KW_UNION;
identifier:      RAW_ID | UNICODE_ID;