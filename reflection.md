# Reflection on implementing regular expressions of a DSL

## Which operators were easiest to implement and why?
The char to regular language and all the operators as extensions were easy in my opinion because it was clearer in the instructions and it was similar to the case matching which is fun and easy to do.

## Which operators were most difficult to implement and why?
The string to regular language was a bit more challenging than char to regular language, and the operator where we had to use a helper function called apply was a bit harder than the other operators because we had to come up with a new function rather than a one line case.

## Comment on the design of this internal DSL

Write a few brief paragraphs that discuss:

- What works about this design? (For example, what things seem easy and
  natural to say, using the DSL?)
- What doesn't work about this design? (For example, what things seem
  cumbersome to say?)
- Think of a syntactic change that might make the language better. How would
  you implement it _or_ what features of Scala would prevent you from
  implementing it? (You don't have to write code for this part. You could say
  "I would use extension to..." or "Scala's rules for valid
  identifiers prevent...")

  Most of the operators that we implemented made them much easier to use. Now, there is no need to type long functions and methods, instead the symbols of the operators can be used which does the job. Reading and understanding is also much easier. 

  One difficulty is the way how some operators are written. For example, to use star or repetition, they have to always be used with <> after the expression, rather than just "a*" or "b+", but instead <*> and <+>.