// We need to import a couple of ANLTR modules
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Language {

	// The main function just instantiates our language and runs it.
	public static void main(String args[]) throws Exception {
        

		//try {

		//	Language c = new Language();
		//	c.run();
		//}

		//catch (Exception e)
		//{
		//	e.printStackTrace ();
		//}
        Language c = new Language();
        c.run();
	}


	// The run function will interact with us through the console
	// asking for arithmetic expressions and returning their value
	public void run() throws Exception {

		// We instantiate an evaluator of arithmetic expressions
		// stored in an visitor-based AST
        GeneratedAST generatedAST = new GeneratedAST();
        GeneratedPG LGP = new GeneratedPG();
        Scanner scanner = new Scanner(System.in);

		while (true) {
			// Read an expression from the console
			System.out.print("Enter an arithmetic expression: ");
			String input = scanner.nextLine();
            // System.out.println("Count:");
            // int count = Integer.parseInt(System.console().readLine());
            System.out.println("Abstract Variable definitions:");
            String variables = scanner.nextLine();
            
            
            
            HashMap<String, Double> vari = new HashMap<>();
            String[] var = variables.split(",");
            
			// Build the parser for the content of the input in several steps

			// Translate the input string into stream of characters 
			CharStream inputStream = CharStreams.fromString(input);

			// Create a lexer for the CharStream
			LanguageLexer lex = new LanguageLexer(inputStream);

			// Use the lexer to generate the token stream
			CommonTokenStream tokens = new CommonTokenStream(lex);

			// Create a parser for the given token stream
            LanguageParser parser = new LanguageParser(tokens);
            
            

            // System.out.println(generatedAST.visit(parser.start()));
            ArrayList<Edge> edges = LGP.getProgramGraph(parser);

            for (Edge e : edges) {
                System.out.println(e.GetPGElement());
            }

            ArrayList<VarKonfig> varKonfigs1 = new ArrayList<VarKonfig>();
            for (String s : var){
                VarKonfig vk = new VarKonfig();
                String[] v = s.split("=");
                vk.varname = v[0];
                if (v[1].equals("-")) {
                    vk.minus = true;
                }
                if (v[1].equals("+")){
                    vk.plus = true;
                }
                if (v[1].equals("0")){
                    vk.zero = true;
                }
                varKonfigs1.add(vk);
            }
            
            
           
            SignAnalyzer SA = new SignAnalyzer(varKonfigs1, edges);
            
            System.out.println(SA.Analyze());

		}
	}



	public class GeneratedAST extends LanguageBaseVisitor<String> {
        @Override public String visitStart(LanguageParser.StartContext ctx) { 
            return "Start: [" + visit(ctx.command()) + "]"; 
        }

        @Override public String visitAssignment(LanguageParser.AssignmentContext ctx) { 
            return "Assignment: [" + ctx.x.getText() + "," + visit(ctx.value) + "]"; 
        }

        @Override public String visitAssignmentToArray(LanguageParser.AssignmentToArrayContext ctx) { 
            return "AssignmentToArray: [" + ctx.A.getText() + "],[" + visit(ctx.value) + "]"; 
        }

        @Override public String visitEndCommand(LanguageParser.EndCommandContext ctx) { 
            return "EndCommand: [" + visit(ctx.lhs)+ ","+ visit(ctx.rhs) + "]"; 
        }

        @Override public String visitSkip(LanguageParser.SkipContext ctx) { 
            return "skip"; 
        }

        @Override public String visitDo(LanguageParser.DoContext ctx) { 
            return "do: [" + visit(ctx.guardedCommand) + "]"; 
        }

        @Override public String visitIf(LanguageParser.IfContext ctx) { 
            return "if: [" + visit(ctx.guardedCommand) + "]";
        }
	
        @Override
        public String visitIFStatements(LanguageParser.IFStatementsContext ctx) {
            return "IFStatements: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }

        @Override
        public String visitIFCondition(LanguageParser.IFConditionContext ctx) {
            return "IFCondition: [" + visit(ctx.condition) + ", " + visit(ctx.Command) + "]";
        }

        @Override
        public String visitUPlusExpr(LanguageParser.UPlusExprContext ctx) {
            return "UPlusExpr: [" + visit(ctx.e) + "]";
        }

        @Override
        public String visitDivExpr(LanguageParser.DivExprContext ctx) {
            return "DivExpr: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }

        @Override
        public String visitPlusExpr(LanguageParser.PlusExprContext ctx) {
            return "PlusExpr: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }
	
	    @Override public String visitNumExpr(LanguageParser.NumExprContext ctx) { return "NumExpr: [" + ctx.n.getText() + "]"; }
	
	    @Override public String visitPowExpr(LanguageParser.PowExprContext ctx) { return "PowExprContext: ["+ visit(ctx.lhs) + ", " + visit(ctx.rhs)+"]"; }
	
	    @Override public String visitVarExpr(LanguageParser.VarExprContext ctx) { return "VarExprContext: [" + ctx.x.getText()+ "]";}
	
	    @Override public String visitNestedExpr(LanguageParser.NestedExprContext ctx) { return "NestedExpression: [" + visit(ctx.arithmetic()) + "]"; }
	
	    @Override
        public String visitUMinusExpr(LanguageParser.UMinusExprContext ctx) {
            return "UMinusExpr: [" + visit(ctx.e) + "]";
        }

        @Override
        public String visitTimesExpr(LanguageParser.TimesExprContext ctx) {
            return "TimesExpr: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }

        @Override
        public String visitArrayA(LanguageParser.ArrayAContext ctx) {
            return "ArrayA: [" + ctx.A.getText() + ", " + visit(ctx.index) + "]";
        }

        @Override
        public String visitMinusExpr(LanguageParser.MinusExprContext ctx) {
            return "MinusExpr: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }

        @Override
        public String visitBooleanFalse(LanguageParser.BooleanFalseContext ctx) {
            return "BooleanFalse: [" + String.valueOf(ctx.getText()) + "]";
        }

        @Override
        public String visitBooleanEquals(LanguageParser.BooleanEqualsContext ctx) {
            return "BooleanEquals: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }

        @Override
        public String visitBooleanOr(LanguageParser.BooleanOrContext ctx) {
            return "BooleanOr: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }

        @Override
        public String visitBooleanDoubleOr(LanguageParser.BooleanDoubleOrContext ctx) {
            return "BooleanDoubleOr: [" + visit(ctx.lhs) + ", " + visit(ctx.rhs) + "]";
        }
	
	    @Override public String visitBooleanAnd(LanguageParser.BooleanAndContext ctx) { return "BooleanAnd: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	
	    @Override public String visitBooleanGreaterThan(LanguageParser.BooleanGreaterThanContext ctx) { return "BooleanGreaterThan: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	
	    @Override public String visitBooleanNegationEquals(LanguageParser.BooleanNegationEqualsContext ctx) { return "BooleanNegationEquals: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	
	    @Override public String visitBooleanNegation(LanguageParser.BooleanNegationContext ctx) {return "BooleanNegation: [" + ctx.value + "]"; }
	
	    @Override public String visitBooleanLessThan(LanguageParser.BooleanLessThanContext ctx) { return "BooleanLessThan: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	
	    @Override public String visitBooleanParenNestedExpression(LanguageParser.BooleanParenNestedExpressionContext ctx) { return "BooleanParenNestedExpression: [" + ctx.value + "]"; }
	
	    @Override public String visitBooleanTrue(LanguageParser.BooleanTrueContext ctx) { return "BooleanTrue: ["+ ctx.getText() + "]"; }
	
	    @Override public String visitBooleanGreaterThanEquals(LanguageParser.BooleanGreaterThanEqualsContext ctx) { return "BooleanGreaterThanEquals: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	
	    @Override public String visitBooleanDoubleAnd(LanguageParser.BooleanDoubleAndContext ctx) { return "BooleanDoubleAnd: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	
    	@Override public String visitBooleanLessThanEquals(LanguageParser.BooleanLessThanEqualsContext ctx) { return "BooleanLessThanEquals: ["+visit(ctx.lhs)+"],["+visit(ctx.rhs)+"]"; }
	}


}


