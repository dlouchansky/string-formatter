### Strinп processor
One of C.T.Co Java school projects.
It removes newline character preceded by n>=1 backslash characters. No regexp.

Examples:

1.  In: "abc\\\\\ndef"
    Out: "abcdef"

2.  In: "abc\\\\\\\\\ndef"
    Out: "abcdef"

3.  In: "abc\ndef"
    Out: "abc\ndef"

4.  In: "abc\\\\def"
    Out: "abc\\\\def"