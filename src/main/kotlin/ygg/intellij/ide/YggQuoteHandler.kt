package ygg.intellij.ide

import ygg.intellij.language.psi.YggTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class YggQuoteHandler : SimpleTokenSetQuoteHandler(ygg.intellij.language.psi.YggTypes.STRING_INLINE)
