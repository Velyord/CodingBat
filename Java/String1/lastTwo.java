/*
Task:
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".
Examples:
    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
 */
package Java.String1;

import static java.lang.System.out;

public class lastTwo {
    public static void main(String[] args) {
        out.println(lastTwo("coding"));
        out.println(lastTwo("cat"));
        out.println(lastTwo("ab"));
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, str.length() - 2) +
               str.charAt(str.length() - 1) +
               str.charAt(str.length() - 2);
    }
}
