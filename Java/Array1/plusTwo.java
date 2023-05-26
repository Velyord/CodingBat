/*
Task:
    Given 2 int arrays, each length 2,
    return a new array length 4 containing all their elements.
Examples:
    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class plusTwo {
    public static void main(String[] args) {
        out.println(Arrays.toString(plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        out.println(Arrays.toString(plusTwo(new int[]{4, 4}, new int[]{2, 2})));
        out.println(Arrays.toString(plusTwo(new int[]{9, 2}, new int[]{3, 4})));
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] c = new int[4];
        c[0] = a[0];
        c[1] = a[1];
        c[2] = b[0];
        c[3] = b[1];

        return c;
    }
}
