/*
Task:
    Given two strings, a and b, create a bigger string made of the first char
    of a, the first char of b, the second char of a, the second char of b, and
    so on. Any leftover chars go at the end of the result.

Examples:
    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
 */
package Java.String2;

import static java.lang.System.out;

public class mixString {
    public static void main(String[] args) {
        out.println(mixString("abc", "xyz"));
        out.println(mixString("Hi", "There"));
        out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }

            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }
}
