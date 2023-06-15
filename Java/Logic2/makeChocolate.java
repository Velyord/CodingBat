/*
Task:
    We want to make a package of goal kilos of chocolate.
    We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use,
    assuming we always use big bars before small bars.
    Return -1 if it can't be done.

Examples:
    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2
 */
package Java.Logic2;

import static java.lang.System.out;

public class makeChocolate {
    public static void main(String[] args) {
        out.println(makeChocolate(4, 1, 9));
        out.println(makeChocolate(4, 1, 10));
        out.println(makeChocolate(4, 1, 7));
    }

    public static int makeChocolate(int small, int big, int goal) {
        while (goal - 5 >= 0 && big > 0) {
            goal -= 5;
            big -= 1;
        }

        if (small >= goal) {
            return goal;
        }

        return -1;
    }
}
