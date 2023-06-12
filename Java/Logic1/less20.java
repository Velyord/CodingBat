/*
Task:
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    So for example 38 and 39 return true, but 40 returns false.

Examples:
    less20(18) → true
    less20(19) → true
    less20(20) → false
 */
package Java.Logic1;

import static java.lang.System.out;

public class less20 {
    public static void main(String[] args) {
        out.println(less20(18));
        out.println(less20(19));
        out.println(less20(20));
    }

    public static boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }
}
