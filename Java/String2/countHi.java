/*
Task:
    Return the number of times that the string "hi" appears anywhere in the
    given string.

Examples:
    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
 */
package Java.String2;

import static java.lang.System.out;

public class countHi {
    public static void main(String[] args) {
        out.println(countHi("abc hi ho"));
        out.println(countHi("ABChi hi"));
        out.println(countHi("hihi"));
    }

    public static int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }

        return count;
    }
}
