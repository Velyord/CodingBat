/*
Task:
    Given a string and an int n,
    return a string made of the first and last n chars from the string.
    The string length will be at least n.
Examples:
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
 */
package Java.String1;

import static java.lang.System.out;

public class nTwice {
    public static void main(String[] args) {
        out.println(nTwice("Hello", 2));
        out.println(nTwice("Chocolate", 3));
        out.println(nTwice("Chocolate", 1));
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}