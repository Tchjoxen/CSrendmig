// // edges funktion/klasse der tager vores custom ast of returnerer et sety of
// // edges hver edge har en tostring metode giver q1 -> q1 [label] to gv format
// import java.util.ArrayList;
// // interface og eksempel på klasserne til custom ast
// //
// //
// public class ExpressionClasses {



// public interface Expression{
//     public String Type();
//     public String GetLabel();
// }
// public class StartExpression implements  Expression{
//     public String Type(){
//         return "Start";
//     }

//     public Expression Command;

//     public String GetLabel(){
//     }
// }

// public class AssignmentExpression implements  Expression{
//     public String Type(){
//         return "Assignment";
//     }

//     public Expression value;
//     public String x;

//     public String GetLabel(){
//         return x + " := " + value.GetLabel();
//     }
// }
// public class AssignmentToArrayExpression implements  Expression{
//     public String Type(){
//         return "AssignmentToArray";
//     }

//     public Expression value;
//     public Expression index;
//     public String A;

//     public String GetLabel(){
//         return A + "[" + index.GetLabel() + "]" + " := " + value.GetLabel();
//     }
// }
// public class EndCommandExpression implements  Expression{
//     public String Type(){
//         return "EndCommand";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " ; " + rhs.GetLabel();
//     }
// }
// public class IfExpression implements  Expression{
//     public String Type(){
//         return "If";
//     }

//     public Expression guardedCommand;

//     public String GetLabel(){
//         return "if " + guardedCommand.GetLabel() + " fi";
//     }
// }
// public class DoExpression implements  Expression{
//     public String Type(){
//         return "Do";
//     }

//     public Expression guardedCommand;

//     public String GetLabel(){
//         return "do " + guardedCommand.GetLabel() + " od";
//     }
// }
// public class SkipExpression implements  Expression{
//     public String Type(){
//         return "Skip";
//     }

//     public String GetLabel(){
//         return "Skip";
//     }
// }
// public class IFConditionExpression implements  Expression{
//     public String Type(){
//         return "IFCondition";
//     }
        
//     public Expression condition;
//     public Expression Command;

//     public String GetLabel(){
//         return condition.GetLabel() + " -> " + Command.GetLabel();
//     }
// }
// public class IFStatementsExpression implements  Expression{
//     public String Type(){
//         return "IFStatements";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " [] " + rhs.GetLabel();
//     }
// }
// public class NumExpression implements  Expression{
//     public String Type(){
//         return "Num";
//     }

//     public String n;

//     public String GetLabel(){
//         return n;
//     }
// }
// public class VarExpression implements  Expression{
//     public String Type(){
//         return "Var";
//     }

//     public String x;

//     public String GetLabel(){
//         return x;
//     }
// }
// public class ArrayAExpression implements  Expression{
//     public String Type(){
//         return "ArrayA";
//     }

//     public String A;
//     public Expression index;

//     public String GetLabel(){
//         return A + "[" + index.GetLabel() + "]";
//     }
// }
// public class DivExpression implements  Expression{
//     public String Type(){
//         return "Div";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " / " + rhs.GetLabel();
//     }
// }
// public class PlusExpression implements  Expression{
//     public String Type(){
//         return "Plus";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " + " + rhs.GetLabel();
//     }
// }
// public class TimesExpression implements  Expression{
//     public String Type(){
//         return "Times";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " * " + rhs.GetLabel();
//     }
// }
// public class MinusExpression implements  Expression{
//     public String Type(){
//         return "Minus";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " - " + rhs.GetLabel();
//     }
// }
// public class PowExpression implements  Expression{
//     public String Type(){
//         return "Pow";
//     }

//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + " ^ " + rhs.GetLabel();
//     }
// }

// public class NestedExpression implements Expression{
//     public String Type(){
//         return "( )";
//     }
//     public Expression value;

//     public String GetLabel() {
//         return "(" + value.GetLabel() + ")";
//     }
// }

// public class UPlusExpression implements  Expression{
//     public String Type(){
//         return "UPlus";
//     }

//     public Expression e;

//     public String GetLabel(){
//         return "+" + e.GetLabel();
//     }
// }
// public class UMinusExpression implements Expression{
//     public String Type(){
//         return "UMinus";
//     }

//     public Expression e;

//     public String GetLabel(){
//         return "-" + e.GetLabel();
//     }
// }

// public class BooleanFalseExpression implements Expression {
//     public String Type(){
//         return "false";
//     }

//     public String GetLabel(){
//         return "false";
//     }   
// }

// public class BooleanTrueExpression implements Expression {
//     public String Type(){
//         return "true";
//     }

//     public String GetLabel(){
//         return "true";
//     }
// }

// public class BooleanNegationEqualsExpression implements Expression {
//     public String Type(){
//         return "!=";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "!= " + rhs.GetLabel();
//     }
// }

// public class BooleanNegationExpression implements Expression {
//     public String Type(){
//         return "!";
//     }
//     public Expression value;

//     public String GetLabel(){
//         return "!" + value.GetLabel();
//     }
// }

// public class BooleanOrExpression implements Expression {
//     public String Type(){
//         return "|";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "|" + rhs.GetLabel();
//     }
// }

// public class BooleanDoubleOrExpression implements Expression {
//     public String Type(){
//         return "||";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "||" + rhs.GetLabel();
//     }
// }

// public class BooleanAndExpression implements Expression {
//     public String Type(){
//         return "&";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "&" + rhs.GetLabel();
//     }
// }

// public class BooleanDoubleAndExpression implements Expression {
//     public String Type(){
//         return "&&";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "&&" + rhs.GetLabel();
//     }
// }

// public class BooleanEqualsExpression implements Expression {
//     public String Type(){
//         return "=";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "=" + rhs.GetLabel();
//     }
// }

// public class BooleanNotEqualsExpression implements Expression {
//     public String Type(){
//         return "!=";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "!=" + rhs.GetLabel();
//     }
// }

// public class BooleanLessThanExpression implements Expression {
//     public String Type(){
//         return "<";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "<" + rhs.GetLabel();
//     }
// }

// public class BooleanLessThanEqualsExpression implements Expression {
//     public String Type(){
//         return "<=";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + "<=" + rhs.GetLabel();
//     }
// }

// public class BooleanGreaterThanExpression implements Expression {
//     public String Type(){
//         return ">";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + ">" + rhs.GetLabel();
//     }
// }

// public class BooleanGreaterThanEqualsExpression implements Expression {
//     public String Type(){
//         return ">=";
//     }
//     public Expression lhs;
//     public Expression rhs;

//     public String GetLabel(){
//         return lhs.GetLabel() + ">=" + rhs.GetLabel();
//     }
// }

// public class BooleanParenNestedExpression implements Expression {
//     public String Type(){
//         return "()";
//     }
//     public Expression value;

//     public String GetLabel(){
//         return "(" + value.GetLabel() + ")";
//     }
// }
// }