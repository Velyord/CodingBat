/*
Task:
    Given 2 arrays of ints, a and b,
    return true if they have the same first element or they have the same last element.
    Both arrays will be length 1 or more.
Examples:
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
 */
package Java.Array1;

import static java.lang.System.out;

public class commonEnd {
    public static void main(String[] args) {
        output(true, commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
        output(false, commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
        output(true, commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));
    }
    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
    public static void output(Object expected, Object actual) {
        out.println("Expected: " + expected + "\nActual: " + actual + "\n");
    }
}
