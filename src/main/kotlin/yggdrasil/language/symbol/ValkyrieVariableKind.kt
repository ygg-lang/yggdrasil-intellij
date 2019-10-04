package yggdrasil.language.symbol

import yggdrasil.language.ast.YggdrasilIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor

data class ValkyrieVariableKind(
    val identifier: YggdrasilIdentifierNode,
    val color: NexusHighlightColor,
)