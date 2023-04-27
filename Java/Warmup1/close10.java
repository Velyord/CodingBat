/*
Task:
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class close10 {
    public static void main(String[] args) {
        out.println(close10(8, 13));
        out.println(close10(13, 8));
        out.println(close10(13, 7));
    }

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        } else if (bDiff < aDiff) {
            return b;
        } else {
            return 0;
        }
    }
}
