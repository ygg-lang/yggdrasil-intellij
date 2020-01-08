package yggdrasil.language.ast.pattern_match

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.impl.source.tree.CompositeElement
import yggdrasil.language.ast.YggdrasilIdentifierNode
import yggdrasil.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.YggdrasilHighlightColor
import valkyrie.ide.highlight.YggdrasilHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import javax.swing.Icon

class YggdrasilMatchStatement(node: CompositeElement) : ValkyrieScopeNode(node), YggdrasilHighlightElement {
    val bind by lazy { YggdrasilIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            // maybe mutable
            e.register(bind, YggdrasilHighlightColor.SYM_LOCAL)
        }
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Actions.InlayRenameInNoCodeFilesActive
    }

    override fun getPresentation(): ItemPresentation {
        return PresentationData("match", null, this.baseIcon, null)
    }
}

