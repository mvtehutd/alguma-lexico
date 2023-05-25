lexer grammar AlgumaLexer;

PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'real' | 'logico' | 'se' | 'entao' | 'senao' | 
    'fim_se' | 'caso' | 'seja' | 'fim_caso' | 'e' | 'nao' | 'ou' | 'leia' | 'escreva' | 'fim_algoritmo' | 'para' | 
    'faca' | 'fim_para' | 'ate' | 'tipo' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro';

NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

CADEIA: '"' ~('\n'|'\r'|'"')* '"';

DELIM: ':';

INTERVALO: '..';

OP_ARIT: '+' | '-' | '*' | '/' | '%';

OP_REL:	'=' | '≠' | '<>' | '>' | '<' | '≥' | '>=' | '≤' | '<=';

OP_CAMPO: '.';

ATRIBUICAO: '<-';

PONTEIRO: '^' | '&';

COMENTARIO: '{' ~('\n'|'\r'|'{'|'}')* '}' {skip();};

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

ABREPAR: '(';

FECHAPAR: ')';

VIRGULA: ',';

IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

CADEIA_NAO_FECHADA: '"' ~('\n'|'\r'|'"')* '\n';

COMENTARIO_NAO_FECHADO: '{' ~('\n'|'\r'|'{'|'}')* '\n' ;

ERRO: .;

