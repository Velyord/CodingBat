/*
Task:
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class posNeg {
    public static void main(String[] args) {
        out.println(posNeg(1, -1, false));
        out.println(posNeg(-1, 1, false));
        out.println(posNeg(-4, -5, true));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
}