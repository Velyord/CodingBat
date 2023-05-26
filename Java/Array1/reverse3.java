/*
Task:
    Given an array of ints length 3, return an array with the elements
    in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
Examples:
    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class reverse3 {
    public static void main(String[] args) {
        output("[3, 2, 1]", Arrays.toString(reverse3(new int[] {1, 2, 3})));
        output("[9, 11, 5]", Arrays.toString(reverse3(new int[] {5, 11, 9})));
        output("[0, 0, 7]", Arrays.toString(reverse3(new int[] {7, 0, 0})));
    }
    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }
    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
