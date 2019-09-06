package ygg.intellij.ide

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import ygg.intellij.language.psi.YggTypes

class QuoteHandler : SimpleTokenSetQuoteHandler(YggTypes.STRING_LITERAL)
