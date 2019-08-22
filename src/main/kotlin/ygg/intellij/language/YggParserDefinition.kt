package ygg.intellij.language


import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import ygg.intellij.YggdrasilLanguage
import ygg.intellij.language.file.YggdrasilFileNode
import ygg.intellij.language.parser.YggParser
import ygg.intellij.language.psi.YggTypes.*


class YggParserDefinition : ParserDefinition {
    companion object {
        val COMMENTS = TokenSet.create(COMMENT_LINE, COMMENT_BLOCK, COMMENT_BLOCK)
        val STRING_LITERALS = TokenSet.create(STRING)
        val FILE = IFileElementType(YggdrasilLanguage)
    }

    override fun createLexer(project: Project): Lexer = YggLexerAdapter()

    override fun createParser(project: Project): PsiParser = YggParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = YggdrasilFileNode(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MAY
    }
}
