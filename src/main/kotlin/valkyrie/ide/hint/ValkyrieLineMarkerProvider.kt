package valkyrie.ide.hint

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment
import com.intellij.psi.PsiElement
import yggdrasil.psi.node.YggdrasilClass
import yggdrasil.psi.node.YggdrasilDefineFunction
import yggdrasil.psi.node.YggdrasilDefineUnion
import yggdrasil.psi.node.YggdrasilVisitor
import javax.swing.Icon

//import nexus.language.psi_node.ValkyrieClassFieldNode
//import nexus.language.psi_node.ValkyrieClassMethodNode

@Suppress("UnstableApiUsage")
class ValkyrieLineMarkerProvider : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        return null
    }

    override fun collectSlowLineMarkers(elements: MutableList<out PsiElement>, result: MutableCollection<in LineMarkerInfo<*>>) {
        for (element in elements) {
            element.accept(ValkyrieLineMarkerVisitor(result))
        }
    }
}

public class ValkyrieLineMarkerVisitor : YggdrasilVisitor {
    val marks: MutableCollection<in LineMarkerInfo<*>>

    constructor(result: MutableCollection<in LineMarkerInfo<*>>) : super() {
        this.marks = result
    }

    override fun visitClass(o: YggdrasilClass) {
        mark(o.identifier?.firstChild, AllIcons.Nodes.Class)
    }

    override fun visitDefineUnion(o: YggdrasilDefineUnion) {
        mark(o.identifier?.firstChild, AllIcons.Nodes.Interface)
    }

    override fun visitDefineFunction(o: YggdrasilDefineFunction) {
        super.visitDefineFunction(o)
    }

    private fun mark(element: PsiElement?, icon: Icon) {
        if (element != null) {
            marks.add(YggdrasilLineMarkerInfo(element, icon))
        }
    }
}


class YggdrasilLineMarkerInfo : LineMarkerInfo<PsiElement> {
    private val mark: Icon

    constructor(element: PsiElement, mark: Icon) : super(element, element.textRange, mark, null, null, Alignment.CENTER) {
        this.mark = mark
    }

    override fun getLineMarkerTooltip(): String {
        return "GetLineMarkerTooltip()"
    }

    override fun createGutterRenderer(): GutterIconRenderer {
        return LineMarkerGutterIconRenderer(this)
    }
}
