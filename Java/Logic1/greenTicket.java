/*
Task:
    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
    the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the
    result is 10.

Examples:
    greenTicket(1, 2, 3) → 0
    greenTicket(2, 2, 2) → 20
    greenTicket(1, 1, 2) → 10
 */
package Java.Logic1;

import static java.lang.System.out;

public class greenTicket {
    public static void main(String[] args) {
        out.println(greenTicket(1, 2, 3));
        out.println(greenTicket(2, 2, 2));
        out.println(greenTicket(1, 1, 2));
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }
}
