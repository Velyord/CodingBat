/*
Task:
    Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class sumDouble {
    public static void main(String[] args) {
        out.println(sumDouble(1, 2));
        out.println(sumDouble(3, 2));
        out.println(sumDouble(2, 2));
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;

        return a == b ? sum * 2 : sum;
    }
}
