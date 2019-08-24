package ygg.intellij.ide.codeStyle

import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

class YggCodeStyleSettings(settings: CodeStyleSettings?) : CustomCodeStyleSettings(
    "YggCodeStyleSettings",
    settings!!
)
