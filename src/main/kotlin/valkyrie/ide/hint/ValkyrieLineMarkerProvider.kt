package valkyrie.ide.hint

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.psi.PsiElement
import nexus.language.psi.ValkyrieLineMarkElement

//import nexus.language.psi_node.ValkyrieClassFieldNode
//import nexus.language.psi_node.ValkyrieClassMethodNode

@Suppress("UnstableApiUsage")
class ValkyrieLineMarkerProvider : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        return null
    }

    override fun collectSlowLineMarkers(elements: MutableList<out PsiElement>, result: MutableCollection<in LineMarkerInfo<*>>) {
        for (element in elements) {
            if (element is ValkyrieLineMarkElement) {
                element.on_line_mark(result)
            }
        }
    }
}

