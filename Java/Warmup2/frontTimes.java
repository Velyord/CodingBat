/*
Task:
    Given a string and a non-negative int n,
    we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3.
    Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
 */
package Java.Warmup2;

import static java.lang.System.out;

public class frontTimes {
    public static void main(String[] args) {
        out.println(frontTimes("Chocolate", 2));
        out.println(frontTimes("Chocolate", 3));
        out.println(frontTimes("Abc", 3));
    }

    public static String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        String front = str.length() < 3 ? str : str.substring(0, 3);

        for (int i = 1; i <= n; i++) {
            result.append(front);
        }

        return result.toString();
    }
}
