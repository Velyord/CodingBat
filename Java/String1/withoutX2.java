/*
Task:
    Given a string, if one or both of the first 2 chars is 'x', return the
    string without those 'x' chars, and otherwise return the string unchanged.
    This is a little harder than it looks.
Examples:
    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
 */
package Java.String1;

import static java.lang.System.out;

public class withoutX2 {
    public static void main(String[] args) {
        out.println(withoutX2("xHi"));
        out.println(withoutX2("Hxi"));
        out.println(withoutX2("Hi"));
    }

    public static String withoutX2(String str) {
        if (str.length() == 0 ||
                str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }

        if(str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        }

        if(str.charAt(0) == 'x') {
            return str.substring(1);
        }

        if(str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }

        return str;
    }
}
