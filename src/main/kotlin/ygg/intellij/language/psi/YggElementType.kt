package ygg.intellij.language.psi

import ygg.intellij.YggLanguage
import com.intellij.psi.tree.IElementType

class YggElementType(debugName: String) : IElementType(debugName, ygg.intellij.YggLanguage.INSTANCE)
