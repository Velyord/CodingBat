/*
Task:
    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist,
    returning 0 if the array is length 0.
Examples:
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
 */
package Java.Array1;

import static java.lang.System.out;

public class sum2 {
    public static void main(String[] args) {
        output("3", sum2(new int[] {1, 2}));
        output("2", sum2(new int[] {1, 1}));
        output("2", sum2(new int[] {1, 1, 1, 1}));
    }
    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }
    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
