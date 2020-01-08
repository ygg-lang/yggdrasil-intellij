package yggdrasil.language.symbol

import yggdrasil.language.ast.YggdrasilIdentifierNode
import valkyrie.ide.highlight.YggdrasilHighlightColor

data class ValkyrieVariableKind(
    val identifier: YggdrasilIdentifierNode,
    val color: YggdrasilHighlightColor,
)