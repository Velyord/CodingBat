/*
Task:
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class loneTeen {
    public static void main(String[] args) {
        out.println(loneTeen(13, 99));
        out.println(loneTeen(21, 19));
        out.println(loneTeen(13, 13));
    }

    private static boolean loneTeen(int a, int b) {
        int startRange = 13;
        int endRange = 19;

        boolean aIsInRange = (a >= startRange && a <= endRange);
        boolean bIsInRange = (b >= startRange && b <= endRange);

        return (aIsInRange ^ bIsInRange);
    }
}
