import java.util.ArrayList;



// import jdk.nashorn.api.tree.BreakTree;

public class GeneratedPG {

    public static ArrayList<Edge> getProgramGraph(LanguageParser parser) {

        StartExpression start = new StartExpression();
        start.Command = new GenerateTree().visit(parser.start());

        String PG = "digraph program_graph {rankdir=LR;\n" +
                "node [shape = circle]; q▷;\n" +
                "node [shape = doublecircle]; q:arrow_backward:; \n" +
                "node [shape = circle]\n";
        Edges getEdges = new Edges();
        ArrayList<Edge> edges = getEdges.edges(new Node("q▷"), new Node("q:arrow_backward:"), start);
        for (Edge e : edges
             ) {
            PG += e.GetPGElement() + "\n";
        }
        PG += "}";
        //return PG;

        return edges;
    
    }
}



// interface og eksempel på klasserne til custom ast
//
//
 interface Expression{
    public String Type();
    public String GetLabel();
}

class StartExpression implements  Expression{
    public String Type(){
        return "Start";
    }
    
    public LanguageParser.StartContext ctx;

    public Expression Command;

    public String GetLabel(){
        return Command.GetLabel();
    }
}
 class AssignmentExpression implements  Expression{
    public String Type(){
        return "Assignment";
    }
    
    public LanguageParser.AssignmentContext ctx;
    

    public Expression a;
    public String x;

    public String GetLabel(){
        return x + " := " + a.GetLabel();
    }
}
 class AssignmentToArrayExpression implements  Expression{
    public String Type(){
        return "AssignmentToArray";
    }
    
    public LanguageParser.AssignmentToArrayContext ctx;

    public Expression value;
    public Expression index;
    public String A;

    public String GetLabel(){
        return A + "[" + index.GetLabel() + "]" + " := " + value.GetLabel();
    }
}
 class EndCommandExpression implements  Expression{
    public String Type(){
        return "EndCommand";
    }
    
    public LanguageParser.EndCommandContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " ; " + rhs.GetLabel();
    }
}
 class IfExpression implements  Expression{
    public String Type(){
        return "If";
    }
    public LanguageParser.IfContext ctx;

    public Expression guardedCommand;

    public String GetLabel(){
        return "if " + guardedCommand.GetLabel() + " fi";
    }
}
class DoExpression implements  Expression{
    public String Type(){
        return "Do";
    }
    
    public LanguageParser.DoContext ctx;

    public Expression guardedCommand;

    public String GetLabel(){
        return "do " + guardedCommand.GetLabel() + " od";
    }
}
 class SkipExpression implements  Expression{
    public String Type(){
        return "Skip";
    }
    
    public LanguageParser.SkipContext ctx;

    public String GetLabel(){
        return "Skip";
    }
}
 class IFConditionExpression implements  Expression{
    public String Type(){
        return "IFCondition";
    }
    
    public LanguageParser.IFConditionContext ctx;

    public Expression condition;
    public Expression Command;

    public String GetLabel(){
        return condition.GetLabel() + " -> " + Command.GetLabel();
    }
}
 class IFStatementsExpression implements  Expression{
    public String Type(){
        return "IFStatements";
    }
    
    public LanguageParser.IFStatementsContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " [] " + rhs.GetLabel();
    }
}
 class NumExpression implements  Expression{
    public String Type(){
        return "Num";
    }
    
    public LanguageParser.NumExprContext ctx;

    public String n;

    public String GetLabel(){
        return n;
    }
}
 class VarExpression implements  Expression{
    public String Type(){
        return "Var";
    }
    
    public LanguageParser.VarExprContext ctx;

    public String x;

    public String GetLabel(){
        return x;
    }
}
 class ArrayAExpression implements  Expression{
    public String Type(){
        return "ArrayA";
    }
    
    public LanguageParser.ArrayAContext ctx;

    public String A;
    public Expression index;

    public String GetLabel(){
        return A + "[" + index.GetLabel() + "]";
    }
}
 class DivExpression implements  Expression{
    public String Type(){
        return "Div";
    }
    
    public LanguageParser.DivExprContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " / " + rhs.GetLabel();
    }
}
 class PlusExpression implements  Expression{
    public String Type(){
        return "Plus";
    }
    
    public LanguageParser.PlusExprContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " + " + rhs.GetLabel();
    }
}
 class TimesExpression implements  Expression{
    public String Type(){
        return "Times";
    }
    
    public LanguageParser.TimesExprContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " * " + rhs.GetLabel();
    }
}
class NestedExpression implements Expression{
    public String Type(){
        return "( )";
    }
    
    public LanguageParser.NestedExprContext ctx;
    
    public Expression value;

