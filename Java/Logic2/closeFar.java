/*
Task:
    Given three ints, a b c, return true if one of b or c is "close"
    (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more.

Examples:
    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
 */
package Java.Logic2;

import static java.lang.System.out;

public class closeFar {
    public static void main(String[] args) {
        out.println(closeFar(1, 2, 10));
        out.println(closeFar(1, 2, 3));
        out.println(closeFar(4, 1, 3));
    }

    public static boolean closeFar(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bc = Math.abs(b - c);

        return ab <= 1 && ac >= 2 && bc >= 2 ||
               ac <= 1 && ab >= 2 && bc >= 2;
    }
}
