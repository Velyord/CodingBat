/*
Task:
    Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.
Examples:
    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
 */
package Java.Array1;

import static java.lang.System.out;

public class double23 {
    public static void main(String[] args) {
        output(true, double23(new int[] {2, 2}));
        output(true, double23(new int[] {3, 3}));
        output(false, double23(new int[] {2, 3}));
    }

    public static boolean double23(int[] nums) {
        return (nums.length == 2 &&
                nums[0] == nums[1] &&
                (nums[0] == 2 || nums[0] == 3));
    }

    public static void output(Object expected, Object actual) {
        out.println("Expected: " + expected + " | Actual: " + actual);
    }
}
