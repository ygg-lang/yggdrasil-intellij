package ygg.intellij.language.psi

import com.intellij.psi.tree.IElementType
import ygg.intellij.YggdrasilLanguage

class YggElementType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "Yggdrasil.${super.toString()}"
}