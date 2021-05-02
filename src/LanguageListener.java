// Generated from /Users/tuxen/Documents/testo/src/Language.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentToArray}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentToArray}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndCommand}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterEndCommand(LanguageParser.EndCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndCommand}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitEndCommand(LanguageParser.EndCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSkip(LanguageParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSkip(LanguageParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Do}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDo(LanguageParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Do}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDo(LanguageParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIf(LanguageParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIf(LanguageParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFStatements}
	 * labeled alternative in {@link LanguageParser#guardedcommand}.
	 * @param ctx the parse tree
	 */
	void enterIFStatements(LanguageParser.IFStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFStatements}
	 * labeled alternative in {@link LanguageParser#guardedcommand}.
	 * @param ctx the parse tree
	 */
	void exitIFStatements(LanguageParser.IFStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFCondition}
	 * labeled alternative in {@link LanguageParser#guardedcommand}.
	 * @param ctx the parse tree
	 */
	void enterIFCondition(LanguageParser.IFConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFCondition}
	 * labeled alternative in {@link LanguageParser#guardedcommand}.
	 * @param ctx the parse tree
	 */
	void exitIFCondition(LanguageParser.IFConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UPlusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterUPlusExpr(LanguageParser.UPlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UPlusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitUPlusExpr(LanguageParser.UPlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(LanguageParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(LanguageParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(LanguageParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(LanguageParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(LanguageParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(LanguageParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(LanguageParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(LanguageParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(LanguageParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(LanguageParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(LanguageParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(LanguageParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UMinusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterUMinusExpr(LanguageParser.UMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UMinusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitUMinusExpr(LanguageParser.UMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr(LanguageParser.TimesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr(LanguageParser.TimesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayA}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArrayA(LanguageParser.ArrayAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayA}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArrayA(LanguageParser.ArrayAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(LanguageParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(LanguageParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanFalse}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanFalse}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEquals(LanguageParser.BooleanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEquals(LanguageParser.BooleanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanOr}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOr(LanguageParser.BooleanOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanOr}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOr(LanguageParser.BooleanOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanDoubleOr}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDoubleOr}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanAnd}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAnd(LanguageParser.BooleanAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanAnd}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAnd(LanguageParser.BooleanAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanGreaterThan}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanGreaterThan}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanNegationEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanNegationEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanNegation}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNegation(LanguageParser.BooleanNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanNegation}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNegation(LanguageParser.BooleanNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLessThan}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLessThan(LanguageParser.BooleanLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLessThan}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanParenNestedExpression}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanParenNestedExpression}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanTrue}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrue(LanguageParser.BooleanTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanTrue}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrue(LanguageParser.BooleanTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanGreaterThanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanGreaterThanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanDoubleAnd}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDoubleAnd}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLessThanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLessThanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx);
}