@file:OptIn(ExperimentalStdlibApi::class)

package valkyrie


private val punctuations = """(?x)\\
    | [.]{2}[=<]
    | [.]{1,3}
    | [{}\[\]()]
    | [,;$§¶^]
    | @[*!?@]?
    | \#[!]?
    # start with <, >
    | >{1,3} | >= | /> | ≥ | ⩾ | ≫
    | <{1,3} | <= | </ | ≤ | ⩽ | <: | <! 
    # start with :
    | ∷ | :: | :> | := | ≔ | :
    # start with -
    | -= | -> | ⟶ | -{1,2}
    # start with ~
    | ~> | ~
    # start with +
    | [+]= | [+]> | [+]{1,2}
    # start with *
    | [*]=?
    # start with / or % or ÷
    | /=?
    | ÷=?
    | %=?
    # start with &
    | &> | &{1,2} | ≻
    | [|]> | [|]{1,2} | ⊁
    | ⊻=? | ⊼=? | ⊽=? | [⩕⩖]
    # start with !
    | != | ≠ | !
    # start with ?
    | [?]{3} | [?]
    # start with =
    | => | ⇒
    | === | == | =
    # unicode
    | [∈∊∉⊑⋢⨳∀∁∂∃∄¬±√∛∜⊹⋗]
    | [⟦⟧⁅⁆⟬⟭]
    | [℃℉]
    | [↻↺⇆↹⇄⇋⇌⇅]
    #
    """.toRegex()
private val numbers = """(?x)
      (?<s1>[_1-9][_\d]*[.][_\d]+)
    | (?<s2>0[.][_\d]+)
    | (?<s4>0[a-zA-Z][_\da-zA-Z]+)
    | (?<s3>0|[1-9][_\d]*)
    | (?<s5>[©®][0-9a-zA-Z]*)
""".toRegex()

