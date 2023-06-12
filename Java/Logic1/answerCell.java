/*
Task:
    Your cell phone rings. Return true if you should answer it.
    Normally you answer, except in the morning you only answer if it is your mom calling.
    In all cases, if you are asleep, you do not answer.

Examples:
    answerCell(false, false, false) → true
    answerCell(false, false, true) → false
    answerCell(true, false, false) → false
 */
package Java.Logic1;

import static java.lang.System.out;

public class answerCell {
    public static void main(String[] args) {
        out.println(answerCell(false, false, false));
        out.println(answerCell(false, false, true));
        out.println(answerCell(true, false, false));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (!isMorning || isMom);
    }
}
