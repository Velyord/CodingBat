/*
Task:
    Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.
 */

package Java.Warmup1;

import static java.lang.System.out;

public class notString {
    public static void main(String[] args) {
        out.println(notString("candy"));
        out.println(notString("x"));
        out.println(notString("not bad"));
    }

    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
