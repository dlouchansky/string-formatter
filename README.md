String sanitizer. One of C.T.Co Java school projects.

It removes newline character preceding n backslash characters.

Examples:

In: "abc\\\ndef"
Out: "abcdef"

In: "abc\\\\\ndef"
Out: "abcdef"

In: "abc\ndef"
Out: "abc\ndef"

In: "abc\\def"
Out: "abc\\def"