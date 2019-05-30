package com.github.ygg_lang.ygg_intellij.language

import com.intellij.lang.Language

class YggLanguage private constructor() : Language(LanguageID) {
    companion object {
        @JvmStatic
        val INSTANCE = YggLanguage()

        const val BundlePath = "messages.YggBundle"

        const val LanguageID = "YGG"

        const val LanguageExtensions = "ygg"
    }
}

