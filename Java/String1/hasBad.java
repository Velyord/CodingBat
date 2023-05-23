/*
Task:
    Given a string, return true if "bad" appears starting at index 0 or 1
    in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.
Examples:
    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
 */
package Java.String1;

import static java.lang.System.out;

public class hasBad {
    public static void main(String[] args) {
        out.println(hasBad("badxx"));
        out.println(hasBad("xbadxx"));
        out.println(hasBad("xxbadxx"));
    }

    public static boolean hasBad(String str) {
        if (str.startsWith("bad") ||
            str.length() > 3 && str.startsWith("bad", 1)) {
            return true;
        }

        return false;
    }
}
