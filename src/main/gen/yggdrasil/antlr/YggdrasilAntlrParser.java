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
		OP_NOT=7, OP_AT=8, OP_HASH=9, OP_CONCAT=10, OP_OR=11, OP_GT=12, OP_UNTAG=13, 
		COLON=14, KW_GRAMMAR=15, KW_IMPORT=16, KW_CLASS=17, KW_UNION=18, KW_CLIMB=19, 
		KW_TOKEN=20, KW_AS=21, OP_PROPORTION=22, PARENTHESES_L=23, PARENTHESES_R=24, 
		BRACKET_L=25, BRACKET_R=26, BRACE_L=27, BRACE_R=28, GENERIC_L=29, GENERIC_R=30, 
		INTEGER=31, SPECIAL=32, ESCAPED=33, REGEX_RANGE=34, REGEX_FREE=35, STRING_SINGLE=36, 
		STRING_DOUBLE=37, RAW_ID=38, UNICODE_ID=39, WHITE_SPACE=40, LINE_COMMENT=41, 
		BLOCK_COMMENT=42, ERROR_CHARACTAR=43;
	public static final int
		RULE_program = 0, RULE_import_statement = 1, RULE_import_block = 2, RULE_define_grammar = 3, 
		RULE_grammar_block = 4, RULE_define_class = 5, RULE_class_block = 6, RULE_class_expression = 7, 
		RULE_define_union = 8, RULE_union_block = 9, RULE_union_term = 10, RULE_union_expression = 11, 
		RULE_define_climb = 12, RULE_tag_pair = 13, RULE_tag_branch = 14, RULE_define_token = 15, 
		RULE_token_block = 16, RULE_token_pair = 17, RULE_token_expression = 18, 
		RULE_macro_call = 19, RULE_tuple_call = 20, RULE_tuple_block = 21, RULE_suffix = 22, 
		RULE_atomic = 23, RULE_regex = 24, RULE_namepath = 25, RULE_string = 26, 
		RULE_identifier = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_statement", "import_block", "define_grammar", "grammar_block", 
			"define_class", "class_block", "class_expression", "define_union", "union_block", 
			"union_term", "union_expression", "define_climb", "tag_pair", "tag_branch", 
			"define_token", "token_block", "token_pair", "token_expression", "macro_call", 
			"tuple_call", "tuple_block", "suffix", "atomic", "regex", "namepath", 
			"string", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", "'*'", "'+'", "'?'", "'!'", "'@'", "'#'", 
			"'~'", "'|'", "'>'", "'^'", "':'", "'grammar'", "'using'", "'class'", 
			"'union'", "'climb'", "'token'", "'as'", "'::'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'\\u27E8'", "'\\u27E9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "MATCH_MAYBE", "MATCH_MANY", "MATCH_OPTIONAL", 
			"OP_NOT", "OP_AT", "OP_HASH", "OP_CONCAT", "OP_OR", "OP_GT", "OP_UNTAG", 
			"COLON", "KW_GRAMMAR", "KW_IMPORT", "KW_CLASS", "KW_UNION", "KW_CLIMB", 
			"KW_TOKEN", "KW_AS", "OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", 
			"BRACKET_L", "BRACKET_R", "BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", 
			"INTEGER", "SPECIAL", "ESCAPED", "REGEX_RANGE", "REGEX_FREE", "STRING_SINGLE", 
			"STRING_DOUBLE", "RAW_ID", "UNICODE_ID", "WHITE_SPACE", "LINE_COMMENT", 
			"BLOCK_COMMENT", "ERROR_CHARACTAR"
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
		public List<Define_grammarContext> define_grammar() {
			return getRuleContexts(Define_grammarContext.class);
		}
		public Define_grammarContext define_grammar(int i) {
			return getRuleContext(Define_grammarContext.class,i);
		}
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824635785992L) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(56);
					define_grammar();
					}
					break;
				case 2:
					{
					setState(57);
					import_statement();
					}
					break;
				case 3:
					{
					setState(58);
					define_class();
					}
					break;
				case 4:
					{
					setState(59);
					define_union();
					}
					break;
				case 5:
					{
					setState(60);
					define_climb();
					}
					break;
				case 6:
					{
					setState(61);
					define_token();
					}
					break;
				case 7:
					{
					setState(62);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Import_blockContext import_block() {
			return getRuleContext(Import_blockContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(KW_IMPORT);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_ID:
			case UNICODE_ID:
				{
				setState(71);
				identifier();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				{
				setState(72);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(75);
				import_block();
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
	public static class Import_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Import_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterImport_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitImport_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitImport_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_blockContext import_block() throws RecognitionException {
		Import_blockContext _localctx = new Import_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(BRACE_L);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(79);
				identifier();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
	public static class Define_grammarContext extends ParserRuleContext {
		public TerminalNode KW_GRAMMAR() { return getToken(YggdrasilAntlrParser.KW_GRAMMAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Grammar_blockContext grammar_block() {
			return getRuleContext(Grammar_blockContext.class,0);
		}
		public Define_grammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_grammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_grammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_grammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_grammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_grammarContext define_grammar() throws RecognitionException {
		Define_grammarContext _localctx = new Define_grammarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_grammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(KW_GRAMMAR);
			setState(88);
			identifier();
			setState(89);
			grammar_block();
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
	public static class Grammar_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public Grammar_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGrammar_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGrammar_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGrammar_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_blockContext grammar_block() throws RecognitionException {
		Grammar_blockContext _localctx = new Grammar_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grammar_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(BRACE_L);
			setState(92);
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
	public static class Define_classContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
		public TerminalNode KW_CLASS() { return getToken(YggdrasilAntlrParser.KW_CLASS, 0); }
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
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
		enterRule(_localctx, 10, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(94);
				macro_call();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(100);
				((Define_classContext)_localctx).identifier = identifier();
				((Define_classContext)_localctx).mods.add(((Define_classContext)_localctx).identifier);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(KW_CLASS);
			setState(107);
			((Define_classContext)_localctx).name = identifier();
			setState(108);
			class_block();
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
	public static class Class_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
		}
		public Class_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterClass_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitClass_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitClass_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_blockContext class_block() throws RecognitionException {
		Class_blockContext _localctx = new Class_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(BRACE_L);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_OR) {
				{
				setState(111);
				match(OP_OR);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1097372541312L) != 0)) {
				{
				{
				setState(114);
				class_expression(0);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
	public static class Class_expressionContext extends ParserRuleContext {
		public Class_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_expression; }
	 
		public Class_expressionContext() { }
		public void copyFrom(Class_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSuffixContext extends Class_expressionContext {
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public CSuffixContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CCallContext extends Class_expressionContext {
		public Tuple_callContext tuple_call() {
			return getRuleContext(Tuple_callContext.class,0);
		}
		public CCallContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CETagContext extends Class_expressionContext {
		public Tag_pairContext tag_pair() {
			return getRuleContext(Tag_pairContext.class,0);
		}
		public CETagContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCETag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCETag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCETag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CUntagContext extends Class_expressionContext {
		public TerminalNode OP_UNTAG() { return getToken(YggdrasilAntlrParser.OP_UNTAG, 0); }
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public CUntagContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCUntag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCUntag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCUntag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CSoftContext extends Class_expressionContext {
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
		}
		public CSoftContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCSoft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCSoft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCSoft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CHardContext extends Class_expressionContext {
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
		}
		public TerminalNode OP_CONCAT() { return getToken(YggdrasilAntlrParser.OP_CONCAT, 0); }
		public CHardContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCHard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCHard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCHard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CPatternContext extends Class_expressionContext {
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
		}
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public CPatternContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CGroupContext extends Class_expressionContext {
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public CGroupContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends Class_expressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public AtomContext(Class_expressionContext ctx) { copyFrom(ctx); }
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
	public static class CNotContext extends Class_expressionContext {
		public TerminalNode OP_NOT() { return getToken(YggdrasilAntlrParser.OP_NOT, 0); }
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public CNotContext(Class_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterCNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitCNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitCNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_expressionContext class_expression() throws RecognitionException {
		return class_expression(0);
	}

	private Class_expressionContext class_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Class_expressionContext _localctx = new Class_expressionContext(_ctx, _parentState);
		Class_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_class_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CETagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				tag_pair();
				}
				break;
			case 2:
				{
				_localctx = new CUntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(OP_UNTAG);
				setState(125);
				class_expression(8);
				}
				break;
			case 3:
				{
				_localctx = new CNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(OP_NOT);
				setState(127);
				class_expression(7);
				}
				break;
			case 4:
				{
				_localctx = new CGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(PARENTHESES_L);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_OR) {
					{
					setState(129);
					match(OP_OR);
					}
				}

				setState(132);
				class_expression(0);
				setState(133);
				match(PARENTHESES_R);
				}
				break;
			case 5:
				{
				_localctx = new CCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				tuple_call();
				}
				break;
			case 6:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new CHardContext(new Class_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140);
						match(OP_CONCAT);
						setState(141);
						class_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new CSoftContext(new Class_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						class_expression(6);
						}
						break;
					case 3:
						{
						_localctx = new CPatternContext(new Class_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						match(OP_OR);
						setState(146);
						class_expression(5);
						}
						break;
					case 4:
						{
						_localctx = new CSuffixContext(new Class_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(147);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(148);
						suffix();
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class Define_unionContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
		public TerminalNode KW_UNION() { return getToken(YggdrasilAntlrParser.KW_UNION, 0); }
		public Union_blockContext union_block() {
			return getRuleContext(Union_blockContext.class,0);
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
		enterRule(_localctx, 16, RULE_define_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(154);
				macro_call();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(160);
				((Define_unionContext)_localctx).identifier = identifier();
				((Define_unionContext)_localctx).mods.add(((Define_unionContext)_localctx).identifier);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(KW_UNION);
			setState(167);
			((Define_unionContext)_localctx).name = identifier();
			setState(168);
			union_block();
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
	public static class Union_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public List<Union_termContext> union_term() {
			return getRuleContexts(Union_termContext.class);
		}
		public Union_termContext union_term(int i) {
			return getRuleContext(Union_termContext.class,i);
		}
		public Union_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUnion_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUnion_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUnion_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_blockContext union_block() throws RecognitionException {
		Union_blockContext _localctx = new Union_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_union_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(BRACE_L);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(171);
				union_term();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
	public static class Union_termContext extends ParserRuleContext {
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public List<Union_expressionContext> union_expression() {
			return getRuleContexts(Union_expressionContext.class);
		}
		public Union_expressionContext union_expression(int i) {
			return getRuleContext(Union_expressionContext.class,i);
		}
		public Tag_branchContext tag_branch() {
			return getRuleContext(Tag_branchContext.class,0);
		}
		public Union_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUnion_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUnion_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUnion_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_termContext union_term() throws RecognitionException {
		Union_termContext _localctx = new Union_termContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_union_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(OP_OR);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1097372541312L) != 0)) {
				{
				{
				setState(180);
				union_expression(0);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_HASH) {
				{
				setState(186);
				tag_branch();
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
	public static class Union_expressionContext extends ParserRuleContext {
		public Union_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_expression; }
	 
		public Union_expressionContext() { }
		public void copyFrom(Union_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UHardContext extends Union_expressionContext {
		public List<Union_expressionContext> union_expression() {
			return getRuleContexts(Union_expressionContext.class);
		}
		public Union_expressionContext union_expression(int i) {
			return getRuleContext(Union_expressionContext.class,i);
		}
		public TerminalNode OP_CONCAT() { return getToken(YggdrasilAntlrParser.OP_CONCAT, 0); }
		public UHardContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUHard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUHard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUHard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UUntagContext extends Union_expressionContext {
		public TerminalNode OP_UNTAG() { return getToken(YggdrasilAntlrParser.OP_UNTAG, 0); }
		public Union_expressionContext union_expression() {
			return getRuleContext(Union_expressionContext.class,0);
		}
		public UUntagContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUUntag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUUntag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUUntag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class USuffixContext extends Union_expressionContext {
		public Union_expressionContext union_expression() {
			return getRuleContext(Union_expressionContext.class,0);
		}
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public USuffixContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UGroupContext extends Union_expressionContext {
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public UGroupContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UETagContext extends Union_expressionContext {
		public Tag_pairContext tag_pair() {
			return getRuleContext(Tag_pairContext.class,0);
		}
		public UETagContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUETag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUETag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUETag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UtomContext extends Union_expressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public UtomContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UNotContext extends Union_expressionContext {
		public TerminalNode OP_NOT() { return getToken(YggdrasilAntlrParser.OP_NOT, 0); }
		public Union_expressionContext union_expression() {
			return getRuleContext(Union_expressionContext.class,0);
		}
		public UNotContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class USoftContext extends Union_expressionContext {
		public List<Union_expressionContext> union_expression() {
			return getRuleContexts(Union_expressionContext.class);
		}
		public Union_expressionContext union_expression(int i) {
			return getRuleContext(Union_expressionContext.class,i);
		}
		public USoftContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUSoft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUSoft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUSoft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UCallContext extends Union_expressionContext {
		public Tuple_callContext tuple_call() {
			return getRuleContext(Tuple_callContext.class,0);
		}
		public UCallContext(Union_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_expressionContext union_expression() throws RecognitionException {
		return union_expression(0);
	}

	private Union_expressionContext union_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Union_expressionContext _localctx = new Union_expressionContext(_ctx, _parentState);
		Union_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_union_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UETagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				tag_pair();
				}
				break;
			case 2:
				{
				_localctx = new UUntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(OP_UNTAG);
				setState(192);
				union_expression(7);
				}
				break;
			case 3:
				{
				_localctx = new UNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(OP_NOT);
				setState(194);
				union_expression(6);
				}
				break;
			case 4:
				{
				_localctx = new UGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(PARENTHESES_L);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_OR) {
					{
					setState(196);
					match(OP_OR);
					}
				}

				setState(199);
				class_expression(0);
				setState(200);
				match(PARENTHESES_R);
				}
				break;
			case 5:
				{
				_localctx = new UCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				tuple_call();
				}
				break;
			case 6:
				{
				_localctx = new UtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new UHardContext(new Union_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union_expression);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						match(OP_CONCAT);
						setState(208);
						union_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new USoftContext(new Union_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union_expression);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						union_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new USuffixContext(new Union_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union_expression);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						suffix();
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class Define_climbContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
		public TerminalNode KW_CLIMB() { return getToken(YggdrasilAntlrParser.KW_CLIMB, 0); }
		public Union_blockContext union_block() {
			return getRuleContext(Union_blockContext.class,0);
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
		enterRule(_localctx, 24, RULE_define_climb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(218);
				macro_call();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(224);
				((Define_climbContext)_localctx).identifier = identifier();
				((Define_climbContext)_localctx).mods.add(((Define_climbContext)_localctx).identifier);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(KW_CLIMB);
			setState(231);
			((Define_climbContext)_localctx).name = identifier();
			setState(232);
			union_block();
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
	public static class Tag_pairContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public Tag_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterTag_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitTag_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitTag_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_pairContext tag_pair() throws RecognitionException {
		Tag_pairContext _localctx = new Tag_pairContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tag_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			identifier();
			setState(235);
			match(COLON);
			setState(236);
			identifier();
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(237);
				suffix();
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
	public static class Tag_branchContext extends ParserRuleContext {
		public TerminalNode OP_HASH() { return getToken(YggdrasilAntlrParser.OP_HASH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_GT() { return getToken(YggdrasilAntlrParser.OP_GT, 0); }
		public Tag_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterTag_branch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitTag_branch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitTag_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_branchContext tag_branch() throws RecognitionException {
		Tag_branchContext _localctx = new Tag_branchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tag_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OP_HASH);
			setState(241);
			identifier();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_GT) {
				{
				setState(242);
				match(OP_GT);
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
	public static class Define_tokenContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext name;
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
		enterRule(_localctx, 30, RULE_define_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(245);
				macro_call();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(251);
				((Define_tokenContext)_localctx).identifier = identifier();
				((Define_tokenContext)_localctx).mods.add(((Define_tokenContext)_localctx).identifier);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(KW_TOKEN);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(258);
				((Define_tokenContext)_localctx).name = identifier();
				}
			}

			setState(261);
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
		enterRule(_localctx, 32, RULE_token_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(BRACE_L);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824633721608L) != 0)) {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_AT:
				case OP_HASH:
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(264);
					token_pair();
					}
					break;
				case SEMICOLON:
					{
					setState(265);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
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
		enterRule(_localctx, 34, RULE_token_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(273);
				macro_call();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			identifier();
			setState(280);
			match(COLON);
			setState(281);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_token_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(284);
			atomic();
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TOrContext(new Token_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_token_expression);
					setState(286);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(287);
					match(OP_OR);
					setState(288);
					token_expression(3);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 38, RULE_macro_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==OP_AT || _la==OP_HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(295);
			namepath();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(296);
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
	public static class Tuple_callContext extends ParserRuleContext {
		public TerminalNode OP_AT() { return getToken(YggdrasilAntlrParser.OP_AT, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Tuple_blockContext tuple_block() {
			return getRuleContext(Tuple_blockContext.class,0);
		}
		public Tuple_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterTuple_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitTuple_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitTuple_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_callContext tuple_call() throws RecognitionException {
		Tuple_callContext _localctx = new Tuple_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tuple_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(OP_AT);
			setState(300);
			namepath();
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(301);
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
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
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
		enterRule(_localctx, 42, RULE_tuple_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(PARENTHESES_L);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1097372541312L) != 0)) {
				{
				setState(305);
				class_expression(0);
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(COMMA);
						setState(307);
						class_expression(0);
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(313);
					match(COMMA);
					}
				}

				}
			}

			setState(318);
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
	public static class SuffixContext extends ParserRuleContext {
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
	 
		public SuffixContext() { }
		public void copyFrom(SuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaybeContext extends SuffixContext {
		public TerminalNode MATCH_MAYBE() { return getToken(YggdrasilAntlrParser.MATCH_MAYBE, 0); }
		public TerminalNode MATCH_OPTIONAL() { return getToken(YggdrasilAntlrParser.MATCH_OPTIONAL, 0); }
		public MaybeContext(SuffixContext ctx) { copyFrom(ctx); }
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
	public static class OptionalContext extends SuffixContext {
		public TerminalNode MATCH_OPTIONAL() { return getToken(YggdrasilAntlrParser.MATCH_OPTIONAL, 0); }
		public OptionalContext(SuffixContext ctx) { copyFrom(ctx); }
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
	public static class MaybeGreedyContext extends SuffixContext {
		public TerminalNode MATCH_MAYBE() { return getToken(YggdrasilAntlrParser.MATCH_MAYBE, 0); }
		public MaybeGreedyContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterMaybeGreedy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitMaybeGreedy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitMaybeGreedy(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyGreedyContext extends SuffixContext {
		public TerminalNode MATCH_MANY() { return getToken(YggdrasilAntlrParser.MATCH_MANY, 0); }
		public ManyGreedyContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterManyGreedy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitManyGreedy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitManyGreedy(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyContext extends SuffixContext {
		public TerminalNode MATCH_MANY() { return getToken(YggdrasilAntlrParser.MATCH_MANY, 0); }
		public TerminalNode MATCH_OPTIONAL() { return getToken(YggdrasilAntlrParser.MATCH_OPTIONAL, 0); }
		public ManyContext(SuffixContext ctx) { copyFrom(ctx); }
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

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_suffix);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new OptionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(MATCH_OPTIONAL);
				}
				break;
			case 2:
				_localctx = new MaybeGreedyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(MATCH_MAYBE);
				}
				break;
			case 3:
				_localctx = new MaybeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(MATCH_MAYBE);
				setState(323);
				match(MATCH_OPTIONAL);
				}
				break;
			case 4:
				_localctx = new ManyGreedyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(MATCH_MANY);
				}
				break;
			case 5:
				_localctx = new ManyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(MATCH_MANY);
				setState(326);
				match(MATCH_OPTIONAL);
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
	public static class AtomicContext extends ParserRuleContext {
		public Tuple_callContext tuple_call() {
			return getRuleContext(Tuple_callContext.class,0);
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
		enterRule(_localctx, 46, RULE_atomic);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				tuple_call();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				namepath();
				}
				break;
			case REGEX_RANGE:
			case REGEX_FREE:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				regex();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(INTEGER);
				}
				break;
			case SPECIAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				match(SPECIAL);
				}
				break;
			case ESCAPED:
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
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
		enterRule(_localctx, 48, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		enterRule(_localctx, 50, RULE_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			identifier();
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==OP_PROPORTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
					identifier();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 52, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 54, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		case 7:
			return class_expression_sempred((Class_expressionContext)_localctx, predIndex);
		case 11:
			return union_expression_sempred((Union_expressionContext)_localctx, predIndex);
		case 18:
			return token_expression_sempred((Token_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean class_expression_sempred(Class_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean union_expression_sempred(Union_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean token_expression_sempred(Token_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0161\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001"+
		"\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Q\b\u0002\n\u0002\f\u0002T\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005\u0001\u0005"+
		"\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006q\b\u0006"+
		"\u0001\u0006\u0005\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008a\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0096\b\u0007"+
		"\n\u0007\f\u0007\u0099\t\u0007\u0001\b\u0005\b\u009c\b\b\n\b\f\b\u009f"+
		"\t\b\u0001\b\u0005\b\u00a2\b\b\n\b\f\b\u00a5\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0005\t\u00ad\b\t\n\t\f\t\u00b0\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0005\n\u00b6\b\n\n\n\f\n\u00b9\t\n\u0001\n\u0003"+
		"\n\u00bc\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c6\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cd\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00d6\b\u000b\n\u000b\f\u000b\u00d9\t\u000b\u0001"+
		"\f\u0005\f\u00dc\b\f\n\f\f\f\u00df\t\f\u0001\f\u0005\f\u00e2\b\f\n\f\f"+
		"\f\u00e5\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ef\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f4"+
		"\b\u000e\u0001\u000f\u0005\u000f\u00f7\b\u000f\n\u000f\f\u000f\u00fa\t"+
		"\u000f\u0001\u000f\u0005\u000f\u00fd\b\u000f\n\u000f\f\u000f\u0100\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0104\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u010b\b\u0010\n\u0010"+
		"\f\u0010\u010e\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0005\u0011"+
		"\u0113\b\u0011\n\u0011\f\u0011\u0116\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0122\b\u0012\n\u0012\f\u0012\u0125\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012a\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u012f\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0135\b\u0015\n\u0015\f\u0015\u0138"+
		"\t\u0015\u0001\u0015\u0003\u0015\u013b\b\u0015\u0003\u0015\u013d\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0148\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0151\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0158\b\u0019\n\u0019\f\u0019\u015b\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0003\u000e"+
		"\u0016$\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0005\u0001\u0000\b\t\u0001"+
		"\u0000\"#\u0002\u0000\u0001\u0001\u0016\u0016\u0001\u0000$%\u0001\u0000"+
		"&\'\u0185\u0000A\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000"+
		"\u0004N\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\b[\u0001"+
		"\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000"+
		"\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000"+
		"\u0012\u00aa\u0001\u0000\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000"+
		"\u0016\u00cc\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000\u0000\u0000"+
		"\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000\u0000\u0000"+
		"\u001e\u00f8\u0001\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000\""+
		"\u0114\u0001\u0000\u0000\u0000$\u011b\u0001\u0000\u0000\u0000&\u0126\u0001"+
		"\u0000\u0000\u0000(\u012b\u0001\u0000\u0000\u0000*\u0130\u0001\u0000\u0000"+
		"\u0000,\u0147\u0001\u0000\u0000\u0000.\u0150\u0001\u0000\u0000\u00000"+
		"\u0152\u0001\u0000\u0000\u00002\u0154\u0001\u0000\u0000\u00004\u015c\u0001"+
		"\u0000\u0000\u00006\u015e\u0001\u0000\u0000\u00008@\u0003\u0006\u0003"+
		"\u00009@\u0003\u0002\u0001\u0000:@\u0003\n\u0005\u0000;@\u0003\u0010\b"+
		"\u0000<@\u0003\u0018\f\u0000=@\u0003\u001e\u000f\u0000>@\u0005\u0003\u0000"+
		"\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001\u0000"+
		"\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0000\u0000\u0001E\u0001\u0001"+
		"\u0000\u0000\u0000FI\u0005\u0010\u0000\u0000GJ\u00036\u001b\u0000HJ\u0003"+
		"4\u001a\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JL\u0001"+
		"\u0000\u0000\u0000KM\u0003\u0004\u0002\u0000LK\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NR\u0005\u001b"+
		"\u0000\u0000OQ\u00036\u001b\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005\u001c\u0000\u0000"+
		"V\u0005\u0001\u0000\u0000\u0000WX\u0005\u000f\u0000\u0000XY\u00036\u001b"+
		"\u0000YZ\u0003\b\u0004\u0000Z\u0007\u0001\u0000\u0000\u0000[\\\u0005\u001b"+
		"\u0000\u0000\\]\u0005\u001c\u0000\u0000]\t\u0001\u0000\u0000\u0000^`\u0003"+
		"&\u0013\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bg\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000df\u00036\u001b\u0000ed\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0011"+
		"\u0000\u0000kl\u00036\u001b\u0000lm\u0003\f\u0006\u0000m\u000b\u0001\u0000"+
		"\u0000\u0000np\u0005\u001b\u0000\u0000oq\u0005\u000b\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qu\u0001\u0000\u0000\u0000"+
		"rt\u0003\u000e\u0007\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u001c\u0000\u0000y\r\u0001"+
		"\u0000\u0000\u0000z{\u0006\u0007\uffff\uffff\u0000{\u008a\u0003\u001a"+
		"\r\u0000|}\u0005\r\u0000\u0000}\u008a\u0003\u000e\u0007\b~\u007f\u0005"+
		"\u0007\u0000\u0000\u007f\u008a\u0003\u000e\u0007\u0007\u0080\u0082\u0005"+
		"\u0017\u0000\u0000\u0081\u0083\u0005\u000b\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000\u0085\u0086\u0005"+
		"\u0018\u0000\u0000\u0086\u008a\u0001\u0000\u0000\u0000\u0087\u008a\u0003"+
		"(\u0014\u0000\u0088\u008a\u0003.\u0017\u0000\u0089z\u0001\u0000\u0000"+
		"\u0000\u0089|\u0001\u0000\u0000\u0000\u0089~\u0001\u0000\u0000\u0000\u0089"+
		"\u0080\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0097\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\n\u0006\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u0096"+
		"\u0003\u000e\u0007\u0007\u008e\u008f\n\u0005\u0000\u0000\u008f\u0096\u0003"+
		"\u000e\u0007\u0006\u0090\u0091\n\u0004\u0000\u0000\u0091\u0092\u0005\u000b"+
		"\u0000\u0000\u0092\u0096\u0003\u000e\u0007\u0005\u0093\u0094\n\n\u0000"+
		"\u0000\u0094\u0096\u0003,\u0016\u0000\u0095\u008b\u0001\u0000\u0000\u0000"+
		"\u0095\u008e\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0003&\u0013\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u00036\u001b\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0012\u0000\u0000\u00a7\u00a8\u00036\u001b\u0000\u00a8\u00a9\u0003"+
		"\u0012\t\u0000\u00a9\u0011\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005\u001b"+
		"\u0000\u0000\u00ab\u00ad\u0003\u0014\n\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001c\u0000"+
		"\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b7\u0005\u000b\u0000"+
		"\u0000\u00b4\u00b6\u0003\u0016\u000b\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u001c\u000e"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\u000b\uffff"+
		"\uffff\u0000\u00be\u00cd\u0003\u001a\r\u0000\u00bf\u00c0\u0005\r\u0000"+
		"\u0000\u00c0\u00cd\u0003\u0016\u000b\u0007\u00c1\u00c2\u0005\u0007\u0000"+
		"\u0000\u00c2\u00cd\u0003\u0016\u000b\u0006\u00c3\u00c5\u0005\u0017\u0000"+
		"\u0000\u00c4\u00c6\u0005\u000b\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8\u00c9\u0005\u0018\u0000"+
		"\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003(\u0014\u0000"+
		"\u00cb\u00cd\u0003.\u0017\u0000\u00cc\u00bd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00cc\u00c1\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c3\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d7\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\n\u0005\u0000\u0000\u00cf\u00d0\u0005\n\u0000\u0000\u00d0\u00d6"+
		"\u0003\u0016\u000b\u0006\u00d1\u00d2\n\u0004\u0000\u0000\u00d2\u00d6\u0003"+
		"\u0016\u000b\u0005\u00d3\u00d4\n\t\u0000\u0000\u00d4\u00d6\u0003,\u0016"+
		"\u0000\u00d5\u00ce\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u0017\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00da\u00dc\u0003&\u0013\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e3\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e2\u00036\u001b\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005\u0013\u0000\u0000\u00e7\u00e8\u00036\u001b\u0000\u00e8\u00e9"+
		"\u0003\u0012\t\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003"+
		"6\u001b\u0000\u00eb\u00ec\u0005\u000e\u0000\u0000\u00ec\u00ee\u00036\u001b"+
		"\u0000\u00ed\u00ef\u0003,\u0016\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u001b\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\t\u0000\u0000\u00f1\u00f3\u00036\u001b\u0000\u00f2"+
		"\u00f4\u0005\f\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u001d\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u0003&\u0013\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fe\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u00036\u001b\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0005\u0014"+
		"\u0000\u0000\u0102\u0104\u00036\u001b\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0003 \u0010\u0000\u0106\u001f\u0001\u0000\u0000\u0000"+
		"\u0107\u010c\u0005\u001b\u0000\u0000\u0108\u010b\u0003\"\u0011\u0000\u0109"+
		"\u010b\u0005\u0003\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\u001c\u0000\u0000\u0110!\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0003&\u0013\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001"+
		"\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u00036\u001b\u0000\u0118\u0119\u0005\u000e"+
		"\u0000\u0000\u0119\u011a\u0003$\u0012\u0000\u011a#\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0006\u0012\uffff\uffff\u0000\u011c\u011d\u0003.\u0017\u0000"+
		"\u011d\u0123\u0001\u0000\u0000\u0000\u011e\u011f\n\u0002\u0000\u0000\u011f"+
		"\u0120\u0005\u000b\u0000\u0000\u0120\u0122\u0003$\u0012\u0003\u0121\u011e"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124%\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0007"+
		"\u0000\u0000\u0000\u0127\u0129\u00032\u0019\u0000\u0128\u012a\u0003*\u0015"+
		"\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\'\u0001\u0000\u0000\u0000\u012b\u012c\u0005\b\u0000\u0000"+
		"\u012c\u012e\u00032\u0019\u0000\u012d\u012f\u0003*\u0015\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f)\u0001"+
		"\u0000\u0000\u0000\u0130\u013c\u0005\u0017\u0000\u0000\u0131\u0136\u0003"+
		"\u000e\u0007\u0000\u0132\u0133\u0005\u0002\u0000\u0000\u0133\u0135\u0003"+
		"\u000e\u0007\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0139\u013b\u0005\u0002\u0000\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001"+
		"\u0000\u0000\u0000\u013c\u0131\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0005"+
		"\u0018\u0000\u0000\u013f+\u0001\u0000\u0000\u0000\u0140\u0148\u0005\u0006"+
		"\u0000\u0000\u0141\u0148\u0005\u0004\u0000\u0000\u0142\u0143\u0005\u0004"+
		"\u0000\u0000\u0143\u0148\u0005\u0006\u0000\u0000\u0144\u0148\u0005\u0005"+
		"\u0000\u0000\u0145\u0146\u0005\u0005\u0000\u0000\u0146\u0148\u0005\u0006"+
		"\u0000\u0000\u0147\u0140\u0001\u0000\u0000\u0000\u0147\u0141\u0001\u0000"+
		"\u0000\u0000\u0147\u0142\u0001\u0000\u0000\u0000\u0147\u0144\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148-\u0001\u0000\u0000"+
		"\u0000\u0149\u0151\u0003(\u0014\u0000\u014a\u0151\u00034\u001a\u0000\u014b"+
		"\u0151\u00032\u0019\u0000\u014c\u0151\u00030\u0018\u0000\u014d\u0151\u0005"+
		"\u001f\u0000\u0000\u014e\u0151\u0005 \u0000\u0000\u014f\u0151\u0005!\u0000"+
		"\u0000\u0150\u0149\u0001\u0000\u0000\u0000\u0150\u014a\u0001\u0000\u0000"+
		"\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0150\u014c\u0001\u0000\u0000"+
		"\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151/\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0007\u0001\u0000\u0000\u01531\u0001\u0000\u0000\u0000\u0154"+
		"\u0159\u00036\u001b\u0000\u0155\u0156\u0007\u0002\u0000\u0000\u0156\u0158"+
		"\u00036\u001b\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0001"+
		"\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a3\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0007\u0003\u0000\u0000\u015d5\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0007\u0004\u0000\u0000\u015f7\u0001\u0000\u0000\u0000"+
		")?AILRagpu\u0082\u0089\u0095\u0097\u009d\u00a3\u00ae\u00b7\u00bb\u00c5"+
		"\u00cc\u00d5\u00d7\u00dd\u00e3\u00ee\u00f3\u00f8\u00fe\u0103\u010a\u010c"+
		"\u0114\u0123\u0129\u012e\u0136\u013a\u013c\u0147\u0150\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}