/*
Task:
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class monkeyTrouble {
    public static void main(String[] args) {
        out.println(monkeyTrouble(true, true));
        out.println(monkeyTrouble(false, false));
        out.println(monkeyTrouble(true, false));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }
}
