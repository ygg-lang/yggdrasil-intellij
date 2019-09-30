package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.NexusIdentifierNode
import yggdrasil.language.ast.classes.YggdrasilClassStatement

class ValkyrieClassReference(definition: YggdrasilClassStatement, element: NexusIdentifierNode) : ValkyrieReference(element, definition) {

}

