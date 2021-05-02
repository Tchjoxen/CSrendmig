import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class intepreter {
	int count;
	boolean terminated = false;
	public static HashMap<String, Double> Variables = new HashMap<>();

	public intepreter(int count, HashMap<String,Double> variables)
	{
		this.count = count;
		Variables = variables;
	}

	public String intepret(ArrayList<Edge> edges)
	{
		int index = 0;
		
		Node currentNode = edges.get(0).Prev;

		while(terminated == false && index < count)
		{
			terminated = true;

			for (Edge edge : edges
				 ) {
				if(edge.Prev == currentNode)
				{
					if(TryExecute(edge)){
						currentNode = edge.Next;
						index ++;
						terminated = false;
					}
				}
			}
		}

		String out = "Count: " + count + "\n"+
				"Status: terminated" + "\n"+
				"Node: " + currentNode.Name + "\n";



		for (Map.Entry<String, Double> v : Variables.entrySet()){
			out += v.getKey()+ "=" + v.getValue() + "\n";
		}		
		// variables.forEach((k,v) -> return out + k + " = " + v + "\n");
		
		return out;
	}

	private boolean TryExecute(Edge edge)
	{
		arithmetic ar = new arithmetic();
		boolEval be = new boolEval();

		if(edge.Label.Type() == "Assignment")
    	{
		AssignmentExpression asgnexp = (AssignmentExpression) edge.Label;
        Double eval = ar.visit(asgnexp.ctx.value);
        Variables.put(asgnexp.x, eval);
		return true;
		}
		else if (edge.Label.Type() == "SkipExpression") {
			return true;            
        }
        else if(edge.Label.Type() == "AssignmentToArray"){
            
        }
		else if(edge.Label.Type() == "false"){
			BooleanFalseExpression bfe = (BooleanFalseExpression) edge.Label;
			
			return false;
		}
		else if (edge.Label.Type() == "true") {
			return true;
		}
		else if (edge.Label.Type() == "!=") {
			BooleanNegationEqualsExpression bnee = (BooleanNegationEqualsExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "!") {
			BooleanNegationExpression bnee = (BooleanNegationExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "|") {
			BooleanOrExpression bnee = (BooleanOrExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "||") {
			BooleanDoubleOrExpression bnee = (BooleanDoubleOrExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "&") {
			BooleanAndExpression bnee = (BooleanAndExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "&&") {
			BooleanDoubleAndExpression bnee = (BooleanDoubleAndExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "=") {
			BooleanEqualsExpression bnee = (BooleanEqualsExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "<") {
			BooleanLessThanExpression bnee = (BooleanLessThanExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "<=") {
			BooleanLessThanEqualsExpression bnee = (BooleanLessThanEqualsExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == ">") {
			BooleanGreaterThanExpression  bnee = (BooleanGreaterThanExpression ) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == ">=") {
			BooleanGreaterThanEqualsExpression bnee = (BooleanGreaterThanEqualsExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		else if (edge.Label.Type() == "()") {
			BooleanParenNestedExpression bnee = (BooleanParenNestedExpression) edge.Label;
			return be.visit(bnee.ctx);
		}
		return false;
	}


}

class arithmetic extends LanguageBaseVisitor<Double> {
	    @Override public Double visitStart(LanguageParser.StartContext ctx) {
	        return 0.0;
	    }

	    @Override public Double visitAssignment(LanguageParser.AssignmentContext ctx) {
	    	return 0.0;
	    }

	    @Override public Double visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitEndCommand(LanguageParser.EndCommandContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitSkip(LanguageParser.SkipContext ctx) {
	    	return 0.0;
	    }

	    @Override public Double visitDo(LanguageParser.DoContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitIf(LanguageParser.IfContext ctx) { 
	    	return 0.0;
	    }

	    @Override
	    public Double visitIFStatements(LanguageParser.IFStatementsContext ctx) {
	    	return 0.0;
	    }

	    @Override
	    public Double visitIFCondition(LanguageParser.IFConditionContext ctx) {
	    	return 0.0;
	    }

	    @Override
	    public Double visitUPlusExpr(LanguageParser.UPlusExprContext ctx) {
	        return visit(ctx.e);
	    }

	    @Override
	    public Double visitDivExpr(LanguageParser.DivExprContext ctx) {
	        return visit(ctx.lhs)/visit(ctx.rhs);
	    }

	    @Override
	    public Double visitPlusExpr(LanguageParser.PlusExprContext ctx) {
	    	return visit(ctx.lhs) + visit(ctx.rhs);
	    }

	    @Override public Double visitNumExpr(LanguageParser.NumExprContext ctx) { 
	    	return Double.valueOf(ctx.n.getText());
	     }

	    @Override public Double visitPowExpr(LanguageParser.PowExprContext ctx) { 
	    	return (Math.pow(visit(ctx.lhs),visit(ctx.rhs)));
	     }

	    @Override public Double visitVarExpr(LanguageParser.VarExprContext ctx) { 
			return intepreter.Variables.get(ctx.x.getText());
	    }

	    @Override public Double visitNestedExpr(LanguageParser.NestedExprContext ctx) {         
	    	return visit(ctx.value);
	    }

	    @Override
	    public Double visitUMinusExpr(LanguageParser.UMinusExprContext ctx) {
	        return - visit(ctx.e);
	    }

	    @Override
	    public Double visitTimesExpr(LanguageParser.TimesExprContext ctx) {
	        return visit(ctx.lhs) * visit(ctx.rhs);
	    }

	    @Override
	    public Double visitArrayA(LanguageParser.ArrayAContext ctx) {
	        return 0.0;
	    }

	    @Override
	    public Double visitMinusExpr(LanguageParser.MinusExprContext ctx) {
	    	return visit(ctx.lhs) - visit(ctx.rhs);
	    }

	    @Override
	    public Double visitBooleanFalse(LanguageParser.BooleanFalseContext ctx) {
	    	return 0.0;
	    }

	    @Override
	    public Double visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx) {
	    	return 0.0;
	    }

	    @Override
	    public Double visitBooleanOr(LanguageParser.BooleanOrContext ctx) {
	    	//_Det her er arithmetic function og skal fixes i g filen
	    	return 0.0;
	    }

	    @Override
	    public Double visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx) {
	    	return 0.0;
	    }

	    @Override public Double visitBooleanAnd(LanguageParser.BooleanAndContext ctx) { 
	    	//_Det her er arithmetic function og skal fixes i g filen
	    	return 0.0;
	    }

	    @Override public Double visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitBooleanNegation(LanguageParser.BooleanNegationContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx) {
	    	return 0.0;  
	    }

	    @Override public Double visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx) {
	    	return 0.0;
	    }

	    @Override public Double visitBooleanTrue(LanguageParser.BooleanTrueContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx) {
	    	return 0.0;
	    }

	    @Override public Double visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx) { 
	    	return 0.0;
	    }

	    @Override public Double visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx) {
	    	return 0.0;
	    }
}
 
class boolEval extends LanguageBaseVisitor<Boolean> {
	    @Override public Boolean visitStart(LanguageParser.StartContext ctx) {
	        return false;
	    }

	    @Override public Boolean visitAssignment(LanguageParser.AssignmentContext ctx) {
	    	return false;
	    }

	    @Override public Boolean visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx) { 
	    	return false;
	    }

	    @Override public Boolean visitEndCommand(LanguageParser.EndCommandContext ctx) { 
	    	return false;
	    }

	    @Override public Boolean visitSkip(LanguageParser.SkipContext ctx) {
	    	return false;
	    }

	    @Override public Boolean visitDo(LanguageParser.DoContext ctx) { 
	    	return false;
	    }

	    @Override public Boolean visitIf(LanguageParser.IfContext ctx) { 
	    	return false;
	    }

	    @Override
	    public Boolean visitIFStatements(LanguageParser.IFStatementsContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitIFCondition(LanguageParser.IFConditionContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitUPlusExpr(LanguageParser.UPlusExprContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitDivExpr(LanguageParser.DivExprContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitPlusExpr(LanguageParser.PlusExprContext ctx) {
	    	return false;
	    }

	    @Override public Boolean visitNumExpr(LanguageParser.NumExprContext ctx) { 
	    	return false;
	     }

	    @Override public Boolean visitPowExpr(LanguageParser.PowExprContext ctx) { 
	        return false;
	     }

	    @Override public Boolean visitVarExpr(LanguageParser.VarExprContext ctx) { 
	    	return false;
	    }

	    @Override public Boolean visitNestedExpr(LanguageParser.NestedExprContext ctx) {         
	    	return false;
	    }

	    @Override
	    public Boolean visitUMinusExpr(LanguageParser.UMinusExprContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitTimesExpr(LanguageParser.TimesExprContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitArrayA(LanguageParser.ArrayAContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitMinusExpr(LanguageParser.MinusExprContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitBooleanFalse(LanguageParser.BooleanFalseContext ctx) {
	        return false;
	    }

	    @Override
	    public Boolean visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx) {
	        arithmetic a = new arithmetic();
	        return a.visit(ctx.lhs) == a.visit(ctx.rhs);
	    }

	    @Override
	    public Boolean visitBooleanOr(LanguageParser.BooleanOrContext ctx) {
	    	return false;
	    }

	    @Override
	    public Boolean visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx) {
	        return visit(ctx.lhs) || visit(ctx.rhs);
	    }

	    @Override public Boolean visitBooleanAnd(LanguageParser.BooleanAndContext ctx) { 
	    	return false;
	    }

	    @Override public Boolean visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx) { 
	    	arithmetic a = new arithmetic();
	        return a.visit(ctx.lhs) > a.visit(ctx.rhs);
	    }

	    @Override public Boolean visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx) { 
	    	arithmetic a = new arithmetic();
	        return a.visit(ctx.lhs) != a.visit(ctx.rhs);
	    }

	    @Override public Boolean visitBooleanNegation(LanguageParser.BooleanNegationContext ctx) { 
	        return !visit(ctx.value);
	    }

	    @Override public Boolean visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx) {
	    	arithmetic a = new arithmetic();
	        return a.visit(ctx.lhs) < a.visit(ctx.rhs);  
	    }

	    @Override public Boolean visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx) {
	        return visit(ctx.value);
	    }

	    @Override public Boolean visitBooleanTrue(LanguageParser.BooleanTrueContext ctx) { 
	        return true;
	    }

	    @Override public Boolean visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx) {
	    	arithmetic a = new arithmetic();
	        return a.visit(ctx.lhs) >= a.visit(ctx.rhs);
	    }

	    @Override public Boolean visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx) { 
	    	arithmetic a = new arithmetic();
	        return visit(ctx.lhs) && visit(ctx.rhs);
	    }

	    @Override public Boolean visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx) {
	    	arithmetic a = new arithmetic();
	        return a.visit(ctx.lhs) <= a.visit(ctx.rhs);
	    }
}