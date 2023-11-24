package yggdrasil.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.SearchScope
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.ast.classes.YggdrasilClassNode
import yggdrasil.language.ast.unions.YggdrasilUnionNode


/**
ValkyrieFile 是个 PsiElement
 */
@Suppress("UnstableApiUsage")
class YggdrasilFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, yggdrasil.language.YggdrasilLanguage) {
    override fun getFileType(): FileType = YggdrasilFileType

    override fun toString(): String = yggdrasil.language.YggdrasilBundle.message("action.create_file")

    val Cache by lazy {
        YggdrasilFileCache(this)
    }

    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
//        val output = mutableListOf<PsiSymbolDeclaration>()
//        for (child in this.children) {
//            output.addAll(child.ownDeclarations)
//        }
//        return output
        return mutableListOf()
    }

    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
//        val output = mutableListOf<PsiSymbolReference>()
//        for (child in this.children) {
//            output.addAll(child.ownReferences)
//        }
//        return output
        return mutableListOf()
    }

    override fun getResolveScope(): GlobalSearchScope {
        return super.getResolveScope()
    }

    override fun getUseScope(): SearchScope {
        return super.getUseScope()
    }

    fun isIndexFile(): Boolean {
        return this.name == "index.ygg"
    }
}

class YggdrasilFileCache(private val root: YggdrasilFileNode) {
    private val _cache = mutableMapOf<String, PsiElement>()

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
        }
    }

    fun find(name: YggdrasilIdentifierNode): PsiElement? {
        return _cache[name.text]
    }
}