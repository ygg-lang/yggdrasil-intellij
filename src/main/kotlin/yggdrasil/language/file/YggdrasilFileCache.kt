package yggdrasil.language.file

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilGroupNode
import yggdrasil.psi.node.YggdrasilIdentifierNode
import yggdrasil.psi.node.YggdrasilUnionNode

class YggdrasilFileCache(root: YggdrasilFileNode) {
    private val _cache = mutableMapOf<String, PsiNameIdentifierOwner>()
    val completions = mutableListOf<LookupElement>()

    init {
        for (child in root.children) {
            when (child) {
                is YggdrasilClassNode -> {
//                    val name = child.name;
//                    _cache[name] = child
//                    child.createLookup(completions)
                }

                is YggdrasilUnionNode -> {
//                    val name = child.name;
//                    _cache[name] = child
//                    child.createLookup(completions)
                }

                is YggdrasilGroupNode -> {
//                    for (item in child.findPairs()) {
//                        _cache[item.name] = item
//                        item.createLookup(completions)
//                    }
                }
            }
        }
    }

    fun find(name: YggdrasilIdentifierNode?): PsiNameIdentifierOwner? {
        return _cache[name?.text]
    }
}