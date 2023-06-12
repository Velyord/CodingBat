/*
Task:
    Given 2 int arrays, a and b, of any length,
    return a new array with the first element of each array.
    If either array is length 0, ignore that array.

Examples:
    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class front11 {
    public static void main(String[] args) {
        out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        out.println(Arrays.toString(front11(new int[]{1}, new int[]{2})));
        out.println(Arrays.toString(front11(new int[]{1, 7}, new int[]{})));
    }

    public static int[] front11(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0) {
            return new int[]{};
        } else if(a.length == 0) {
            return new int[]{b[0]};
        } else if(b.length == 0) {
            return new int[]{a[0]};
        }

        return new int[]{a[0], b[0]};
    }
}
