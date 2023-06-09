/*
Task:
    Start with 2 int arrays, a and b, each length 2.
    Consider the sum of the values in each array.
    Return the array which has the largest sum.
    In event of a tie, return a.
Examples:
    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class biggerTwo {
    public static void main(String[] args) {
        out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        out.println(Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        out.println(Arrays.toString(biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] < b[0] + b[1]) {
            return b;
        }

        return a;
    }
}
