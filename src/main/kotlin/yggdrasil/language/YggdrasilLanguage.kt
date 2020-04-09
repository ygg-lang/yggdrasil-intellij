package yggdrasil.language

import com.intellij.lang.Language
import com.intellij.lexer.FlexAdapter
import com.intellij.openapi.fileTypes.LanguageFileType
import yggdrasil.psi._YggdrasilLexer


private const val LANGUAGE_ID = "yggdrasil"


object YggdrasilLanguage : Language(LANGUAGE_ID) {
    val lexer = FlexAdapter(_YggdrasilLexer(null))
    private fun readResolve(): Any = YggdrasilLanguage
    override fun getID(): String {
        return LANGUAGE_ID
    }

    override fun getDisplayName(): String {
        return "Yggdrasil"
    }

    override fun getAssociatedFileType(): LanguageFileType? {
        return super.getAssociatedFileType()
    }

    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-yggdrasil")
    }
}