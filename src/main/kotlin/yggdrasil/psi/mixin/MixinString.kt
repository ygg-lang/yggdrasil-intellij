package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import yggdrasil.psi.YggdrasilElement
import yggdrasil.psi.node.YggdrasilString

abstract class MixinString(node: ASTNode) : YggdrasilElement(node),
    YggdrasilString {


//    override fun getPresentation(): ItemPresentation? {
//        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
//    }

}

