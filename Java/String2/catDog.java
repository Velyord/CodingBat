/*
Task:
    Return true if the string "cat" and "dog" appear the same number of times
    in the given string.

Examples:
    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
 */
package Java.String2;

import static java.lang.System.out;

public class catDog {
    public static void main(String[] args) {
        out.println(catDog("catdog"));
        out.println(catDog("catcat"));
        out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                catCount++;
            } else if (str.startsWith("dog", i)) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }
}
