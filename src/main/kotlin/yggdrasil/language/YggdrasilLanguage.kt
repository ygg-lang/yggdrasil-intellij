package yggdrasil.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType

private const val LANGUAGE_ID = "Yggdrasil"


object YggdrasilLanguage : Language(yggdrasil.language.LANGUAGE_ID) {
    private fun readResolve(): Any = yggdrasil.language.YggdrasilLanguage
    override fun getID(): String {
        return yggdrasil.language.LANGUAGE_ID
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
}