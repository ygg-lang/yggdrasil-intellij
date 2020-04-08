package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilExpressionTag
import yggdrasil.psi.node.YggdrasilModifier

abstract class MixinModifier(node: ASTNode) : YggdrasilElement(node), YggdrasilModifier {
    override fun getName(): String {
        return this.identifier.text ?: ""
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", AllIcons.Nodes.Annotationtype, null)
    }
}

abstract class MixinExpressionTag(node: ASTNode) : YggdrasilElement(node), YggdrasilExpressionTag {
    override fun getName(): String {
        return this.identifierFree?.text ?: ""
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", AllIcons.Nodes.Annotationtype, null)
    }
}

