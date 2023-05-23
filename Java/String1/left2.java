/*
Task:
    Given a string, return a "rotated left 2"
    version where the first 2 chars are moved to the end.
    The string length will be at least 2.
Examples:
    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"
 */
package Java.String1;

import static java.lang.System.out;

public class left2 {
    public static void main(String[] args) {
        out.println(left2("Hello"));
        out.println(left2("java"));
        out.println(left2("Hi"));
    }

    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
