/*
Task:
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class diff21 {
    public static void main(String[] args) {
        out.println(diff21(19));
        out.println(diff21(10));
        out.println(diff21(21));
    }

    public static int diff21(int n) {
        int diff = Math.abs(n - 21);

        return n > 21 ? diff * 2 : diff;
    }
}
