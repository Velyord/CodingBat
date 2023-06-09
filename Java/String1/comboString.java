/*
Task:
    Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).
Examples:
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
 */
package Java.String1;

import static java.lang.System.out;

public class comboString {
    public static void main(String[] args) {
        out.println(comboString("Hello", "hi"));
        out.println(comboString("hi", "Hello"));
        out.println(comboString("aaa", "b"));
    }

    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
}
