grammar Pseudocode;

prog: block EOF;

block: stat*;

stat:
  'IF' expr 'THEN' block 'ENDIF' # IfStat|
  'FUNCTION' NAME funcDefineParams 'RETURNS' datatype block 'ENDFUNCTION' # DefineFunction |
  'PROCEDURE' NAME funcDefineParams block 'ENDPROCEDURE' # DefineProc |
  'FOR' NAME '<-' expr 'TO' expr ('STEP' expr)? block 'NEXT' NAME # ForLoop | 
  'REPEAT' block 'UNTIL' expr # RepeatLoop |
  'WHILE' expr block 'ENDWHILE' # WhileLoop |
  'OUTPUT' exprlist # Output |
  'INPUT' NAME # Input |
  'TYPE' name=NAME '=' '^' datatype # DefinePointerType |
  'TYPE' name=NAME '(' NAME ( ',' NAME )* ')' # DefineEnum |
  'TYPE' name=NAME (declare)* 'ENDTYPE' # DefineUserType |
  functionCall # CallFunction |
  'CALL' name=NAME args # CallProsudure |
  var '<-' expr # Assignment |
  declare # DeclareVariable |
  'CONSTANT' NAME '=' expr # DeclareConstant;

funcDefineParams: ( '(' NAME ':' datatype (',' NAME ':' datatype)* ')' )?;

declare: 'DECLARE' name=NAME ':' datatype;

expr:
  'TRUE' # ConstTrue|
  'FALSE' # ConstFalse |
  functionCall # ExprFuncCall |
  var # ExprVar |
  STRING # ExprStr |
  CHAR # ExprChar |
  INT # ExprInt |
  expr '>' expr # ExprMore |
  expr '<' expr # ExprLess |
  expr '=' expr # ExprEqual |
  expr '>=' expr # ExprMoreEqual |
  expr '<=' expr # ExprLessEqual |
  expr '<>' expr # ExprNotEqual |
  expr '+' expr # OpAdd |
  expr '-' expr # Opsubtract |
  expr '*' expr # OpMult |
  expr '/' expr # OpDivide |
  expr 'AND' expr # OpAnd |
  expr 'OR' expr # OpOr |
  'NOT' expr # OpNot|
  '(' expr ')' # ExprBracket;

functionCall: var args;

var: NAME varSuffix* ;

varSuffix: args* ('[' expr ']' | '.' NAME) ;

args: '(' exprlist? ')' ;

exprlist: (expr ',')* expr;

datatype:
  'ARRAY' '[' arrayLengthDefine ( ',' arrayLengthDefine )* ']' 'OF' datatype # TypeArray |
  NAME # TypeUserDefined |
  'INTEGER' # TypeInt |
  'STRING' # TypeStr |
  'REAL' # TypeReal |
  'CHAR' # TypeChar |
  'BOOLEAN' # TypeBool ;

arrayLengthDefine: INT ':' INT;

fragment
EscapeSequence:
  '\\' [rnt"'\\0] |
  '\\' '\r'? '\n';

STRING:
  '"' ( EscapeSequence | ~('\\'|'"') )* '"';

CHAR:
  '\'' ( EscapeSequence | ~('\\'|'"') ) '\'';

NAME: [a-zA-Z_][a-zA-Z_0-9]*;
NEWLINE: [ \t\r\n]+ -> skip;
INT: [0-9]+ ;

