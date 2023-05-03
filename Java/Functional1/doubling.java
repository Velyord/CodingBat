/*
Task:
    Given a list of integers, return a list where each integer is multiplied by 2.

    doubling([1, 2, 3]) → [2, 4, 6]
    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    doubling([]) → []
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class doubling {
    public static void main(String[] args) {
        out.println(doubling(Arrays.asList(1, 2, 3)));
        out.println(doubling(Arrays.asList(6, 8, 6, 8, -1)));
        out.println(doubling(Arrays.asList()));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);

        return nums;
    }
}
