/*
Task:
    Given an int array length 2, return true if it contains a 2 or a 3.
Examples:
    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false
 */
package Java.Array1;

import static java.lang.System.out;

public class has23 {
    public static void main(String[] args) {
        output(true, has23(new int[] {2, 5}));
        output(true, has23(new int[] {4, 3}));
        output(false, has23(new int[] {4, 5}));
    }

    public static boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
