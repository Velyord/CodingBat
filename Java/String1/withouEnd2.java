/*
Task:
    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.
Examples:
    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
 */
package Java.String1;

import static java.lang.System.out;

public class withouEnd2 {
    public static void main(String[] args) {
        out.println(withoutEnd2("Hello"));
        out.println(withoutEnd2("abc"));
        out.println(withoutEnd2("ab"));
    }

    public static String withoutEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
