package nexus.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import yggdrasil.antlr.YggdrasilAntlrLexer
import yggdrasil.antlr.YggdrasilAntlrLexer.*

class NexusLexer : Lexer() {
    private var adaptor: ANTLRLexerAdaptor

    init {
        val lexer = YggdrasilAntlrLexer(null)
        this.adaptor = ANTLRLexerAdaptor(nexus.language.NexusLanguage, lexer)
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
            nexus.language.NexusLanguage,
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
            nexus.language.NexusLanguage,

        )
        val OperatorInfix: TokenSet = PSIElementTypeFactory.createTokenSet(
            nexus.language.NexusLanguage,


            )
        val OperatorSuffix: TokenSet = PSIElementTypeFactory.createTokenSet(
            nexus.language.NexusLanguage,
        )
        val Operators = TokenSet.orSet(
            OperatorPrefix,
            OperatorInfix,
            OperatorSuffix
        );
        val MacroOperators = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Escapes: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Comma: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Semicolon: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Integers: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Decimals: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Strings: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val Identifiers: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);

        val Comments: TokenSet = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        val CompletionWords: TokenSet = PSIElementTypeFactory.createTokenSet(
            nexus.language.NexusLanguage,

            )
    }
}
