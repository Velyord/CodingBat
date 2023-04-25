/*
Task:
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class icyHot {
    public static void main(String[] args) {
        out.println(icyHot(120, -1));
        out.println(icyHot(-1, 120));
        out.println(icyHot(2, 120));
    }

    private static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }
}
