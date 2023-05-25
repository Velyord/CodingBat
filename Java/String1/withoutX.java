/*
Task:
    Given a string, if the first or last chars are 'x', return the string
    without those 'x' chars, and otherwise return the string unchanged.
Examples:
    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
 */
package Java.String1;

import static java.lang.System.out;

public class withoutX {
    public static void main(String[] args) {
        out.println(withoutX("xHix"));
        out.println(withoutX("xHi"));
        out.println(withoutX("Hxix"));
    }

    public static String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
