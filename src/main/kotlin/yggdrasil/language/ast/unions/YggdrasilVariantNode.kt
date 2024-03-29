package yggdrasil.language.ast.unions

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.file.YggdrasilFileNode
import yggdrasil.language.file.YggdrasilIconProvider
import javax.swing.Icon

class YggdrasilVariantNode(node: CompositeElement) : ASTWrapperPsiElement(node) {
//    private val _all by lazy {
//        YggdrasilParser.getChildrenOfType<YggdrasilIdentifierNode>(this)
//    }

    override fun getBaseIcon(): Icon {
        return YggdrasilIconProvider.Instance.UNION
    }

    override fun getContainingFile(): YggdrasilFileNode {
        return super.getContainingFile() as YggdrasilFileNode
    }
}
