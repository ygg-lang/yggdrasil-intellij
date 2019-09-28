package valkyrie.ide.reference.declaration

import nexus.language.ast.NexusFunctionStatement
import nexus.language.ast.NexusIdentifierNode

class ValkyrieFunctionReference(definition: NexusFunctionStatement, element: NexusIdentifierNode) :
    ValkyrieReference(element, definition) {

}