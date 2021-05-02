// // edges funktion/klasse der tager vores custom ast of returnerer et sety of
// // edges hver edge har en tostring metode giver q1 -> q1 [label] to gv format
// import java.util.ArrayList;
// // interface og eksempel på klasserne til custom ast
// //
// //



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


// // edge og node klasser
// public class Node{
//     public String Name; //eg. p1
//     public Node(String name){
//         Name = name;
//     }
// }

// public class Edge{
//     public Expression Label; //eg b := 3
//     public Node Next;
//     public Node Prev;

//     public Edge(Expression label){
//         Label = label;
//     }

//     public String GetPGElement()
//     {
//         return Prev.Name + " -> " + Next.Name + "[" + Label.GetLabel() + "]";
//     }
// }

// public class Edges {
//     public ArrayList<Edge> edges(Node from, Node to, Expression exp) {
//         ArrayList<Edge> edges = new ArrayList<>();

//         if (exp.Type() == "Assignment") {
//             AssignmentExpression aExp = (AssignmentExpression) exp;
//             Edge out = new Edge(aExp);
//             edges.add(out);
//         }
//         else if (exp.Type() == "SkipExpression") {
//             SkipExpression sExp = (SkipExpression) exp;
//             Edge out = new Edge(sExp);
//             edges.add(out);
//         }
//         else if (exp.Type() == "EndCommand") {
//             EndCommandExpression eExp = (EndCommandExpression) exp;
//             Node q = new Node("q" + 1); // not one but some counter
//             edges.addAll(edges(from, q, eExp.lhs));
//             edges.addAll(edges(q, to, eExp.rhs));
//         }
//         else if (exp.Type() == "IFExpression") {
//             IfExpression iExp = (IfExpression) exp;
//             edges.addAll(edges(from, to, iExp.guardedCommand));
//         }
//         else if (exp.Type() == "DOExpression") {
//             DoExpression dExp = (DoExpression) exp;
//             if(dExp.guardedCommand.Type() == "IFCondition"){
//                 IFConditionExpression IFCExp = (IFConditionExpression) exp;
//                 Node q = new Node("q" + 1); // not one but some counter
//                 edges.addAll(edges(from, q, IFCExp.condition));
//                 BooleanNegationExpression bne = new BooleanNegationExpression();
//                 bne.value = IFCExp.Command;
//                 edges.addAll(edges(q, to, bne.value));
//             }
//             else{
//                 edges.addAll(edges(from, to, dExp.guardedCommand));
//             }
//         }
//         else if(exp.Type() == "IFCondition"){
//             IFConditionExpression IFCExp = (IFConditionExpression) exp;
//             Node q = new Node("q" + 1); // not one but some counter
//             edges.addAll(edges(from, q, IFCExp.condition));
//             edges.addAll(edges(q, to, IFCExp.Command));
//         }
//         else if(exp.Type() == "IFStatements"){
//             IFStatementsExpression IFSExp = (IFStatementsExpression) exp;
//             edges.addAll(edges(from, to, IFSExp.rhs));
//             edges.addAll(edges(from, to, IFSExp.lhs));
//         }// some still missing
//         return edges;
//     }
// }


// // eksempel på hvordan det skal bygges (custom ast)
// public class GeneratedPG extends LanguageBaseVisitor<Expression> {
//     @Override public Expression visitStart(LanguageParser.StartContext ctx) {
//         StartExpression start =  new StartExpression();
//         start.Command = visit(ctx.command());
//         return start;
//     }

//     @Override public Expression visitAssignment(LanguageParser.AssignmentContext ctx) {
//         AssignmentExpression assign =  new AssignmentExpression();
//         assign.x = ctx.x.getText();
//         assign.value = visit(ctx.value);
//         return assign;
//     }

//     @Override public Expression visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx) { 
//         AssignmentToArrayExpression assignA =  new AssignmentToArrayExpression();
//         assignA.A = ctx.A.getText();
//         assignA.value = visit(ctx.value);
//         return assignA;
//     }

//     @Override public Expression visitEndCommand(LanguageParser.EndCommandContext ctx) { 
//         EndCommandExpression endCommand =  new EndCommandExpression();
//         endCommand.lhs = visit(ctx.lhs);
//         endCommand.rhs = visit(ctx.rhs);
//         return endCommand;
//     }

