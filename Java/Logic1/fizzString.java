/*
Task:
    Given a string str, if the string starts with "f" return "Fizz".
    If the string ends with "b" return "Buzz". If both the "f" and "b"
    conditions are true, return "FizzBuzz". In all other cases, return
    the string unchanged. (See also: FizzBuzz Code)

Examples:
    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
 */
package Java.Logic1;

import static java.lang.System.out;

public class fizzString {
    public static void main(String[] args) {
        out.println(fizzString("fig"));
        out.println(fizzString("dib"));
        out.println(fizzString("fib"));
    }

    public static String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if(startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if(startsWithF) {
            return "Fizz";
        } else if(endsWithB) {
            return "Buzz";
        }

        return str;
    }
}
