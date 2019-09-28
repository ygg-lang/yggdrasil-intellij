package nexus.language

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey
import java.util.function.Supplier


private const val Bundle = "messages.NexusBundle"

object NexusBundle : DynamicBundle(nexus.language.Bundle) {

    @Suppress("SpreadOperator")
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = nexus.language.Bundle) key: String, vararg params: Any): String {
        return getMessage(key, *params)
    }

    @Suppress("SpreadOperator", "unused")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = nexus.language.Bundle) key: String, vararg params: Any): Supplier<String> {
        return getLazyMessage(key, *params)
    }
}