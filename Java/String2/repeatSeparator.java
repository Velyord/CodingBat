/*
Task:
    Given two strings, word and a separator sep, return a big string made of
    count occurrences of the word, separated by the separator string.

Examples:
    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
 */
package Java.String2;

import static java.lang.System.out;

public class repeatSeparator {
    public static void main(String[] args) {
        out.println(repeatSeparator("Word", "X", 3));
        out.println(repeatSeparator("This", "And", 2));
        out.println(repeatSeparator("This", "And", 1));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);

            if (i < count - 1) {
                result.append(sep);
            }
        }

        return result.toString();
    }
}
