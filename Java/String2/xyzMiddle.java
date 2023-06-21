/*
Task:
    Given a string, does "xyz" appear in the middle of the string? To define
    middle, we'll say that the number of chars to the left and right of the "xyz"
    must differ by at most one. This problem is harder than it looks.
 */
package Java.String2;

import static java.lang.System.out;

public class xyzMiddle {
    public static void main(String[] args) {
        out.println(xyzMiddle("AAxyzBB"));
        out.println(xyzMiddle("AxyzBB"));
        out.println(xyzMiddle("AAxyzB"));
        out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int mid = len / 2;

        if (len < 3) {
            return false;
        }

        boolean xyz = str.substring(mid - 1, mid + 2).equals("xyz");

        if (len % 2 == 0) {
            return xyz || str.substring(mid - 2, mid + 1).equals("xyz");
        } else {
            return xyz;
        }
    }
}