//     @Override public Expression visitSkip(LanguageParser.SkipContext ctx) {
//         SkipExpression skip =  new SkipExpression();
//         return skip;
//     }

//     @Override public Expression visitDo(LanguageParser.DoContext ctx) { 
//         DoExpression doExp =  new DoExpression();
//         doExp.guardedCommand = visit(ctx.guardedCommand);
//         return doExp;
//     }

//     @Override public Expression visitIf(LanguageParser.IfContext ctx) { 
//         IfExpression ifExp =  new IfExpression();
//         ifExp.guardedCommand = visit(ctx.guardedCommand);
//         return ifExp;
//     }

//     @Override
//     public Expression visitIFStatements(LanguageParser.IFStatementsContext ctx) {
//         IFStatementsExpression ifExp =  new IFStatementsExpression();
//         ifExp.lhs = visit(ctx.lhs);
//         ifExp.rhs = visit(ctx.rhs);
//         return ifExp;
//     }

//     @Override
//     public Expression visitIFCondition(LanguageParser.IFConditionContext ctx) {
//         IFConditionExpression ifCon =  new IFConditionExpression();
//         ifCon.condition = visit(ctx.condition);
//         ifCon.Command = visit(ctx.Command);
//         return ifCon;
//     }

//     @Override
//     public Expression visitUPlusExpr(LanguageParser.UPlusExprContext ctx) {
//         UPlusExpression uplus =  new UPlusExpression();
//         uplus.e = visit(ctx.e);
//         return uplus;
//     }

//     @Override
//     public Expression visitDivExpr(LanguageParser.DivExprContext ctx) {
//         DivExpression div =  new DivExpression();
//         div.lhs = visit(ctx.lhs);
//         div.rhs = visit(ctx.rhs);
//         return div;
//     }

//     @Override
//     public Expression visitPlusExpr(LanguageParser.PlusExprContext ctx) {
//         PlusExpression plus =  new PlusExpression();
//         plus.lhs = visit(ctx.lhs);
//         plus.rhs = visit(ctx.rhs);
//         return plus;
//     }

//     @Override public Expression visitNumExpr(LanguageParser.NumExprContext ctx) { 
//         NumExpression num =  new NumExpression();
//         num.n = ctx.n.getText();
//         return num;
//      }

//     @Override public Expression visitPowExpr(LanguageParser.PowExprContext ctx) { 
//         PowExpression pow =  new PowExpression();
//         pow.lhs = visit(ctx.lhs);
//         pow.rhs = visit(ctx.rhs);
//         return pow;
//      }

//     @Override public Expression visitVarExpr(LanguageParser.VarExprContext ctx) { 
//         VarExpression vari =  new VarExpression();
//         vari.x = ctx.x.getText();
//         return vari;
//     }

//     @Override public Expression visitNestedExpr(LanguageParser.NestedExprContext ctx) {         
//         NestedExpression NestedExpr = new NestedExpression();
//         NestedExpr.value = visit(ctx.value);
//         return NestedExpr; 
//     }

//     @Override
//     public Expression visitUMinusExpr(LanguageParser.UMinusExprContext ctx) {
//         UMinusExpression uminus =  new UMinusExpression();
//         uminus.e = visit(ctx.e);
//         return uminus;
//     }

//     @Override
//     public Expression visitTimesExpr(LanguageParser.TimesExprContext ctx) {
//         TimesExpression times =  new TimesExpression();
//         times.lhs = visit(ctx.lhs);
//         times.rhs = visit(ctx.rhs);
//         return times;
//     }

//     @Override
//     public Expression visitArrayA(LanguageParser.ArrayAContext ctx) {
//         ArrayAExpression arrayA =  new ArrayAExpression();
//         arrayA.A = ctx.A.getText();
//         arrayA.index = visit(ctx.index);
//         return arrayA;
//     }

//     @Override
//     public Expression visitMinusExpr(LanguageParser.MinusExprContext ctx) {
//         MinusExpression minus =  new MinusExpression();
//         minus.lhs = visit(ctx.lhs);
//         minus.rhs = visit(ctx.rhs);
//         return minus;
//     }

