package valkyrie.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet
import nexus.antlr.NexusLexer
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory.createTokenSet
import valkyrie.ide.matcher.ValkyrieBracketMatch
import yggdrasil.antlr.YggdrasilAntlrLexer


private val removeSpaceBefore = TokenSet.orSet(
    createTokenSet(nexus.language.NexusLanguage),
    ValkyrieBracketMatch.Instance.Right,

    )

private val removeSpaceNewlineBefore = TokenSet.orSet(
    createTokenSet(nexus.language.NexusLanguage)

)

private val removeSpaceAfter = TokenSet.orSet(
    createTokenSet(nexus.language.NexusLanguage)
)

private val removeSpaceNewlineAfter = TokenSet.orSet(
    createTokenSet(nexus.language.NexusLanguage)
)

// 左右插入一个空格
private val spaceAroundOperator = TokenSet.orSet(
    createTokenSet(nexus.language.NexusLanguage, YggdrasilAntlrLexer.KW_IN),
    NexusLexer.OperatorInfix
)

private val addSpaceAfter = TokenSet.orSet(
    createTokenSet(nexus.language.NexusLanguage)
)

private val newlineIndentAfter = TokenSet.create()

data class FormatSpace(val commonSettings: CommonCodeStyleSettings, val spacingBuilder: SpacingBuilder) {
    companion object {
        fun create(settings: CodeStyleSettings): FormatSpace {
            val commonSettings = settings.getCommonSettings(nexus.language.NexusLanguage)
            return FormatSpace(commonSettings, createSpacingBuilder(commonSettings))
        }

        private fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
            return SpacingBuilder(commonSettings)
                .after(addSpaceAfter).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)
                .around(spaceAroundOperator).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)
                .before(removeSpaceBefore).spaceIf(false)
                .before(removeSpaceNewlineBefore).spacing(0, 0, 0, false, 0)
                .after(removeSpaceAfter).spaceIf(false)
                .after(removeSpaceNewlineAfter).spacing(0, 0, 0, false, 0)
                .after(newlineIndentAfter).spacing(0, 0, 0, true, 1)
        }
    }
}