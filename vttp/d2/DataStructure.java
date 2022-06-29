// Using lists

package vttp.d2;

import java.util.List;
import java.util.LinkedList;

public class DataStructure {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<String>();
        stringList.add("Taekwondo");
        stringList.add("Football");
        stringList.add("Dance");

        List<Integer> intList = new LinkedList<Integer>();
        intList.add(52);
        intList.add(28);
        intList.add(13);
        intList.add(2,69);

        List<Character> charList = new LinkedList<Character>();
        charList.add('*');
        charList.add('%');

        System.out.println(stringList);
        System.out.println(intList);
        System.out.println(charList);

        for (int i=0; i < intList.size(); i++) {
            System.out.printf("The %dth integer: %d\n",i ,intList.get(i));
        }

    }
    
}
