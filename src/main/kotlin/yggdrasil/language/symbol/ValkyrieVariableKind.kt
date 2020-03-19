package yggdrasil.language.symbol

import valkyrie.ide.highlight.YggdrasilHighlightColor
import yggdrasil.psi.node.YggdrasilIdentifierNode

data class ValkyrieVariableKind(
    val identifier: YggdrasilIdentifierNode,
    val color: YggdrasilHighlightColor,
)