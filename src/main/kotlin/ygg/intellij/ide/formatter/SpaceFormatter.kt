package ygg.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet
import ygg.intellij.language.psi.YggTypes

private val prefix = TokenSet.create(YggTypes.AT) //  OPTIONAL | MANY | MANY1

private val suffix = TokenSet.create(YggTypes.SUFFIX) //  OPTIONAL | MANY | MANY1

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
        //
        .before(suffix).spaceIf(false)
        .after(prefix).spaceIf(false)
}

