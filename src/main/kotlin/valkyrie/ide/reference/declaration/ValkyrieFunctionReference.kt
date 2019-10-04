package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.NexusFunctionStatement
import yggdrasil.language.ast.YggdrasilIdentifierNode

class ValkyrieFunctionReference(definition: NexusFunctionStatement, element: YggdrasilIdentifierNode) :
    ValkyrieReference(element, definition) {

}