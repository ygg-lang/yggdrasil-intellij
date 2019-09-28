package valkyrie.ide.project.library

import com.intellij.openapi.roots.libraries.LibraryProperties
import org.jdom.Element

class ValkyrieLibraryProperty : LibraryProperties<Element>() {
    override fun equals(other: Any?): Boolean {
        if (other !is ValkyrieLibraryProperty) return false;
        return this.hashCode() == other.hashCode()
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun getState(): Element? {
        return null
    }

    override fun loadState(state: Element) {

    }
}