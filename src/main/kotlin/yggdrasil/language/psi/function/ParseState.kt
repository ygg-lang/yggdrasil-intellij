package yggdrasil.language.psi.function

import com.intellij.execution.processTools.mapFlat
import org.junit.Test
import yggdrasil.language.psi.function.exceptions.MismatchCharacter
import yggdrasil.language.psi.function.exceptions.MismatchString


@Suppress("FunctionName", "PropertyName")
public class ParseState {
    val residual: CharSequence;
    val start_offset: Int;

    constructor(residual: CharSequence, start: Int = 0) {
        this.residual = residual;
        this.start_offset = start;
    }

    fun match_char(char: Char): Result<ParseState> {
        return if (residual.length > start_offset && residual[start_offset] == char) {
            Result.success(ParseState(residual.subSequence(start_offset + 1, residual.length), start_offset + 1))
        } else {
            Result.failure(
                MismatchCharacter(char, residual[start_offset])
            )
        }
    }

    fun match_string(string: CharSequence, case: Boolean = true): Result<ParseState> {
        return if (residual.startsWith(string, !case)) {
            Result.success(ParseState(residual.subSequence(string.length, residual.length), start_offset + string.length))
        } else {
            Result.failure(MismatchString(string, start_offset))
        }
    }

    override fun toString(): String {
        return "<${start_offset}>: ${residual.take(10)}..."
    }
}


class TestParser {
    @Test
    fun testAddition() {
        val text = ParseState("abc")
        val result = text.match_char('a')
            .mapFlat { text.match_char('b') }
        println(result)
    }
}