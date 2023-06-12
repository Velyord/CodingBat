/*
Task:
    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

Examples:
    lessBy10(1, 7, 11) → true
    lessBy10(1, 7, 10) → false
    lessBy10(11, 1, 7) → true
 */
package Java.Logic1;

import static java.lang.System.out;

public class lessBy10 {
    public static void main(String[] args) {
        out.println(lessBy10(1, 7, 11));
        out.println(lessBy10(1, 7, 10));
        out.println(lessBy10(11, 1, 7));
    }

    public static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 ||
               Math.abs(a - c) >= 10 ||
               Math.abs(b - c) >= 10;
    }
}
