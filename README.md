# comparator-testing
Displays usage of the Comparator interface in Java.

Criteria for test1:
Codes are formatted as such:
QZ-dd, DC-ddd, ML-ddd, where "d" is an integer digit.
The comparator sorts codes in the order of ML < DC < QZ.
If codes share the same letter prefix, they are sorted by "d" instead, where smaller value digits > larger value digits.

Criteria for test2:
Any code with a "t" appended to the end takes proirity over the other codes with the same prefix, making it greater than the rest.
If two codes with the same prefix both have a "t", they are sorted by "d" instead, where the same case as test1 applies with the integers.

