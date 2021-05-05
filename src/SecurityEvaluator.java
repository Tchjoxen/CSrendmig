import java.util.ArrayList;

public class SecurityEvaluator extends LanguageBaseVisitor<ArrayList<String>> {
	public SecurityAnalysisConfiguration _secConfig;
	
	public SecurityEvaluator(SecurityAnalysisConfiguration secConfig) {
		_secConfig = secConfig;
	}
    @Override public ArrayList<String> visitStart(LanguageParser.StartContext ctx) {
        return visit(ctx.command());
    }

    @Override public ArrayList<String> visitAssignment(LanguageParser.AssignmentContext ctx) {
    	SecurityConfig toConfig = _secConfig.FindConfigByVarName(ctx.x.getText());
    	ArrayList<String> rhs = visit(ctx.value);
    	
    	for(int i=0; i < rhs.size(); i++) {
    		SecurityConfig fromConfig = _secConfig.FindConfigByVarName(rhs.get(i));
    		_secConfig.AddFlow(new Flow(fromConfig, toConfig));
    	}
    	
    	rhs.clear();
    	rhs.add(toConfig.VarName);

    	
        return rhs;
    }

    @Override public ArrayList<String> visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx) { 

    	SecurityConfig toConfig = _secConfig.FindConfigByVarName(ctx.A.getText());
    	ArrayList<String> rhs = visit(ctx.value);
    	
    	for(int i=0; i < rhs.size(); i++) {
    		SecurityConfig fromConfig = _secConfig.FindConfigByVarName(rhs.get(i));
    		_secConfig.AddFlow(new Flow(fromConfig, toConfig));
    	}
    	
    	rhs.clear();
    	rhs.add(toConfig.VarName);

    	
        return rhs;
    }

    @Override public ArrayList<String> visitEndCommand(LanguageParser.EndCommandContext ctx) { 
    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitSkip(LanguageParser.SkipContext ctx) {

        return null;
    }

    @Override public ArrayList<String> visitDo(LanguageParser.DoContext ctx) { 

        return visit(ctx.guardedCommand);
    }

    @Override public ArrayList<String> visitIf(LanguageParser.IfContext ctx) { 

    	return visit(ctx.guardedCommand);
    }

    @Override
    public ArrayList<String> visitIFStatements(LanguageParser.IFStatementsContext ctx) {
    	
    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitIFCondition(LanguageParser.IFConditionContext ctx) {
    	
    	ArrayList<String> lhs = visit(ctx.condition);
    	ArrayList<String> rhs = visit(ctx.Command);
    	
    	for(int i=0; i < lhs.size(); i++) {
    		SecurityConfig fromConfig = _secConfig.FindConfigByVarName(lhs.get(i));
	    	for(int j=0; j < rhs.size(); j++) {
	    		SecurityConfig toConfig = _secConfig.FindConfigByVarName(rhs.get(j));
	    		_secConfig.AddFlow(new Flow(fromConfig, toConfig));
	    	}
    	}
    	
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitUPlusExpr(LanguageParser.UPlusExprContext ctx) {

    	ArrayList<String> e = visit(ctx.e);
        return e;
    }

    @Override
    public ArrayList<String> visitDivExpr(LanguageParser.DivExprContext ctx) {
    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitPlusExpr(LanguageParser.PlusExprContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitNumExpr(LanguageParser.NumExprContext ctx) { 
        return new ArrayList<String>();
     }

    @Override public ArrayList<String> visitPowExpr(LanguageParser.PowExprContext ctx) { 

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
     }

    @Override public ArrayList<String> visitVarExpr(LanguageParser.VarExprContext ctx) { 
    	
    	ArrayList<String> vari = new ArrayList<String>();
    	vari.add(ctx.x.getText());
        return vari;
    }

    @Override public ArrayList<String> visitNestedExpr(LanguageParser.NestedExprContext ctx) {         

    	ArrayList<String> value = visit(ctx.value);
        return value;
    }

    @Override
    public ArrayList<String> visitUMinusExpr(LanguageParser.UMinusExprContext ctx) {

    	ArrayList<String> e = visit(ctx.e);
        return e;
    }

    @Override
    public ArrayList<String> visitTimesExpr(LanguageParser.TimesExprContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitArrayA(LanguageParser.ArrayAContext ctx) {

    	ArrayList<String> vari = new ArrayList<String>();
    	vari.add(ctx.A.getText());
        return vari;
    }

    @Override
    public ArrayList<String> visitMinusExpr(LanguageParser.MinusExprContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitBooleanFalse(LanguageParser.BooleanFalseContext ctx) {
        return new ArrayList<String>();
    }

    @Override
    public ArrayList<String> visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitBooleanOr(LanguageParser.BooleanOrContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override
    public ArrayList<String> visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitBooleanAnd(LanguageParser.BooleanAndContext ctx) { 

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx) { 

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx) { 

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitBooleanNegation(LanguageParser.BooleanNegationContext ctx) { 

    	ArrayList<String> value = visit(ctx.value);
        return value;
    }

    @Override public ArrayList<String> visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;  
    }

    @Override public ArrayList<String> visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx) {


    	ArrayList<String> value = visit(ctx.value);
        return value;
    }

    @Override public ArrayList<String> visitBooleanTrue(LanguageParser.BooleanTrueContext ctx) { 
    	return new ArrayList<String>();
    }

    @Override public ArrayList<String> visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx) { 

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }

    @Override public ArrayList<String> visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx) {

    	ArrayList<String> lhs = visit(ctx.lhs);
    	ArrayList<String> rhs = visit(ctx.rhs);
    	lhs.removeAll(rhs);
    	lhs.addAll(rhs);
        return lhs;
    }
}
