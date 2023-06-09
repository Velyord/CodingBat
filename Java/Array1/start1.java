/*
Task:
    Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.
Examples:
    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1
 */
package Java.Array1;

import static java.lang.System.out;

public class start1 {
    public static void main(String[] args) {
        out.println(start1(new int[] {1, 2, 3}, new int[] {1, 3}));
        out.println(start1(new int[] {7, 2, 3}, new int[] {1}));
        out.println(start1(new int[] {1, 2}, new int[] {}));
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;

        return count;
    }
}
