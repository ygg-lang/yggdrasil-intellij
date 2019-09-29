package yggdrasil.language.psi

import com.intellij.codeInsight.daemon.LineMarkerInfo

interface ValkyrieLineMarkElement {
    @Suppress("FunctionName")
    fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>)
}