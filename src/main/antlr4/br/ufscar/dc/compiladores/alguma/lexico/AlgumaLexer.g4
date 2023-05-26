lexer grammar AlgumaLexer;

// Palavras chave da gramática, representam palavras que possuem um sentindo/executam uma função na gramática.
PALAVRA_CHAVE: 'algoritmo' | 'declare' | 'literal' | 'inteiro' | 'real' | 'logico' | 'se' | 'entao' | 'senao' | 
    'fim_se' | 'caso' | 'seja' | 'fim_caso' | 'e' | 'nao' | 'ou' | 'leia' | 'escreva' | 'fim_algoritmo' | 'para' | 
    'faca' | 'fim_para' | 'ate' | 'tipo' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'fim_procedimento' | 'var' |
    'procedimento' | 'funcao' | 'fim_funcao' | 'retorne' | 'constante' | 'falso' | 'verdadeiro';

// Identificadores para números inteiros e reais
NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

// Identifica uma cadeia de caracteres dentro de " ".
CADEIA: '"' ~('\n'|'\r'|'"')* '"';

// Operadores da gramática que vão desde aritméticas, relacionais, até aqueles que executam alguma ação na gramática.
DELIM: ':';

INTERVALO: '..';

OP_ARIT: '+' | '-' | '*' | '/' | '%';

OP_REL:	'=' | '≠' | '<>' | '>' | '<' | '≥' | '>=' | '≤' | '<=';

OP_CAMPO: '.';

ATRIBUICAO: '<-';

PONTEIRO: '^' | '&';


// Identifica um comentário que é representado por uma sequência de caracteres dentro de { } e ignora ele
COMENTARIO: '{' ~('\n'|'\r'|'{'|'}')* '}' {skip();};

// Ignora espaços em branco
WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

// Identificadores para os [] e () e ,
ABREPAR: '(';

FECHAPAR: ')';

ABRECHAVE: '[';

FECHACHAVE: ']';

VIRGULA: ',';

// Reconhece os identificadores (variáveis), que são qualquer sequência de caracteres iniciada por uma letra ou _ (underline)
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// Identificadores que representam os possíveis erros
// Reconhece uma cadeia que não teve suas "" fechada
CADEIA_NAO_FECHADA: '"' ~('\n'|'\r'|'"')* '\n';

// Reconhece um comentário que não fechou sua }
COMENTARIO_NAO_FECHADO: '{' ~('\n'|'\r'|'{'|'}')* '\n' ;

// Qualquer outro símbolo não identificado é reconhecido aqui
ERRO: .;

