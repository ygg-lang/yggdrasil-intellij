package yggdrasil.language.psi

import valkyrie.ide.formatter.ValkyrieRewriter

interface ValkyrieRewritableElement {
    @Suppress("FunctionName")
    fun on_rewrite(e: ValkyrieRewriter);
}