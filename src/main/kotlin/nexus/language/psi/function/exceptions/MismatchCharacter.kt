package nexus.language.psi.function.exceptions

// not found = EOF
class MismatchCharacter(val except: Char, val found: Char?) : ParseStop() {
    override fun toString(): String {
        return "MismatchCharacter($except, $found)"
    }
}