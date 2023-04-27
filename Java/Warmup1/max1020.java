/*
Task:
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class max1020 {
    public static void main(String[] args) {
        out.println(max1020(11, 19));
        out.println(max1020(19, 11));
        out.println(max1020(11, 9));
    }

    public static int max1020(int a, int b) {
        boolean aInRange1020 = (a >= 10 && a <= 20);
        boolean bInRange1020 = (b >= 10 && b <= 20);

        if (aInRange1020 && bInRange1020) {
            return Math.max(a, b);
        } else if (aInRange1020) {
            return a;
        } else if (bInRange1020) {
            return b;
        } else {
            return 0;
        }
    }
}
