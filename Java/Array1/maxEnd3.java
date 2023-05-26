/*
Task:
    Given an array of ints length 3, figure out which is larger, the first or
    last element in the array, and set all the other elements to be that value.
    Return the changed array.
Examples:
    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class maxEnd3 {
    public static void main(String[] args) {
        output("[3, 3, 3]", Arrays.toString(maxEnd3(new int[] {1, 2, 3})));
        output("[11, 11, 11]", Arrays.toString(maxEnd3(new int[] {11, 5, 9})));
        output("[3, 3, 3]", Arrays.toString(maxEnd3(new int[] {2, 11, 3})));
    }
    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[] {max, max, max};
    }
    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
