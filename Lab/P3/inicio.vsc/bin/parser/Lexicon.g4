lexer grammar Lexicon;

LITENT : [0-9]+;

COMMENT : '/*' .*? '*/' -> skip;

WS : [ \t\r\n]+ -> skip;
