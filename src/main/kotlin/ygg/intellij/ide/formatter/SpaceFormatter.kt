package ygg.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet
import ygg.intellij.language.psi.YggTypes

private val prefix = TokenSet.create(YggTypes.AT, YggTypes.HASH)

private val suffix = TokenSet.create(YggTypes.OPTIONAL, YggTypes.MANY, YggTypes.MANY1)

private val declare = TokenSet.create(YggTypes.KW_CLASS, YggTypes.KW_UNION, YggTypes.KW_DEFINE)

fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
    return SpacingBuilder(commonSettings)
        // ,
//        .after(YggTypes.COMMA).spacing(1, 1, 0, true, 0)
//        .before(YggTypes.COMMA).spaceIf(false)
        .after(declare).spacing(1, 1, 0, true, 0)
//        .aroundInside(YggTypes.IDENTIFIER, YggTypes.MODIFIERS).spacing(1, 1, 0, true, 0)
        // {1,2}
        .aroundInside(YggTypes.COMMA, YggTypes.RANGE).spaceIf(false)
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
        .around(YggTypes.CHOOSE).spacing(1, 1, 0, true, 0)
        // a:b
        .aroundInside(YggTypes.COLON, YggTypes.FIELD_MARK).spaceIf(false)
        //
        .before(suffix).spaceIf(false)
        .after(prefix).spaceIf(false)
}

