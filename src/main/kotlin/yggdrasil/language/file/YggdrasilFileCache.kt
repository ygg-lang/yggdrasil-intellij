package yggdrasil.language.file

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.psi.node.YggdrasilClassNode
import yggdrasil.psi.node.YggdrasilGroupNode
import yggdrasil.psi.node.YggdrasilIdentifierNode

import yggdrasil.psi.node.YggdrasilUnionNode

class YggdrasilFileCache(val root: YggdrasilFileNode) {
    private fun getCache(): MutableMap<String, PsiNameIdentifierOwner> {
        val cache = mutableMapOf<String, PsiNameIdentifierOwner>()

        for (child in root.children) {
            when (child) {
                is YggdrasilClassNode -> {
                    cache[child.name] = child
                }

                is YggdrasilUnionNode -> {
                    cache[child.name] = child
                }

                is YggdrasilGroupNode -> {
                    for (item in child.tokenList) {
                        cache[item.name] = item
                    }
                }
            }
        }
        return cache
    }

     fun getCompletions(): MutableList<LookupElement> {
        val completions = mutableListOf<LookupElement>()
        for (child in root.children) {
            when (child) {
                is YggdrasilClassNode -> {
                    child.createLookup(completions)
                }

                is YggdrasilUnionNode -> {
                    child.createLookup(completions)
                }

                is YggdrasilGroupNode -> {
                    for (item in child.tokenList) {
                        item.createLookup(completions)
                    }
                }
            }
        }
        return completions
    }


    fun find(name: YggdrasilIdentifierNode?): PsiNameIdentifierOwner? {
        return getCache()[name?.text]
    }
}