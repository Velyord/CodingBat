/*
Task:
    Given a string and an int n, return a string made of n repetitions of the
    last n characters of the string. You may assume that n is between 0 and the
    length of the string, inclusive.

Examples:
    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
 */
package Java.String2;

import static java.lang.System.out;

public class repeatEnd {
    public static void main(String[] args) {
        out.println(repeatEnd("Hello", 3));
        out.println(repeatEnd("Hello", 2));
        out.println(repeatEnd("Hello", 1));
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(str.substring(str.length() - n));
        }

        return result.toString();
    }
}
