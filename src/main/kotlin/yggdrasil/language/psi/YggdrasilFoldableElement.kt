package yggdrasil.language.psi

import valkyrie.ide.folding.ValkyrieNodeFolder

interface YggdrasilFoldableElement {
    @Suppress("FunctionName")
    fun on_fold(e: ValkyrieNodeFolder);
}