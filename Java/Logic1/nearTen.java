/*
Task:
    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

Examples:
    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true
 */
package Java.Logic1;

import static java.lang.System.out;

public class nearTen {
    public static void main(String[] args) {
        out.println(nearTen(12));
        out.println(nearTen(17));
        out.println(nearTen(19));
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
