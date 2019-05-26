package com.github.ygg_lang.ygg_intellij.language


import com.github.ygg_lang.ygg_intellij.language.parser.YggParser
import com.github.ygg_lang.ygg_intellij.language.psi.YggTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class YggLexerAdapter : FlexAdapter(_YggLexer())


class YggParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = YggLexerAdapter()

    override fun createParser(project: Project): PsiParser = YggParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = YggTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = YggFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    companion object {
        val COMMENTS = TokenSet.create(YggTypes.COMMENT, YggTypes.BLOCK_COMMENT)
        val STRING_LITERALS = TokenSet.create(YggTypes.STRING_INLINE, YggTypes.STRING_PREFIX, YggTypes.STRING_MULTI)
        val FILE = IFileElementType(YggLanguage.INSTANCE)
    }
}
