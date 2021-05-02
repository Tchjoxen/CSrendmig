// Generated from /Users/tuxen/Documents/testo/src/Language.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentToArray}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndCommand}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndCommand(LanguageParser.EndCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(LanguageParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Do}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(LanguageParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link LanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LanguageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFStatements}
	 * labeled alternative in {@link LanguageParser#guardedcommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFStatements(LanguageParser.IFStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFCondition}
	 * labeled alternative in {@link LanguageParser#guardedcommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFCondition(LanguageParser.IFConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UPlusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUPlusExpr(LanguageParser.UPlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(LanguageParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(LanguageParser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(LanguageParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(LanguageParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(LanguageParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(LanguageParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UMinusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUMinusExpr(LanguageParser.UMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesExpr(LanguageParser.TimesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayA}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayA(LanguageParser.ArrayAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link LanguageParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(LanguageParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanFalse}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalse(LanguageParser.BooleanFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanOr}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOr(LanguageParser.BooleanOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanDoubleOr}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanAnd}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAnd(LanguageParser.BooleanAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanGreaterThan}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanNegationEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanNegation}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNegation(LanguageParser.BooleanNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLessThan}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanParenNestedExpression}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanTrue}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTrue(LanguageParser.BooleanTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanGreaterThanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanDoubleAnd}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLessThanEquals}
	 * labeled alternative in {@link LanguageParser#booleanoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx);
}