/*
Task:
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
    or they are both in the range 40..50 inclusive.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class in3050 {
    public static void main(String[] args) {
        out.println(in3050(30, 31));
        out.println(in3050(30, 41));
        out.println(in3050(40, 50));
    }

    public static boolean in3050(int a, int b) {
        boolean aInRange3040 = (a >= 30 && a <= 40);
        boolean bInRange3040 = (b >= 30 && b <= 40);
        boolean aInRange4050 = (a >= 40 && a <= 50);
        boolean bInRange4050 = (b >= 40 && b <= 50);

        boolean bothInRange3040 = (aInRange3040 && bInRange3040);
        boolean bothInRange4050 = (aInRange4050 && bInRange4050);

        return bothInRange3040 || bothInRange4050;
    }
}
