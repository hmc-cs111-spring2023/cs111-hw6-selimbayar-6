package machines

import regex._
import dfa._
import machines._

// TODO: Add your code below

// Char -> Regular Language
given Conversion[Char, RegularLanguage] = Character(_)

// String -> Regular Language
given Conversion[String, RegularLanguage] = str => str.toList.foldRight(Concat(Epsilon, Epsilon))(Concat(_,_))

// Adding operators
extension (r: RegularLanguage)
    def || (r2: RegularLanguage) = Union(r, r2)
    def ~ (r2: RegularLanguage) = Concat(r, r2)
    def <*> = Star(r)
    def <+> = Concat(r, Star(r))
    def apply(n: Int) : RegularLanguage = if (n == 1) r else (Concat(r, apply (n-1)))