package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.NexusFunctionStatement
import yggdrasil.language.ast.NexusIdentifierNode

class ValkyrieFunctionReference(definition: NexusFunctionStatement, element: NexusIdentifierNode) :
    ValkyrieReference(element, definition) {

}