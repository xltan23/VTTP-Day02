// Sum of all arguments inputted

package vttp.d2;

public class SumAll {
    public static void main(String[] args) {
        
        int operand = 0;
        int sumResult = 0;
        int mulResult = 1;

        for (int i = 0; i < args.length ; i++) {
            operand = Integer.parseInt(args[i]);
            sumResult += operand;
            mulResult *= operand;
        }
        System.out.printf("The sum of all inputted argument: %d\n", sumResult);
        System.out.printf("The product of all inputted argument: %d", mulResult);
    }
    
}
