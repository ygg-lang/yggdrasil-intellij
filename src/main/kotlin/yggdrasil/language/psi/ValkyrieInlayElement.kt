package yggdrasil.language.psi

import valkyrie.ide.hint.ParameterInlayHint

@Suppress("FunctionName")
interface ValkyrieInlayElement {

    fun parameter_hint(inlay: ParameterInlayHint): Boolean {
        return false
    }
}