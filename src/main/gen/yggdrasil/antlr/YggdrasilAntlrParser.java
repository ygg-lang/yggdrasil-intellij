// Generated from C:/Users/Dell/IdeaProjects/yggdrasil-intellij/src/main/antlr/YggdrasilAntlr.g4 by ANTLR 4.13.1
package yggdrasil.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class YggdrasilAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, SEMICOLON=3, MATCH_MAYBE=4, MATCH_MANY=5, MATCH_OPTIONAL=6, 
		OP_NOT=7, OP_AT=8, OP_HASH=9, OP_CONCAT=10, OP_OR=11, OP_UNTAG=12, COLON=13, 
		KW_IMPORT=14, KW_CLASS=15, KW_UNION=16, KW_CLIMB=17, KW_TOKEN=18, KW_AS=19, 
		OP_PROPORTION=20, PARENTHESES_L=21, PARENTHESES_R=22, BRACKET_L=23, BRACKET_R=24, 
		BRACE_L=25, BRACE_R=26, GENERIC_L=27, GENERIC_R=28, INTEGER=29, SPECIAL=30, 
		ESCAPED=31, REGEX_RANGE=32, REGEX_FREE=33, STRING_SINGLE=34, STRING_DOUBLE=35, 
		RAW_ID=36, UNICODE_ID=37, WHITE_SPACE=38, LINE_COMMENT=39, BLOCK_COMMENT=40, 
		ERROR_CHARACTAR=41;
	public static final int
		RULE_program = 0, RULE_import_statement = 1, RULE_define_class = 2, RULE_define_union = 3, 
		RULE_define_climb = 4, RULE_define_token = 5, RULE_rule_block = 6, RULE_token_block = 7, 
		RULE_token_pair = 8, RULE_token_expression = 9, RULE_macro_call = 10, 
		RULE_function_call = 11, RULE_tuple_block = 12, RULE_expression = 13, 
		RULE_atomic = 14, RULE_regex = 15, RULE_namepath = 16, RULE_string = 17, 
		RULE_identifier = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_statement", "define_class", "define_union", "define_climb", 
			"define_token", "rule_block", "token_block", "token_pair", "token_expression", 
			"macro_call", "function_call", "tuple_block", "expression", "atomic", 
			"regex", "namepath", "string", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", "'*'", "'+'", "'?'", "'!'", "'@'", "'#'", 
			"'~'", "'|'", "'^'", "':'", "'using'", "'class'", "'union'", "'climb'", 
			"'token'", "'as'", "'::'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'\\u27E8'", "'\\u27E9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "MATCH_MAYBE", "MATCH_MANY", "MATCH_OPTIONAL", 
			"OP_NOT", "OP_AT", "OP_HASH", "OP_CONCAT", "OP_OR", "OP_UNTAG", "COLON", 
			"KW_IMPORT", "KW_CLASS", "KW_UNION", "KW_CLIMB", "KW_TOKEN", "KW_AS", 
			"OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", 
			"BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", "INTEGER", "SPECIAL", 
			"ESCAPED", "REGEX_RANGE", "REGEX_FREE", "STRING_SINGLE", "STRING_DOUBLE", 
			"RAW_ID", "UNICODE_ID", "WHITE_SPACE", "LINE_COMMENT", "BLOCK_COMMENT", 
			"ERROR_CHARACTAR"
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
	public String getGrammarFileName() { return "YggdrasilAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YggdrasilAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YggdrasilAntlrParser.EOF, 0); }
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public List<Define_classContext> define_class() {
			return getRuleContexts(Define_classContext.class);
		}
		public Define_classContext define_class(int i) {
			return getRuleContext(Define_classContext.class,i);
		}
		public List<Define_unionContext> define_union() {
			return getRuleContexts(Define_unionContext.class);
		}
		public Define_unionContext define_union(int i) {
			return getRuleContext(Define_unionContext.class,i);
		}
		public List<Define_climbContext> define_climb() {
			return getRuleContexts(Define_climbContext.class);
		}
		public Define_climbContext define_climb(int i) {
			return getRuleContext(Define_climbContext.class,i);
		}
		public List<Define_tokenContext> define_token() {
			return getRuleContexts(Define_tokenContext.class);
		}
		public Define_tokenContext define_token(int i) {
			return getRuleContext(Define_tokenContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YggdrasilAntlrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YggdrasilAntlrParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 206158938888L) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					import_statement();
					}
					break;
				case 2:
					{
					setState(39);
					define_class();
					}
					break;
				case 3:
					{
					setState(40);
					define_union();
					}
					break;
				case 4:
					{
					setState(41);
					define_climb();
					}
					break;
				case 5:
					{
					setState(42);
					define_token();
					}
					break;
				case 6:
					{
					setState(43);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(YggdrasilAntlrParser.KW_IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(KW_IMPORT);
			setState(52);
			identifier();
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
	public static class Define_classContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
		public TerminalNode KW_CLASS() { return getToken(YggdrasilAntlrParser.KW_CLASS, 0); }
		public Rule_blockContext rule_block() {
			return getRuleContext(Rule_blockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Define_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_classContext define_class() throws RecognitionException {
		Define_classContext _localctx = new Define_classContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(54);
				macro_call();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(60);
				((Define_classContext)_localctx).identifier = identifier();
				((Define_classContext)_localctx).mods.add(((Define_classContext)_localctx).identifier);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(KW_CLASS);
			setState(67);
			((Define_classContext)_localctx).name = identifier();
			setState(68);
			rule_block();
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
	public static class Define_unionContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
		public TerminalNode KW_UNION() { return getToken(YggdrasilAntlrParser.KW_UNION, 0); }
		public Rule_blockContext rule_block() {
			return getRuleContext(Rule_blockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Define_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_unionContext define_union() throws RecognitionException {
		Define_unionContext _localctx = new Define_unionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(70);
				macro_call();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(76);
				((Define_unionContext)_localctx).identifier = identifier();
				((Define_unionContext)_localctx).mods.add(((Define_unionContext)_localctx).identifier);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(KW_UNION);
			setState(83);
			((Define_unionContext)_localctx).name = identifier();
			setState(84);
			rule_block();
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
	public static class Define_climbContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
		public TerminalNode KW_CLIMB() { return getToken(YggdrasilAntlrParser.KW_CLIMB, 0); }
		public Rule_blockContext rule_block() {
			return getRuleContext(Rule_blockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Define_climbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_climb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_climb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_climb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_climb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_climbContext define_climb() throws RecognitionException {
		Define_climbContext _localctx = new Define_climbContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_climb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(86);
				macro_call();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(92);
				((Define_climbContext)_localctx).identifier = identifier();
				((Define_climbContext)_localctx).mods.add(((Define_climbContext)_localctx).identifier);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(KW_CLIMB);
			setState(99);
			((Define_climbContext)_localctx).name = identifier();
			setState(100);
			rule_block();
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
	public static class Define_tokenContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public TerminalNode KW_TOKEN() { return getToken(YggdrasilAntlrParser.KW_TOKEN, 0); }
		public Token_blockContext token_block() {
			return getRuleContext(Token_blockContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Define_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_tokenContext define_token() throws RecognitionException {
		Define_tokenContext _localctx = new Define_tokenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(102);
				macro_call();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(108);
				((Define_tokenContext)_localctx).identifier = identifier();
				((Define_tokenContext)_localctx).mods.add(((Define_tokenContext)_localctx).identifier);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(KW_TOKEN);
			setState(115);
			token_block();
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
	public static class Rule_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Rule_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterRule_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitRule_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitRule_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_blockContext rule_block() throws RecognitionException {
		Rule_blockContext _localctx = new Rule_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rule_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(BRACE_L);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_OR) {
				{
				setState(118);
				match(OP_OR);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274343138176L) != 0)) {
				{
				{
				setState(121);
				expression(0);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(BRACE_R);
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
	public static class Token_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public List<Token_pairContext> token_pair() {
			return getRuleContexts(Token_pairContext.class);
		}
		public Token_pairContext token_pair(int i) {
			return getRuleContext(Token_pairContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YggdrasilAntlrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YggdrasilAntlrParser.SEMICOLON, i);
		}
		public Token_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterToken_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitToken_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitToken_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_blockContext token_block() throws RecognitionException {
		Token_blockContext _localctx = new Token_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_token_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(BRACE_L);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 206158430216L) != 0)) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(130);
					token_pair();
					}
					break;
				case SEMICOLON:
					{
					setState(131);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(BRACE_R);
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
	public static class Token_pairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public Token_expressionContext token_expression() {
			return getRuleContext(Token_expressionContext.class,0);
		}
		public Token_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterToken_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitToken_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitToken_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_pairContext token_pair() throws RecognitionException {
		Token_pairContext _localctx = new Token_pairContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_token_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			identifier();
			setState(140);
			match(COLON);
			setState(141);
			token_expression(0);
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
	public static class Token_expressionContext extends ParserRuleContext {
		public Token_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_expression; }
	 
		public Token_expressionContext() { }
		public void copyFrom(Token_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TOrContext extends Token_expressionContext {
		public List<Token_expressionContext> token_expression() {
			return getRuleContexts(Token_expressionContext.class);
		}
		public Token_expressionContext token_expression(int i) {
			return getRuleContext(Token_expressionContext.class,i);
		}
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public TOrContext(Token_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterTOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitTOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitTOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TAtomContext extends Token_expressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TAtomContext(Token_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterTAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitTAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitTAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_expressionContext token_expression() throws RecognitionException {
		return token_expression(0);
	}

	private Token_expressionContext token_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Token_expressionContext _localctx = new Token_expressionContext(_ctx, _parentState);
		Token_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_token_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(144);
			atomic();
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TOrContext(new Token_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_token_expression);
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					match(OP_OR);
					setState(148);
					token_expression(3);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class Macro_callContext extends ParserRuleContext {
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode OP_HASH() { return getToken(YggdrasilAntlrParser.OP_HASH, 0); }
		public TerminalNode OP_AT() { return getToken(YggdrasilAntlrParser.OP_AT, 0); }
		public Tuple_blockContext tuple_block() {
			return getRuleContext(Tuple_blockContext.class,0);
		}
		public Macro_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterMacro_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitMacro_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitMacro_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_callContext macro_call() throws RecognitionException {
		Macro_callContext _localctx = new Macro_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_macro_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==OP_AT || _la==OP_HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(155);
			namepath();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(156);
				tuple_block();
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode OP_AT() { return getToken(YggdrasilAntlrParser.OP_AT, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Tuple_blockContext tuple_block() {
			return getRuleContext(Tuple_blockContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(OP_AT);
			setState(160);
			namepath();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(161);
				tuple_block();
				}
				break;
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
	public static class Tuple_blockContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YggdrasilAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YggdrasilAntlrParser.COMMA, i);
		}
		public Tuple_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterTuple_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitTuple_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitTuple_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_blockContext tuple_block() throws RecognitionException {
		Tuple_blockContext _localctx = new Tuple_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tuple_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(PARENTHESES_L);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274343138176L) != 0)) {
				{
				setState(165);
				expression(0);
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						match(COMMA);
						setState(167);
						expression(0);
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(173);
					match(COMMA);
					}
				}

				}
			}

			setState(178);
			match(PARENTHESES_R);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntagContext extends ExpressionContext {
		public TerminalNode OP_UNTAG() { return getToken(YggdrasilAntlrParser.OP_UNTAG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UntagContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUntag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUntag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUntag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ExpressionContext {
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public GroupContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public PatternContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaybeContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MATCH_MAYBE() { return getToken(YggdrasilAntlrParser.MATCH_MAYBE, 0); }
		public TerminalNode MATCH_OPTIONAL() { return getToken(YggdrasilAntlrParser.MATCH_OPTIONAL, 0); }
		public MaybeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterMaybe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitMaybe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitMaybe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MATCH_OPTIONAL() { return getToken(YggdrasilAntlrParser.MATCH_OPTIONAL, 0); }
		public OptionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchTagContext extends ExpressionContext {
		public TerminalNode OP_HASH() { return getToken(YggdrasilAntlrParser.OP_HASH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BranchTagContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterBranchTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitBranchTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitBranchTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HardContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_CONCAT() { return getToken(YggdrasilAntlrParser.OP_CONCAT, 0); }
		public HardContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterHard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitHard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitHard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SoftContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SoftContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterSoft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitSoft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitSoft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ExpressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public AtomContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpressionContext {
		public TerminalNode OP_NOT() { return getToken(YggdrasilAntlrParser.OP_NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeTagContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public NodeTagContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterNodeTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitNodeTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitNodeTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MATCH_MANY() { return getToken(YggdrasilAntlrParser.MATCH_MANY, 0); }
		public TerminalNode MATCH_OPTIONAL() { return getToken(YggdrasilAntlrParser.MATCH_OPTIONAL, 0); }
		public ManyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				match(OP_UNTAG);
				setState(182);
				expression(10);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(OP_NOT);
				setState(184);
				expression(9);
				}
				break;
			case 3:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(PARENTHESES_L);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_OR) {
					{
					setState(186);
					match(OP_OR);
					}
				}

				setState(189);
				expression(0);
				setState(190);
				match(PARENTHESES_R);
				}
				break;
			case 4:
				{
				_localctx = new BranchTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(OP_HASH);
				setState(193);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new NodeTagContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(199);
						match(COLON);
						setState(200);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new HardContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(202);
						match(OP_CONCAT);
						setState(203);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new SoftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(205);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new PatternContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						match(OP_OR);
						setState(208);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new OptionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(210);
						match(MATCH_OPTIONAL);
						}
						break;
					case 6:
						{
						_localctx = new MaybeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(212);
						match(MATCH_MAYBE);
						setState(214);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(213);
							match(MATCH_OPTIONAL);
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new ManyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(217);
						match(MATCH_MANY);
						setState(219);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(218);
							match(MATCH_OPTIONAL);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class AtomicContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(YggdrasilAntlrParser.INTEGER, 0); }
		public TerminalNode SPECIAL() { return getToken(YggdrasilAntlrParser.SPECIAL, 0); }
		public TerminalNode ESCAPED() { return getToken(YggdrasilAntlrParser.ESCAPED, 0); }
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomic);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				function_call();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				namepath();
				}
				break;
			case REGEX_RANGE:
			case REGEX_FREE:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				regex();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(INTEGER);
				}
				break;
			case SPECIAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(SPECIAL);
				}
				break;
			case ESCAPED:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(ESCAPED);
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
	public static class RegexContext extends ParserRuleContext {
		public TerminalNode REGEX_RANGE() { return getToken(YggdrasilAntlrParser.REGEX_RANGE, 0); }
		public TerminalNode REGEX_FREE() { return getToken(YggdrasilAntlrParser.REGEX_FREE, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==REGEX_RANGE || _la==REGEX_FREE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class NamepathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(YggdrasilAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(YggdrasilAntlrParser.OP_PROPORTION, i);
		}
		public List<TerminalNode> DOT() { return getTokens(YggdrasilAntlrParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(YggdrasilAntlrParser.DOT, i);
		}
		public NamepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterNamepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitNamepath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitNamepath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamepathContext namepath() throws RecognitionException {
		NamepathContext _localctx = new NamepathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			identifier();
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==OP_PROPORTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(239);
					identifier();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_SINGLE() { return getToken(YggdrasilAntlrParser.STRING_SINGLE, 0); }
		public TerminalNode STRING_DOUBLE() { return getToken(YggdrasilAntlrParser.STRING_DOUBLE, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==STRING_SINGLE || _la==STRING_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode RAW_ID() { return getToken(YggdrasilAntlrParser.RAW_ID, 0); }
		public TerminalNode UNICODE_ID() { return getToken(YggdrasilAntlrParser.UNICODE_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==RAW_ID || _la==UNICODE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return token_expression_sempred((Token_expressionContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean token_expression_sempred(Token_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u00028\b\u0002"+
		"\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0005\u0002>\b\u0002\n\u0002\f\u0002"+
		"A\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001\u0003\u0005\u0003"+
		"N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0005\u0004X\b\u0004\n\u0004\f\u0004[\t\u0004"+
		"\u0001\u0004\u0005\u0004^\b\u0004\n\u0004\f\u0004a\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005h\b\u0005"+
		"\n\u0005\f\u0005k\t\u0005\u0001\u0005\u0005\u0005n\b\u0005\n\u0005\f\u0005"+
		"q\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006x\b\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006"+
		"~\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0085\b\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u0096\b\t\n\t\f\t\u0099\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u009e\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a3"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a9\b\f\n\f\f\f\u00ac"+
		"\t\f\u0001\f\u0003\f\u00af\b\f\u0003\f\u00b1\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bc\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c5\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d7\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00dc\b\r\u0005\r\u00de\b\r\n\r\f\r\u00e1\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ea\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00f1\b\u0010\n\u0010\f\u0010\u00f4"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000"+
		"\u0002\u0012\u001a\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0001\u0000\b\t\u0001"+
		"\u0000 !\u0002\u0000\u0001\u0001\u0014\u0014\u0001\u0000\"#\u0001\u0000"+
		"$%\u0114\u0000.\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bY\u0001"+
		"\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000"+
		"\u000e\u0081\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000"+
		"\u0012\u008f\u0001\u0000\u0000\u0000\u0014\u009a\u0001\u0000\u0000\u0000"+
		"\u0016\u009f\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000"+
		"\u001a\u00c4\u0001\u0000\u0000\u0000\u001c\u00e9\u0001\u0000\u0000\u0000"+
		"\u001e\u00eb\u0001\u0000\u0000\u0000 \u00ed\u0001\u0000\u0000\u0000\""+
		"\u00f5\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000&-\u0003"+
		"\u0002\u0001\u0000\'-\u0003\u0004\u0002\u0000(-\u0003\u0006\u0003\u0000"+
		")-\u0003\b\u0004\u0000*-\u0003\n\u0005\u0000+-\u0005\u0003\u0000\u0000"+
		",&\u0001\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000"+
		"\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"12\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u000034\u0005\u000e"+
		"\u0000\u000045\u0003$\u0012\u00005\u0003\u0001\u0000\u0000\u000068\u0003"+
		"\u0014\n\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:?\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<>\u0003$\u0012\u0000=<\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u000f"+
		"\u0000\u0000CD\u0003$\u0012\u0000DE\u0003\f\u0006\u0000E\u0005\u0001\u0000"+
		"\u0000\u0000FH\u0003\u0014\n\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JO\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0003$\u0012\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0010\u0000\u0000ST\u0003$\u0012\u0000TU\u0003\f\u0006"+
		"\u0000U\u0007\u0001\u0000\u0000\u0000VX\u0003\u0014\n\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z_\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\^\u0003$\u0012\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0011\u0000\u0000cd\u0003"+
		"$\u0012\u0000de\u0003\f\u0006\u0000e\t\u0001\u0000\u0000\u0000fh\u0003"+
		"\u0014\n\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jo\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000ln\u0003$\u0012\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0012"+
		"\u0000\u0000st\u0003\u000e\u0007\u0000t\u000b\u0001\u0000\u0000\u0000"+
		"uw\u0005\u0019\u0000\u0000vx\u0005\u000b\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x|\u0001\u0000\u0000\u0000y{\u0003\u001a"+
		"\r\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u001a\u0000\u0000\u0080\r"+
		"\u0001\u0000\u0000\u0000\u0081\u0086\u0005\u0019\u0000\u0000\u0082\u0085"+
		"\u0003\u0010\b\u0000\u0083\u0085\u0005\u0003\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a\u000f\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0003$\u0012\u0000\u008c\u008d\u0005\r"+
		"\u0000\u0000\u008d\u008e\u0003\u0012\t\u0000\u008e\u0011\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0006\t\uffff\uffff\u0000\u0090\u0091\u0003\u001c\u000e"+
		"\u0000\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0093\n\u0002\u0000\u0000"+
		"\u0093\u0094\u0005\u000b\u0000\u0000\u0094\u0096\u0003\u0012\t\u0003\u0095"+
		"\u0092\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0013\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0007\u0000\u0000\u0000\u009b\u009d\u0003 \u0010\u0000\u009c\u009e"+
		"\u0003\u0018\f\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\b\u0000\u0000\u00a0\u00a2\u0003 \u0010\u0000\u00a1\u00a3\u0003\u0018"+
		"\f\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00b0\u0005\u0015\u0000"+
		"\u0000\u00a5\u00aa\u0003\u001a\r\u0000\u00a6\u00a7\u0005\u0002\u0000\u0000"+
		"\u00a7\u00a9\u0003\u001a\r\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00af\u0005\u0002\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a5\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0016\u0000\u0000\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0006\r\uffff\uffff\u0000\u00b5\u00b6\u0005\f\u0000\u0000\u00b6"+
		"\u00c5\u0003\u001a\r\n\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00c5"+
		"\u0003\u001a\r\t\u00b9\u00bb\u0005\u0015\u0000\u0000\u00ba\u00bc\u0005"+
		"\u000b\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0003"+
		"\u001a\r\u0000\u00be\u00bf\u0005\u0016\u0000\u0000\u00bf\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\t\u0000\u0000\u00c1\u00c5\u0003$\u0012"+
		"\u0000\u00c2\u00c5\u0003\u0016\u000b\u0000\u00c3\u00c5\u0003\u001c\u000e"+
		"\u0000\u00c4\u00b4\u0001\u0000\u0000\u0000\u00c4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00df\u0001\u0000\u0000\u0000\u00c6\u00c7\n\b\u0000\u0000"+
		"\u00c7\u00c8\u0005\r\u0000\u0000\u00c8\u00de\u0003\u001a\r\t\u00c9\u00ca"+
		"\n\u0007\u0000\u0000\u00ca\u00cb\u0005\n\u0000\u0000\u00cb\u00de\u0003"+
		"\u001a\r\b\u00cc\u00cd\n\u0006\u0000\u0000\u00cd\u00de\u0003\u001a\r\u0007"+
		"\u00ce\u00cf\n\u0005\u0000\u0000\u00cf\u00d0\u0005\u000b\u0000\u0000\u00d0"+
		"\u00de\u0003\u001a\r\u0006\u00d1\u00d2\n\r\u0000\u0000\u00d2\u00de\u0005"+
		"\u0006\u0000\u0000\u00d3\u00d4\n\f\u0000\u0000\u00d4\u00d6\u0005\u0004"+
		"\u0000\u0000\u00d5\u00d7\u0005\u0006\u0000\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00de\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\n\u000b\u0000\u0000\u00d9\u00db\u0005\u0005\u0000"+
		"\u0000\u00da\u00dc\u0005\u0006\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00c6\u0001\u0000\u0000\u0000\u00dd\u00c9\u0001\u0000\u0000"+
		"\u0000\u00dd\u00cc\u0001\u0000\u0000\u0000\u00dd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000\u00dd\u00d3\u0001\u0000\u0000"+
		"\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u001b\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00ea\u0003\u0016\u000b\u0000\u00e3\u00ea\u0003\"\u0011\u0000"+
		"\u00e4\u00ea\u0003 \u0010\u0000\u00e5\u00ea\u0003\u001e\u000f\u0000\u00e6"+
		"\u00ea\u0005\u001d\u0000\u0000\u00e7\u00ea\u0005\u001e\u0000\u0000\u00e8"+
		"\u00ea\u0005\u001f\u0000\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u001d\u0001\u0000\u0000\u0000\u00eb\u00ec\u0007\u0001\u0000\u0000\u00ec"+
		"\u001f\u0001\u0000\u0000\u0000\u00ed\u00f2\u0003$\u0012\u0000\u00ee\u00ef"+
		"\u0007\u0002\u0000\u0000\u00ef\u00f1\u0003$\u0012\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3!\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007\u0003"+
		"\u0000\u0000\u00f6#\u0001\u0000\u0000\u0000\u00f7\u00f8\u0007\u0004\u0000"+
		"\u0000\u00f8%\u0001\u0000\u0000\u0000\u001c,.9?IOY_iow|\u0084\u0086\u0097"+
		"\u009d\u00a2\u00aa\u00ae\u00b0\u00bb\u00c4\u00d6\u00db\u00dd\u00df\u00e9"+
		"\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}