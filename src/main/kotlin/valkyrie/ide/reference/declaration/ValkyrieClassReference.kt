package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.classes.YggdrasilClassNode

class ValkyrieClassReference(definition: YggdrasilClassNode, element: YggdrasilIdentifierNode) : ValkyrieReference(element, definition) {

}

