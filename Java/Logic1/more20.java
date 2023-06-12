/*
Task:
    Return true if the given non-negative number is 1 or 2 more than a
    multiple of 20.

Examples:
    more20(20) → false
    more20(21) → true
    more20(22) → true
 */
package Java.Logic1;

import static java.lang.System.out;

public class more20 {
    public static void main(String[] args) {
        out.println(more20(20));
        out.println(more20(21));
        out.println(more20(22));
    }

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }
}