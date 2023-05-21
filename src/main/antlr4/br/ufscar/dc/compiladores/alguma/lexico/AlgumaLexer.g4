lexer grammar AlgumaLexer;

PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'real' | 'leia' | 'escreva' | 'fim_algoritmo';

IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

CADEIA: '"' ~('\n'|'\r'|'"')* '"';

DELIM: ':';

OPERADORES: '+' | '-' | '*' | '/';

COMENTARIO: '{' ~('\n'|'\r')* '}' {skip();};

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

ABREPAR: '(';

FECHAPAR: ')';

VIRGULA: ',';