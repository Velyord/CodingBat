/*
Task:
    We have a loud talking parrot.
    The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    Return true if we are in trouble.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class parrotTrouble {
    public static void main(String[] args) {
        out.println(parrotTrouble(true, 6));
        out.println(parrotTrouble(true, 7));
        out.println(parrotTrouble(false, 6));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
}
