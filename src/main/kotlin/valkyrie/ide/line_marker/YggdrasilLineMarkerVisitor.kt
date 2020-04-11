package valkyrie.ide.line_marker

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import yggdrasil.psi.node.YggdrasilClass
import yggdrasil.psi.node.YggdrasilDefineFunction
import yggdrasil.psi.node.YggdrasilDefineUnion
import yggdrasil.psi.node.YggdrasilVisitor
import javax.swing.Icon

class YggdrasilLineMarkerVisitor : YggdrasilVisitor {
    private val marks: MutableCollection<in LineMarkerInfo<*>>

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