/*
Task:
    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks
    (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little
    harder than it looks and can be done without any loops.

Examples:
    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
 */
package Java.Logic2;

import static java.lang.System.out;

public class makeBricks {
    public static void main(String[] args) {
        out.println(makeBricks(3, 1, 8));
        out.println(makeBricks(3, 1, 9));
        out.println(makeBricks(3, 2, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int bigBricks = big * 5;
        int smallBricks = small;
        int totalBricks = bigBricks + smallBricks;

        if (totalBricks < goal) {
            return false;
        } else if (totalBricks == goal) {
            return true;
        } else {
            int remainder = goal % 5;

            if (remainder <= smallBricks) {
                return true;
            } else {
                return false;
            }
        }
    }
}
