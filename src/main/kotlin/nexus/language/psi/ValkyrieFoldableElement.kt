package nexus.language.psi

import valkyrie.ide.folding.ValkyrieNodeFolder

interface ValkyrieFoldableElement {
    @Suppress("FunctionName")
    fun on_fold(e: ValkyrieNodeFolder);
}