grammar Grammar
	;

import Lexicon
	;

start
	: sentencia* EOF
	;

sentencia
	: 'return' ';'
	| 'return' expr ';'
	| ('printsp'|'print'|'println') expr* ';'
	| 'read' expr ';'
    | IDENT '(' expr ')' ';'
    | definicion
    | asignacion
	| 'if' '(' expr ')' '{' sentencia* '}'
	| 'if' '(' expr ')' '{' sentencia* '}' 'else' '{' (sentencia)* '}'
	| 'while' '(' expr ')' '{' (sentencia)* '}'
	;


funcion
	: IDENT '(' parametros* ')' (':' tipo)? '{' (sentencia)* '}'
	;

parametros
	: IDENT ':' tipo
	| IDENT ':' tipo ','
	| expr
	;

asignacion
	: expr '=' expr ';'
	;
	
expr
	: IDENT
	| LITENT
	| LITREAL
	| LITCHAR
	| expr '*' expr
	| expr '/' expr
	| expr '+' expr
	| expr '-' expr
	| expr '%' expr
	| expr '!=' expr
	| expr '==' expr
	| expr '>=' expr
	| expr '<=' expr
	| expr '<' expr
	| expr '>' expr
	| expr '||' expr
	| expr '&&' expr
	| expr '!' expr
	| expr ',' expr
	| '(' expr ')'
    | '<' tipo '>' '(' expr ')'
    | IDENT dimension* ('.' expr)?
    | IDENT '(' expr ')'
	;

definicion
	: 'var' IDENT ':' (tipo|IDENT) ';'
	| 'var' IDENT ':' dimension+ (tipo|IDENT) ';' 
	| 'struct' IDENT '{' atributos+ '};' definicion
	| funcion
	;
	
dimension
	: '[' expr ']'
	;
	
atributos
	: IDENT ':' (tipo|IDENT) ';'
	| IDENT ':' dimension+ (tipo|IDENT) ';'
	;

tipo
	: 'int'
	| 'float'
	| 'char'
	;

