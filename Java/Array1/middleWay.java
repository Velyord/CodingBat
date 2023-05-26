/*
Task:
    Given 2 int arrays, a and b, each length 3, return a new array length 2
    containing their middle elements.
Examples:
    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class middleWay {
    public static void main(String[] args) {
        output("[2, 5]", Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6})));
        output("[7, 8]", Arrays.toString(middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0})));
        output("[2, 4]", Arrays.toString(middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5})));
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
