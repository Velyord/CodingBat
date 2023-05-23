/*
Task:
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
Examples:
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
 */
package Java.String1;

import static java.lang.System.out;

public class firstHalf {
    public static void main(String[] args) {
        out.println(firstHalf("WooHoo"));
        out.println(firstHalf("HelloThere"));
        out.println(firstHalf("abcdef"));
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
