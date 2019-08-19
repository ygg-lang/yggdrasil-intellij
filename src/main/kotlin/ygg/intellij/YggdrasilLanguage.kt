package ygg.intellij

import com.intellij.lang.Language

class YggdrasilLanguage private constructor() : Language(LanguageID) {
    companion object {
        @JvmStatic
        val INSTANCE = YggdrasilLanguage()

        const val BundlePath = "messages.YggBundle"

        const val LanguageID = "YGG"

        const val LanguageExtensions = "ygg"
    }
}

