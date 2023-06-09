/*
Task:
    Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the
    sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative
    int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)

Examples:
    sumLimit(2, 3) → 5
    sumLimit(8, 3) → 8
    sumLimit(8, 1) → 9
 */
package Java.Logic1;

import static java.lang.System.out;

public class sumLimit {
    public static void main(String[] args) {
        out.println(sumLimit(2, 3));
        out.println(sumLimit(8, 3));
        out.println(sumLimit(8, 1));
    }

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if (sumLength > aLength) {
            return a;
        } else {
            return sum;
        }
    }
}
