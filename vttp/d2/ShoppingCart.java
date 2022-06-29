// Create shopping cart that allows user to add, remove items. Does not store duplicates.

package vttp.d2;

import java.util.List;
import java.util.LinkedList;
import java.io.Console;

public class ShoppingCart {
    public static void main(String[] args) {
        Console cons = System.console();
        List<String> cart = new LinkedList<String>();

        String input;
        int delIndex = 0;
        boolean stop = false;

        System.out.println("Welcome to your shopping cart!");

        while (!stop) {
            input = cons.readLine("list, add or remove item in cart\n >> "); 
            input = input.replaceAll(",","");
            String[] terms = input.split(" ");
            //System.out.println(terms.length);

            switch (terms[0]) {
                case "list":
                    if (cart.size() > 0) {
                        for (int i = 0; i < cart.size(); i++){
                            System.out.printf("%d %s\n", (i+1), cart.get(i));
                        }
                    } else {
                        System.out.println("The cart is empty.\n");
                    }
                    break;
                case "add":
                    for (int i = 1; i < terms.length; i++) {
                        if (cart.contains(terms[i])) {
                            System.out.printf("The cart already has %s. \n", terms[i]);
                        } else {
                            cart.add(terms[i]);
                            System.out.printf("%s added\n", terms[i]);
                        } 
                    }
                    break;
                case "remove":
                    if (terms.length > 1) {
                        delIndex = Integer.parseInt(terms[1]);
                        if (delIndex <= cart.size()) {
                            System.out.printf("%s removed \n", cart.get(delIndex-1));
                            cart.remove(delIndex-1);
                        } else {
                            System.out.printf("The index is out of range.\n");
                        }
                    } else {
                        System.out.println("Please include an index to remove.\n");
                    }
                    break;
                   
                case "exit":
                    System.out.println("See you again!");
                    stop = true;
                    break;
                default:
            }

        }

    }
    
}
