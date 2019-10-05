package yggdrasil.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import javax.swing.Icon

class YggdrasilLetStatement(node: CompositeElement) : ASTWrapperPsiElement(node), YggdrasilHighlightElement {
    override fun getBaseIcon(): Icon {
        return AllIcons.Actions.InlayRenameInNoCodeFilesActive
    }

    override fun getPresentation(): ItemPresentation {
        return PresentationData("let", null, this.baseIcon, null)
    }


    override fun on_highlight(e: NodeHighlighter) {

    }
}


