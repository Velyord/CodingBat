/*
Task:
    Given a string, return true if it ends in "ly".
Examples:
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
 */
package Java.String1;

import static java.lang.System.out;

public class endsLy {
    public static void main(String[] args) {
        out.println(endsLy("oddly"));
        out.println(endsLy("y"));
        out.println(endsLy("oddy"));
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }
}
