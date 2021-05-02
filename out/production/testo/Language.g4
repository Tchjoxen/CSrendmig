//cd ~path/LANGUAGE
//build: antlr4 -visitor -no-listener Language.g
//compile: javac *.java
//run: java Language.java

grammar Language;

start : command EOF;

command: x = VAR ':=' value = arithmetic                           #Assignment
      | A = VAR '[' index = arithmetic ']' ':=' value = arithmetic #AssignmentToArray
      | <assoc=right> lhs = command     ';' rhs = command          #EndCommand
      | 'if ' guardedCommand = guardedcommand ' fi'                #If
      | 'do ' guardedCommand = guardedcommand ' od'                #Do
      | 'skip'                                                     #Skip
      ;

guardedcommand : condition = booleanoperation    '->' Command = command     #IFCondition
      | lhs = guardedcommand '[]' rhs = guardedcommand                      #IFStatements
      ;

arithmetic : n = NUM                                        #NumExpr
      | x = VAR                                             #VarExpr
      | A = VAR '[' index = arithmetic ']'                  #ArrayA
      |               lhs = arithmetic '/' rhs = arithmetic #DivExpr
      |               lhs = arithmetic '+' rhs = arithmetic #PlusExpr
      |               lhs = arithmetic '*' rhs = arithmetic #TimesExpr
      |               lhs = arithmetic '-' rhs = arithmetic #MinusExpr
      | <assoc=right> lhs = arithmetic '^' rhs = arithmetic #PowExpr
      | '(' value = arithmetic ')'                                  #NestedExpr
      | '+' e = arithmetic                                  #UPlusExpr
      | '-' e = arithmetic                                  #UMinusExpr
      ;

booleanoperation: 'true'                                                               #BooleanTrue
                | 'false'                                                              #BooleanFalse
                | '!' value = booleanoperation    	                                 #BooleanNegation
                |               lhs = booleanoperation    '|' rhs = booleanoperation   #BooleanOr
                |               lhs = booleanoperation    '||' rhs = booleanoperation  #BooleanDoubleOr
                |               lhs = booleanoperation    '&' rhs = booleanoperation   #BooleanAnd
                |               lhs = booleanoperation    '&&' rhs = booleanoperation  #BooleanDoubleAnd
                |               lhs = arithmetic '=' rhs = arithmetic 	               #BooleanEquals
                |               lhs = arithmetic '!=' rhs = arithmetic 	               #BooleanNegationEquals
                |               lhs = arithmetic '<' rhs = arithmetic 	               #BooleanLessThan
                |               lhs = arithmetic '<=' rhs = arithmetic 	               #BooleanLessThanEquals
                |               lhs = arithmetic '>' rhs = arithmetic 	               #BooleanGreaterThan
                |               lhs = arithmetic '>=' rhs = arithmetic 	               #BooleanGreaterThanEquals
                | '(' value = booleanoperation    ')'                                  #BooleanParenNestedExpression
                ;


NUM : ('0'..'9')+ ( '.' ('0'..'9')+)?  ('E' ('+'|'-')? ('0'..'9')+ )? ;
VAR : ('A'..'Z'|'a'..'z')+ ;


WS    : [ \t\r\n]+ -> skip ;

