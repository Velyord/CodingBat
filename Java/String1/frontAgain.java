/*
Task:
    Given a string, return true if the first 2 chars in the string also appear
    at the end of the string, such as with "edited".
Examples:
    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
 */
package Java.String1;

import static java.lang.System.out;

public class frontAgain {
    public static void main(String[] args) {
        out.println(frontAgain("edited"));
        out.println(frontAgain("edit"));
        out.println(frontAgain("ed"));
    }

    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }

        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }
}
