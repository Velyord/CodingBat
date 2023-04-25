/*
Task:
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class delDel {
    public static void main(String[] args) {
        out.println(delDel("adelbc"));
        out.println(delDel("adelHello"));
        out.println(delDel("adedbc"));
    }

    public static String delDel(String str) {
        if (str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }

        return str;
    }
}
