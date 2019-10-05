package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.YggdrasilFunctionStatement
import yggdrasil.language.ast.YggdrasilIdentifierNode

class ValkyrieFunctionReference(definition: YggdrasilFunctionStatement, element: YggdrasilIdentifierNode) :
    ValkyrieReference(element, definition) {

}