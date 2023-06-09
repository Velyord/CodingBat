/*
Task:
    Given an int array, return a new array with double the length where its last
    element is the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more. Note: by default, a new int
    array contains all 0's.
Examples:
    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class makeLast {
    public static void main(String[] args) {
        output("[0, 0, 0, 0, 0, 6]", Arrays.toString(makeLast(new int[] {4, 5, 6})));
        output("[0, 0, 0, 2]", Arrays.toString(makeLast(new int[] {1, 2})));
        output("[0, 3]", Arrays.toString(makeLast(new int[] {3})));
    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];

        return result;
    }

    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
