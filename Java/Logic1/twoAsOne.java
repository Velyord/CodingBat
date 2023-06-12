/*
Task:
    Given three ints, a b c, return true if it is possible to add two of the ints
    to get the third.

Examples:
    twoAsOne(1, 2, 3) → true
    twoAsOne(3, 1, 2) → true
    twoAsOne(3, 2, 2) → false
 */
package Java.Logic1;

import static java.lang.System.out;

public class twoAsOne {
    public static void main(String[] args) {
        out.println(twoAsOne(1, 2, 3));
        out.println(twoAsOne(3, 1, 2));
        out.println(twoAsOne(3, 2, 2));
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}
