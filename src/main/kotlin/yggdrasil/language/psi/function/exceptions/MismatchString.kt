package yggdrasil.language.psi.function.exceptions

class MismatchString(val except: CharSequence, val start: Int) : ParseStop() {

    override fun toString(): String {
        return "MismatchString($except, $start)"
    }
}