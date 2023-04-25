/*
Task:
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class nearHundred {
    public static void main(String[] args) {
        out.println(nearHundred(93));
        out.println(nearHundred(90));
        out.println(nearHundred(89));
    }

    public static boolean nearHundred(int n) {
        int diff100 = Math.abs(n - 100);
        int diff200 = Math.abs(n - 200);

        return diff100 <= 10 || diff200 <= 10;
    }
}
