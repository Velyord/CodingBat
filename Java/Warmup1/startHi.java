/*
Task:
    Given a string, return true if the string starts with "hi" and false otherwise.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class startHi {
    public static void main(String[] args) {
        out.println(startHi("hi there"));
        out.println(startHi("hi"));
        out.println(startHi("hello hi"));
    }

    private static boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
