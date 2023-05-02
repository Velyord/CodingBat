/*
Task:
    Given a string, return a new string made of every other char starting with the first,
    so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
 */
package Java.Warmup2;

import static java.lang.System.out;

public class stringBits {
    public static void main(String[] args) {
        out.println(stringBits("Hello"));
        out.println(stringBits("Hi"));
        out.println(stringBits("Heeololeo"));
    }

    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
