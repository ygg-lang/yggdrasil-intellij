package yggdrasil.language.symbol

import yggdrasil.language.ast.NexusIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor

data class ValkyrieVariableKind(
    val identifier: NexusIdentifierNode,
    val color: NexusHighlightColor,
)