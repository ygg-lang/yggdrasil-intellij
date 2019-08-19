package ygg.intellij.language.psi

import ygg.intellij.YggdrasilLanguage
import com.intellij.psi.tree.IElementType

class YggTokenType(debugName: String) : IElementType(debugName, YggdrasilLanguage.INSTANCE) {
    override fun toString(): String = "YggTokenType.${super.toString()}"
}


