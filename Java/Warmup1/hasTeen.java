/*
Task:
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class hasTeen {
    public static void main(String[] args) {
        out.println(hasTeen(13, 20, 10));
        out.println(hasTeen(20, 19, 10));
        out.println(hasTeen(20, 10, 13));
    }

    private static boolean hasTeen(int a, int b, int c) {
        int startRange = 13;
        int endRange = 19;

        boolean aIsInRange = (a >= startRange && a <= endRange);
        boolean bIsInRange = (b >= startRange && b <= endRange);
        boolean cIsInRange = (c >= startRange && c <= endRange);

        return aIsInRange || bIsInRange || cIsInRange;
    }
}
