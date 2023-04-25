/*
Task:
    Given a string, return a new string where the first and last chars have been exchanged.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class frontBack {
    public static void main(String[] args) {
        out.println(frontBack("code"));
        out.println(frontBack("a"));
        out.println(frontBack("ab"));
    }

    private static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String front = str.substring(0, 1);
        String back = str.substring(str.length() - 1);
        String mid = str.substring(1, str.length() - 1);

        return back + mid + front;
    }
}
