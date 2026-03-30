package yggdrasil.psi

import com.intellij.psi.tree.IElementType
import yggdrasil.language.YggdrasilLanguage


class YggdrasilElementType(debugName: String) : IElementType(debugName, YggdrasilLanguage) {
    override fun toString(): String = "YggdrasilElement.${super.toString()}"
}

