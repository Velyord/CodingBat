/*
Task:
    Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class front3 {
    public static void main(String[] args) {
        out.println(front3("Java"));
        out.println(front3("Chocolate"));
        out.println(front3("abc"));
    }

    private static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }

        String front = str.substring(0, 3);

        return front + front + front;
    }
}
