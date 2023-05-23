/*
Task:
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.
Examples:
    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
 */
package Java.String1;

import static java.lang.System.out;

public class atFirst {
    public static void main(String[] args) {
        out.println(atFirst("hello"));
        out.println(atFirst("hi"));
        out.println(atFirst("h"));
    }

    public static String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return str.substring(0, 2);
        }
    }
}
