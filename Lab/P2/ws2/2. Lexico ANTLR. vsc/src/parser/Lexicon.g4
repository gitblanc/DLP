/*
Añadir EN ESTE ORDEN:
- Identificadores. Deben empezar por letra y luego puede ser letra, dígito o subrayado '_'.
- Palabras reservadas: read, print, int y float.
- Operadores aritméticos y otros simbolos:  + - = ;
- Literales reales: 3.15, 78.23, ... (parte entera obligatoria/ parte decimal OBLIGATORIA).
- Comentarios de una línea y multilinea.

- Tarea OBLIGATORIA para casa -> Ver "Tarea.pdf"
*/

lexer grammar Lexicon;

LITENT : [0-9]+;

LITREAL : [0-9]+ '.' [0-9]+;

MAS : '+';

MENOS : '-';

IGUAL : '=';

PCOMA : ';';

READ : 'read';

PRINT : 'print';

INT : 'int';

FLOAT : 'float';

IDENT : [a-zA-Z][a-zA-Z0-9_]*;

LINE_COMMENT : '//' .*? ('\n' | EOF) -> skip;

MULTILINE_COMMENT : '/*' .*? '*/' -> skip;

WHITESPACE : [ \t\r\n]+ -> skip;
