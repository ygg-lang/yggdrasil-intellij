package yggdrasil.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import yggdrasil.language.YggdrasilLanguage
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.psi.YggdrasilTypes.*
import yggdrasil.psi.parser.YggdrasilParser

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
            KW_ANY, KW_BOOLEAN,
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
//            RAW_ID, UNICODE_ID
        )
    }

}

open class YggdrasilElement(node: ASTNode) : ASTWrapperPsiElement(node)

class YggdrasilElementType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "YggdrasilElement.${super.toString()}"
}

class YggdrasilTokenType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "YggdrasilToken.${super.toString()}"
}

object ParserDefinition : ParserDefinition {
    fun createLexer(): Lexer = FlexAdapter(_YggdrasilLexer(null))
    override fun createLexer(project: Project): Lexer = FlexAdapter(_YggdrasilLexer(null))
    override fun createParser(project: Project): PsiParser = YggdrasilParser()
    override fun getFileNodeType(): IFileElementType = IFileElementType(YggdrasilLanguage)
    override fun getCommentTokens(): TokenSet =
        TokenSet.create(YggdrasilTypes.COMMENT_LINE, YggdrasilTypes.COMMENT_BLOCK)

    override fun getStringLiteralElements(): TokenSet = TokenSet.create()
    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    override fun createElement(node: ASTNode): PsiElement = YggdrasilTypes.Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = YggdrasilFileNode(viewProvider)
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }
}
