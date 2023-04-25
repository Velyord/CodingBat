/*
Task:
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class makes10 {
    public static void main(String[] args) {
        out.println(makes10(9, 10));
        out.println(makes10(9, 9));
        out.println(makes10(1, 9));
    }

    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }
}
