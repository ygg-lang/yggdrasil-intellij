package yggdrasil.language.file

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilGroupNode
import yggdrasil.psi.node.YggdrasilIdentifierNode

import yggdrasil.psi.node.YggdrasilUnionNode

class YggdrasilFileCache(root: YggdrasilFileNode) {
    val cache = mutableMapOf<String, PsiNameIdentifierOwner>()
    val completions = mutableListOf<LookupElement>()

    init {
        for (child in root.children) {
            when (child) {
                is YggdrasilClassNode -> {
                    val name = child.name;
                    cache[name] = child
                    child.createLookup(completions)
                }

                is YggdrasilUnionNode -> {
                    val name = child.name;
                    cache[name] = child
                    child.createLookup(completions)
                }

                is YggdrasilGroupNode -> {
                    for (item in child.tokenList) {
                        cache[item.name] = item
                        item.createLookup(completions)
                    }
                }
            }
        }
    }


    fun find(name: YggdrasilIdentifierNode?): PsiNameIdentifierOwner? {
        return cache[name?.text]
    }
}