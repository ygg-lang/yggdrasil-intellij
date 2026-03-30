package yggdrasil.psi

import com.intellij.psi.tree.IElementType
import yggdrasil.language.YggdrasilLanguage

class YggdrasilTokenType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "YggdrasilToken.${super.toString()}"
}