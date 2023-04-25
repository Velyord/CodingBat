/*
Task:
    Given a string, take the first 2 chars
    and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class front22 {
    public static void main(String[] args) {
        out.println(front22("kitten"));
        out.println(front22("Ha"));
        out.println(front22("abc"));
    }

    private static String front22(String str) {
        String front;

        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }

        return front + str + front;
    }
}
