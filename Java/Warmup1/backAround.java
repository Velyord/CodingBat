/*
Task:
    Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class backAround {
    public static void main(String[] args) {
        out.println(backAround("cat"));
        out.println(backAround("Hello"));
        out.println(backAround("a"));
    }

    private static String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);

        return lastChar + str + lastChar;
    }

}
