/*
Task:
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
Examples:
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
 */
package Java.String1;

import static java.lang.System.out;

public class extraEnd {
    public static void main(String[] args) {
        out.println(extraEnd("Hello"));
        out.println(extraEnd("ab"));
        out.println(extraEnd("Hi"));
    }

    public static String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }
}
