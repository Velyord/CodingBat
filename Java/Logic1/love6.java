/*
Task:
    The number 6 is a truly great number.
    Given two int values, a and b, return true if either one is 6.
    Or if their sum or difference is 6.
    Note: the function Math.abs(num) computes the absolute value of a number.

Examples:
    love6(6, 4) → true
    love6(4, 5) → false
    love6(1, 5) → true
 */
package Java.Logic1;

import static java.lang.System.out;

public class love6 {
    public static void main(String[] args) {
        out.println(love6(6, 4));
        out.println(love6(4, 5));
        out.println(love6(1, 5));
    }

    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }
}
