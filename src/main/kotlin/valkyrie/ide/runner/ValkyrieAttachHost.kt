package valkyrie.ide.runner

import com.intellij.execution.process.ProcessInfo
import com.intellij.xdebugger.attach.XAttachHost

class ValkyrieAttachHost : XAttachHost {
    override fun getProcessList(): MutableList<ProcessInfo> {
        TODO("Not yet implemented")
    }
}