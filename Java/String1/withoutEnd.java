/*
Task:
    Given a string, return a version without the first and last char,
    so "Hello" yields "ell". The string length will be at least 2.
Examples:
    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
 */
package Java.String1;

import static java.lang.System.out;

public class withoutEnd {
    public static void main(String[] args) {
        out.println(withoutEnd("Hello"));
        out.println(withoutEnd("java"));
        out.println(withoutEnd("coding"));
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
}
