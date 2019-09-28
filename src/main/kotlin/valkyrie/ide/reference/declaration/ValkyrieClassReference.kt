package valkyrie.ide.reference.declaration

import nexus.language.ast.NexusIdentifierNode
import nexus.language.ast.classes.NexusClassStatement

class ValkyrieClassReference(definition: NexusClassStatement, element: NexusIdentifierNode) : ValkyrieReference(element, definition) {

}

