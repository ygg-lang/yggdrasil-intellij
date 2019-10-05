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
		OP_NOT=7, OP_AT=8, OP_HASH=9, OP_CONCAT=10, OP_OR=11, OP_UNTAG=12, TAG_NODE=13, 
		KW_IMPORT=14, KW_CLASS=15, KW_UNION=16, KW_CLIMB=17, KW_AS=18, OP_PROPORTION=19, 
		PARENTHESES_L=20, PARENTHESES_R=21, BRACKET_L=22, BRACKET_R=23, BRACE_L=24, 
		BRACE_R=25, GENERIC_L=26, GENERIC_R=27, INTEGER=28, SPECIAL=29, ESCAPED=30, 
		REGEX_RANGE=31, REGEX_FREE=32, STRING_SINGLE=33, STRING_DOUBLE=34, RAW_ID=35, 
		UNICODE_ID=36, WHITE_SPACE=37, LINE_COMMENT=38, BLOCK_COMMENT=39, ERROR_CHARACTAR=40;
	public static final int
		RULE_program = 0, RULE_import_statement = 1, RULE_define_class = 2, RULE_define_union = 3, 
		RULE_define_climb = 4, RULE_rule_block = 5, RULE_macro_call = 6, RULE_function_call = 7, 
		RULE_tuple_block = 8, RULE_expression = 9, RULE_atomic = 10, RULE_regex = 11, 
		RULE_namepath = 12, RULE_string = 13, RULE_identifier = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_statement", "define_class", "define_union", "define_climb", 
			"rule_block", "macro_call", "function_call", "tuple_block", "expression", 
			"atomic", "regex", "namepath", "string", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", "'*'", "'+'", "'?'", "'!'", "'@'", "'#'", 
			"'~'", "'|'", "'^'", "':'", "'using'", "'class'", "'union'", "'climb'", 
			"'as'", "'::'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\\u27E8'", 
			"'\\u27E9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "MATCH_MAYBE", "MATCH_MANY", "MATCH_OPTIONAL", 
			"OP_NOT", "OP_AT", "OP_HASH", "OP_CONCAT", "OP_OR", "OP_UNTAG", "TAG_NODE", 
			"KW_IMPORT", "KW_CLASS", "KW_UNION", "KW_CLIMB", "KW_AS", "OP_PROPORTION", 
			"PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", "BRACE_L", 
			"BRACE_R", "GENERIC_L", "GENERIC_R", "INTEGER", "SPECIAL", "ESCAPED", 
			"REGEX_RANGE", "REGEX_FREE", "STRING_SINGLE", "STRING_DOUBLE", "RAW_ID", 
			"UNICODE_ID", "WHITE_SPACE", "LINE_COMMENT", "BLOCK_COMMENT", "ERROR_CHARACTAR"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 103079461640L) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					import_statement();
					}
					break;
				case 2:
					{
					setState(31);
					define_class();
					}
					break;
				case 3:
					{
					setState(32);
					define_union();
					}
					break;
				case 4:
					{
					setState(33);
					define_climb();
					}
					break;
				case 5:
					{
					setState(34);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(42);
			match(KW_IMPORT);
			setState(43);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(45);
				macro_call();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(51);
				((Define_classContext)_localctx).identifier = identifier();
				((Define_classContext)_localctx).mods.add(((Define_classContext)_localctx).identifier);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(KW_CLASS);
			setState(58);
			((Define_classContext)_localctx).name = identifier();
			setState(59);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(61);
				macro_call();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(67);
				((Define_unionContext)_localctx).identifier = identifier();
				((Define_unionContext)_localctx).mods.add(((Define_unionContext)_localctx).identifier);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(KW_UNION);
			setState(74);
			((Define_unionContext)_localctx).name = identifier();
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(77);
				macro_call();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(83);
				((Define_climbContext)_localctx).identifier = identifier();
				((Define_climbContext)_localctx).mods.add(((Define_climbContext)_localctx).identifier);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(KW_CLIMB);
			setState(90);
			((Define_climbContext)_localctx).name = identifier();
			setState(91);
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
		enterRule(_localctx, 10, RULE_rule_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(BRACE_L);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_OR) {
				{
				setState(94);
				match(OP_OR);
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137171571584L) != 0)) {
				{
				{
				setState(97);
				expression(0);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
		enterRule(_localctx, 12, RULE_macro_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==OP_AT || _la==OP_HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			namepath();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(107);
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
		enterRule(_localctx, 14, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(OP_AT);
			setState(111);
			namepath();
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(112);
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
		enterRule(_localctx, 16, RULE_tuple_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PARENTHESES_L);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137171571584L) != 0)) {
				{
				setState(116);
				expression(0);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
						match(COMMA);
						setState(118);
						expression(0);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(124);
					match(COMMA);
					}
				}

				}
			}

			setState(129);
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
		public TerminalNode TAG_NODE() { return getToken(YggdrasilAntlrParser.TAG_NODE, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new UntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(OP_UNTAG);
				setState(133);
				expression(10);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(OP_NOT);
				setState(135);
				expression(9);
				}
				break;
			case 3:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(PARENTHESES_L);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_OR) {
					{
					setState(137);
					match(OP_OR);
					}
				}

				setState(140);
				expression(0);
				setState(141);
				match(PARENTHESES_R);
				}
				break;
			case 4:
				{
				_localctx = new BranchTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(OP_HASH);
				setState(144);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new NodeTagContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(150);
						match(TAG_NODE);
						setState(151);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new HardContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						match(OP_CONCAT);
						setState(154);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new SoftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new PatternContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(OP_OR);
						setState(159);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new OptionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(161);
						match(MATCH_OPTIONAL);
						}
						break;
					case 6:
						{
						_localctx = new MaybeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(163);
						match(MATCH_MAYBE);
						setState(165);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(164);
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
						setState(167);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(168);
						match(MATCH_MANY);
						setState(170);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(169);
							match(MATCH_OPTIONAL);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 20, RULE_atomic);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				function_call();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				namepath();
				}
				break;
			case REGEX_RANGE:
			case REGEX_FREE:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				regex();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(INTEGER);
				}
				break;
			case SPECIAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(SPECIAL);
				}
				break;
			case ESCAPED:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
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
		enterRule(_localctx, 22, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 24, RULE_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			identifier();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==OP_PROPORTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(190);
					identifier();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 26, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 28, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002/\b\u0002\n\u0002\f\u00022\t\u0002\u0001\u0002"+
		"\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003?\b\u0003\n\u0003\f\u0003"+
		"B\t\u0003\u0001\u0003\u0005\u0003E\b\u0003\n\u0003\f\u0003H\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004O\b"+
		"\u0004\n\u0004\f\u0004R\t\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004"+
		"\f\u0004X\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0005\u0005c\b\u0005"+
		"\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007r\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bx\b\b\n\b"+
		"\f\b{\t\b\u0001\b\u0003\b~\b\b\u0003\b\u0080\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008b\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0094\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a6\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ab\b\t\u0005\t\u00ad\b\t\n\t\f\t\u00b0\t"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b9"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c0\b\f"+
		"\n\f\f\f\u00c3\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0001\u0012\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0005\u0001\u0000\b\t\u0001\u0000"+
		"\u001f \u0002\u0000\u0001\u0001\u0013\u0013\u0001\u0000!\"\u0001\u0000"+
		"#$\u00e1\u0000%\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000"+
		"\u00040\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bP\u0001"+
		"\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000"+
		"\u000en\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012\u0093"+
		"\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000\u0000\u0016\u00ba"+
		"\u0001\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000\u0000\u001a\u00c4"+
		"\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000\u0000\u0000\u001e$\u0003"+
		"\u0002\u0001\u0000\u001f$\u0003\u0004\u0002\u0000 $\u0003\u0006\u0003"+
		"\u0000!$\u0003\b\u0004\u0000\"$\u0005\u0003\u0000\u0000#\u001e\u0001\u0000"+
		"\u0000\u0000#\u001f\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001"+
		"\u0001\u0000\u0000\u0000*+\u0005\u000e\u0000\u0000+,\u0003\u001c\u000e"+
		"\u0000,\u0003\u0001\u0000\u0000\u0000-/\u0003\f\u0006\u0000.-\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000016\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"35\u0003\u001c\u000e\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u000f\u0000\u0000:;\u0003"+
		"\u001c\u000e\u0000;<\u0003\n\u0005\u0000<\u0005\u0001\u0000\u0000\u0000"+
		"=?\u0003\f\u0006\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AF\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CE\u0003\u001c\u000e\u0000DC\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IJ\u0005\u0010\u0000\u0000JK\u0003\u001c\u000e\u0000KL\u0003\n\u0005\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QV\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0003"+
		"\u001c\u000e\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0011\u0000\u0000Z[\u0003\u001c"+
		"\u000e\u0000[\\\u0003\n\u0005\u0000\\\t\u0001\u0000\u0000\u0000]_\u0005"+
		"\u0018\u0000\u0000^`\u0005\u000b\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000\u0000ac\u0003\u0012\t\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0019\u0000\u0000h\u000b\u0001\u0000\u0000\u0000"+
		"ij\u0007\u0000\u0000\u0000jl\u0003\u0018\f\u0000km\u0003\u0010\b\u0000"+
		"lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\r\u0001\u0000\u0000"+
		"\u0000no\u0005\b\u0000\u0000oq\u0003\u0018\f\u0000pr\u0003\u0010\b\u0000"+
		"qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000f\u0001\u0000"+
		"\u0000\u0000s\u007f\u0005\u0014\u0000\u0000ty\u0003\u0012\t\u0000uv\u0005"+
		"\u0002\u0000\u0000vx\u0003\u0012\t\u0000wu\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0005\u0002\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007ft\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0015"+
		"\u0000\u0000\u0082\u0011\u0001\u0000\u0000\u0000\u0083\u0084\u0006\t\uffff"+
		"\uffff\u0000\u0084\u0085\u0005\f\u0000\u0000\u0085\u0094\u0003\u0012\t"+
		"\n\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0094\u0003\u0012\t\t\u0088"+
		"\u008a\u0005\u0014\u0000\u0000\u0089\u008b\u0005\u000b\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u008e"+
		"\u0005\u0015\u0000\u0000\u008e\u0094\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\t\u0000\u0000\u0090\u0094\u0003\u001c\u000e\u0000\u0091\u0094\u0003"+
		"\u000e\u0007\u0000\u0092\u0094\u0003\u0014\n\u0000\u0093\u0083\u0001\u0000"+
		"\u0000\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0093\u0088\u0001\u0000"+
		"\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u00ae\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\n\b\u0000\u0000\u0096\u0097\u0005\r\u0000\u0000"+
		"\u0097\u00ad\u0003\u0012\t\t\u0098\u0099\n\u0007\u0000\u0000\u0099\u009a"+
		"\u0005\n\u0000\u0000\u009a\u00ad\u0003\u0012\t\b\u009b\u009c\n\u0006\u0000"+
		"\u0000\u009c\u00ad\u0003\u0012\t\u0007\u009d\u009e\n\u0005\u0000\u0000"+
		"\u009e\u009f\u0005\u000b\u0000\u0000\u009f\u00ad\u0003\u0012\t\u0006\u00a0"+
		"\u00a1\n\r\u0000\u0000\u00a1\u00ad\u0005\u0006\u0000\u0000\u00a2\u00a3"+
		"\n\f\u0000\u0000\u00a3\u00a5\u0005\u0004\u0000\u0000\u00a4\u00a6\u0005"+
		"\u0006\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00ad\u0001\u0000\u0000\u0000\u00a7\u00a8\n\u000b"+
		"\u0000\u0000\u00a8\u00aa\u0005\u0005\u0000\u0000\u00a9\u00ab\u0005\u0006"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u0095\u0001\u0000"+
		"\u0000\u0000\u00ac\u0098\u0001\u0000\u0000\u0000\u00ac\u009b\u0001\u0000"+
		"\u0000\u0000\u00ac\u009d\u0001\u0000\u0000\u0000\u00ac\u00a0\u0001\u0000"+
		"\u0000\u0000\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0013\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b9\u0003\u000e"+
		"\u0007\u0000\u00b2\u00b9\u0003\u001a\r\u0000\u00b3\u00b9\u0003\u0018\f"+
		"\u0000\u00b4\u00b9\u0003\u0016\u000b\u0000\u00b5\u00b9\u0005\u001c\u0000"+
		"\u0000\u00b6\u00b9\u0005\u001d\u0000\u0000\u00b7\u00b9\u0005\u001e\u0000"+
		"\u0000\u00b8\u00b1\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b3\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u0015\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0007\u0001\u0000\u0000\u00bb\u0017\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c1\u0003\u001c\u000e\u0000\u00bd\u00be\u0007\u0002\u0000"+
		"\u0000\u00be\u00c0\u0003\u001c\u000e\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0019\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0003\u0000"+
		"\u0000\u00c5\u001b\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0004\u0000"+
		"\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u0017#%06@FPV_dlqy}\u007f\u008a"+
		"\u0093\u00a5\u00aa\u00ac\u00ae\u00b8\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}