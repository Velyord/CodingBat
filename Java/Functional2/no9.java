/*
Task:
    Given a list of non-negative integers,
    return a list of those numbers except omitting any that end with 9. (Note: % by 10)

    no9([1, 2, 19]) → [1, 2]
    no9([9, 19, 29, 3]) → [3]
    no9([1, 2, 3]) → [1, 2, 3]
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class no9 {
    public static void main(String[] args) {
        out.println(no9(new ArrayList<>(Arrays.asList(1, 2, 19))));
        out.println(no9(new ArrayList<>(Arrays.asList(9, 19, 29, 3))));
        out.println(no9(new ArrayList<>(Arrays.asList(1, 2, 3))));
    }

    static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);

        return nums;
    }
}
