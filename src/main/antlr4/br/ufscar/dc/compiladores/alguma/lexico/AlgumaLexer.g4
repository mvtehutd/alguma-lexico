lexer grammar AlgumaLexer;

// Palavras chave da gramatica, representam palavras que possuem um sentindo/executam uma funcao na gramatica.
PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'real' | 'logico' | 'se' | 'entao' | 'senao' | 
    'fim_se' | 'caso' | 'seja' | 'fim_caso' | 'e' | 'nao' | 'ou' | 'leia' | 'escreva' | 'fim_algoritmo' | 'para' | 
    'faca' | 'fim_para' | 'ate' | 'tipo' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'fim_procedimento' | 'var' |
    'procedimento' | 'funcao' | 'fim_funcao' | 'retorne' | 'constante' | 'falso' | 'verdadeiro';

// Identificadores para numeros inteiros e reais
NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

// Identifica uma cadeira de caracteres que são sequencia de qualquer coisa dentro de " ".
CADEIA: '"' ~('\n'|'\r'|'"')* '"';

// Operadores da gramatica que vao desde aritmeticas, relacionais até aqueles que executam alguma ação na gramatica.
DELIM: ':';

INTERVALO: '..';

OP_ARIT: '+' | '-' | '*' | '/' | '%';

OP_REL:	'=' | '≠' | '<>' | '>' | '<' | '≥' | '>=' | '≤' | '<=';

OP_CAMPO: '.';

ATRIBUICAO: '<-';

PONTEIRO: '^' | '&';


// Identifica um comentário que é representado por uma sequencia de qualquer coisa dentro de { } e ignora ele
COMENTARIO: '{' ~('\n'|'\r'|'{'|'}')* '}' {skip();};

// Ignora espaços em branco
WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

// Identificadores para os [] e () e ,
ABREPAR: '(';

FECHAPAR: ')';

ABRECHAVE: '[';

FECHACHAVE: ']';

VIRGULA: ',';

// Identifica os identifcadores que são qualquer sequencia de caracteres iniciada por uma letra e seguida por qualquer coisa que da nome a alguma coisa
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// Identificadores que representam os possiveis erros
// Reconhece uma cadeia que não teve suas "" fechada
CADEIA_NAO_FECHADA: '"' ~('\n'|'\r'|'"')* '\n';

// Reconhece um comentário que não fechou sua }
COMENTARIO_NAO_FECHADO: '{' ~('\n'|'\r'|'{'|'}')* '\n' ;

// Qualquer outro simbolo nao identificado é reconhecido aqui
ERRO: .;

