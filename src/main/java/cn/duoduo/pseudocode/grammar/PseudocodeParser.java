// Generated from java-escape by ANTLR 4.11.1
package cn.duoduo.pseudocode.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PseudocodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, STRING=55, CHAR=56, NAME=57, NEWLINE=58, INT=59;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_stat = 2, RULE_funcDefineParams = 3, 
		RULE_declare = 4, RULE_expr = 5, RULE_functionCall = 6, RULE_var = 7, 
		RULE_varSuffix = 8, RULE_args = 9, RULE_exprlist = 10, RULE_datatype = 11, 
		RULE_arrayLengthDefine = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "stat", "funcDefineParams", "declare", "expr", "functionCall", 
			"var", "varSuffix", "args", "exprlist", "datatype", "arrayLengthDefine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'THEN'", "'ENDIF'", "'FUNCTION'", "'RETURNS'", "'ENDFUNCTION'", 
			"'PROCEDURE'", "'ENDPROCEDURE'", "'FOR'", "'<-'", "'TO'", "'STEP'", "'NEXT'", 
			"'REPEAT'", "'UNTIL'", "'WHILE'", "'ENDWHILE'", "'OUTPUT'", "'INPUT'", 
			"'TYPE'", "'='", "'^'", "'('", "','", "')'", "'ENDTYPE'", "'CALL'", "'CONSTANT'", 
			"':'", "'DECLARE'", "'TRUE'", "'FALSE'", "'>'", "'<'", "'>='", "'<='", 
			"'<>'", "'+'", "'-'", "'*'", "'/'", "'AND'", "'OR'", "'NOT'", "'['", 
			"']'", "'.'", "'ARRAY'", "'OF'", "'INTEGER'", "'STRING'", "'REAL'", "'CHAR'", 
			"'BOOLEAN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING", "CHAR", "NAME", "NEWLINE", 
			"INT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudocodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PseudocodeParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			block();
			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 144115189554168466L) != 0) {
				{
				{
				setState(29);
				stat();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineProcContext extends StatContext {
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public FuncDefineParamsContext funcDefineParams() {
			return getRuleContext(FuncDefineParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefineProcContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDefineProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDefineProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDefineProc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends StatContext {
		public List<TerminalNode> NAME() { return getTokens(PseudocodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PseudocodeParser.NAME, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareVariableContext extends StatContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public DeclareVariableContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDeclareVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDeclareVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDeclareVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareConstantContext extends StatContext {
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareConstantContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDeclareConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDeclareConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDeclareConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinePointerTypeContext extends StatContext {
		public Token name;
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public DefinePointerTypeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDefinePointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDefinePointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDefinePointerType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends StatContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineEnumContext extends StatContext {
		public Token name;
		public List<TerminalNode> NAME() { return getTokens(PseudocodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PseudocodeParser.NAME, i);
		}
		public DefineEnumContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDefineEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDefineEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDefineEnum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends StatContext {
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public InputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatLoopContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends StatContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public OutputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineUserTypeContext extends StatContext {
		public Token name;
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public DefineUserTypeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDefineUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDefineUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDefineUserType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineFunctionContext extends StatContext {
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public FuncDefineParamsContext funcDefineParams() {
			return getRuleContext(FuncDefineParamsContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefineFunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDefineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDefineFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDefineFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends StatContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallFunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallProsudureContext extends StatContext {
		public Token name;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public CallProsudureContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterCallProsudure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitCallProsudure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitCallProsudure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(T__0);
				setState(36);
				expr(0);
				setState(37);
				match(T__1);
				setState(38);
				block();
				setState(39);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new DefineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__3);
				setState(42);
				match(NAME);
				setState(43);
				funcDefineParams();
				setState(44);
				match(T__4);
				setState(45);
				datatype();
				setState(46);
				block();
				setState(47);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new DefineProcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__6);
				setState(50);
				match(NAME);
				setState(51);
				funcDefineParams();
				setState(52);
				block();
				setState(53);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(T__8);
				setState(56);
				match(NAME);
				setState(57);
				match(T__9);
				setState(58);
				expr(0);
				setState(59);
				match(T__10);
				setState(60);
				expr(0);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(61);
					match(T__11);
					setState(62);
					expr(0);
					}
				}

				setState(65);
				block();
				setState(66);
				match(T__12);
				setState(67);
				match(NAME);
				}
				break;
			case 5:
				_localctx = new RepeatLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(T__13);
				setState(70);
				block();
				setState(71);
				match(T__14);
				setState(72);
				expr(0);
				}
				break;
			case 6:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__15);
				setState(75);
				expr(0);
				setState(76);
				block();
				setState(77);
				match(T__16);
				}
				break;
			case 7:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(T__17);
				setState(80);
				exprlist();
				}
				break;
			case 8:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(T__18);
				setState(82);
				match(NAME);
				}
				break;
			case 9:
				_localctx = new DefinePointerTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				match(T__19);
				setState(84);
				((DefinePointerTypeContext)_localctx).name = match(NAME);
				setState(85);
				match(T__20);
				setState(86);
				match(T__21);
				setState(87);
				datatype();
				}
				break;
			case 10:
				_localctx = new DefineEnumContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				match(T__19);
				setState(89);
				((DefineEnumContext)_localctx).name = match(NAME);
				setState(90);
				match(T__22);
				setState(91);
				match(NAME);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(92);
					match(T__23);
					setState(93);
					match(NAME);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__24);
				}
				break;
			case 11:
				_localctx = new DefineUserTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(100);
				match(T__19);
				setState(101);
				((DefineUserTypeContext)_localctx).name = match(NAME);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(102);
					declare();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__25);
				}
				break;
			case 12:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				functionCall();
				}
				break;
			case 13:
				_localctx = new CallProsudureContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(110);
				match(T__26);
				setState(111);
				((CallProsudureContext)_localctx).name = match(NAME);
				setState(112);
				args();
				}
				break;
			case 14:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(113);
				var();
				setState(114);
				match(T__9);
				setState(115);
				expr(0);
				}
				break;
			case 15:
				_localctx = new DeclareVariableContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(117);
				declare();
				}
				break;
			case 16:
				_localctx = new DeclareConstantContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(118);
				match(T__27);
				setState(119);
				match(NAME);
				setState(120);
				match(T__20);
				setState(121);
				expr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefineParamsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PseudocodeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PseudocodeParser.NAME, i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public FuncDefineParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefineParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterFuncDefineParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitFuncDefineParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitFuncDefineParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefineParamsContext funcDefineParams() throws RecognitionException {
		FuncDefineParamsContext _localctx = new FuncDefineParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDefineParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(124);
				match(T__22);
				setState(125);
				match(NAME);
				setState(126);
				match(T__28);
				setState(127);
				datatype();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(128);
					match(T__23);
					setState(129);
					match(NAME);
					setState(130);
					match(T__28);
					setState(131);
					datatype();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__24);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends ParserRuleContext {
		public Token name;
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__29);
			setState(142);
			((DeclareContext)_localctx).name = match(NAME);
			setState(143);
			match(T__28);
			setState(144);
			datatype();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVarContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBracketContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprBracketContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprNotEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpDivideContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpDivideContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntContext extends ExprContext {
		public TerminalNode INT() { return getToken(PseudocodeParser.INT, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprLessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprLess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCharContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(PseudocodeParser.CHAR, 0); }
		public ExprCharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstFalseContext extends ExprContext {
		public ConstFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterConstFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitConstFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitConstFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMoreContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMoreContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprMore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpMultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpMultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLessEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprLessEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpAddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PseudocodeParser.STRING, 0); }
		public ExprStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstTrueContext extends ExprContext {
		public ConstTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterConstTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitConstTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitConstTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFuncCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMoreEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMoreEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprMoreEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprMoreEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprMoreEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpsubtractContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpsubtractContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpsubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpsubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpsubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterOpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitOpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitOpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ConstTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(147);
				match(T__30);
				}
				break;
			case 2:
				{
				_localctx = new ConstFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(T__31);
				}
				break;
			case 3:
				{
				_localctx = new ExprFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				var();
				}
				break;
			case 5:
				{
				_localctx = new ExprStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new ExprCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new OpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(T__43);
				setState(155);
				expr(2);
				}
				break;
			case 9:
				{
				_localctx = new ExprBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__22);
				setState(157);
				expr(0);
				setState(158);
				match(T__24);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMoreContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(163);
						match(T__32);
						setState(164);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprLessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(166);
						match(T__33);
						setState(167);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(169);
						match(T__20);
						setState(170);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprMoreEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(172);
						match(T__34);
						setState(173);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprLessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(175);
						match(T__35);
						setState(176);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprNotEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(178);
						match(T__36);
						setState(179);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new OpAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
						match(T__37);
						setState(182);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new OpsubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
						match(T__38);
						setState(185);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new OpMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						match(T__39);
						setState(188);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new OpDivideContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190);
						match(T__40);
						setState(191);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new OpAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193);
						match(T__41);
						setState(194);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new OpOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196);
						match(T__42);
						setState(197);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			var();
			setState(204);
			args();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(NAME);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					varSuffix();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarSuffixContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitVarSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(213);
				args();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				{
				setState(219);
				match(T__44);
				setState(220);
				expr(0);
				setState(221);
				match(T__45);
				}
				break;
			case T__46:
				{
				setState(223);
				match(T__46);
				setState(224);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__22);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 828679930073055232L) != 0) {
				{
				setState(228);
				exprlist();
				}
			}

			setState(231);
			match(T__24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					expr(0);
					setState(234);
					match(T__23);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(241);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	 
		public DatatypeContext() { }
		public void copyFrom(DatatypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeArrayContext extends DatatypeContext {
		public List<ArrayLengthDefineContext> arrayLengthDefine() {
			return getRuleContexts(ArrayLengthDefineContext.class);
		}
		public ArrayLengthDefineContext arrayLengthDefine(int i) {
			return getRuleContext(ArrayLengthDefineContext.class,i);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TypeArrayContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeRealContext extends DatatypeContext {
		public TypeRealContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCharContext extends DatatypeContext {
		public TypeCharContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoolContext extends DatatypeContext {
		public TypeBoolContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeStrContext extends DatatypeContext {
		public TypeStrContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends DatatypeContext {
		public TypeIntContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeUserDefinedContext extends DatatypeContext {
		public TerminalNode NAME() { return getToken(PseudocodeParser.NAME, 0); }
		public TypeUserDefinedContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterTypeUserDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitTypeUserDefined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitTypeUserDefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_datatype);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				_localctx = new TypeArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__47);
				setState(244);
				match(T__44);
				setState(245);
				arrayLengthDefine();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(246);
					match(T__23);
					setState(247);
					arrayLengthDefine();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__45);
				setState(254);
				match(T__48);
				setState(255);
				datatype();
				}
				break;
			case NAME:
				_localctx = new TypeUserDefinedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(NAME);
				}
				break;
			case T__49:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				match(T__53);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthDefineContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(PseudocodeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PseudocodeParser.INT, i);
		}
		public ArrayLengthDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLengthDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).enterArrayLengthDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeListener ) ((PseudocodeListener)listener).exitArrayLengthDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeVisitor ) return ((PseudocodeVisitor<? extends T>)visitor).visitArrayLengthDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthDefineContext arrayLengthDefine() throws RecognitionException {
		ArrayLengthDefineContext _localctx = new ArrayLengthDefineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayLengthDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(INT);
			setState(266);
			match(T__28);
			setState(267);
			match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u010e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002h\b"+
		"\u0002\n\u0002\f\u0002k\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002{\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0085\b\u0003\n\u0003\f\u0003"+
		"\u0088\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008c\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c7\b\u0005\n\u0005\f\u0005"+
		"\u00ca\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00d1\b\u0007\n\u0007\f\u0007\u00d4\t\u0007\u0001\b\u0005"+
		"\b\u00d7\b\b\n\b\f\b\u00da\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00e2\b\b\u0001\t\u0001\t\u0003\t\u00e6\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n\u00f0\t\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00f9\b\u000b\n\u000b\f\u000b\u00fc\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0108\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0001\n\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u0135\u0000\u001a\u0001\u0000"+
		"\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000\u0000"+
		"\u0006\u008b\u0001\u0000\u0000\u0000\b\u008d\u0001\u0000\u0000\u0000\n"+
		"\u00a0\u0001\u0000\u0000\u0000\f\u00cb\u0001\u0000\u0000\u0000\u000e\u00ce"+
		"\u0001\u0000\u0000\u0000\u0010\u00d8\u0001\u0000\u0000\u0000\u0012\u00e3"+
		"\u0001\u0000\u0000\u0000\u0014\u00ee\u0001\u0000\u0000\u0000\u0016\u0107"+
		"\u0001\u0000\u0000\u0000\u0018\u0109\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0003\u0002\u0001\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001"+
		"\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003\n"+
		"\u0005\u0000%&\u0005\u0002\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005"+
		"\u0003\u0000\u0000({\u0001\u0000\u0000\u0000)*\u0005\u0004\u0000\u0000"+
		"*+\u00059\u0000\u0000+,\u0003\u0006\u0003\u0000,-\u0005\u0005\u0000\u0000"+
		"-.\u0003\u0016\u000b\u0000./\u0003\u0002\u0001\u0000/0\u0005\u0006\u0000"+
		"\u00000{\u0001\u0000\u0000\u000012\u0005\u0007\u0000\u000023\u00059\u0000"+
		"\u000034\u0003\u0006\u0003\u000045\u0003\u0002\u0001\u000056\u0005\b\u0000"+
		"\u00006{\u0001\u0000\u0000\u000078\u0005\t\u0000\u000089\u00059\u0000"+
		"\u00009:\u0005\n\u0000\u0000:;\u0003\n\u0005\u0000;<\u0005\u000b\u0000"+
		"\u0000<?\u0003\n\u0005\u0000=>\u0005\f\u0000\u0000>@\u0003\n\u0005\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0003\u0002\u0001\u0000BC\u0005\r\u0000\u0000CD\u00059\u0000"+
		"\u0000D{\u0001\u0000\u0000\u0000EF\u0005\u000e\u0000\u0000FG\u0003\u0002"+
		"\u0001\u0000GH\u0005\u000f\u0000\u0000HI\u0003\n\u0005\u0000I{\u0001\u0000"+
		"\u0000\u0000JK\u0005\u0010\u0000\u0000KL\u0003\n\u0005\u0000LM\u0003\u0002"+
		"\u0001\u0000MN\u0005\u0011\u0000\u0000N{\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0012\u0000\u0000P{\u0003\u0014\n\u0000QR\u0005\u0013\u0000\u0000R{\u0005"+
		"9\u0000\u0000ST\u0005\u0014\u0000\u0000TU\u00059\u0000\u0000UV\u0005\u0015"+
		"\u0000\u0000VW\u0005\u0016\u0000\u0000W{\u0003\u0016\u000b\u0000XY\u0005"+
		"\u0014\u0000\u0000YZ\u00059\u0000\u0000Z[\u0005\u0017\u0000\u0000[`\u0005"+
		"9\u0000\u0000\\]\u0005\u0018\u0000\u0000]_\u00059\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000c{\u0005\u0019\u0000\u0000de\u0005\u0014\u0000\u0000ei\u00059\u0000"+
		"\u0000fh\u0003\b\u0004\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000l{\u0005\u001a\u0000\u0000m{\u0003"+
		"\f\u0006\u0000no\u0005\u001b\u0000\u0000op\u00059\u0000\u0000p{\u0003"+
		"\u0012\t\u0000qr\u0003\u000e\u0007\u0000rs\u0005\n\u0000\u0000st\u0003"+
		"\n\u0005\u0000t{\u0001\u0000\u0000\u0000u{\u0003\b\u0004\u0000vw\u0005"+
		"\u001c\u0000\u0000wx\u00059\u0000\u0000xy\u0005\u0015\u0000\u0000y{\u0003"+
		"\n\u0005\u0000z#\u0001\u0000\u0000\u0000z)\u0001\u0000\u0000\u0000z1\u0001"+
		"\u0000\u0000\u0000z7\u0001\u0000\u0000\u0000zE\u0001\u0000\u0000\u0000"+
		"zJ\u0001\u0000\u0000\u0000zO\u0001\u0000\u0000\u0000zQ\u0001\u0000\u0000"+
		"\u0000zS\u0001\u0000\u0000\u0000zX\u0001\u0000\u0000\u0000zd\u0001\u0000"+
		"\u0000\u0000zm\u0001\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zq\u0001"+
		"\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000"+
		"{\u0005\u0001\u0000\u0000\u0000|}\u0005\u0017\u0000\u0000}~\u00059\u0000"+
		"\u0000~\u007f\u0005\u001d\u0000\u0000\u007f\u0086\u0003\u0016\u000b\u0000"+
		"\u0080\u0081\u0005\u0018\u0000\u0000\u0081\u0082\u00059\u0000\u0000\u0082"+
		"\u0083\u0005\u001d\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0000\u0084"+
		"\u0080\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0019\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"|\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0007"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u001e\u0000\u0000\u008e\u008f"+
		"\u00059\u0000\u0000\u008f\u0090\u0005\u001d\u0000\u0000\u0090\u0091\u0003"+
		"\u0016\u000b\u0000\u0091\t\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u0005"+
		"\uffff\uffff\u0000\u0093\u00a1\u0005\u001f\u0000\u0000\u0094\u00a1\u0005"+
		" \u0000\u0000\u0095\u00a1\u0003\f\u0006\u0000\u0096\u00a1\u0003\u000e"+
		"\u0007\u0000\u0097\u00a1\u00057\u0000\u0000\u0098\u00a1\u00058\u0000\u0000"+
		"\u0099\u00a1\u0005;\u0000\u0000\u009a\u009b\u0005,\u0000\u0000\u009b\u00a1"+
		"\u0003\n\u0005\u0002\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u009e\u0003"+
		"\n\u0005\u0000\u009e\u009f\u0005\u0019\u0000\u0000\u009f\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a0\u0092\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000"+
		"\u0000\u0000\u00a0\u0095\u0001\u0000\u0000\u0000\u00a0\u0096\u0001\u0000"+
		"\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000"+
		"\u0000\u0000\u00a0\u0099\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000"+
		"\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a1\u00c8\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\n\u000e\u0000\u0000\u00a3\u00a4\u0005!\u0000"+
		"\u0000\u00a4\u00c7\u0003\n\u0005\u000f\u00a5\u00a6\n\r\u0000\u0000\u00a6"+
		"\u00a7\u0005\"\u0000\u0000\u00a7\u00c7\u0003\n\u0005\u000e\u00a8\u00a9"+
		"\n\f\u0000\u0000\u00a9\u00aa\u0005\u0015\u0000\u0000\u00aa\u00c7\u0003"+
		"\n\u0005\r\u00ab\u00ac\n\u000b\u0000\u0000\u00ac\u00ad\u0005#\u0000\u0000"+
		"\u00ad\u00c7\u0003\n\u0005\f\u00ae\u00af\n\n\u0000\u0000\u00af\u00b0\u0005"+
		"$\u0000\u0000\u00b0\u00c7\u0003\n\u0005\u000b\u00b1\u00b2\n\t\u0000\u0000"+
		"\u00b2\u00b3\u0005%\u0000\u0000\u00b3\u00c7\u0003\n\u0005\n\u00b4\u00b5"+
		"\n\b\u0000\u0000\u00b5\u00b6\u0005&\u0000\u0000\u00b6\u00c7\u0003\n\u0005"+
		"\t\u00b7\u00b8\n\u0007\u0000\u0000\u00b8\u00b9\u0005\'\u0000\u0000\u00b9"+
		"\u00c7\u0003\n\u0005\b\u00ba\u00bb\n\u0006\u0000\u0000\u00bb\u00bc\u0005"+
		"(\u0000\u0000\u00bc\u00c7\u0003\n\u0005\u0007\u00bd\u00be\n\u0005\u0000"+
		"\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf\u00c7\u0003\n\u0005\u0006"+
		"\u00c0\u00c1\n\u0004\u0000\u0000\u00c1\u00c2\u0005*\u0000\u0000\u00c2"+
		"\u00c7\u0003\n\u0005\u0005\u00c3\u00c4\n\u0003\u0000\u0000\u00c4\u00c5"+
		"\u0005+\u0000\u0000\u00c5\u00c7\u0003\n\u0005\u0004\u00c6\u00a2\u0001"+
		"\u0000\u0000\u0000\u00c6\u00a5\u0001\u0000\u0000\u0000\u00c6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00c6\u00ab\u0001\u0000\u0000\u0000\u00c6\u00ae\u0001"+
		"\u0000\u0000\u0000\u00c6\u00b1\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00b7\u0001\u0000\u0000\u0000\u00c6\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u000b\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0003\u000e\u0007\u0000\u00cc\u00cd\u0003"+
		"\u0012\t\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce\u00d2\u00059\u0000"+
		"\u0000\u00cf\u00d1\u0003\u0010\b\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u000f\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003\u0012\t\u0000\u00d6"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00e1\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005-\u0000\u0000\u00dc\u00dd\u0003\n\u0005\u0000\u00dd\u00de"+
		"\u0005.\u0000\u0000\u00de\u00e2\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"/\u0000\u0000\u00e0\u00e2\u00059\u0000\u0000\u00e1\u00db\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u0011\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0005\u0017\u0000\u0000\u00e4\u00e6\u0003\u0014\n\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0019\u0000\u0000"+
		"\u00e8\u0013\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003\n\u0005\u0000\u00ea"+
		"\u00eb\u0005\u0018\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0003\n\u0005\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u00050\u0000\u0000\u00f4\u00f5\u0005-\u0000\u0000\u00f5\u00fa\u0003\u0018"+
		"\f\u0000\u00f6\u00f7\u0005\u0018\u0000\u0000\u00f7\u00f9\u0003\u0018\f"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005.\u0000\u0000\u00fe\u00ff\u00051\u0000\u0000\u00ff"+
		"\u0100\u0003\u0016\u000b\u0000\u0100\u0108\u0001\u0000\u0000\u0000\u0101"+
		"\u0108\u00059\u0000\u0000\u0102\u0108\u00052\u0000\u0000\u0103\u0108\u0005"+
		"3\u0000\u0000\u0104\u0108\u00054\u0000\u0000\u0105\u0108\u00055\u0000"+
		"\u0000\u0106\u0108\u00056\u0000\u0000\u0107\u00f3\u0001\u0000\u0000\u0000"+
		"\u0107\u0101\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000\u0000"+
		"\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0017\u0001\u0000\u0000\u0000\u0109\u010a\u0005;\u0000\u0000\u010a"+
		"\u010b\u0005\u001d\u0000\u0000\u010b\u010c\u0005;\u0000\u0000\u010c\u0019"+
		"\u0001\u0000\u0000\u0000\u0011 ?`iz\u0086\u008b\u00a0\u00c6\u00c8\u00d2"+
		"\u00d8\u00e1\u00e5\u00ee\u00fa\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}