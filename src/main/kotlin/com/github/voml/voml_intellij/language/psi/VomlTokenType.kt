package com.github.voml.voml_intellij.language.psi

import com.github.voml.voml_intellij.language.VomlLanguage
import com.intellij.psi.tree.IElementType

class VomlTokenType(debugName: String) : IElementType(debugName, VomlLanguage.INSTANCE) {
    override fun toString(): String = "VomlTokenType.${super.toString()}"
}


