/*
Task:
    Given an array of ints, return true if it contains a 2, 7, 1 pattern:
    a value, followed by the value plus 5, followed by the value minus 1.
    Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.

    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true
 */
package Java.Warmup2;

import static java.lang.System.out;

public class has271 {
    public static void main(String[] args) {
        out.println(has271(new int[]{1, 2, 7, 1}));
        out.println(has271(new int[]{1, 2, 8, 1}));
        out.println(has271(new int[]{2, 7, 1}));
    }

    public static boolean has271(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if((nums[i + 1] == nums[i] + 5)  &&
               (nums[i + 2] >= nums[i] - 1 - 2)  &&
               (nums[i + 2] <= nums[i] - 1 + 2)) {
                return true;
            }
        }

        return false;
    }
}
