package yggdrasil.language.file

import com.intellij.psi.PsiNameIdentifierOwner
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.group.YggdrasilGroupNode
import yggdrasil.language.ast.unions.YggdrasilUnionNode

class YggdrasilFileCache(root: YggdrasilFileNode) {
    private val _cache = mutableMapOf<String, PsiNameIdentifierOwner>()

    init {
        for (child in root.children) {
            if (child is YggdrasilClassNode) {
                val name = child.name;
                if (name != null) {
                    _cache[name] = child
                }
            }
            if (child is YggdrasilUnionNode) {
                val name = child.name;
                if (name != null) {
                    _cache[name] = child
                }
            }
            if (child is YggdrasilGroupNode) {
                for (item in child.items) {
                    val name = item.name;
                    if (name != null) {
                        _cache[name] = item
                    }
                }
            }
        }
    }

    fun find(name: YggdrasilIdentifierNode): PsiNameIdentifierOwner? {
        return _cache[name.text]
    }
}