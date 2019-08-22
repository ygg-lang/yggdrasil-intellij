package ygg.intellij.language.file

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey
import ygg.intellij.YggdrasilLanguage.Bundle
import java.util.function.Supplier

object YggdrasilBundle : DynamicBundle(Bundle) {
    fun message(@PropertyKey(resourceBundle = Bundle) key: String, vararg params: Any): String {
        return getMessage(key, *params)
    }

    fun messagePointer(@PropertyKey(resourceBundle = Bundle) key: String, vararg params: Any): Supplier<String> {
        return getLazyMessage(key, *params)
    }
}