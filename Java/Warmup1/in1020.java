/*
Task:
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class in1020 {
    public static void main(String[] args) {
        out.println(in1020(12, 99));
        out.println(in1020(21, 12));
        out.println(in1020(8, 99));
    }

    private static boolean in1020(int a, int b) {
        int startRange = 10;
        int endRange = 20;

        boolean aIsInRange = (a >= startRange && a <= endRange);
        boolean bIsInRange = (b >= startRange && b <= endRange);

        return aIsInRange || bIsInRange;
    }
}