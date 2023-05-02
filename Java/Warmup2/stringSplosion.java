/*
Task:
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
 */
package Java.Warmup2;

import static java.lang.System.out;

public class stringSplosion {
    public static void main(String[] args) {
        out.println(stringSplosion("Code"));
        out.println(stringSplosion("abc"));
        out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str, 0, i + 1);
        }

        return result.toString();
    }
}
