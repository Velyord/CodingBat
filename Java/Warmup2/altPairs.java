/*
Task:
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
    so "kittens" yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
 */
package Java.Warmup2;

import static java.lang.System.out;

public class altPairs {
    public static void main(String[] args) {
        out.println(altPairs("kitten"));
        out.println(altPairs("Chocolate"));
        out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i));

            if(i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
            }
        }

        return result.toString();
    }
}
