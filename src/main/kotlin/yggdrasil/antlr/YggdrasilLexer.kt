package yggdrasil.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
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
        val Keywords: TokenSet = PSIElementTypeFactory.createTokenSet(
            YggdrasilLanguage,
            // declare keywords
            KW_IMPORT, KW_AS,
            KW_CLASS, KW_UNION, KW_CLIMB,
            //

            KW_TOKEN,

            // conditional

            // control flow


            // which/match/catch

            // control keywords
            SPECIAL
            //

        )
        val OperatorPrefix: TokenSet = PSIElementTypeFactory.createTokenSet(
            YggdrasilLanguage,

            )
        val OperatorInfix: TokenSet = PSIElementTypeFactory.createTokenSet(
            YggdrasilLanguage,


            )
        val OperatorSuffix: TokenSet = PSIElementTypeFactory.createTokenSet(
            YggdrasilLanguage,
        )
        val Operators = TokenSet.orSet(
            OperatorPrefix,
            OperatorInfix,
            OperatorSuffix
        );
        val MacroOperators: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage, OP_HASH, OP_AT);
        val Escapes: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage, ESCAPED);
        val Comma: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage);
        val Semicolon: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage);
        val Integers: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage);
        val Decimals: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage);
        val Strings: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage, STRING_SINGLE, STRING_DOUBLE);
        val Identifiers: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage);

        val Comments: TokenSet = PSIElementTypeFactory.createTokenSet(YggdrasilLanguage, LINE_COMMENT, BLOCK_COMMENT);
        val CompletionWords: TokenSet = PSIElementTypeFactory.createTokenSet(
            YggdrasilLanguage,

            )
    }
}
