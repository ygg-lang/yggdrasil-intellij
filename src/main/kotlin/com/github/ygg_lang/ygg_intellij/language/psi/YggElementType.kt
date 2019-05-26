package com.github.ygg_lang.ygg_intellij.language.psi

import com.github.ygg_lang.ygg_intellij.language.YggLanguage
import com.intellij.psi.tree.IElementType

class YggElementType(debugName: String) : IElementType(debugName, YggLanguage.INSTANCE)
