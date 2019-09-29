package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.NexusIdentifierNode
import yggdrasil.language.ast.classes.NexusClassStatement

class ValkyrieClassReference(definition: NexusClassStatement, element: NexusIdentifierNode) : ValkyrieReference(element, definition) {

}

