/*
Task:
    Return true if the given string contains between 1 and 3 'e' chars.
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
 */
package Java.Warmup1;

import static java.lang.System.out;

public class stringE {
    public static void main(String[] args) {
        out.println(stringE("Hello"));
        out.println(stringE("Heelle"));
        out.println(stringE("Heelele"));
    }

    public static boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        return (count >= 1 && count <= 3);
    }
}
