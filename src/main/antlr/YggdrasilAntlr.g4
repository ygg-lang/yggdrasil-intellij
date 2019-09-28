grammar YggdrasilAntlr;
import YggdrasilBasic;

program: (identifier)* EOF;










identifier: RAW_ID | UNICODE_ID;