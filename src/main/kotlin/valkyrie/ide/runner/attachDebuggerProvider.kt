package valkyrie.ide.runner

import com.intellij.execution.process.ProcessInfo
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.UserDataHolder
import com.intellij.xdebugger.attach.XAttachDebugger
import com.intellij.xdebugger.attach.XAttachDebuggerProvider
import com.intellij.xdebugger.attach.XAttachHost

class attachDebuggerProvider : XAttachDebuggerProvider {
    override fun isAttachHostApplicable(attachHost: XAttachHost): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAvailableDebuggers(
        project: Project,
        attachHost: XAttachHost,
        processInfo: ProcessInfo,
        contextHolder: UserDataHolder,
    ): MutableList<XAttachDebugger> {
        TODO("Not yet implemented")
    }
}