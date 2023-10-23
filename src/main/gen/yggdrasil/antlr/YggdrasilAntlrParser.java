// Generated from C:/Users/Dell/IdeaProjects/yggdrasil-intellij/src/main/antlr/YggdrasilAntlr.g4 by ANTLR 4.13.1
package yggdrasil.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class YggdrasilAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, COLON=3, SEMICOLON=4, MATCH_MANY=5, MATCH_MANY1=6, MATCH_OPTIONAL=7, 
		OP_NOT=8, OP_AT=9, OP_HASH=10, OP_CONCAT=11, OP_OR=12, OP_GT=13, OP_UNTAG=14, 
		OP_TO=15, OP_ASSIGN=16, OP_SLICE=17, OP_PEEK_ALL=18, KW_GRAMMAR=19, KW_MACRO=20, 
		KW_IMPORT=21, KW_AS=22, KW_CLASS=23, KW_UNION=24, KW_CLIMB=25, KW_GROUP=26, 
		KW_EXTERNAL=27, KW_INSPECTOR=28, OP_CATEGORY=29, OP_PROPORTION=30, PARENTHESES_L=31, 
		PARENTHESES_R=32, BRACKET_L=33, BRACKET_R=34, BRACE_L=35, BRACE_R=36, 
		KW_PULL=37, KW_PUSH=38, KW_PEEK=39, KW_DROP=40, INTEGER=41, KW_ANY=42, 
		BOOLEAN=43, ESCAPED=44, REGEX_RANGE=45, REGEX_FREE=46, STRING_SINGLE=47, 
		STRING_DOUBLE=48, RAW_ID=49, UNICODE_ID=50, WHITE_SPACE=51, LINE_COMMENT=52, 
		BLOCK_COMMENT=53, ERROR_CHARACTAR=54;
	public static final int
		RULE_program = 0, RULE_import_statement = 1, RULE_import_block = 2, RULE_define_grammar = 3, 
		RULE_grammar_block = 4, RULE_grammar_pair = 5, RULE_grammar_key = 6, RULE_grammar_value = 7, 
		RULE_define_class = 8, RULE_class_block = 9, RULE_class_expression = 10, 
		RULE_class_tag = 11, RULE_define_union = 12, RULE_union_block = 13, RULE_union_term = 14, 
		RULE_union_expression = 15, RULE_union_tag = 16, RULE_define_climb = 17, 
		RULE_tag_branch = 18, RULE_define_group = 19, RULE_group_block = 20, RULE_group_pair = 21, 
		RULE_group_expression = 22, RULE_define_external = 23, RULE_external_block = 24, 
		RULE_external_pair = 25, RULE_define_inspector = 26, RULE_define_function = 27, 
		RULE_function_tuple = 28, RULE_annotation = 29, RULE_modifiers = 30, RULE_macro_call = 31, 
		RULE_tuple_block = 32, RULE_suffix = 33, RULE_ucc = 34, RULE_push = 35, 
		RULE_peek = 36, RULE_atomic = 37, RULE_regex = 38, RULE_namepath = 39, 
		RULE_string = 40, RULE_identifier_free = 41, RULE_identifier = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_statement", "import_block", "define_grammar", "grammar_block", 
			"grammar_pair", "grammar_key", "grammar_value", "define_class", "class_block", 
			"class_expression", "class_tag", "define_union", "union_block", "union_term", 
			"union_expression", "union_tag", "define_climb", "tag_branch", "define_group", 
			"group_block", "group_pair", "group_expression", "define_external", "external_block", 
			"external_pair", "define_inspector", "define_function", "function_tuple", 
			"annotation", "modifiers", "macro_call", "tuple_block", "suffix", "ucc", 
			"push", "peek", "atomic", "regex", "namepath", "string", "identifier_free", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "';'", "'*'", "'+'", "'?'", "'!'", "'@'", 
			"'#'", "'~'", "'|'", "'>'", "'^'", "'->'", "'='", null, "'...'", "'grammar'",
                "'macro'", "'using'", "'as'", null, null, "'climb'", null, null, null,
                "'\\p'", "'::'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'PULL'",
			"'PUSH'", "'PEEK'", "'DROP'", null, "'ANY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "COLON", "SEMICOLON", "MATCH_MANY", "MATCH_MANY1", 
			"MATCH_OPTIONAL", "OP_NOT", "OP_AT", "OP_HASH", "OP_CONCAT", "OP_OR", 
			"OP_GT", "OP_UNTAG", "OP_TO", "OP_ASSIGN", "OP_SLICE", "OP_PEEK_ALL", 
			"KW_GRAMMAR", "KW_MACRO", "KW_IMPORT", "KW_AS", "KW_CLASS", "KW_UNION", 
			"KW_CLIMB", "KW_GROUP", "KW_EXTERNAL", "KW_INSPECTOR", "OP_CATEGORY", 
			"OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", 
			"BRACE_L", "BRACE_R", "KW_PULL", "KW_PUSH", "KW_PEEK", "KW_DROP", "INTEGER", 
			"KW_ANY", "BOOLEAN", "ESCAPED", "REGEX_RANGE", "REGEX_FREE", "STRING_SINGLE", 
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
		public List<Define_groupContext> define_group() {
			return getRuleContexts(Define_groupContext.class);
		}
		public Define_groupContext define_group(int i) {
			return getRuleContext(Define_groupContext.class,i);
		}
		public List<Define_externalContext> define_external() {
			return getRuleContexts(Define_externalContext.class);
		}
		public Define_externalContext define_external(int i) {
			return getRuleContext(Define_externalContext.class,i);
		}
		public List<Define_inspectorContext> define_inspector() {
			return getRuleContexts(Define_inspectorContext.class);
		}
		public Define_inspectorContext define_inspector(int i) {
			return getRuleContext(Define_inspectorContext.class,i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688850392417808L) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(86);
					define_grammar();
					}
					break;
				case 2:
					{
					setState(87);
					import_statement();
					}
					break;
				case 3:
					{
					setState(88);
					define_class();
					}
					break;
				case 4:
					{
					setState(89);
					define_union();
					}
					break;
				case 5:
					{
					setState(90);
					define_climb();
					}
					break;
				case 6:
					{
					setState(91);
					define_group();
					}
					break;
				case 7:
					{
					setState(92);
					define_external();
					}
					break;
				case 8:
					{
					setState(93);
					define_inspector();
					}
					break;
				case 9:
					{
					setState(94);
					define_function();
					}
					break;
				case 10:
					{
					setState(95);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
			setState(103);
			match(KW_IMPORT);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_ID:
			case UNICODE_ID:
				{
				setState(104);
				identifier();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				{
				setState(105);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(108);
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
			setState(111);
			match(BRACE_L);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(112);
				identifier();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public IdentifierContext parent;
		public TerminalNode KW_GRAMMAR() { return getToken(YggdrasilAntlrParser.KW_GRAMMAR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Grammar_blockContext grammar_block() {
			return getRuleContext(Grammar_blockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(KW_GRAMMAR);
			setState(121);
			identifier();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(122);
				match(COLON);
				setState(123);
				((Define_grammarContext)_localctx).parent = identifier();
				}
			}

			setState(126);
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
		public List<Grammar_pairContext> grammar_pair() {
			return getRuleContexts(Grammar_pairContext.class);
		}
		public Grammar_pairContext grammar_pair(int i) {
			return getRuleContext(Grammar_pairContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YggdrasilAntlrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YggdrasilAntlrParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YggdrasilAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YggdrasilAntlrParser.COMMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(BRACE_L);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2111062325329940L) != 0)) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_SINGLE:
				case STRING_DOUBLE:
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(129);
					grammar_pair();
					}
					break;
				case SEMICOLON:
					{
					setState(130);
					match(SEMICOLON);
					}
					break;
				case COMMA:
					{
					setState(131);
					match(COMMA);
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
	public static class Grammar_pairContext extends ParserRuleContext {
		public Grammar_keyContext grammar_key() {
			return getRuleContext(Grammar_keyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public Grammar_valueContext grammar_value() {
			return getRuleContext(Grammar_valueContext.class,0);
		}
		public Grammar_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGrammar_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGrammar_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGrammar_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_pairContext grammar_pair() throws RecognitionException {
		Grammar_pairContext _localctx = new Grammar_pairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grammar_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			grammar_key();
			setState(140);
			match(COLON);
			setState(141);
			grammar_value();
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
	public static class Grammar_keyContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Grammar_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGrammar_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGrammar_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGrammar_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_keyContext grammar_key() throws RecognitionException {
		Grammar_keyContext _localctx = new Grammar_keyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grammar_key);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_SINGLE:
			case STRING_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				identifier();
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
	public static class Grammar_valueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(YggdrasilAntlrParser.BOOLEAN, 0); }
		public Grammar_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGrammar_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGrammar_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGrammar_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_valueContext grammar_value() throws RecognitionException {
		Grammar_valueContext _localctx = new Grammar_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_grammar_value);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_SINGLE:
			case STRING_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				namepath();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(BOOLEAN);
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
	public static class Define_classContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext cast;
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_TO() { return getToken(YggdrasilAntlrParser.OP_TO, 0); }
		public TerminalNode OP_UNTAG() { return getToken(YggdrasilAntlrParser.OP_UNTAG, 0); }
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
		enterRule(_localctx, 16, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(152);
				annotation();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			modifiers();
			setState(159);
			match(KW_CLASS);
			setState(160);
			((Define_classContext)_localctx).name = identifier();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_TO) {
				{
				setState(161);
				match(OP_TO);
				setState(162);
				((Define_classContext)_localctx).cast = identifier();
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_UNTAG) {
				{
				setState(165);
				match(OP_UNTAG);
				}
			}

			setState(168);
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
		enterRule(_localctx, 18, RULE_class_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(BRACE_L);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_OR) {
				{
				setState(171);
				match(OP_OR);
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251665084269312L) != 0)) {
				{
				{
				setState(174);
				class_expression(0);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
	public static class CETagContext extends Class_expressionContext {
		public Class_tagContext class_tag() {
			return getRuleContext(Class_tagContext.class,0);
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
		public Class_expressionContext lhs;
		public Class_expressionContext rhs;
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
		public Class_expressionContext lhs;
		public Class_expressionContext rhs;
		public TerminalNode OP_CONCAT() { return getToken(YggdrasilAntlrParser.OP_CONCAT, 0); }
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
		}
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
		public Class_expressionContext lhs;
		public Class_expressionContext rhs;
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public List<Class_expressionContext> class_expression() {
			return getRuleContexts(Class_expressionContext.class);
		}
		public Class_expressionContext class_expression(int i) {
			return getRuleContext(Class_expressionContext.class,i);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_class_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CETagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				class_tag();
				}
				break;
			case 2:
				{
				_localctx = new CUntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(OP_UNTAG);
				setState(185);
				class_expression(6);
				}
				break;
			case 3:
				{
				_localctx = new CNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(OP_NOT);
				setState(187);
				class_expression(5);
				}
				break;
			case 4:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new CHardContext(new Class_expressionContext(_parentctx, _parentState));
						((CHardContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(OP_CONCAT);
						setState(193);
						((CHardContext)_localctx).rhs = class_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new CSoftContext(new Class_expressionContext(_parentctx, _parentState));
						((CSoftContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						((CSoftContext)_localctx).rhs = class_expression(4);
						}
						break;
					case 3:
						{
						_localctx = new CPatternContext(new Class_expressionContext(_parentctx, _parentState));
						((CPatternContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(OP_OR);
						setState(198);
						((CPatternContext)_localctx).rhs = class_expression(3);
						}
						break;
					case 4:
						{
						_localctx = new CSuffixContext(new Class_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_class_expression);
						setState(199);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(200);
						suffix();
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class Class_tagContext extends ParserRuleContext {
		public Identifier_freeContext identifier_free() {
			return getRuleContext(Identifier_freeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public Class_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterClass_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitClass_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitClass_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_tagContext class_tag() throws RecognitionException {
		Class_tagContext _localctx = new Class_tagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			identifier_free();
			setState(207);
			match(COLON);
			setState(208);
			class_expression(0);
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
		public IdentifierContext name;
		public IdentifierContext cast;
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_TO() { return getToken(YggdrasilAntlrParser.OP_TO, 0); }
		public TerminalNode OP_UNTAG() { return getToken(YggdrasilAntlrParser.OP_UNTAG, 0); }
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
		enterRule(_localctx, 24, RULE_define_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(210);
				annotation();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			modifiers();
			setState(217);
			match(KW_UNION);
			setState(218);
			((Define_unionContext)_localctx).name = identifier();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_TO) {
				{
				setState(219);
				match(OP_TO);
				setState(220);
				((Define_unionContext)_localctx).cast = identifier();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_UNTAG) {
				{
				setState(223);
				match(OP_UNTAG);
				}
			}

			setState(226);
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
		enterRule(_localctx, 26, RULE_union_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BRACE_L);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(229);
				union_term();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
		enterRule(_localctx, 28, RULE_union_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(OP_OR);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251665084269312L) != 0)) {
				{
				{
				setState(238);
				union_expression(0);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_HASH) {
				{
				setState(244);
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
		public Union_expressionContext lhs;
		public Union_expressionContext rhs;
		public TerminalNode OP_CONCAT() { return getToken(YggdrasilAntlrParser.OP_CONCAT, 0); }
		public List<Union_expressionContext> union_expression() {
			return getRuleContexts(Union_expressionContext.class);
		}
		public Union_expressionContext union_expression(int i) {
			return getRuleContext(Union_expressionContext.class,i);
		}
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
	public static class UETagContext extends Union_expressionContext {
		public Union_tagContext union_tag() {
			return getRuleContext(Union_tagContext.class,0);
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
		public Union_expressionContext lhs;
		public Union_expressionContext rhs;
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

	public final Union_expressionContext union_expression() throws RecognitionException {
		return union_expression(0);
	}

	private Union_expressionContext union_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Union_expressionContext _localctx = new Union_expressionContext(_ctx, _parentState);
		Union_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_union_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new UETagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(248);
				union_tag();
				}
				break;
			case 2:
				{
				_localctx = new UUntagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(OP_UNTAG);
				setState(250);
				union_expression(5);
				}
				break;
			case 3:
				{
				_localctx = new UNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(OP_NOT);
				setState(252);
				union_expression(4);
				}
				break;
			case 4:
				{
				_localctx = new UtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new UHardContext(new Union_expressionContext(_parentctx, _parentState));
						((UHardContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_union_expression);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						match(OP_CONCAT);
						setState(258);
						((UHardContext)_localctx).rhs = union_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new USoftContext(new Union_expressionContext(_parentctx, _parentState));
						((USoftContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_union_expression);
						setState(259);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(260);
						((USoftContext)_localctx).rhs = union_expression(3);
						}
						break;
					case 3:
						{
						_localctx = new USuffixContext(new Union_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_union_expression);
						setState(261);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(262);
						suffix();
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class Union_tagContext extends ParserRuleContext {
		public Identifier_freeContext identifier_free() {
			return getRuleContext(Identifier_freeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public Union_expressionContext union_expression() {
			return getRuleContext(Union_expressionContext.class,0);
		}
		public Union_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUnion_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUnion_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUnion_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_tagContext union_tag() throws RecognitionException {
		Union_tagContext _localctx = new Union_tagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_union_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			identifier_free();
			setState(269);
			match(COLON);
			setState(270);
			union_expression(0);
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
		public IdentifierContext name;
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_CLIMB() { return getToken(YggdrasilAntlrParser.KW_CLIMB, 0); }
		public Union_blockContext union_block() {
			return getRuleContext(Union_blockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		enterRule(_localctx, 34, RULE_define_climb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(272);
				annotation();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			modifiers();
			setState(279);
			match(KW_CLIMB);
			setState(280);
			((Define_climbContext)_localctx).name = identifier();
			setState(281);
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
		enterRule(_localctx, 36, RULE_tag_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OP_HASH);
			setState(284);
			identifier();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_GT) {
				{
				setState(285);
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
	public static class Define_groupContext extends ParserRuleContext {
		public IdentifierContext name;
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_GROUP() { return getToken(YggdrasilAntlrParser.KW_GROUP, 0); }
		public Group_blockContext group_block() {
			return getRuleContext(Group_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Define_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_groupContext define_group() throws RecognitionException {
		Define_groupContext _localctx = new Define_groupContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_define_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(288);
				annotation();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			modifiers();
			setState(295);
			match(KW_GROUP);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(296);
				((Define_groupContext)_localctx).name = identifier();
				}
			}

			setState(299);
			group_block();
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
	public static class Group_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public List<Group_pairContext> group_pair() {
			return getRuleContexts(Group_pairContext.class);
		}
		public Group_pairContext group_pair(int i) {
			return getRuleContext(Group_pairContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YggdrasilAntlrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YggdrasilAntlrParser.SEMICOLON, i);
		}
		public Group_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGroup_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGroup_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGroup_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_blockContext group_block() throws RecognitionException {
		Group_blockContext _localctx = new Group_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_group_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(BRACE_L);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688849860265488L) != 0)) {
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_AT:
				case OP_HASH:
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(302);
					group_pair();
					}
					break;
				case SEMICOLON:
					{
					setState(303);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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
	public static class Group_pairContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Group_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterGroup_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitGroup_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitGroup_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_pairContext group_pair() throws RecognitionException {
		Group_pairContext _localctx = new Group_pairContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_group_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(311);
				annotation();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			modifiers();
			setState(318);
			identifier();
			setState(319);
			match(COLON);
			setState(320);
			atomic();
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
	public static class Group_expressionContext extends ParserRuleContext {
		public Group_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_expression; }
	 
		public Group_expressionContext() { }
		public void copyFrom(Group_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TOrContext extends Group_expressionContext {
		public List<Group_expressionContext> group_expression() {
			return getRuleContexts(Group_expressionContext.class);
		}
		public Group_expressionContext group_expression(int i) {
			return getRuleContext(Group_expressionContext.class,i);
		}
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public TOrContext(Group_expressionContext ctx) { copyFrom(ctx); }
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
	public static class TAtomContext extends Group_expressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TAtomContext(Group_expressionContext ctx) { copyFrom(ctx); }
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

	public final Group_expressionContext group_expression() throws RecognitionException {
		return group_expression(0);
	}

	private Group_expressionContext group_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Group_expressionContext _localctx = new Group_expressionContext(_ctx, _parentState);
		Group_expressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_group_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(323);
			atomic();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TOrContext(new Group_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_group_expression);
					setState(325);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(326);
					match(OP_OR);
					setState(327);
					group_expression(3);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
	public static class Define_externalContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_EXTERNAL() { return getToken(YggdrasilAntlrParser.KW_EXTERNAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_blockContext external_block() {
			return getRuleContext(External_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_externalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_external; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_external(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_external(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_external(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_externalContext define_external() throws RecognitionException {
		Define_externalContext _localctx = new Define_externalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_define_external);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(333);
				annotation();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			modifiers();
			setState(340);
			match(KW_EXTERNAL);
			setState(341);
			identifier();
			setState(342);
			external_block();
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
	public static class External_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public List<External_pairContext> external_pair() {
			return getRuleContexts(External_pairContext.class);
		}
		public External_pairContext external_pair(int i) {
			return getRuleContext(External_pairContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YggdrasilAntlrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YggdrasilAntlrParser.SEMICOLON, i);
		}
		public External_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterExternal_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitExternal_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitExternal_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_blockContext external_block() throws RecognitionException {
		External_blockContext _localctx = new External_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_external_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(BRACE_L);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1688849860265488L) != 0)) {
				{
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_AT:
				case OP_HASH:
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(345);
					external_pair();
					}
					break;
				case SEMICOLON:
					{
					setState(346);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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
	public static class External_pairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(YggdrasilAntlrParser.COLON, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public External_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterExternal_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitExternal_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitExternal_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_pairContext external_pair() throws RecognitionException {
		External_pairContext _localctx = new External_pairContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_external_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(354);
				annotation();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			identifier();
			setState(361);
			match(COLON);
			setState(362);
			namepath();
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
	public static class Define_inspectorContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_INSPECTOR() { return getToken(YggdrasilAntlrParser.KW_INSPECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_blockContext external_block() {
			return getRuleContext(External_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_inspectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_inspector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_inspector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_inspector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_inspector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_inspectorContext define_inspector() throws RecognitionException {
		Define_inspectorContext _localctx = new Define_inspectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_define_inspector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT || _la==OP_HASH) {
				{
				{
				setState(364);
				annotation();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			modifiers();
			setState(371);
			match(KW_INSPECTOR);
			setState(372);
			identifier();
			setState(373);
			external_block();
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
	public static class Define_functionContext extends ParserRuleContext {
		public TerminalNode KW_MACRO() { return getToken(YggdrasilAntlrParser.KW_MACRO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_tupleContext function_tuple() {
			return getRuleContext(Function_tupleContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public Define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterDefine_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitDefine_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitDefine_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_functionContext define_function() throws RecognitionException {
		Define_functionContext _localctx = new Define_functionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_define_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(KW_MACRO);
			setState(376);
			identifier();
			setState(377);
			function_tuple();
			setState(378);
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
	public static class Function_tupleContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YggdrasilAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YggdrasilAntlrParser.COMMA, i);
		}
		public Function_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterFunction_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitFunction_tuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitFunction_tuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_tupleContext function_tuple() throws RecognitionException {
		Function_tupleContext _localctx = new Function_tupleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_tuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(PARENTHESES_L);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(381);
				identifier();
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382);
						match(COMMA);
						setState(383);
						identifier();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389);
					match(COMMA);
					}
				}

				}
			}

			setState(394);
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
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode OP_HASH() { return getToken(YggdrasilAntlrParser.OP_HASH, 0); }
		public TerminalNode OP_AT() { return getToken(YggdrasilAntlrParser.OP_AT, 0); }
		public TerminalNode KW_EXTERNAL() { return getToken(YggdrasilAntlrParser.KW_EXTERNAL, 0); }
		public TerminalNode KW_INSPECTOR() { return getToken(YggdrasilAntlrParser.KW_INSPECTOR, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Tuple_blockContext tuple_block() {
			return getRuleContext(Tuple_blockContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==OP_AT || _la==OP_HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_EXTERNAL:
				{
				setState(397);
				match(KW_EXTERNAL);
				}
				break;
			case KW_INSPECTOR:
				{
				setState(398);
				match(KW_INSPECTOR);
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				{
				setState(399);
				namepath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(402);
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
	public static class ModifiersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					identifier();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class Macro_callContext extends ParserRuleContext {
		public TerminalNode OP_AT() { return getToken(YggdrasilAntlrParser.OP_AT, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_macro_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(OP_AT);
			setState(412);
			namepath();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(413);
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
		enterRule(_localctx, 64, RULE_tuple_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(PARENTHESES_L);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251665084269312L) != 0)) {
				{
				setState(417);
				class_expression(0);
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(418);
						match(COMMA);
						setState(419);
						class_expression(0);
						}
						} 
					}
					setState(424);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(425);
					match(COMMA);
					}
				}

				}
			}

			setState(430);
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
	public static class Many1Context extends SuffixContext {
		public TerminalNode MATCH_MANY1() { return getToken(YggdrasilAntlrParser.MATCH_MANY1, 0); }
		public Many1Context(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterMany1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitMany1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitMany1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends SuffixContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public TerminalNode INTEGER() { return getToken(YggdrasilAntlrParser.INTEGER, 0); }
		public IndexContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyContext extends SuffixContext {
		public TerminalNode MATCH_MANY() { return getToken(YggdrasilAntlrParser.MATCH_MANY, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends SuffixContext {
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public TerminalNode COMMA() { return getToken(YggdrasilAntlrParser.COMMA, 0); }
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(YggdrasilAntlrParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(YggdrasilAntlrParser.INTEGER, i);
		}
		public RangeContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_suffix);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new OptionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(MATCH_OPTIONAL);
				}
				break;
			case 2:
				_localctx = new ManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(MATCH_MANY);
				}
				break;
			case 3:
				_localctx = new Many1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(MATCH_MANY1);
				}
				break;
			case 4:
				_localctx = new IndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(BRACE_L);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(436);
					match(INTEGER);
					}
				}

				setState(439);
				match(BRACE_R);
				}
				break;
			case 5:
				_localctx = new RangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(BRACE_L);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(441);
					match(INTEGER);
					}
				}

				setState(444);
				match(COMMA);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(445);
					match(INTEGER);
					}
				}

				setState(448);
				match(BRACE_R);
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
	public static class UccContext extends ParserRuleContext {
		public TerminalNode OP_CATEGORY() { return getToken(YggdrasilAntlrParser.OP_CATEGORY, 0); }
		public TerminalNode BRACE_L() { return getToken(YggdrasilAntlrParser.BRACE_L, 0); }
		public List<TerminalNode> UNICODE_ID() { return getTokens(YggdrasilAntlrParser.UNICODE_ID); }
		public TerminalNode UNICODE_ID(int i) {
			return getToken(YggdrasilAntlrParser.UNICODE_ID, i);
		}
		public TerminalNode BRACE_R() { return getToken(YggdrasilAntlrParser.BRACE_R, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(YggdrasilAntlrParser.OP_ASSIGN, 0); }
		public UccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ucc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterUcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitUcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitUcc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UccContext ucc() throws RecognitionException {
		UccContext _localctx = new UccContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ucc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(OP_CATEGORY);
			setState(452);
			match(BRACE_L);
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(453);
				match(UNICODE_ID);
				setState(454);
				match(OP_ASSIGN);
				}
				break;
			}
			setState(457);
			match(UNICODE_ID);
			setState(458);
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
	public static class PushContext extends ParserRuleContext {
		public TerminalNode KW_PUSH() { return getToken(YggdrasilAntlrParser.KW_PUSH, 0); }
		public Tuple_blockContext tuple_block() {
			return getRuleContext(Tuple_blockContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(KW_PUSH);
			setState(461);
			tuple_block();
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
	public static class PeekContext extends ParserRuleContext {
		public TerminalNode KW_PEEK() { return getToken(YggdrasilAntlrParser.KW_PEEK, 0); }
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(YggdrasilAntlrParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(YggdrasilAntlrParser.INTEGER, i);
		}
		public TerminalNode OP_SLICE() { return getToken(YggdrasilAntlrParser.OP_SLICE, 0); }
		public TerminalNode OP_PEEK_ALL() { return getToken(YggdrasilAntlrParser.OP_PEEK_ALL, 0); }
		public PeekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterPeek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitPeek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitPeek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeekContext peek() throws RecognitionException {
		PeekContext _localctx = new PeekContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_peek);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(KW_PEEK);
				setState(464);
				match(PARENTHESES_L);
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(465);
					match(INTEGER);
					}
					break;
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_SLICE) {
					{
					setState(468);
					match(OP_SLICE);
					}
				}

				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(471);
					match(INTEGER);
					}
				}

				setState(474);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(KW_PEEK);
				setState(476);
				match(PARENTHESES_L);
				setState(477);
				match(OP_PEEK_ALL);
				setState(478);
				match(PARENTHESES_R);
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
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	 
		public AtomicContext() { }
		public void copyFrom(AtomicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class APushContext extends AtomicContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public APushContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAPush(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ADropContext extends AtomicContext {
		public TerminalNode KW_DROP() { return getToken(YggdrasilAntlrParser.KW_DROP, 0); }
		public ADropContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterADrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitADrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitADrop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ACharContext extends AtomicContext {
		public TerminalNode ESCAPED() { return getToken(YggdrasilAntlrParser.ESCAPED, 0); }
		public ACharContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class APeekContext extends AtomicContext {
		public PeekContext peek() {
			return getRuleContext(PeekContext.class,0);
		}
		public APeekContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAPeek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAPeek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAPeek(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AUccContext extends AtomicContext {
		public UccContext ucc() {
			return getRuleContext(UccContext.class,0);
		}
		public AUccContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAUcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAUcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAUcc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ACallContext extends AtomicContext {
		public Macro_callContext macro_call() {
			return getRuleContext(Macro_callContext.class,0);
		}
		public ACallContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterACall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitACall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitACall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AIntContext extends AtomicContext {
		public TerminalNode INTEGER() { return getToken(YggdrasilAntlrParser.INTEGER, 0); }
		public AIntContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AReContext extends AtomicContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public AReContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterARe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitARe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitARe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AAnyContext extends AtomicContext {
		public TerminalNode KW_ANY() { return getToken(YggdrasilAntlrParser.KW_ANY, 0); }
		public AAnyContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAAny(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AGroupContext extends AtomicContext {
		public TerminalNode PARENTHESES_L() { return getToken(YggdrasilAntlrParser.PARENTHESES_L, 0); }
		public Class_expressionContext class_expression() {
			return getRuleContext(Class_expressionContext.class,0);
		}
		public TerminalNode PARENTHESES_R() { return getToken(YggdrasilAntlrParser.PARENTHESES_R, 0); }
		public TerminalNode OP_OR() { return getToken(YggdrasilAntlrParser.OP_OR, 0); }
		public AGroupContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ABoolContext extends AtomicContext {
		public TerminalNode BOOLEAN() { return getToken(YggdrasilAntlrParser.BOOLEAN, 0); }
		public ABoolContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterABool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitABool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitABool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AIdContext extends AtomicContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AIdContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class APullContext extends AtomicContext {
		public TerminalNode KW_PULL() { return getToken(YggdrasilAntlrParser.KW_PULL, 0); }
		public APullContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAPull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAPull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAPull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AStringContext extends AtomicContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AStringContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterAString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitAString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitAString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_atomic);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTHESES_L:
				_localctx = new AGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(PARENTHESES_L);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_OR) {
					{
					setState(482);
					match(OP_OR);
					}
				}

				setState(485);
				class_expression(0);
				setState(486);
				match(PARENTHESES_R);
				}
				break;
			case OP_AT:
				_localctx = new ACallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				macro_call();
				}
				break;
			case STRING_SINGLE:
			case STRING_DOUBLE:
				_localctx = new AStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				string();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				_localctx = new AIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				identifier();
				}
				break;
			case KW_DROP:
				_localctx = new ADropContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(KW_DROP);
				}
				break;
			case KW_PULL:
				_localctx = new APullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				match(KW_PULL);
				}
				break;
			case KW_PUSH:
				_localctx = new APushContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				push();
				}
				break;
			case KW_PEEK:
				_localctx = new APeekContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(494);
				peek();
				}
				break;
			case REGEX_RANGE:
			case REGEX_FREE:
				_localctx = new AReContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				regex();
				}
				break;
			case OP_CATEGORY:
				_localctx = new AUccContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(496);
				ucc();
				}
				break;
			case INTEGER:
				_localctx = new AIntContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(497);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new ABoolContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(498);
				match(BOOLEAN);
				}
				break;
			case KW_ANY:
				_localctx = new AAnyContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(499);
				match(KW_ANY);
				}
				break;
			case ESCAPED:
				_localctx = new ACharContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(500);
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
		enterRule(_localctx, 76, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		enterRule(_localctx, 78, RULE_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			identifier();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==OP_PROPORTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(507);
					identifier();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 80, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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
	public static class Identifier_freeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_CLASS() { return getToken(YggdrasilAntlrParser.KW_CLASS, 0); }
		public TerminalNode KW_UNION() { return getToken(YggdrasilAntlrParser.KW_UNION, 0); }
		public Identifier_freeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_free; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).enterIdentifier_free(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YggdrasilAntlrListener ) ((YggdrasilAntlrListener)listener).exitIdentifier_free(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YggdrasilAntlrVisitor ) return ((YggdrasilAntlrVisitor<? extends T>)visitor).visitIdentifier_free(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_freeContext identifier_free() throws RecognitionException {
		Identifier_freeContext _localctx = new Identifier_freeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identifier_free);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				identifier();
				}
				break;
			case KW_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(KW_CLASS);
				}
				break;
			case KW_UNION:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				match(KW_UNION);
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
		enterRule(_localctx, 84, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		case 10:
			return class_expression_sempred((Class_expressionContext)_localctx, predIndex);
		case 15:
			return union_expression_sempred((Union_expressionContext)_localctx, predIndex);
		case 22:
			return group_expression_sempred((Group_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean class_expression_sempred(Class_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean union_expression_sempred(Union_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean group_expression_sempred(Group_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00016\u020b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000a\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001"+
		"\u0001\u0001\u0003\u0001n\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"r\b\u0002\n\u0002\f\u0002u\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0085\b\u0004\n\u0004\f\u0004\u0088\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0092\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0097"+
		"\b\u0007\u0001\b\u0005\b\u009a\b\b\n\b\f\b\u009d\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00a4\b\b\u0001\b\u0003\b\u00a7\b\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0003\t\u00ad\b\t\u0001\t\u0005\t\u00b0\b\t\n"+
		"\t\f\t\u00b3\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00be\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ca\b\n\n\n\f\n\u00cd"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00d4"+
		"\b\f\n\f\f\f\u00d7\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00de\b\f\u0001\f\u0003\f\u00e1\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005"+
		"\r\u00e7\b\r\n\r\f\r\u00ea\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00f0\b\u000e\n\u000e\f\u000e\u00f3\t\u000e\u0001\u000e\u0003"+
		"\u000e\u00f6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ff\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0108\b\u000f\n\u000f\f\u000f\u010b\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0005\u0011\u0112\b\u0011\n\u0011"+
		"\f\u0011\u0115\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011f\b\u0012"+
		"\u0001\u0013\u0005\u0013\u0122\b\u0013\n\u0013\f\u0013\u0125\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012a\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0131\b\u0014\n"+
		"\u0014\f\u0014\u0134\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0005"+
		"\u0015\u0139\b\u0015\n\u0015\f\u0015\u013c\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0149\b\u0016\n\u0016"+
		"\f\u0016\u014c\t\u0016\u0001\u0017\u0005\u0017\u014f\b\u0017\n\u0017\f"+
		"\u0017\u0152\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u015c\b\u0018\n"+
		"\u0018\f\u0018\u015f\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005"+
		"\u0019\u0164\b\u0019\n\u0019\f\u0019\u0167\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0005\u001a\u016e\b\u001a\n\u001a"+
		"\f\u001a\u0171\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0181\b\u001c"+
		"\n\u001c\f\u001c\u0184\t\u001c\u0001\u001c\u0003\u001c\u0187\b\u001c\u0003"+
		"\u001c\u0189\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0191\b\u001d\u0001\u001d\u0003\u001d\u0194"+
		"\b\u001d\u0001\u001e\u0005\u001e\u0197\b\u001e\n\u001e\f\u001e\u019a\t"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u019f\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u01a5\b \n \f \u01a8\t \u0001 \u0003 \u01ab"+
		"\b \u0003 \u01ad\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01b6\b!\u0001!\u0001!\u0001!\u0003!\u01bb\b!\u0001!\u0001!\u0003!\u01bf"+
		"\b!\u0001!\u0003!\u01c2\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01c8"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0003$\u01d3\b$\u0001$\u0003$\u01d6\b$\u0001$\u0003$\u01d9\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u01e0\b$\u0001%\u0001%\u0003%\u01e4"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01f6\b%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u01fd\b\'\n\'\f\'\u0200\t\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0003)\u0207\b)\u0001*\u0001*\u0001*\u0000\u0003"+
		"\u0014\u001e,+\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000\u0005\u0001"+
		"\u0000\t\n\u0001\u0000-.\u0002\u0000\u0001\u0001\u001e\u001e\u0001\u0000"+
		"/0\u0001\u000012\u0240\u0000b\u0001\u0000\u0000\u0000\u0002g\u0001\u0000"+
		"\u0000\u0000\u0004o\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000"+
		"\b\u0080\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u0091"+
		"\u0001\u0000\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u009b"+
		"\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000\u0014\u00bd"+
		"\u0001\u0000\u0000\u0000\u0016\u00ce\u0001\u0000\u0000\u0000\u0018\u00d5"+
		"\u0001\u0000\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00ed"+
		"\u0001\u0000\u0000\u0000\u001e\u00fe\u0001\u0000\u0000\u0000 \u010c\u0001"+
		"\u0000\u0000\u0000\"\u0113\u0001\u0000\u0000\u0000$\u011b\u0001\u0000"+
		"\u0000\u0000&\u0123\u0001\u0000\u0000\u0000(\u012d\u0001\u0000\u0000\u0000"+
		"*\u013a\u0001\u0000\u0000\u0000,\u0142\u0001\u0000\u0000\u0000.\u0150"+
		"\u0001\u0000\u0000\u00000\u0158\u0001\u0000\u0000\u00002\u0165\u0001\u0000"+
		"\u0000\u00004\u016f\u0001\u0000\u0000\u00006\u0177\u0001\u0000\u0000\u0000"+
		"8\u017c\u0001\u0000\u0000\u0000:\u018c\u0001\u0000\u0000\u0000<\u0198"+
		"\u0001\u0000\u0000\u0000>\u019b\u0001\u0000\u0000\u0000@\u01a0\u0001\u0000"+
		"\u0000\u0000B\u01c1\u0001\u0000\u0000\u0000D\u01c3\u0001\u0000\u0000\u0000"+
		"F\u01cc\u0001\u0000\u0000\u0000H\u01df\u0001\u0000\u0000\u0000J\u01f5"+
		"\u0001\u0000\u0000\u0000L\u01f7\u0001\u0000\u0000\u0000N\u01f9\u0001\u0000"+
		"\u0000\u0000P\u0201\u0001\u0000\u0000\u0000R\u0206\u0001\u0000\u0000\u0000"+
		"T\u0208\u0001\u0000\u0000\u0000Va\u0003\u0006\u0003\u0000Wa\u0003\u0002"+
		"\u0001\u0000Xa\u0003\u0010\b\u0000Ya\u0003\u0018\f\u0000Za\u0003\"\u0011"+
		"\u0000[a\u0003&\u0013\u0000\\a\u0003.\u0017\u0000]a\u00034\u001a\u0000"+
		"^a\u00036\u001b\u0000_a\u0005\u0004\u0000\u0000`V\u0001\u0000\u0000\u0000"+
		"`W\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`Y\u0001\u0000\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000"+
		"\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0000\u0000\u0001f\u0001\u0001\u0000\u0000\u0000gj\u0005"+
		"\u0015\u0000\u0000hk\u0003T*\u0000ik\u0003P(\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000ln\u0003\u0004"+
		"\u0002\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0003"+
		"\u0001\u0000\u0000\u0000os\u0005#\u0000\u0000pr\u0003T*\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0005$\u0000\u0000w\u0005\u0001\u0000\u0000\u0000xy\u0005\u0013"+
		"\u0000\u0000y|\u0003T*\u0000z{\u0005\u0003\u0000\u0000{}\u0003T*\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0003\b\u0004\u0000\u007f\u0007\u0001\u0000\u0000\u0000"+
		"\u0080\u0086\u0005#\u0000\u0000\u0081\u0085\u0003\n\u0005\u0000\u0082"+
		"\u0085\u0005\u0004\u0000\u0000\u0083\u0085\u0005\u0002\u0000\u0000\u0084"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005$\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003\f\u0006\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0003"+
		"\u000e\u0007\u0000\u008e\u000b\u0001\u0000\u0000\u0000\u008f\u0092\u0003"+
		"P(\u0000\u0090\u0092\u0003T*\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093"+
		"\u0097\u0003P(\u0000\u0094\u0097\u0003N\'\u0000\u0095\u0097\u0005+\u0000"+
		"\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u000f\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0003:\u001d\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0003<\u001e\u0000\u009f"+
		"\u00a0\u0005\u0017\u0000\u0000\u00a0\u00a3\u0003T*\u0000\u00a1\u00a2\u0005"+
		"\u000f\u0000\u0000\u00a2\u00a4\u0003T*\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0005\u000e\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0003\u0012\t\u0000\u00a9\u0011\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0005#\u0000\u0000\u00ab\u00ad\u0005\f\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b1\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0014\n\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005$\u0000\u0000\u00b5\u0013\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006"+
		"\n\uffff\uffff\u0000\u00b7\u00be\u0003\u0016\u000b\u0000\u00b8\u00b9\u0005"+
		"\u000e\u0000\u0000\u00b9\u00be\u0003\u0014\n\u0006\u00ba\u00bb\u0005\b"+
		"\u0000\u0000\u00bb\u00be\u0003\u0014\n\u0005\u00bc\u00be\u0003J%\u0000"+
		"\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00cb\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0004\u0000\u0000\u00c0"+
		"\u00c1\u0005\u000b\u0000\u0000\u00c1\u00ca\u0003\u0014\n\u0005\u00c2\u00c3"+
		"\n\u0003\u0000\u0000\u00c3\u00ca\u0003\u0014\n\u0004\u00c4\u00c5\n\u0002"+
		"\u0000\u0000\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00ca\u0003\u0014\n"+
		"\u0003\u00c7\u00c8\n\u0007\u0000\u0000\u00c8\u00ca\u0003B!\u0000\u00c9"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c9\u00c2\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003R)\u0000\u00cf\u00d0\u0005"+
		"\u0003\u0000\u0000\u00d0\u00d1\u0003\u0014\n\u0000\u00d1\u0017\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0003:\u001d\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003<\u001e\u0000"+
		"\u00d9\u00da\u0005\u0018\u0000\u0000\u00da\u00dd\u0003T*\u0000\u00db\u00dc"+
		"\u0005\u000f\u0000\u0000\u00dc\u00de\u0003T*\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0005\u000e\u0000\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000\u00e3\u0019\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e8\u0005#\u0000\u0000\u00e5\u00e7\u0003\u001c\u000e\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005$\u0000\u0000\u00ec\u001b\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f1\u0005\f\u0000\u0000\u00ee\u00f0\u0003\u001e\u000f\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f6"+
		"\u0003$\u0012\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u001d\u0001\u0000\u0000\u0000\u00f7\u00f8\u0006"+
		"\u000f\uffff\uffff\u0000\u00f8\u00ff\u0003 \u0010\u0000\u00f9\u00fa\u0005"+
		"\u000e\u0000\u0000\u00fa\u00ff\u0003\u001e\u000f\u0005\u00fb\u00fc\u0005"+
		"\b\u0000\u0000\u00fc\u00ff\u0003\u001e\u000f\u0004\u00fd\u00ff\u0003J"+
		"%\u0000\u00fe\u00f7\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0109\u0001\u0000\u0000\u0000\u0100\u0101\n\u0003\u0000\u0000"+
		"\u0101\u0102\u0005\u000b\u0000\u0000\u0102\u0108\u0003\u001e\u000f\u0004"+
		"\u0103\u0104\n\u0002\u0000\u0000\u0104\u0108\u0003\u001e\u000f\u0003\u0105"+
		"\u0106\n\u0006\u0000\u0000\u0106\u0108\u0003B!\u0000\u0107\u0100\u0001"+
		"\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u001f\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0003"+
		"R)\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e\u010f\u0003\u001e\u000f"+
		"\u0000\u010f!\u0001\u0000\u0000\u0000\u0110\u0112\u0003:\u001d\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0003<\u001e\u0000\u0117\u0118\u0005\u0019\u0000\u0000\u0118\u0119"+
		"\u0003T*\u0000\u0119\u011a\u0003\u001a\r\u0000\u011a#\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005\n\u0000\u0000\u011c\u011e\u0003T*\u0000\u011d"+
		"\u011f\u0005\r\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f%\u0001\u0000\u0000\u0000\u0120\u0122\u0003"+
		":\u001d\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003<\u001e\u0000\u0127\u0129\u0005\u001a\u0000"+
		"\u0000\u0128\u012a\u0003T*\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0003(\u0014\u0000\u012c\'\u0001\u0000\u0000\u0000\u012d\u0132"+
		"\u0005#\u0000\u0000\u012e\u0131\u0003*\u0015\u0000\u012f\u0131\u0005\u0004"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005$\u0000"+
		"\u0000\u0136)\u0001\u0000\u0000\u0000\u0137\u0139\u0003:\u001d\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0003<\u001e\u0000\u013e\u013f\u0003T*\u0000\u013f\u0140\u0005"+
		"\u0003\u0000\u0000\u0140\u0141\u0003J%\u0000\u0141+\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0006\u0016\uffff\uffff\u0000\u0143\u0144\u0003J%\u0000"+
		"\u0144\u014a\u0001\u0000\u0000\u0000\u0145\u0146\n\u0002\u0000\u0000\u0146"+
		"\u0147\u0005\f\u0000\u0000\u0147\u0149\u0003,\u0016\u0003\u0148\u0145"+
		"\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b-\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014f\u0003"+
		":\u001d\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0003<\u001e\u0000\u0154\u0155\u0005\u001b\u0000"+
		"\u0000\u0155\u0156\u0003T*\u0000\u0156\u0157\u00030\u0018\u0000\u0157"+
		"/\u0001\u0000\u0000\u0000\u0158\u015d\u0005#\u0000\u0000\u0159\u015c\u0003"+
		"2\u0019\u0000\u015a\u015c\u0005\u0004\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0005$\u0000\u0000\u01611\u0001\u0000\u0000\u0000"+
		"\u0162\u0164\u0003:\u001d\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0003T*\u0000\u0169\u016a\u0005"+
		"\u0003\u0000\u0000\u016a\u016b\u0003N\'\u0000\u016b3\u0001\u0000\u0000"+
		"\u0000\u016c\u016e\u0003:\u001d\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0003<\u001e\u0000\u0173"+
		"\u0174\u0005\u001c\u0000\u0000\u0174\u0175\u0003T*\u0000\u0175\u0176\u0003"+
		"0\u0018\u0000\u01765\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0014\u0000"+
		"\u0000\u0178\u0179\u0003T*\u0000\u0179\u017a\u00038\u001c\u0000\u017a"+
		"\u017b\u0003\u0012\t\u0000\u017b7\u0001\u0000\u0000\u0000\u017c\u0188"+
		"\u0005\u001f\u0000\u0000\u017d\u0182\u0003T*\u0000\u017e\u017f\u0005\u0002"+
		"\u0000\u0000\u017f\u0181\u0003T*\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0187\u0005\u0002\u0000\u0000"+
		"\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u017d\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0005 \u0000\u0000\u018b9\u0001\u0000\u0000\u0000\u018c\u0190"+
		"\u0007\u0000\u0000\u0000\u018d\u0191\u0005\u001b\u0000\u0000\u018e\u0191"+
		"\u0005\u001c\u0000\u0000\u018f\u0191\u0003N\'\u0000\u0190\u018d\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0194\u0003"+
		"@ \u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194;\u0001\u0000\u0000\u0000\u0195\u0197\u0003T*\u0000\u0196"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"=\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005\t\u0000\u0000\u019c\u019e\u0003N\'\u0000\u019d\u019f\u0003@ \u0000"+
		"\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019f?\u0001\u0000\u0000\u0000\u01a0\u01ac\u0005\u001f\u0000\u0000\u01a1"+
		"\u01a6\u0003\u0014\n\u0000\u01a2\u01a3\u0005\u0002\u0000\u0000\u01a3\u01a5"+
		"\u0003\u0014\n\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0005\u0002\u0000\u0000\u01aa\u01a9\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ac\u01a1\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		" \u0000\u0000\u01afA\u0001\u0000\u0000\u0000\u01b0\u01c2\u0005\u0007\u0000"+
		"\u0000\u01b1\u01c2\u0005\u0005\u0000\u0000\u01b2\u01c2\u0005\u0006\u0000"+
		"\u0000\u01b3\u01b5\u0005#\u0000\u0000\u01b4\u01b6\u0005)\u0000\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01c2\u0005$\u0000\u0000\u01b8\u01ba"+
		"\u0005#\u0000\u0000\u01b9\u01bb\u0005)\u0000\u0000\u01ba\u01b9\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01be\u0005\u0002\u0000\u0000\u01bd\u01bf\u0005)\u0000"+
		"\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0005$\u0000\u0000"+
		"\u01c1\u01b0\u0001\u0000\u0000\u0000\u01c1\u01b1\u0001\u0000\u0000\u0000"+
		"\u01c1\u01b2\u0001\u0000\u0000\u0000\u01c1\u01b3\u0001\u0000\u0000\u0000"+
		"\u01c1\u01b8\u0001\u0000\u0000\u0000\u01c2C\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\u001d\u0000\u0000\u01c4\u01c7\u0005#\u0000\u0000\u01c5\u01c6"+
		"\u00052\u0000\u0000\u01c6\u01c8\u0005\u0010\u0000\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u00052\u0000\u0000\u01ca\u01cb\u0005$\u0000"+
		"\u0000\u01cbE\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005&\u0000\u0000\u01cd"+
		"\u01ce\u0003@ \u0000\u01ceG\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005"+
		"\'\u0000\u0000\u01d0\u01d2\u0005\u001f\u0000\u0000\u01d1\u01d3\u0005)"+
		"\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01d6\u0005\u0011"+
		"\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d9\u0005)\u0000"+
		"\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01e0\u0005 \u0000\u0000"+
		"\u01db\u01dc\u0005\'\u0000\u0000\u01dc\u01dd\u0005\u001f\u0000\u0000\u01dd"+
		"\u01de\u0005\u0012\u0000\u0000\u01de\u01e0\u0005 \u0000\u0000\u01df\u01cf"+
		"\u0001\u0000\u0000\u0000\u01df\u01db\u0001\u0000\u0000\u0000\u01e0I\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e3\u0005\u001f\u0000\u0000\u01e2\u01e4\u0005"+
		"\f\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003\u0014"+
		"\n\u0000\u01e6\u01e7\u0005 \u0000\u0000\u01e7\u01f6\u0001\u0000\u0000"+
		"\u0000\u01e8\u01f6\u0003>\u001f\u0000\u01e9\u01f6\u0003P(\u0000\u01ea"+
		"\u01f6\u0003T*\u0000\u01eb\u01f6\u0005(\u0000\u0000\u01ec\u01f6\u0005"+
		"%\u0000\u0000\u01ed\u01f6\u0003F#\u0000\u01ee\u01f6\u0003H$\u0000\u01ef"+
		"\u01f6\u0003L&\u0000\u01f0\u01f6\u0003D\"\u0000\u01f1\u01f6\u0005)\u0000"+
		"\u0000\u01f2\u01f6\u0005+\u0000\u0000\u01f3\u01f6\u0005*\u0000\u0000\u01f4"+
		"\u01f6\u0005,\u0000\u0000\u01f5\u01e1\u0001\u0000\u0000\u0000\u01f5\u01e8"+
		"\u0001\u0000\u0000\u0000\u01f5\u01e9\u0001\u0000\u0000\u0000\u01f5\u01ea"+
		"\u0001\u0000\u0000\u0000\u01f5\u01eb\u0001\u0000\u0000\u0000\u01f5\u01ec"+
		"\u0001\u0000\u0000\u0000\u01f5\u01ed\u0001\u0000\u0000\u0000\u01f5\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f5\u01ef\u0001\u0000\u0000\u0000\u01f5\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001\u0000\u0000\u0000\u01f5\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6K\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007"+
		"\u0001\u0000\u0000\u01f8M\u0001\u0000\u0000\u0000\u01f9\u01fe\u0003T*"+
		"\u0000\u01fa\u01fb\u0007\u0002\u0000\u0000\u01fb\u01fd\u0003T*\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"O\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0007\u0003\u0000\u0000\u0202Q\u0001\u0000\u0000\u0000\u0203\u0207\u0003"+
		"T*\u0000\u0204\u0207\u0005\u0017\u0000\u0000\u0205\u0207\u0005\u0018\u0000"+
		"\u0000\u0206\u0203\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000"+
		"\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207S\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0007\u0004\u0000\u0000\u0209U\u0001\u0000\u0000\u0000?`"+
		"bjms|\u0084\u0086\u0091\u0096\u009b\u00a3\u00a6\u00ac\u00b1\u00bd\u00c9"+
		"\u00cb\u00d5\u00dd\u00e0\u00e8\u00f1\u00f5\u00fe\u0107\u0109\u0113\u011e"+
		"\u0123\u0129\u0130\u0132\u013a\u014a\u0150\u015b\u015d\u0165\u016f\u0182"+
		"\u0186\u0188\u0190\u0193\u0198\u019e\u01a6\u01aa\u01ac\u01b5\u01ba\u01be"+
		"\u01c1\u01c7\u01d2\u01d5\u01d8\u01df\u01e3\u01f5\u01fe\u0206";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}