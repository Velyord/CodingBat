/*
Task:
    Given three ints, a b c, return true if one of b or c is "close"
    (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more.

Examples:
    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
 */
package Java.Logic2;

import static java.lang.System.out;

public class evenlySpaced {
    public static void main(String[] args) {
        out.println(evenlySpaced(2, 4, 6));
        out.println(evenlySpaced(4, 6, 2));
        out.println(evenlySpaced(4, 6, 3));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int med;

        if (a != max && a != min) {
            med = a;
        } else if (b != max && b != min) {
            med=b;
        } else {
            med=c;
        }

        return ((double) (max + min) / 2 == med);
    }
}
