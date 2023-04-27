/*
Task:
    Given two non-negative int values, return true if they have the same last digit,
    such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
 */
package Java.Warmup1;

import static java.lang.System.out;

public class lastDigit {
    public static void main(String[] args) {
        out.println(lastDigit(7, 17));
        out.println(lastDigit(6, 17));
        out.println(lastDigit(3, 113));
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }
}
