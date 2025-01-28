## base

```kt
package valkyrie.psi.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.LightPsiParser
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.lang.parser.GeneratedParserUtilBase.*
import com.intellij.psi.tree.IElementType

class ValkyrieParser : PsiParser, LightPsiParser {
    override fun parse(type: IElementType, builder: PsiBuilder): ASTNode {
        parseLight(type, builder)
        return builder.treeBuilt
    }

    override fun parseLight(type: IElementType?, builder: PsiBuilder) {
        val adapted = adapt_builder_(type, builder, this)
        val marker = enter_section_(adapted, 0, _COLLAPSE_, null)
        exit_section_(adapted, 0, marker, type, root(adapted, 0), true, TRUE_CONDITION)
    }

    companion object {
        // root ::= statements*
        private fun root(builder: PsiBuilder, depth: Int): Boolean {
            if (!recursion_guard_(builder, depth, "root")) return false
            var fine = true
            val s = enter_section_(
                builder,
                depth,
                GeneratedParserUtilBase._NONE_,
                ValkyrieAST.Root,
                "<root>"
            )
            fine = fine && `statements*`
            exit_section_(builder, depth, s, fine, false, null)
            return fine

        }
        private fun `statements*`(builder: PsiBuilder, depth: Int): Boolean {
            if (!recursion_guard_(builder, depth, "statements*")) return false
            while (true) {
                val c = current_position_(builder)
                if (!statements(builder, depth + 1)) break
                if (!empty_element_parsed_guard_(builder, "statements*", c)) break
            }
            return true
        }
    }
}
```


## choice

```kt
// control_statement ::=
//     | control-return
//     | control-yield-send    // generator<Yield=T, Return=()>
//     | control-yield-stop    // generator<Yield=R, Return=()>
//     | control-yield-from
//     | control-continue
//     | control-break
//     | control-through
//     | control-resume
fun controlStatement(builder: PsiBuilder, depth: Int): Boolean {
    if (!recursion_guard_(builder, depth, "control-statement")) return false
    var fail = true
    val s = enter_section_(
        builder,
        depth,
        GeneratedParserUtilBase._NONE_,
        ValkyrieAST.CONTROL_STATEMENT,
        "<control-statement>"
    )
    if (fail) fail = !control_return(builder, depth + 1)
    if (fail) fail = !control_yield_send(builder, depth + 1)
    if (fail) fail = !control_yield_stop(builder, depth + 1)
    if (fail) fail = !control_yield_from(builder, depth + 1)
    if (fail) fail = !control_continue(builder, depth + 1)
    if (fail) fail = !control_break(builder, depth + 1)
    if (fail) fail = !control_through(builder, depth + 1)
    if (fail) fail = !control_resume(builder, depth + 1)
    exit_section_(builder, depth, s, !fail, false, null)
    return !fail
}
```

## sequence

```kt
// modifier* identifier BIND?
fun match_bind(builder: PsiBuilder, l: Int): Boolean {
    if (!recursion_guard_(builder, l, "match-bind")) return false
    var fine = true
    val s = enter_section_(
        builder,
        l,
        GeneratedParserUtilBase._NONE_,
        ValkyrieAST.MATCH_BIND,
        "<match-bind>"
    )
    fine = fine && `modifier*`(builder, l + 1)
    fine = fine && identifier(builder, l + 1)
    /* optional */ consumeToken(builder, ValkyrieCST.BIND)
    exit_section_(builder, l, s, fine, false, null)
    return fine
}

// modifier*
// modifier+ = modifier modifier*
private fun `modifier*`(builder: PsiBuilder, depth: Int): Boolean {
    if (!recursion_guard_(builder, depth, "modifier*")) return false
    while (true) {
        val c = current_position_(builder)
        if (!modifier(builder, depth + 1)) break
        if (!empty_element_parsed_guard_(builder, "modifier*", c)) break
    }
    return true
}
```

## negative

```kt
// !modifier
private fun `!modifier`(builder: PsiBuilder, depth: Int): Boolean {
    if (!recursion_guard_(builder, depth, "!modifier")) return false
    val s = enter_section_(builder, depth, GeneratedParserUtilBase._NOT_)
    val n = !modifier(builder, depth + 1)
    exit_section_(builder, depth, s, n, false, null)
    return n
}
```
