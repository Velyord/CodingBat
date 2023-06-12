/*
Task:
    Given 2 ints, a and b, return their sum.
    However, sums in the range 10..19 inclusive, are forbidden,
    so in that case just return 20.

Examples:
    sortaSum(3, 4) → 7
    sortaSum(9, 4) → 20
    sortaSum(10, 11) → 21
 */
package Java.Logic1;

import static java.lang.System.out;

public class sortaSum {
    public static void main(String[] args) {
        out.println(sortaSum(3, 4));
        out.println(sortaSum(9, 4));
        out.println(sortaSum(10, 11));
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;

        if(sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }
}
