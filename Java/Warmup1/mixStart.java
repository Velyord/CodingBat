/*
Task:
    Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class mixStart {
    public static void main(String[] args) {
        out.println(mixStart("mix snacks"));
        out.println(mixStart("pix snacks"));
        out.println(mixStart("piz snacks"));
    }

    public static boolean mixStart(String str) {
        return str.startsWith("ix", 1);
    }
}
