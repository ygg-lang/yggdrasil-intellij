package valkyrie.ide.runner

import com.intellij.build.BuildTextConsoleView
import com.intellij.build.BuildTreeConsoleView
import com.intellij.build.DefaultBuildDescriptor
import com.intellij.execution.DefaultExecutionResult
import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.process.KillableProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.runners.ProgramRunner

class ValkyrieRunningState(executor: Executor, private val environment: ExecutionEnvironment) : RunProfileState {
    override fun execute(executor: Executor?, runner: ProgramRunner<*>): ExecutionResult {
        val line = BuildTextConsoleView(environment.project, true, listOf())
        val console = BuildTreeConsoleView(
            environment.project,
            DefaultBuildDescriptor("Valkyrie", "Valkyrie", "Valkyrie", System.currentTimeMillis()),
            line
        )
        return DefaultExecutionResult(console, KillableProcessHandler(GeneralCommandLine("cmd", "/c", "dir")));
    }
}
