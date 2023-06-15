/*
Task:
    Given 3 int values, a b c, return their sum.
    However, if one of the values is the same as another of the values,
    it does not count towards the sum.

Examples:
    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1
 */
package Java.Logic2;

import static java.lang.System.out;

public class loneSum {
    public static void main(String[] args) {
        out.println(loneSum(1, 2, 3));
        out.println(loneSum(3, 2, 3));
        out.println(loneSum(3, 3, 3));
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }
}
