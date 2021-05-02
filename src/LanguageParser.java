// Generated from /Users/tuxen/Documents/testo/src/Language.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		NUM=32, VAR=33, WS=34;
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_guardedcommand = 2, RULE_arithmetic = 3, 
		RULE_booleanoperation = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "command", "guardedcommand", "arithmetic", "booleanoperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'['", "']'", "';'", "'if '", "' fi'", "'do '", "' od'", 
			"'skip'", "'->'", "'[]'", "'/'", "'+'", "'*'", "'-'", "'^'", "'('", "')'", 
			"'true'", "'false'", "'!'", "'|'", "'||'", "'&'", "'&&'", "'='", "'!='", 
			"'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUM", "VAR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			command(0);
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public Token x;
		public ArithmeticContext value;
		public TerminalNode VAR() { return getToken(LanguageParser.VAR, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentToArrayContext extends CommandContext {
		public Token A;
		public ArithmeticContext index;
		public ArithmeticContext value;
		public TerminalNode VAR() { return getToken(LanguageParser.VAR, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public AssignmentToArrayContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignmentToArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignmentToArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignmentToArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndCommandContext extends CommandContext {
		public CommandContext lhs;
		public CommandContext rhs;
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public EndCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterEndCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitEndCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitEndCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends CommandContext {
		public SkipContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoContext extends CommandContext {
		public GuardedcommandContext guardedCommand;
		public GuardedcommandContext guardedcommand() {
			return getRuleContext(GuardedcommandContext.class,0);
		}
		public DoContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends CommandContext {
		public GuardedcommandContext guardedCommand;
		public GuardedcommandContext guardedcommand() {
			return getRuleContext(GuardedcommandContext.class,0);
		}
		public IfContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		return command(0);
	}

	private CommandContext command(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommandContext _localctx = new CommandContext(_ctx, _parentState);
		CommandContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_command, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(14);
				((AssignmentContext)_localctx).x = match(VAR);
				setState(15);
				match(T__0);
				setState(16);
				((AssignmentContext)_localctx).value = arithmetic(0);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentToArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				((AssignmentToArrayContext)_localctx).A = match(VAR);
				setState(18);
				match(T__1);
				setState(19);
				((AssignmentToArrayContext)_localctx).index = arithmetic(0);
				setState(20);
				match(T__2);
				setState(21);
				match(T__0);
				setState(22);
				((AssignmentToArrayContext)_localctx).value = arithmetic(0);
				}
				break;
			case 3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__4);
				setState(25);
				((IfContext)_localctx).guardedCommand = guardedcommand(0);
				setState(26);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new DoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(T__6);
				setState(29);
				((DoContext)_localctx).guardedCommand = guardedcommand(0);
				setState(30);
				match(T__7);
				}
				break;
			case 5:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EndCommandContext(new CommandContext(_parentctx, _parentState));
					((EndCommandContext)_localctx).lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_command);
					setState(35);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(36);
					match(T__3);
					setState(37);
					((EndCommandContext)_localctx).rhs = command(4);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GuardedcommandContext extends ParserRuleContext {
		public GuardedcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedcommand; }
	 
		public GuardedcommandContext() { }
		public void copyFrom(GuardedcommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IFStatementsContext extends GuardedcommandContext {
		public GuardedcommandContext lhs;
		public GuardedcommandContext rhs;
		public List<GuardedcommandContext> guardedcommand() {
			return getRuleContexts(GuardedcommandContext.class);
		}
		public GuardedcommandContext guardedcommand(int i) {
			return getRuleContext(GuardedcommandContext.class,i);
		}
		public IFStatementsContext(GuardedcommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIFStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIFStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIFStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFConditionContext extends GuardedcommandContext {
		public BooleanoperationContext condition;
		public CommandContext Command;
		public BooleanoperationContext booleanoperation() {
			return getRuleContext(BooleanoperationContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public IFConditionContext(GuardedcommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIFCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIFCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIFCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardedcommandContext guardedcommand() throws RecognitionException {
		return guardedcommand(0);
	}

	private GuardedcommandContext guardedcommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedcommandContext _localctx = new GuardedcommandContext(_ctx, _parentState);
		GuardedcommandContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_guardedcommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IFConditionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(44);
			((IFConditionContext)_localctx).condition = booleanoperation(0);
			setState(45);
			match(T__9);
			setState(46);
			((IFConditionContext)_localctx).Command = command(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IFStatementsContext(new GuardedcommandContext(_parentctx, _parentState));
					((IFStatementsContext)_localctx).lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_guardedcommand);
					setState(48);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(49);
					match(T__10);
					setState(50);
					((IFStatementsContext)_localctx).rhs = guardedcommand(2);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UPlusExprContext extends ArithmeticContext {
		public ArithmeticContext e;
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public UPlusExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterUPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitUPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitUPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends ArithmeticContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public DivExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ArithmeticContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public PlusExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ArithmeticContext {
		public Token n;
		public TerminalNode NUM() { return getToken(LanguageParser.NUM, 0); }
		public NumExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ArithmeticContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public PowExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ArithmeticContext {
		public Token x;
		public TerminalNode VAR() { return getToken(LanguageParser.VAR, 0); }
		public VarExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedExprContext extends ArithmeticContext {
		public ArithmeticContext value;
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public NestedExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNestedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UMinusExprContext extends ArithmeticContext {
		public ArithmeticContext e;
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public UMinusExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterUMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitUMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitUMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesExprContext extends ArithmeticContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TimesExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterTimesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitTimesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitTimesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAContext extends ArithmeticContext {
		public Token A;
		public ArithmeticContext index;
		public TerminalNode VAR() { return getToken(LanguageParser.VAR, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArrayAContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArrayA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArrayA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArrayA(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ArithmeticContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public MinusExprContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_arithmetic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				((NumExprContext)_localctx).n = match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				((VarExprContext)_localctx).x = match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((ArrayAContext)_localctx).A = match(VAR);
				setState(60);
				match(T__1);
				setState(61);
				((ArrayAContext)_localctx).index = arithmetic(0);
				setState(62);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__16);
				setState(65);
				((NestedExprContext)_localctx).value = arithmetic(0);
				setState(66);
				match(T__17);
				}
				break;
			case 5:
				{
				_localctx = new UPlusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(T__12);
				setState(69);
				((UPlusExprContext)_localctx).e = arithmetic(2);
				}
				break;
			case 6:
				{
				_localctx = new UMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(T__14);
				setState(71);
				((UMinusExprContext)_localctx).e = arithmetic(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new DivExprContext(new ArithmeticContext(_parentctx, _parentState));
						((DivExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(74);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(75);
						match(T__11);
						setState(76);
						((DivExprContext)_localctx).rhs = arithmetic(9);
						}
						break;
					case 2:
						{
						_localctx = new PlusExprContext(new ArithmeticContext(_parentctx, _parentState));
						((PlusExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(77);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(78);
						match(T__12);
						setState(79);
						((PlusExprContext)_localctx).rhs = arithmetic(8);
						}
						break;
					case 3:
						{
						_localctx = new TimesExprContext(new ArithmeticContext(_parentctx, _parentState));
						((TimesExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						match(T__13);
						setState(82);
						((TimesExprContext)_localctx).rhs = arithmetic(7);
						}
						break;
					case 4:
						{
						_localctx = new MinusExprContext(new ArithmeticContext(_parentctx, _parentState));
						((MinusExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(83);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(84);
						match(T__14);
						setState(85);
						((MinusExprContext)_localctx).rhs = arithmetic(6);
						}
						break;
					case 5:
						{
						_localctx = new PowExprContext(new ArithmeticContext(_parentctx, _parentState));
						((PowExprContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						match(T__15);
						setState(88);
						((PowExprContext)_localctx).rhs = arithmetic(4);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanoperationContext extends ParserRuleContext {
		public BooleanoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanoperation; }
	 
		public BooleanoperationContext() { }
		public void copyFrom(BooleanoperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanFalseContext extends BooleanoperationContext {
		public BooleanFalseContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanEqualsContext extends BooleanoperationContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public BooleanEqualsContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanOrContext extends BooleanoperationContext {
		public BooleanoperationContext lhs;
		public BooleanoperationContext rhs;
		public List<BooleanoperationContext> booleanoperation() {
			return getRuleContexts(BooleanoperationContext.class);
		}
		public BooleanoperationContext booleanoperation(int i) {
			return getRuleContext(BooleanoperationContext.class,i);
		}
		public BooleanOrContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDoubleOrContext extends BooleanoperationContext {
		public BooleanoperationContext lhs;
		public BooleanoperationContext rhs;
		public List<BooleanoperationContext> booleanoperation() {
			return getRuleContexts(BooleanoperationContext.class);
		}
		public BooleanoperationContext booleanoperation(int i) {
			return getRuleContext(BooleanoperationContext.class,i);
		}
		public BooleanDoubleOrContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanDoubleOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanDoubleOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanDoubleOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAndContext extends BooleanoperationContext {
		public BooleanoperationContext lhs;
		public BooleanoperationContext rhs;
		public List<BooleanoperationContext> booleanoperation() {
			return getRuleContexts(BooleanoperationContext.class);
		}
		public BooleanoperationContext booleanoperation(int i) {
			return getRuleContext(BooleanoperationContext.class,i);
		}
		public BooleanAndContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGreaterThanContext extends BooleanoperationContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public BooleanGreaterThanContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanNegationEqualsContext extends BooleanoperationContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public BooleanNegationEqualsContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanNegationEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanNegationEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanNegationEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanNegationContext extends BooleanoperationContext {
		public BooleanoperationContext value;
		public BooleanoperationContext booleanoperation() {
			return getRuleContext(BooleanoperationContext.class,0);
		}
		public BooleanNegationContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLessThanContext extends BooleanoperationContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public BooleanLessThanContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanParenNestedExpressionContext extends BooleanoperationContext {
		public BooleanoperationContext value;
		public BooleanoperationContext booleanoperation() {
			return getRuleContext(BooleanoperationContext.class,0);
		}
		public BooleanParenNestedExpressionContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanParenNestedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanParenNestedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanParenNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTrueContext extends BooleanoperationContext {
		public BooleanTrueContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGreaterThanEqualsContext extends BooleanoperationContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public BooleanGreaterThanEqualsContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanGreaterThanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanGreaterThanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanGreaterThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDoubleAndContext extends BooleanoperationContext {
		public BooleanoperationContext lhs;
		public BooleanoperationContext rhs;
		public List<BooleanoperationContext> booleanoperation() {
			return getRuleContexts(BooleanoperationContext.class);
		}
		public BooleanoperationContext booleanoperation(int i) {
			return getRuleContext(BooleanoperationContext.class,i);
		}
		public BooleanDoubleAndContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanDoubleAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanDoubleAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanDoubleAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLessThanEqualsContext extends BooleanoperationContext {
		public ArithmeticContext lhs;
		public ArithmeticContext rhs;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public BooleanLessThanEqualsContext(BooleanoperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanLessThanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanLessThanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanLessThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoperationContext booleanoperation() throws RecognitionException {
		return booleanoperation(0);
	}

	private BooleanoperationContext booleanoperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanoperationContext _localctx = new BooleanoperationContext(_ctx, _parentState);
		BooleanoperationContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_booleanoperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(95);
				match(T__18);
				}
				break;
			case 2:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(T__19);
				}
				break;
			case 3:
				{
				_localctx = new BooleanNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(T__20);
				setState(98);
				((BooleanNegationContext)_localctx).value = booleanoperation(12);
				}
				break;
			case 4:
				{
				_localctx = new BooleanEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				((BooleanEqualsContext)_localctx).lhs = arithmetic(0);
				setState(100);
				match(T__25);
				setState(101);
				((BooleanEqualsContext)_localctx).rhs = arithmetic(0);
				}
				break;
			case 5:
				{
				_localctx = new BooleanNegationEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				((BooleanNegationEqualsContext)_localctx).lhs = arithmetic(0);
				setState(104);
				match(T__26);
				setState(105);
				((BooleanNegationEqualsContext)_localctx).rhs = arithmetic(0);
				}
				break;
			case 6:
				{
				_localctx = new BooleanLessThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((BooleanLessThanContext)_localctx).lhs = arithmetic(0);
				setState(108);
				match(T__27);
				setState(109);
				((BooleanLessThanContext)_localctx).rhs = arithmetic(0);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLessThanEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				((BooleanLessThanEqualsContext)_localctx).lhs = arithmetic(0);
				setState(112);
				match(T__28);
				setState(113);
				((BooleanLessThanEqualsContext)_localctx).rhs = arithmetic(0);
				}
				break;
			case 8:
				{
				_localctx = new BooleanGreaterThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				((BooleanGreaterThanContext)_localctx).lhs = arithmetic(0);
				setState(116);
				match(T__29);
				setState(117);
				((BooleanGreaterThanContext)_localctx).rhs = arithmetic(0);
				}
				break;
			case 9:
				{
				_localctx = new BooleanGreaterThanEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				((BooleanGreaterThanEqualsContext)_localctx).lhs = arithmetic(0);
				setState(120);
				match(T__30);
				setState(121);
				((BooleanGreaterThanEqualsContext)_localctx).rhs = arithmetic(0);
				}
				break;
			case 10:
				{
				_localctx = new BooleanParenNestedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__16);
				setState(124);
				((BooleanParenNestedExpressionContext)_localctx).value = booleanoperation(0);
				setState(125);
				match(T__17);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanOrContext(new BooleanoperationContext(_parentctx, _parentState));
						((BooleanOrContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanoperation);
						setState(129);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(130);
						match(T__21);
						setState(131);
						((BooleanOrContext)_localctx).rhs = booleanoperation(12);
						}
						break;
					case 2:
						{
						_localctx = new BooleanDoubleOrContext(new BooleanoperationContext(_parentctx, _parentState));
						((BooleanDoubleOrContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanoperation);
						setState(132);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(133);
						match(T__22);
						setState(134);
						((BooleanDoubleOrContext)_localctx).rhs = booleanoperation(11);
						}
						break;
					case 3:
						{
						_localctx = new BooleanAndContext(new BooleanoperationContext(_parentctx, _parentState));
						((BooleanAndContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanoperation);
						setState(135);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(136);
						match(T__23);
						setState(137);
						((BooleanAndContext)_localctx).rhs = booleanoperation(10);
						}
						break;
					case 4:
						{
						_localctx = new BooleanDoubleAndContext(new BooleanoperationContext(_parentctx, _parentState));
						((BooleanDoubleAndContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanoperation);
						setState(138);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(139);
						match(T__24);
						setState(140);
						((BooleanDoubleAndContext)_localctx).rhs = booleanoperation(9);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return command_sempred((CommandContext)_localctx, predIndex);
		case 2:
			return guardedcommand_sempred((GuardedcommandContext)_localctx, predIndex);
		case 3:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		case 4:
			return booleanoperation_sempred((BooleanoperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean command_sempred(CommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean guardedcommand_sempred(GuardedcommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanoperation_sempred(BooleanoperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\3\3\3"+
		"\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\66\n"+
		"\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\6\2\6\4\6\b"+
		"\n\7\2\4\6\b\n\2\2\2\u00ac\2\f\3\2\2\2\4#\3\2\2\2\6-\3\2\2\2\bJ\3\2\2"+
		"\2\n\u0081\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17\20\b\3\1\2"+
		"\20\21\7#\2\2\21\22\7\3\2\2\22$\5\b\5\2\23\24\7#\2\2\24\25\7\4\2\2\25"+
		"\26\5\b\5\2\26\27\7\5\2\2\27\30\7\3\2\2\30\31\5\b\5\2\31$\3\2\2\2\32\33"+
		"\7\7\2\2\33\34\5\6\4\2\34\35\7\b\2\2\35$\3\2\2\2\36\37\7\t\2\2\37 \5\6"+
		"\4\2 !\7\n\2\2!$\3\2\2\2\"$\7\13\2\2#\17\3\2\2\2#\23\3\2\2\2#\32\3\2\2"+
		"\2#\36\3\2\2\2#\"\3\2\2\2$*\3\2\2\2%&\f\6\2\2&\'\7\6\2\2\')\5\4\3\6(%"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-.\b\4\1\2"+
		"./\5\n\6\2/\60\7\f\2\2\60\61\5\4\3\2\61\67\3\2\2\2\62\63\f\3\2\2\63\64"+
		"\7\r\2\2\64\66\5\6\4\4\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28\7\3\2\2\29\67\3\2\2\2:;\b\5\1\2;K\7\"\2\2<K\7#\2\2=>\7#\2\2>?\7"+
		"\4\2\2?@\5\b\5\2@A\7\5\2\2AK\3\2\2\2BC\7\23\2\2CD\5\b\5\2DE\7\24\2\2E"+
		"K\3\2\2\2FG\7\17\2\2GK\5\b\5\4HI\7\21\2\2IK\5\b\5\3J:\3\2\2\2J<\3\2\2"+
		"\2J=\3\2\2\2JB\3\2\2\2JF\3\2\2\2JH\3\2\2\2K]\3\2\2\2LM\f\n\2\2MN\7\16"+
		"\2\2N\\\5\b\5\13OP\f\t\2\2PQ\7\17\2\2Q\\\5\b\5\nRS\f\b\2\2ST\7\20\2\2"+
		"T\\\5\b\5\tUV\f\7\2\2VW\7\21\2\2W\\\5\b\5\bXY\f\6\2\2YZ\7\22\2\2Z\\\5"+
		"\b\5\6[L\3\2\2\2[O\3\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2]["+
		"\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\b\6\1\2a\u0082\7\25\2\2b\u0082"+
		"\7\26\2\2cd\7\27\2\2d\u0082\5\n\6\16ef\5\b\5\2fg\7\34\2\2gh\5\b\5\2h\u0082"+
		"\3\2\2\2ij\5\b\5\2jk\7\35\2\2kl\5\b\5\2l\u0082\3\2\2\2mn\5\b\5\2no\7\36"+
		"\2\2op\5\b\5\2p\u0082\3\2\2\2qr\5\b\5\2rs\7\37\2\2st\5\b\5\2t\u0082\3"+
		"\2\2\2uv\5\b\5\2vw\7 \2\2wx\5\b\5\2x\u0082\3\2\2\2yz\5\b\5\2z{\7!\2\2"+
		"{|\5\b\5\2|\u0082\3\2\2\2}~\7\23\2\2~\177\5\n\6\2\177\u0080\7\24\2\2\u0080"+
		"\u0082\3\2\2\2\u0081`\3\2\2\2\u0081b\3\2\2\2\u0081c\3\2\2\2\u0081e\3\2"+
		"\2\2\u0081i\3\2\2\2\u0081m\3\2\2\2\u0081q\3\2\2\2\u0081u\3\2\2\2\u0081"+
		"y\3\2\2\2\u0081}\3\2\2\2\u0082\u0091\3\2\2\2\u0083\u0084\f\r\2\2\u0084"+
		"\u0085\7\30\2\2\u0085\u0090\5\n\6\16\u0086\u0087\f\f\2\2\u0087\u0088\7"+
		"\31\2\2\u0088\u0090\5\n\6\r\u0089\u008a\f\13\2\2\u008a\u008b\7\32\2\2"+
		"\u008b\u0090\5\n\6\f\u008c\u008d\f\n\2\2\u008d\u008e\7\33\2\2\u008e\u0090"+
		"\5\n\6\13\u008f\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2"+
		"\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\13\3\2\2\2\u0093\u0091\3\2\2\2\13#*\67J[]\u0081\u008f\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}