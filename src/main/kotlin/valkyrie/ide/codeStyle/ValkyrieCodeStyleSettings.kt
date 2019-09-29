package valkyrie.ide.codeStyle

import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

@Suppress("PropertyName")
class ValkyrieCodeStyleSettings(container: CodeStyleSettings) : CustomCodeStyleSettings(yggdrasil.language.YggdrasilLanguage.id, container) {
    val class_field_trailing: CommaOrSemicolon = CommaOrSemicolon.Comma
    val flags_trailing: CommaOrSemicolon = CommaOrSemicolon.Comma
    val variant_trailing: CommaOrSemicolon = CommaOrSemicolon.Comma
    val return_type: ReturnType = ReturnType.Arrow
    val namespace_delimiter: NamespaceDelimiter = NamespaceDelimiter.Dot
    val namespace_colon: Triplet = Triplet.Always

    enum class Triplet {
        Ignore,
        Nothing,
        Always,
    }

    enum class CommaOrSemicolon {
        Ignore,    // 别动
        Nothing,     // 去掉
        Comma,     // `,`
        Semicolon; // `;`
    }

    enum class ReturnType {
        Ignore,       // 别动
        Colon,        // `:`
        Arrow,        // `->`
        UnicodeArrow, // `⟶`
    }

    enum class NamespaceDelimiter {
        Ignore, // 别动
        Dot,    // `.`
        Colon,  // `::`
        UnicodeColon, // `∷`
    }
}
