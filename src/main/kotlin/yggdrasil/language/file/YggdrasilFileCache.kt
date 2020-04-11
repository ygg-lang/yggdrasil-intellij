package yggdrasil.language.file

import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilDefineUnionNode
import yggdrasil.psi.node.YggdrasilGroupNode

class YggdrasilFileCache {
    private val root: YggdrasilFileNode

    constructor(root: YggdrasilFileNode) {
        this.root = root
    }

    fun getCache(): Sequence<PsiNameIdentifierOwner> {
        return sequence {
            for (child in root.children) {
                when (child) {
                    is YggdrasilClassNode -> {
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