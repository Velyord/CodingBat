/*
Task:
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
Examples:
    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"
 */
package Java.String1;

import static java.lang.System.out;

public class extraFront {
    public static void main(String[] args) {
        out.println(extraFront("Hello"));
        out.println(extraFront("ab"));
        out.println(extraFront("H"));
    }

    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }

        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }
}
