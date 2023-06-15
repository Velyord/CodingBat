/*
Task:
    For this problem, we'll round an int value up to the next multiple of 10 if
    its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round
    down to the previous multiple of 10 if its rightmost digit is less than 5, so
    12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded
    values. To avoid code repetition, write a separate helper "public int
    round10(int num) {" and call it 3 times. Write the helper entirely below and
    at the same indent level as roundSum().

Examples:
    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10
 */
package Java.Logic2;

import static java.lang.System.out;

public class roundSum {
    public static void main(String[] args) {
        out.println(roundSum(16, 17, 18));
        out.println(roundSum(12, 13, 14));
        out.println(roundSum(6, 4, 4));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int remainder = num % 10;

        if (remainder >= 5) {
            return num + (10 - remainder);
        } else {
            return num - remainder;
        }
    }
}
