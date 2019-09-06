package ygg.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import ygg.intellij.language.psi.YggTypes

fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
    return SpacingBuilder(commonSettings)
        // ,
        .after(YggTypes.COMMA).spacing(1, 1, 0, true, 0)
        .before(YggTypes.COMMA).spaceIf(false)
        // [ ]
        .after(YggTypes.BRACKET_L).spaceIf(false)
        .before(YggTypes.BRACKET_R).spaceIf(false)
        // { }
        .after(YggTypes.BRACE_L).spaceIf(false)
        .before(YggTypes.BRACE_R).spaceIf(false)
        // ( )
        .after(YggTypes.PARENTHESIS_L).spaceIf(false)
        .before(YggTypes.PARENTHESIS_R).spaceIf(false)
        // |
        .around(YggTypes.CHOOSE).spaceIf(true)
}

