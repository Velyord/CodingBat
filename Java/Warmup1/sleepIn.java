/*
Task:
    We have two monkeys, a and b,
    and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class sleepIn {
    public static void main(String[] args) {
        out.println(sleepIn(false, false));
        out.println(sleepIn(true, false));
        out.println(sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}