/*
Task:
    Given a list of integers, return a list where each integer is added to 1
    and the result is multiplied by 10.

    math1([1, 2, 3]) → [20, 30, 40]
    math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
    math1([10]) → [110]
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class math1 {
    public static void main(String[] args) {
        out.println(math1(Arrays.asList(1, 2, 3)));
        out.println(math1(Arrays.asList(6, 8, 6, 8, 1)));
        out.println(math1(Arrays.asList(10)));
    }

    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);

        return nums;
    }
}
