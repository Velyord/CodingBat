/*
Task:
    Given two strings, append them together (known as "concatenation")
    and return the result.
    However, if the strings are different lengths, omit chars from the
    longer string so it is the same length as the shorter string.
    So "Hello" and "Hi" yield "loHi". The strings may be any length.
Examples:
    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
 */
package Java.String1;

import static java.lang.System.out;

public class minCat {
    public static void main(String[] args) {
        out.println(minCat("Hello", "Hi"));
        out.println(minCat("Hello", "java"));
        out.println(minCat("java", "Hello"));
    }

    public static String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        }

        if (lenA < lenB) {
            return a + b.substring(lenB - lenA);
        }

        return a + b;
    }
}
