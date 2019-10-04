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
		OP_AT=7, OP_HASH=8, OP_CONCAT=9, OP_OR=10, OP_UNTAG=11, TAG_NODE=12, KW_IMPORT=13, 
		KW_CLASS=14, KW_UNION=15, KW_AS=16, OP_PROPORTION=17, PARENTHESES_L=18, 
		PARENTHESES_R=19, BRACKET_L=20, BRACKET_R=21, BRACE_L=22, BRACE_R=23, 
		GENERIC_L=24, GENERIC_R=25, STRING_SINGLE=26, STRING_DOUBLE=27, RAW_ID=28, 
		UNICODE_ID=29, WHITE_SPACE=30, LINE_COMMENT=31, BLOCK_COMMENT=32, ERROR_CHARACTAR=33;
	public static final int
		RULE_program = 0, RULE_import_statement = 1, RULE_define_class = 2, RULE_define_union = 3, 
		RULE_rule_block = 4, RULE_macro_call = 5, RULE_function_call = 6, RULE_tuple_block = 7, 
		RULE_expression = 8, RULE_string = 9, RULE_identifier = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_statement", "define_class", "define_union", "rule_block", 
			"macro_call", "function_call", "tuple_block", "expression", "string", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", "'*'", "'+'", "'?'", "'@'", "'#'", "'~'", 
			"'|'", "'^'", "':'", "'using'", "'class'", "'union'", "'as'", "'::'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'\\u27E8'", "'\\u27E9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "MATCH_MAYBE", "MATCH_MANY", "MATCH_OPTIONAL", 
			"OP_AT", "OP_HASH", "OP_CONCAT", "OP_OR", "OP_UNTAG", "TAG_NODE", "KW_IMPORT", 
			"KW_CLASS", "KW_UNION", "KW_AS", "OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", 
			"BRACKET_L", "BRACKET_R", "BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", 
			"STRING_SINGLE", "STRING_DOUBLE", "RAW_ID", "UNICODE_ID", "WHITE_SPACE", 
			"LINE_COMMENT", "BLOCK_COMMENT", "ERROR_CHARACTAR"
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805364104L) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					import_statement();
					}
					break;
				case 2:
					{
					setState(23);
					define_class();
					}
					break;
				case 3:
					{
					setState(24);
					define_union();
					}
					break;
				case 4:
					{
					setState(25);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
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
			setState(33);
			match(KW_IMPORT);
			setState(34);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(36);
				macro_call();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(42);
				((Define_classContext)_localctx).identifier = identifier();
				((Define_classContext)_localctx).mods.add(((Define_classContext)_localctx).identifier);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(KW_CLASS);
			setState(49);
			((Define_classContext)_localctx).name = identifier();
			setState(50);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(52);
				macro_call();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(58);
				((Define_unionContext)_localctx).identifier = identifier();
				((Define_unionContext)_localctx).mods.add(((Define_unionContext)_localctx).identifier);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(KW_UNION);
			setState(65);
			((Define_unionContext)_localctx).name = identifier();
			setState(66);
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
		enterRule(_localctx, 8, RULE_rule_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BRACE_L);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_OR) {
				{
				setState(69);
				match(OP_OR);
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006897536L) != 0)) {
				{
				{
				setState(72);
				expression(0);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 10, RULE_macro_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==OP_AT || _la==OP_HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			identifier();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(82);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 12, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OP_AT);
			setState(86);
			identifier();
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(87);
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
		enterRule(_localctx, 14, RULE_tuple_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(PARENTHESES_L);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006897536L) != 0)) {
				{
				setState(91);
				expression(0);
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						match(COMMA);
						setState(93);
						expression(0);
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(99);
					match(COMMA);
					}
				}

				}
			}

			setState(104);
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
	public static class EIdentifierContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterEIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitEIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitEIdentifier(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class EStringContext extends ExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public EStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterEString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitEString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitEString(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_UNTAG:
				{
				_localctx = new UntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(107);
				match(OP_UNTAG);
				setState(108);
				expression(10);
				}
				break;
			case PARENTHESES_L:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(PARENTHESES_L);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_OR) {
					{
					setState(110);
					match(OP_OR);
					}
				}

				setState(113);
				expression(0);
				setState(114);
				match(PARENTHESES_R);
				}
				break;
			case OP_HASH:
				{
				_localctx = new BranchTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(OP_HASH);
				setState(117);
				identifier();
				}
				break;
			case OP_AT:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				function_call();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				{
				_localctx = new EStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				{
				_localctx = new EIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new NodeTagContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
						match(TAG_NODE);
						setState(125);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new HardContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						match(OP_CONCAT);
						setState(128);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new SoftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(130);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new PatternContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(132);
						match(OP_OR);
						setState(133);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new OptionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(135);
						match(MATCH_OPTIONAL);
						}
						break;
					case 6:
						{
						_localctx = new MaybeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(137);
						match(MATCH_MAYBE);
						setState(139);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(138);
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
						setState(141);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(142);
						match(MATCH_MANY);
						setState(144);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(143);
							match(MATCH_OPTIONAL);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 20, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
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
		"\u0004\u0001!\u009c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001\u0002\u0005\u0002"+
		",\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t\u0003"+
		"\u0001\u0003\u0005\u0003<\b\u0003\n\u0003\f\u0003?\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"G\b\u0004\u0001\u0004\u0005\u0004J\b\u0004\n\u0004\f\u0004M\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005T\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007_\b\u0007\n\u0007"+
		"\f\u0007b\t\u0007\u0001\u0007\u0003\u0007e\b\u0007\u0003\u0007g\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bp\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bz\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u008c\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0091\b\b\u0005\b"+
		"\u0093\b\b\n\b\f\b\u0096\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000"+
		"\u0001\u0010\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0003\u0001\u0000\u0007\b\u0001\u0000\u001a\u001b\u0001\u0000\u001c"+
		"\u001d\u00ae\u0000\u001c\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004\'\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000"+
		"\bD\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fU\u0001\u0000"+
		"\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000"+
		"\u0012\u0097\u0001\u0000\u0000\u0000\u0014\u0099\u0001\u0000\u0000\u0000"+
		"\u0016\u001b\u0003\u0002\u0001\u0000\u0017\u001b\u0003\u0004\u0002\u0000"+
		"\u0018\u001b\u0003\u0006\u0003\u0000\u0019\u001b\u0005\u0003\u0000\u0000"+
		"\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001"+
		"\u0001\u0000\u0000\u0000!\"\u0005\r\u0000\u0000\"#\u0003\u0014\n\u0000"+
		"#\u0003\u0001\u0000\u0000\u0000$&\u0003\n\u0005\u0000%$\u0001\u0000\u0000"+
		"\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(-\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*,\u0003"+
		"\u0014\n\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0005\u000e\u0000\u000012\u0003\u0014\n\u0000"+
		"23\u0003\b\u0004\u00003\u0005\u0001\u0000\u0000\u000046\u0003\n\u0005"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008=\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:<\u0003\u0014\n\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u000f\u0000"+
		"\u0000AB\u0003\u0014\n\u0000BC\u0003\b\u0004\u0000C\u0007\u0001\u0000"+
		"\u0000\u0000DF\u0005\u0016\u0000\u0000EG\u0005\n\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GK\u0001\u0000\u0000\u0000HJ\u0003"+
		"\u0010\b\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0005\u0017\u0000\u0000O\t\u0001\u0000\u0000"+
		"\u0000PQ\u0007\u0000\u0000\u0000QS\u0003\u0014\n\u0000RT\u0003\u000e\u0007"+
		"\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u000b\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000VX\u0003\u0014\n\u0000WY\u0003"+
		"\u000e\u0007\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Zf\u0005\u0012\u0000\u0000[`\u0003\u0010\b"+
		"\u0000\\]\u0005\u0002\u0000\u0000]_\u0003\u0010\b\u0000^\\\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"ce\u0005\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0013\u0000\u0000i\u000f"+
		"\u0001\u0000\u0000\u0000jk\u0006\b\uffff\uffff\u0000kl\u0005\u000b\u0000"+
		"\u0000lz\u0003\u0010\b\nmo\u0005\u0012\u0000\u0000np\u0005\n\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0003\u0010\b\u0000rs\u0005\u0013\u0000\u0000sz\u0001\u0000\u0000"+
		"\u0000tu\u0005\b\u0000\u0000uz\u0003\u0014\n\u0000vz\u0003\f\u0006\u0000"+
		"wz\u0003\u0012\t\u0000xz\u0003\u0014\n\u0000yj\u0001\u0000\u0000\u0000"+
		"ym\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0094\u0001"+
		"\u0000\u0000\u0000{|\n\t\u0000\u0000|}\u0005\f\u0000\u0000}\u0093\u0003"+
		"\u0010\b\n~\u007f\n\b\u0000\u0000\u007f\u0080\u0005\t\u0000\u0000\u0080"+
		"\u0093\u0003\u0010\b\t\u0081\u0082\n\u0007\u0000\u0000\u0082\u0093\u0003"+
		"\u0010\b\b\u0083\u0084\n\u0006\u0000\u0000\u0084\u0085\u0005\n\u0000\u0000"+
		"\u0085\u0093\u0003\u0010\b\u0007\u0086\u0087\n\r\u0000\u0000\u0087\u0093"+
		"\u0005\u0006\u0000\u0000\u0088\u0089\n\f\u0000\u0000\u0089\u008b\u0005"+
		"\u0004\u0000\u0000\u008a\u008c\u0005\u0006\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0093\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\n\u000b\u0000\u0000\u008e\u0090\u0005\u0005"+
		"\u0000\u0000\u008f\u0091\u0005\u0006\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092{\u0001\u0000\u0000\u0000\u0092~\u0001\u0000\u0000\u0000"+
		"\u0092\u0081\u0001\u0000\u0000\u0000\u0092\u0083\u0001\u0000\u0000\u0000"+
		"\u0092\u0086\u0001\u0000\u0000\u0000\u0092\u0088\u0001\u0000\u0000\u0000"+
		"\u0092\u008d\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0007\u0001\u0000\u0000\u0098\u0013\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0007\u0002\u0000\u0000\u009a\u0015\u0001\u0000\u0000\u0000"+
		"\u0013\u001a\u001c\'-7=FKSX`dfoy\u008b\u0090\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}