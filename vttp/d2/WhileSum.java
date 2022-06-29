// Sum of arguments when asked using while loop

package vttp.d2;

import java.io.Console;

public class WhileSum {
    public static void main(String[] args) {

        Console cons = System.console();
        int result = 0;
        boolean stop = false;

        while (!stop) {
            String input = cons.readLine(">> ");
            if (input.length() > 0) {
                int operand = Integer.parseInt(input);
                result += operand;
            } else {
                stop = true;
            }

        }
        System.out.printf("Result of sum: %d", result);
    }
}
