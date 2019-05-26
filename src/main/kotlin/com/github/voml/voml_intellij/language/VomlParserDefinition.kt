package com.github.voml.voml_intellij.language

import com.github.voml.voml_intellij.language.parser.VomlParser
import com.github.voml.voml_intellij.language.psi.VomlTypes
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


class VomlLexerAdapter : FlexAdapter(_VomlLexer())


class VomlParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = VomlLexerAdapter()

    override fun createParser(project: Project): PsiParser = VomlParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = VomlTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = VomlFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    companion object {
        val COMMENTS = TokenSet.create(VomlTypes.COMMENT, VomlTypes.BLOCK_COMMENT)
        val STRING_LITERALS = TokenSet.create(VomlTypes.STRING_INLINE, VomlTypes.STRING_PREFIX, VomlTypes.STRING_MULTI)
        val FILE = IFileElementType(VomlLanguage.INSTANCE)
    }
}
