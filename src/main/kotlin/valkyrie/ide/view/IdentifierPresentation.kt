package valkyrie.ide.view

import com.intellij.navigation.ColoredItemPresentation
import com.intellij.openapi.editor.colors.TextAttributesKey
import yggdrasil.language.ast.NexusIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor
import javax.swing.Icon

class IdentifierPresentation(val name: NexusIdentifierNode?, private val icon: Icon) : ColoredItemPresentation {
    override fun getPresentableText(): String {
        return name?.name ?: "[Missing]"
    }

    override fun getIcon(unused: Boolean): Icon {
        return icon
    }

    override fun getTextAttributesKey(): TextAttributesKey {
        return NexusHighlightColor.IDENTIFIER.textAttributesKey
    }

}