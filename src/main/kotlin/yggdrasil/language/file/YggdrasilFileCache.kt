package yggdrasil.language.file

import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.group.YggdrasilGroupNode
import yggdrasil.language.ast.unions.YggdrasilUnionNode

class YggdrasilFileCache(root: YggdrasilFileNode) {
    private val _cache = mutableMapOf<String, PsiNameIdentifierOwner>()
    val completions = mutableListOf<LookupElementBuilder>()
    init {
        for (child in root.children) {
            when (child) {
                is YggdrasilClassNode -> {
                    val name = child.name;
                    if (name != null) {
                        _cache[name] = child
                        completions.add(child.lookUp())
                    }
                }

                is YggdrasilUnionNode -> {
                    val name = child.name;
                    if (name != null) {
                        _cache[name] = child
                        completions.add(child.lookUp())
                    }
                }

                is YggdrasilGroupNode -> {
                    for (item in child.findPairs()) {
                        _cache[item.name] = item
                        completions.add(item.lookUp())
                    }
                }
            }
        }
    }

    fun find(name: YggdrasilIdentifierNode): PsiNameIdentifierOwner? {
        return _cache[name.text]
    }


}