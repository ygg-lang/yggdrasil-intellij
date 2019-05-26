package com.github.voml.voml_intellij.language.psi

import com.github.voml.voml_intellij.language.VomlLanguage
import com.intellij.psi.tree.IElementType

class VomlElementType(debugName: String) : IElementType(debugName, VomlLanguage.INSTANCE)
