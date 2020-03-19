package valkyrie.ide.reference.declaration

import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilIdentifierNode

class ValkyrieClassReference(definition: YggdrasilClassNode, element: YggdrasilIdentifierNode) : ValkyrieReference(element, definition) {

}

