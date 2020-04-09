package yggdrasil.psi

import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.psi.YggdrasilTypes.*

class ParserExtension : GeneratedParserUtilBase() {
    companion object {
        val Keywords: TokenSet = TokenSet.create(

            // declare keywords
            KW_GRAMMAR, KW_GROUP, KW_CLASS, KW_UNION, KW_CLIMB,
            // import keywords
            KW_IMPORT, KW_AS,
            // tok
            KW_MACRO,
            // special
//            KW_ANY, KW_BOOLEAN,
//            OP_CONCAT,
//            // control flow
//            KW_PUSH, KW_PEEK, KW_DROP, KW_PULL,
            //

        )
        val OperatorPrefix: TokenSet = TokenSet.create(


        )
        val OperatorInfix: TokenSet = TokenSet.create(

//            OP_PEEK_ALL, OP_SLICE


        )
        val OperatorSuffix: TokenSet = TokenSet.create(

//            MATCH_OPTIONAL, MATCH_MANY, MATCH_MANY1,
        )
        val Operators = TokenSet.orSet(
            OperatorPrefix,
            OperatorInfix,
            OperatorSuffix
        );
        val Comments: TokenSet = TokenSet.create();
        val CompletionWords: TokenSet = TokenSet.create(
            SYMBOL, SYMBOW_RAW
        )
    }

}

class YggdrasilElementType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "YggdrasilElement.${super.toString()}"
}

class YggdrasilTokenType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "YggdrasilToken.${super.toString()}"
}

