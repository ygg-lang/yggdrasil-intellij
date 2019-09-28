package nexus.language.ast

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.psi.ValkyrieScopeNode
import org.jetbrains.annotations.Unmodifiable
import javax.swing.Icon

class ValkyrieForStatement(node: CompositeElement) : ValkyrieScopeNode(node) {
    val parameters by lazy { findParameters() };

    override fun getBaseIcon(): Icon {
        return AllIcons.Actions.InlayRenameInNoCodeFilesActive
    }

    override fun getPresentation(): ItemPresentation {
        return PresentationData("for", null, this.baseIcon, null)
    }

    private fun findParameters(): @Unmodifiable MutableList<NexusLetParameter> {
//        val pattern = ValkyrieParser.getChildOfType(this, NexusAntlrParser.RULE_for_pattern);
//        return PsiTreeUtil.getChildrenOfTypeAsList(pattern, ValkyrieLetParameter::class.java);
        return mutableListOf()
    }
}

