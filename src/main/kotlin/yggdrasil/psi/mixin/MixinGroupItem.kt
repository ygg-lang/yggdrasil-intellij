package yggdrasil.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import yggdrasil.psi.YggdrasilDeclaration
import yggdrasil.psi.node.YggdrasilGroupItem
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon

abstract class MixinGroupItem : YggdrasilDeclaration, YggdrasilGroupItem {
    constructor(node: ASTNode) : super(node)


    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifierList.lastOrNull() as? YggdrasilIdentifierNode
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Constant
    }

    override fun highlight(highlighter: NodeHighlighter) {
        this.identifierList.forEach {
            if (it == this.identifierList.lastOrNull()) {
                highlighter.highlight(it, HighlightColor.SYM_CONSTANT)
            } else {
                highlighter.highlight(it, HighlightColor.KEYWORD)
            }
        }
    }
}

