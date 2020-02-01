package yggdrasil.language.ast.unions

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.language.file.YggdrasilIconProvider
import yggdrasil.language.psi.YggdrasilScopeNode
import javax.swing.Icon

class YggdrasilVariantNode(node: CompositeElement) : YggdrasilScopeNode(node) {
//    private val _all by lazy {
//        YggdrasilParser.getChildrenOfType<YggdrasilIdentifierNode>(this)
//    }


    override fun getBaseIcon(): Icon {
        return YggdrasilIconProvider.Instance.UNION
    }

    override fun getPresentation(): ItemPresentation {
        TODO("Not yet implemented")
    }

    override fun getContainingFile(): YggdrasilFileNode {
        return super.getContainingFile() as YggdrasilFileNode
    }
}
