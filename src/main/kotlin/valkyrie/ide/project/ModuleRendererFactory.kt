package valkyrie.ide.project

import com.intellij.ide.util.DefaultModuleRendererFactory
import com.intellij.openapi.roots.OrderEntry
import com.intellij.openapi.vfs.VirtualFile

class ModuleRendererFactory : DefaultModuleRendererFactory() {
//    override fun libraryLocation(fileIndex: ProjectFileIndex, vFile: VirtualFile): TextWithIcon {
//        return super.libraryLocation(fileIndex, vFile)
//    }

    override fun getPresentableName(order: OrderEntry?, vFile: VirtualFile?): String {
        return super.getPresentableName(order, vFile)
    }
}
