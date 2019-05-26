package com.github.ygg_lang.ygg_intellij.ide

import com.github.ygg_lang.ygg_intellij.language.psi.YggTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class YggQuoteHandler : SimpleTokenSetQuoteHandler(YggTypes.STRING_INLINE)
