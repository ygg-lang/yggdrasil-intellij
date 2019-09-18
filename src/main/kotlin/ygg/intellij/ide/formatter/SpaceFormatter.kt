package ygg.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet
import ygg.intellij.language.psi.YggTypes

private val prefix = TokenSet.create(YggTypes.AT, YggTypes.HASH)

private val infix = TokenSet.create(YggTypes.SOFT_CONNECT, YggTypes.CHOOSE)

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
        .beforeInside(YggTypes.COMMA, YggTypes.DEFINE_PARAMETERS).spaceIf(false)
        .afterInside(YggTypes.COMMA, YggTypes.DEFINE_PARAMETERS).spacing(1, 1, 0, true, 0)
        // [ ]
        .after(YggTypes.BRACKET_L).spaceIf(false)
        .before(YggTypes.BRACKET_R).spaceIf(false)
        // { }
        .after(YggTypes.BRACE_L).spaceIf(false)

        .before(YggTypes.BRACE_R).spaceIf(false)
        // ( )
        .after(YggTypes.PARENTHESIS_L).spaceIf(false)
        .before(YggTypes.PARENTHESIS_R).spaceIf(false)
        // a:b
        .aroundInside(YggTypes.COLON, YggTypes.FIELD_MARK).spaceIf(false)
        .afterInside(YggTypes.COLON, YggTypes.RULE_TYPE).spaceIf(true)
        .beforeInside(YggTypes.ARROW, YggTypes.RULE_TYPE).spaceIf(true)
//        .before(YggTypes.RULE_TYPE).spaceIf(false)
        //
        .after(YggTypes.PREFIX).spaceIf(false)
        .around(YggTypes.INFIX).spaceIf(true)
        .before(YggTypes.SUFFIX).spaceIf(false)
}