//     @Override
//     public Expression visitBooleanFalse(LanguageParser.BooleanFalseContext ctx) {
//         BooleanFalseExpression bFalse = new BooleanFalseExpression();
//         return bFalse;
//     }

//     @Override
//     public Expression visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx) {
//         BooleanEqualsExpression bEqual = new BooleanEqualsExpression();
//         bEqual.lhs = visit(ctx.lhs);
//         bEqual.rhs = visit(ctx.rhs);
//         return bEqual;
//     }

//     @Override
//     public Expression visitBooleanOr(LanguageParser.BooleanOrContext ctx) {
//         BooleanOrExpression bOr = new BooleanOrExpression();
//         bOr.lhs = visit(ctx.lhs);
//         bOr.rhs = visit(ctx.rhs);
//         return bOr;
//     }

//     @Override
//     public Expression visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx) {
//         BooleanDoubleOrExpression bDoubleOr = new BooleanDoubleOrExpression();
//         bDoubleOr.lhs = visit(ctx.lhs);
//         bDoubleOr.rhs = visit(ctx.rhs);
//         return bDoubleOr;
//     }

//     @Override public Expression visitBooleanAnd(LanguageParser.BooleanAndContext ctx) { 
//         BooleanAndExpression BooleanAnd = new BooleanAndExpression();
//         BooleanAnd.lhs = visit(ctx.lhs);
//         BooleanAnd.rhs = visit(ctx.rhs);
//         return BooleanAnd;
//     }

//     @Override public Expression visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx) { 
//         BooleanGreaterThanExpression nGreaterThan = new BooleanGreaterThanExpression();
//         nGreaterThan.lhs = visit(ctx.lhs);
//         nGreaterThan.rhs = visit(ctx.rhs);
//         return nGreaterThan;
//     }

//     @Override public Expression visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx) { 
//         BooleanNegationEqualsExpression bNegationEquals = new BooleanNegationEqualsExpression();
//         bNegationEquals.lhs = visit(ctx.lhs);
//         bNegationEquals.rhs = visit(ctx.rhs);
//         return bNegationEquals;
//     }

//     @Override public Expression visitBooleanNegation(LanguageParser.BooleanNegationContext ctx) { 
//         BooleanNegationExpression bNegation = new BooleanNegationExpression();
//         bNegation.value = visit(ctx.value);
//         return bNegation;
//     }

//     @Override public Expression visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx) {
//         BooleanLessThanExpression bLessThan = new BooleanLessThanExpression();
//         bLessThan.lhs = visit(ctx.lhs);
//         bLessThan.rhs = visit(ctx.rhs);
//         return bLessThan;    
//     }

//     @Override public Expression visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx) {
//         BooleanParenNestedExpression bParenNested = new BooleanParenNestedExpression();
//         bParenNested.value = visit(ctx.value);
//         return bParenNested;
//     }

//     @Override public Expression visitBooleanTrue(LanguageParser.BooleanTrueContext ctx) { 
//         BooleanTrueExpression bTrue = new BooleanTrueExpression();
//         return bTrue;
//     }

//     @Override public Expression visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx) {
//         BooleanGreaterThanEqualsExpression bGreaterThanEquals = new BooleanGreaterThanEqualsExpression();
//         bGreaterThanEquals.lhs = visit(ctx.lhs);
//         bGreaterThanEquals.rhs = visit(ctx.rhs);
//         return bGreaterThanEquals;
//     }

//     @Override public Expression visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx) { 
//         BooleanDoubleAndExpression bDoubleAnd = new BooleanDoubleAndExpression();
//         bDoubleAnd.lhs = visit(ctx.lhs);
//         bDoubleAnd.rhs = visit(ctx.rhs);
//         return bDoubleAnd;
//     }

//     @Override public Expression visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx) {
//         BooleanLessThanEqualsExpression bLessThanEquals = new BooleanLessThanEqualsExpression();
//         bLessThanEquals.lhs = visit(ctx.lhs);
//         bLessThanEquals.rhs = visit(ctx.rhs);
//         return bLessThanEquals;
//     }
// }
