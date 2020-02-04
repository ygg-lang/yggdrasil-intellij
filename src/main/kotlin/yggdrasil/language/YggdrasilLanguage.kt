package yggdrasil.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory

private const val LANGUAGE_ID = "Yggdrasil"


object YggdrasilLanguage : Language(LANGUAGE_ID) {
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
        return arrayOf("text/x-valkyrie")
    }

    fun createTokenSet(vararg types: Int): TokenSet {
        val tokens = PSIElementTypeFactory.getTokenIElementTypes(this) ?: return TokenSet.EMPTY;
        val elements = arrayOfNulls<IElementType>(types.size)

        for (i in types.indices) {
            if (types[i] == -1) {
                elements[i] = PSIElementTypeFactory.getEofElementType(this)
            } else {
                elements[i] = tokens[types[i]]
            }
        }

        return TokenSet.create(*elements)
    }
}