package valkyrie.ide.view

import com.intellij.navigation.ColoredItemPresentation
import com.intellij.openapi.editor.colors.TextAttributesKey
import valkyrie.ide.highlight.YggdrasilHighlightColor
import yggdrasil.psi.node.YggdrasilIdentifierNode
import javax.swing.Icon

class IdentifierPresentation(val name: YggdrasilIdentifierNode?, private val icon: Icon) : ColoredItemPresentation {
    override fun getPresentableText(): String {
        return name?.name ?: "[Missing]"
    }

    override fun getIcon(unused: Boolean): Icon {
        return icon
    }

    override fun getTextAttributesKey(): TextAttributesKey {
        return YggdrasilHighlightColor.IDENTIFIER.textAttributesKey
    }

}