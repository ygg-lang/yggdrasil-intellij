package com.github.voml.voml_intellij.ide

import com.github.voml.voml_intellij.language.psi.VomlTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class VomlQuoteHandler : SimpleTokenSetQuoteHandler(VomlTypes.STRING_INLINE)
