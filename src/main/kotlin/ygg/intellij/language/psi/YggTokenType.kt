package ygg.intellij.language.psi

import ygg.intellij.YggLanguage
import com.intellij.psi.tree.IElementType

class YggTokenType(debugName: String) : IElementType(debugName, YggLanguage.INSTANCE) {
    override fun toString(): String = "YggTokenType.${super.toString()}"
}


