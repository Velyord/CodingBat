/*
Task:
    Given an int array length 2, return true if it does not contain a 2 or 3.
Examples:
    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false
 */
package Java.Array1;

import static java.lang.System.out;

public class no23 {
    public static void main(String[] args) {
        output(true, no23(new int[] {4, 5}));
        output(false, no23(new int[] {4, 2}));
        output(false, no23(new int[] {3, 5}));
    }

    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
