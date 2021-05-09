import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StuckEvaluator {
	public static HashMap<String, Double> Variables = new HashMap<>();

	public StuckEvaluator(HashMap<String,Double> initialVariables)
	{
		Variables = initialVariables;
	}

	public void stuckEval(ArrayList<Edge> edges)
	{
		ArrayList<State> toExplore = new ArrayList<State>();
		ArrayList<State> visited = new ArrayList<State>();
	
		
		toExplore.add(new State(edges.get(0).Prev, (HashMap<String, Double>) Variables.clone()));

		while(!toExplore.isEmpty())
		{
			State currentState = toExplore.get(0);
			Variables = currentState.config;
			boolean terminated = true;
			
			for (Edge edge : edges) {
				if(edge.Prev == currentState.node)
				{
					if(TryExecute(edge)){
						toExplore.add(new State(edge.Next, (HashMap<String, Double>) Variables.clone()));
						terminated = false;
					}
				}
			}
			visited.add(currentState);
			toExplore.remove(currentState);
			
			if(terminated) {
				System.out.println("");
				System.out.print("Terminated at node: " + currentState.node.Name + " with the config: ");
				for (Map.Entry<String, Double> v : Variables.entrySet()){
        			System.out.print(v.getKey() + " = " + v.getValue() + ", ");
        		}	
			}
		}
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
