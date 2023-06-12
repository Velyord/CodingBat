/*
Task:
    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    The ints are non-negative.

Examples:
    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true
 */
package Java.Logic1;

import static java.lang.System.out;

public class lastDigit {
    public static void main(String[] args) {
        out.println(lastDigit(23, 19, 13));
        out.println(lastDigit(23, 19, 12));
        out.println(lastDigit(23, 19, 3));
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
}
