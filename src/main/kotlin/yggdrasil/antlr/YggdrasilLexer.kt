package yggdrasil.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import yggdrasil.antlr.YggdrasilAntlrLexer.*
import yggdrasil.language.YggdrasilLanguage

class YggdrasilLexer : Lexer() {
    private var adaptor: ANTLRLexerAdaptor

    init {
        val lexer = YggdrasilAntlrLexer(null)
        this.adaptor = ANTLRLexerAdaptor(YggdrasilLanguage, lexer)
    }

    override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int) {
        return adaptor.start(buffer, startOffset, endOffset, initialState)
    }

    override fun getState(): Int {
        return adaptor.state
    }

    override fun getTokenType(): IElementType? {
        return adaptor.tokenType
    }

    override fun getTokenStart(): Int {
        return adaptor.tokenStart
    }

    override fun getTokenEnd(): Int {
        return adaptor.tokenEnd
    }

    override fun advance() {
        adaptor.advance()
    }

    override fun getCurrentPosition(): LexerPosition {
        return adaptor.currentPosition
    }

    override fun restore(position: LexerPosition) {
        adaptor.restore(position)
    }

    override fun getBufferSequence(): CharSequence {
        return adaptor.bufferSequence
    }

    override fun getBufferEnd(): Int {
        return adaptor.bufferEnd
    }

    companion object {
        val Keywords: TokenSet = YggdrasilLanguage.createTokenSet(

            // declare keywords
            KW_GRAMMAR, KW_GROUP, KW_CLASS, KW_UNION, KW_CLIMB,
            // import keywords
            KW_IMPORT, KW_AS,
            // tok
            KW_MACRO,
            // special
            KW_ANY, BOOLEAN,
            OP_CONCAT,
            // control flow
            KW_PUSH, KW_PEEK, KW_DROP, KW_PULL,
            //

        )
        val OperatorPrefix: TokenSet = YggdrasilLanguage.createTokenSet(


            )
        val OperatorInfix: TokenSet = YggdrasilLanguage.createTokenSet(

            OP_PEEK_ALL, OP_SLICE


        )
        val OperatorSuffix: TokenSet = YggdrasilLanguage.createTokenSet(

            MATCH_OPTIONAL, MATCH_MANY, MATCH_MANY1,
        )
        val Operators = TokenSet.orSet(
            OperatorPrefix,
            OperatorInfix,
            OperatorSuffix
        );
        val Escapes: TokenSet = YggdrasilLanguage.createTokenSet(ESCAPED, OP_CATEGORY);
        val Comma: TokenSet = YggdrasilLanguage.createTokenSet(COMMA);
        val Semicolon: TokenSet = YggdrasilLanguage.createTokenSet(SEMICOLON);
        val Integers: TokenSet = YggdrasilLanguage.createTokenSet(INTEGER);
        val Decimals: TokenSet = YggdrasilLanguage.createTokenSet(INTEGER);
        val Strings: TokenSet = YggdrasilLanguage.createTokenSet(STRING_SINGLE, STRING_DOUBLE);
        val Identifiers: TokenSet = YggdrasilLanguage.createTokenSet(RAW_ID);

        val Comments: TokenSet = YggdrasilLanguage.createTokenSet(LINE_COMMENT, BLOCK_COMMENT);
        val CompletionWords: TokenSet = YggdrasilLanguage.createTokenSet(
            RAW_ID, UNICODE_ID
        )
    }
}
