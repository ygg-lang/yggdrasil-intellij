package yggdrasil.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import yggdrasil.antlr.YggdrasilAntlrLexer.*

class NexusLexer : Lexer() {
    private var adaptor: ANTLRLexerAdaptor

    init {
        val lexer = YggdrasilAntlrLexer(null)
        this.adaptor = ANTLRLexerAdaptor(yggdrasil.language.YggdrasilLanguage, lexer)
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
            yggdrasil.language.YggdrasilLanguage,
            // declare keywords
            KW_IMPORT, KW_AS, KW_IN,
            KW_CLASS,
            //

            // conditional
            KW_IF, KW_ELSE, KW_END,
            // control flow

            KW_FOR, KW_IN,
            // which/match/catch

            // control keywords

            //

        )
        val OperatorPrefix: TokenSet = PSIElementTypeFactory.createTokenSet(
            yggdrasil.language.YggdrasilLanguage,

        )
        val OperatorInfix: TokenSet = PSIElementTypeFactory.createTokenSet(
            yggdrasil.language.YggdrasilLanguage,


            )
        val OperatorSuffix: TokenSet = PSIElementTypeFactory.createTokenSet(
            yggdrasil.language.YggdrasilLanguage,
        )
        val Operators = TokenSet.orSet(
            OperatorPrefix,
            OperatorInfix,
            OperatorSuffix
        );
        val MacroOperators = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Escapes: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Comma: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Semicolon: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Integers: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Decimals: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Strings: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val Identifiers: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);

        val Comments: TokenSet = PSIElementTypeFactory.createTokenSet(yggdrasil.language.YggdrasilLanguage);
        val CompletionWords: TokenSet = PSIElementTypeFactory.createTokenSet(
            yggdrasil.language.YggdrasilLanguage,

            )
    }
}
