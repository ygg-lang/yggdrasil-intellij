package valkyrie.ide.reference.declaration

import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.classes.YggdrasilClassStatement

class ValkyrieClassReference(definition: YggdrasilClassStatement, element: YggdrasilIdentifierNode) : ValkyrieReference(element, definition) {

}

