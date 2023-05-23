/*
Task:
    Given 2 strings, a and b, return a new string made of the first char of a
    and the last char of b, so "yo" and "java" yields "ya". If either string
    is length 0, use '@' for its missing char.
Examples:
    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
 */
package Java.String1;

import static java.lang.System.out;

public class lastChars {
    public static void main(String[] args) {
        out.println(lastChars("last", "chars"));
        out.println(lastChars("yo", "java"));
        out.println(lastChars("hi", ""));
    }

    public static String lastChars(String a, String b) {
        String first = "@";
        String second = "@";

        if (a.length() > 0) {
            first = a.substring(0, 1);
        }

        if (b.length() > 0) {
            second = b.substring(b.length() - 1);
        }

        return first + second;
    }
}
