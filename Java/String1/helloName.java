/*
Task:
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
 */
package Java.String1;

import static java.lang.System.out;

public class helloName {
    public static void main(String[] args) {
        out.println(helloName("Bob"));
        out.println(helloName("Alice"));
        out.println(helloName("X"));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
