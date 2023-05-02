/*
Task:
    Given a string, return true if the first instance of "x" in the string is
    immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
 */
package Java.Warmup2;

import static java.lang.System.out;

public class doubleX {
    public static void main(String[] args) {
        out.println(doubleX("axxbb"));
        out.println(doubleX("axaxax"));
        out.println(doubleX("xxxxx"));
    }

    public static boolean doubleX(String str) {
        int i = str.indexOf("x");

        if(i == -1) {
            return false;
        }

        if(i + 1 >= str.length()) {
            return false;
        }

        return str.charAt(i + 1) == 'x';
    }
}
