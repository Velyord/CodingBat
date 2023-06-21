/*
Task:
    We'll say that a String is xy-balanced if for all the 'x' chars in the
    string, there exists a 'y' char somewhere later in the string. So "xxy" is
    balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true
    if the given string is xy-balanced.

Examples:
    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
 */
package Java.String2;

import static java.lang.System.out;

public class xyBalance {
    public static void main(String[] args) {
        out.println(xyBalance("aaxbby"));
        out.println(xyBalance("aaxbb"));
        out.println(xyBalance("yaaxbb"));
    }

    public static boolean xyBalance(String str) {
        int x = str.lastIndexOf('x');
        int y = str.lastIndexOf('y');

        return x <= y;
    }
}
