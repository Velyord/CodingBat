/*
Task:
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
 */
package Java.Warmup2;

import static java.lang.System.out;

public class stringX {
    public static void main(String[] args) {
        out.println(stringX("xxHxix"));
        out.println(stringX("abxxxcd"));
        out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(i == 0 || i == str.length() - 1) {
                result.append(str.charAt(i));
            } else if(str.charAt(i) != 'x') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
