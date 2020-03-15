package yggdrasil.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.v4.runtime.Token
import yggdrasil.antlr.YggdrasilAntlrParser

private const val LANGUAGE_ID = "Yggdrasil"


object YggdrasilLanguage : Language(LANGUAGE_ID) {
    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            YggdrasilLanguage, YggdrasilAntlrParser.tokenNames, YggdrasilAntlrParser.ruleNames
        )
    }

    private fun readResolve(): Any = YggdrasilLanguage
    override fun getID(): String {
        return LANGUAGE_ID
    }
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun getAssociatedFileType(): LanguageFileType? {
        return super.getAssociatedFileType()
    }
    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-yggdrasil")
    }

    fun createTokenSet(vararg types: Int): TokenSet {
        val tokenIElementTypes = PSIElementTypeFactory.getTokenIElementTypes(YggdrasilLanguage)

        val elementTypes = arrayOfNulls<IElementType>(types.size)
        for (i in types.indices) {
            if (types[i] == Token.EOF) {
                elementTypes[i] = PSIElementTypeFactory.getEofElementType(YggdrasilLanguage)
            } else {
                elementTypes[i] = tokenIElementTypes[types[i]]
            }
        }

        return TokenSet.create(*elementTypes)
    }
}