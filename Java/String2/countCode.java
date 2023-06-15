/*
Task:
    Return the number of times that the string "code" appears anywhere in the
    given string, except we'll accept any letter for the 'd', so "cope" and
    "cooe" count.

Examples:
    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
 */
package Java.String2;

import static java.lang.System.out;

public class countCode {
    public static void main(String[] args) {
        out.println(countCode("aaacodebbb"));
        out.println(countCode("codexxcode"));
        out.println(countCode("cozexxcope"));
    }

    public static int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' &&
                str.charAt(i + 1) == 'o' &&
                str.charAt(i + 3)=='e') {
                count++;
            }
        }

        return count;
    }
}
