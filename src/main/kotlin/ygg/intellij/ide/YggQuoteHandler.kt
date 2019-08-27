package ygg.intellij.ide

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import ygg.intellij.language.psi.YggTypes

class YggQuoteHandler : SimpleTokenSetQuoteHandler(YggTypes.STRING_LITERAL)
