/*
Task:
    Given a string, if the string begins with "red" or "blue" return that
    color string, otherwise return the empty string.
Examples:
    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
 */
package Java.String1;

import static java.lang.System.out;

public class seeColor {
    public static void main(String[] args) {
        out.println(seeColor("redxx"));
        out.println(seeColor("xxred"));
        out.println(seeColor("blueTimes"));
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }

        if (str.startsWith("blue")) {
            return "blue";
        }

        return "";
    }
}
