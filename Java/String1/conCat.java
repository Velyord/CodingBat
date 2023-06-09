/*
Task:
    Given two strings, append them together (known as "concatenation")
    and return the result.
    However, if the concatenation creates a double-char, then omit one
    of the chars, so "abc" and "cat" yields "abcat".
Examples:
    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
 */
package Java.String1;

import static java.lang.System.out;

public class conCat {
    public static void main(String[] args) {
        out.println(conCat("abc", "cat"));
        out.println(conCat("dog", "cat"));
        out.println(conCat("abc", ""));
    }

    public static String conCat(String a, String b) {
        if (a.length() != 0 && b.length() != 0 &&
            a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }

        return a + b;
    }
}
