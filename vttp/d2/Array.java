// Array experiment

package vttp.d2;

public class Array {
    public static void main(String[] args) {
        String[] todos = new String[5];
        todos[0] = "To train Taekwondo";
        todos[1] = "Study Java";
        todos[2] = "Lunch";
        todos[3] = "Gym Session";

        int[] numberArr = new int[5];
        numberArr[0] = 1;
        numberArr[1] = 2;
        numberArr[2] = 3;
        numberArr[3] = 42;   
        
        char[] charArr = new char[5];
        charArr[0] = '*';
        charArr[1] = '%';
        charArr[2] = '#';
        charArr[3] = '$';   
    
        for (int i = 0; i < todos.length; i++){
            System.out.printf("%s\n", todos[i]);
        }
        for (int i = 0; i < numberArr.length; i++){
            System.out.printf("%d\n", numberArr[i]);
        }
        for (int i = 0; i < charArr.length; i++){
            System.out.printf("%c\n", charArr[i]);
        }
    }
}