    public String GetLabel() {
        return "(" + value.GetLabel() + ")";
    }
}
 class MinusExpression implements  Expression{
    public String Type(){
        return "Minus";
    }
    
    public LanguageParser.MinusExprContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " - " + rhs.GetLabel();
    }
}
 class PowExpression implements  Expression{
    public String Type(){
        return "Pow";
    }
    
    public LanguageParser.PowExprContext ctx;

    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + " ^ " + rhs.GetLabel();
    }
}
 class UPlusExpression implements  Expression{
    public String Type(){
        return "UPlus";
    }
    
    public LanguageParser.UPlusExprContext ctx;

    public Expression e;

    public String GetLabel(){
        return "+" + e.GetLabel();
    }
}
 class UMinusExpression implements Expression{
    public String Type(){
        return "UMinus";
    }
    
    public LanguageParser.UMinusExprContext ctx;

    public Expression e;

    public String GetLabel(){
        return "-" + e.GetLabel();
    }
}
 class BooleanFalseExpression implements Expression {
    public String Type(){
        return "false";
    }
    
    public LanguageParser.BooleanFalseContext ctx;

    public String GetLabel(){
        return "false";
    }
}
 class BooleanTrueExpression implements Expression {
    public String Type(){
        return "true";
    }
    
    public LanguageParser.BooleanTrueContext ctx;

    public String GetLabel(){
        return "true";
    }
}
 class BooleanNegationEqualsExpression implements Expression {
    public String Type(){
        return "!=";
    }
    
    public LanguageParser.BooleanNegationEqualsContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "!= " + rhs.GetLabel();
    }
}
 class BooleanNegationExpression implements Expression {
    public String Type(){
        return "!";
    }
    
    public LanguageParser.BooleanNegationContext ctx;
    
    public Expression value;

    public String GetLabel(){
        return "!(" + value.GetLabel()+")";
    }
}
 class BooleanOrExpression implements Expression {
    public String Type(){
        return "|";
    }
    
    public LanguageParser.BooleanOrContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "|" + rhs.GetLabel();
    }
}
 class BooleanDoubleOrExpression implements Expression {
    public String Type(){
        return "||";
    }
    
    public LanguageParser.BooleanDoubleOrContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "||" + rhs.GetLabel();
    }
}
 class BooleanAndExpression implements Expression {
    public String Type(){
        return "&";
    }
    
    public LanguageParser.BooleanAndContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "&" + rhs.GetLabel();
    }
}
 class BooleanDoubleAndExpression implements Expression {
    public String Type(){
        return "&&";
    }
    
    public LanguageParser.BooleanDoubleAndContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "&&" + rhs.GetLabel();
    }
}
 class BooleanEqualsExpression implements Expression {
    public String Type(){
        return "=";
    }
    
    public LanguageParser.BooleanEqualsContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "=" + rhs.GetLabel();
    }
}
 class BooleanNotEqualsExpression implements Expression {
    public String Type(){
        return "!=";
    }
    
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "!=" + rhs.GetLabel();
    }
}
 class BooleanLessThanExpression implements Expression {
    public String Type(){
        return "<";
    }
    
    public LanguageParser.BooleanLessThanContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "<" + rhs.GetLabel();
    }
}
 class BooleanLessThanEqualsExpression implements Expression {
    public String Type(){
        return "<=";
    }
    
    public LanguageParser.BooleanLessThanEqualsContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + "<=" + rhs.GetLabel();
    }
}
 class BooleanGreaterThanExpression implements Expression {
    public String Type(){
        return ">";
    }
    
    public LanguageParser.BooleanGreaterThanContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + ">" + rhs.GetLabel();
    }
}
 class BooleanGreaterThanEqualsExpression implements Expression {
    public String Type(){
        return ">=";
    }
    
    public LanguageParser.BooleanGreaterThanEqualsContext ctx;
    
    public Expression lhs;
    public Expression rhs;

    public String GetLabel(){
        return lhs.GetLabel() + ">=" + rhs.GetLabel();
    }
}
 class BooleanParenNestedExpression implements Expression {
    public String Type(){
        return "()";
    }
    
    public LanguageParser.BooleanParenNestedExpressionContext ctx;
    
    public Expression value;

    public String GetLabel(){
        return "(" + value.GetLabel() + ")";
    }
}





class GenerateTree extends LanguageBaseVisitor<Expression> {
    @Override public Expression visitStart(LanguageParser.StartContext ctx) {
        StartExpression start =  new StartExpression();
        start.ctx = ctx;
        start.Command = visit(ctx.command());
        return start;
    }

    @Override public Expression visitAssignment(LanguageParser.AssignmentContext ctx) {
        AssignmentExpression assign =  new AssignmentExpression();
        assign.ctx = ctx;
        assign.x = ctx.x.getText();
        assign.a = visit(ctx.value);
        return assign;
    }

