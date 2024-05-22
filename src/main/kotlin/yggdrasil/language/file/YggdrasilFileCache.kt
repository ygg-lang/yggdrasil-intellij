package yggdrasil.language.file

import yggdrasil.psi.YggdrasilDeclaration
import yggdrasil.psi.node.YggdrasilDefineClassNode
import yggdrasil.psi.node.YggdrasilDefineUnionNode
import yggdrasil.psi.node.YggdrasilGroupNode

class YggdrasilFileCache {
    private val root: YggdrasilFileNode


    constructor(root: YggdrasilFileNode) {
        this.root = root
    }

    fun getDefinitions(): Sequence<YggdrasilDeclaration> {
        return sequence {
            for (child in root.children) {
                when (child) {
                    is YggdrasilDefineClassNode -> {
                        yield(child)
                    }

                    is YggdrasilDefineUnionNode -> {
                        yield(child)
                    }

                    is YggdrasilGroupNode -> {
                        for (item in child.tokenList) {
                            yield(item)
                        }
                    }
                }
            }
        }
    }
}