    @Override public Expression visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx) { 
        AssignmentToArrayExpression assignA =  new AssignmentToArrayExpression();
        assignA.ctx = ctx;
        assignA.A = ctx.A.getText();
        assignA.index = visit(ctx.index);
        assignA.value = visit(ctx.value);
        return assignA;
    }

    @Override public Expression visitEndCommand(LanguageParser.EndCommandContext ctx) { 
        EndCommandExpression endCommand =  new EndCommandExpression();
        endCommand.ctx = ctx;
        endCommand.lhs = visit(ctx.lhs);
        endCommand.rhs = visit(ctx.rhs);
        return endCommand;
    }

    @Override public Expression visitSkip(LanguageParser.SkipContext ctx) {
        SkipExpression skip =  new SkipExpression();
        skip.ctx = ctx;
        return skip;
    }

    @Override public Expression visitDo(LanguageParser.DoContext ctx) { 
        DoExpression doExp =  new DoExpression();
        doExp.guardedCommand = visit(ctx.guardedCommand);
        return doExp;
    }

    @Override public Expression visitIf(LanguageParser.IfContext ctx) { 
        IfExpression ifExp =  new IfExpression();
        ifExp.ctx = ctx;
        ifExp.guardedCommand = visit(ctx.guardedCommand);
        return ifExp;
    }

    @Override
    public Expression visitIFStatements(LanguageParser.IFStatementsContext ctx) {
        IFStatementsExpression ifExp =  new IFStatementsExpression();
        ifExp.ctx = ctx;
        ifExp.lhs = visit(ctx.lhs);
        ifExp.rhs = visit(ctx.rhs);
        return ifExp;
    }

    @Override
    public Expression visitIFCondition(LanguageParser.IFConditionContext ctx) {
        IFConditionExpression ifCon =  new IFConditionExpression();
        ifCon.ctx = ctx;
        ifCon.condition = visit(ctx.condition);
        ifCon.Command = visit(ctx.Command);
        return ifCon;
    }

    @Override
    public Expression visitUPlusExpr(LanguageParser.UPlusExprContext ctx) {
        UPlusExpression uplus =  new UPlusExpression();
        uplus.ctx = ctx;
        uplus.e = visit(ctx.e);
        return uplus;
    }

    @Override
    public Expression visitDivExpr(LanguageParser.DivExprContext ctx) {
        DivExpression div =  new DivExpression();
        div.ctx = ctx;
        div.lhs = visit(ctx.lhs);
        div.rhs = visit(ctx.rhs);
        return div;
    }

    @Override
    public Expression visitPlusExpr(LanguageParser.PlusExprContext ctx) {
        PlusExpression plus =  new PlusExpression();
        plus.ctx = ctx;
        plus.lhs = visit(ctx.lhs);
        plus.rhs = visit(ctx.rhs);
        return plus;
    }

    @Override public Expression visitNumExpr(LanguageParser.NumExprContext ctx) { 
        NumExpression num =  new NumExpression();
        num.ctx = ctx;
        num.n = ctx.n.getText();
        return num;
     }

    @Override public Expression visitPowExpr(LanguageParser.PowExprContext ctx) { 
        PowExpression pow =  new PowExpression();
        pow.ctx = ctx;
        pow.lhs = visit(ctx.lhs);
        pow.rhs = visit(ctx.rhs);
        return pow;
     }

    @Override public Expression visitVarExpr(LanguageParser.VarExprContext ctx) { 
        VarExpression vari =  new VarExpression();
        vari.ctx = ctx;
        vari.x = ctx.x.getText();
        return vari;
    }

    @Override public Expression visitNestedExpr(LanguageParser.NestedExprContext ctx) {         
        NestedExpression NestedExpr = new NestedExpression();
        NestedExpr.ctx = ctx;
        NestedExpr.value = visit(ctx.value);
        return NestedExpr; 
    }

    @Override
    public Expression visitUMinusExpr(LanguageParser.UMinusExprContext ctx) {
        UMinusExpression uminus =  new UMinusExpression();
        uminus.ctx = ctx;
        uminus.e = visit(ctx.e);
        return uminus;
    }

    @Override
    public Expression visitTimesExpr(LanguageParser.TimesExprContext ctx) {
        TimesExpression times =  new TimesExpression();
        times.ctx = ctx;
        times.lhs = visit(ctx.lhs);
        times.rhs = visit(ctx.rhs);
        return times;
    }

    @Override
    public Expression visitArrayA(LanguageParser.ArrayAContext ctx) {
        ArrayAExpression arrayA =  new ArrayAExpression();
        arrayA.ctx = ctx;
        arrayA.A = ctx.A.getText();
        arrayA.index = visit(ctx.index);
        return arrayA;
    }

    @Override
    public Expression visitMinusExpr(LanguageParser.MinusExprContext ctx) {
        MinusExpression minus =  new MinusExpression();
        minus.ctx = ctx;
        minus.lhs = visit(ctx.lhs);
        minus.rhs = visit(ctx.rhs);
        return minus;
    }

    @Override
    public Expression visitBooleanFalse(LanguageParser.BooleanFalseContext ctx) {
        BooleanFalseExpression bFalse = new BooleanFalseExpression();
        bFalse.ctx = ctx;
        return bFalse;
    }

    @Override
    public Expression visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx) {
        BooleanEqualsExpression bEqual = new BooleanEqualsExpression();
        bEqual.ctx = ctx;
        bEqual.lhs = visit(ctx.lhs);
        bEqual.rhs = visit(ctx.rhs);
        return bEqual;
    }

    @Override
    public Expression visitBooleanOr(LanguageParser.BooleanOrContext ctx) {
        BooleanOrExpression bOr = new BooleanOrExpression();
        bOr.ctx = ctx;
        bOr.lhs = visit(ctx.lhs);
        bOr.rhs = visit(ctx.rhs);
        return bOr;
    }

    @Override
    public Expression visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx) {
        BooleanDoubleOrExpression bDoubleOr = new BooleanDoubleOrExpression();
        bDoubleOr.ctx = ctx;
        bDoubleOr.lhs = visit(ctx.lhs);
        bDoubleOr.rhs = visit(ctx.rhs);
        return bDoubleOr;
    }

    @Override public Expression visitBooleanAnd(LanguageParser.BooleanAndContext ctx) { 
        BooleanAndExpression BooleanAnd = new BooleanAndExpression();
        BooleanAnd.ctx = ctx;
        BooleanAnd.lhs = visit(ctx.lhs);
        BooleanAnd.rhs = visit(ctx.rhs);
        return BooleanAnd;
    }

    @Override public Expression visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx) { 
        BooleanGreaterThanExpression nGreaterThan = new BooleanGreaterThanExpression();
        nGreaterThan.ctx = ctx;
        nGreaterThan.lhs = visit(ctx.lhs);
        nGreaterThan.rhs = visit(ctx.rhs);
        return nGreaterThan;
    }

    @Override public Expression visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx) { 
        BooleanNegationEqualsExpression bNegationEquals = new BooleanNegationEqualsExpression();
        bNegationEquals.ctx = ctx;
        bNegationEquals.lhs = visit(ctx.lhs);
        bNegationEquals.rhs = visit(ctx.rhs);
        return bNegationEquals;
    }

    @Override public Expression visitBooleanNegation(LanguageParser.BooleanNegationContext ctx) { 
        BooleanNegationExpression bNegation = new BooleanNegationExpression();
        bNegation.ctx = ctx;
        bNegation.value = visit(ctx.value);
        return bNegation;
    }

    @Override public Expression visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx) {
        BooleanLessThanExpression bLessThan = new BooleanLessThanExpression();
        bLessThan.ctx = ctx;
        bLessThan.lhs = visit(ctx.lhs);
        bLessThan.rhs = visit(ctx.rhs);
        return bLessThan;    
    }

    @Override public Expression visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx) {
        BooleanParenNestedExpression bParenNested = new BooleanParenNestedExpression();
        bParenNested.ctx = ctx;
        bParenNested.value = visit(ctx.value);
        return bParenNested;
    }

    @Override public Expression visitBooleanTrue(LanguageParser.BooleanTrueContext ctx) { 
        BooleanTrueExpression bTrue = new BooleanTrueExpression();
        bTrue.ctx = ctx;
        return bTrue;
    }

    @Override public Expression visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx) {
        BooleanGreaterThanEqualsExpression bGreaterThanEquals = new BooleanGreaterThanEqualsExpression();
        bGreaterThanEquals.ctx = ctx;
        bGreaterThanEquals.lhs = visit(ctx.lhs);
        bGreaterThanEquals.rhs = visit(ctx.rhs);
        return bGreaterThanEquals;
    }

    @Override public Expression visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx) { 
        BooleanDoubleAndExpression bDoubleAnd = new BooleanDoubleAndExpression();
        bDoubleAnd.ctx = ctx;
        bDoubleAnd.lhs = visit(ctx.lhs);
        bDoubleAnd.rhs = visit(ctx.rhs);
        return bDoubleAnd;
    }

    @Override public Expression visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx) {
        BooleanLessThanEqualsExpression bLessThanEquals = new BooleanLessThanEqualsExpression();
        bLessThanEquals.ctx = ctx;
        bLessThanEquals.lhs = visit(ctx.lhs);
        bLessThanEquals.rhs = visit(ctx.rhs);
        return bLessThanEquals;
    }
}
