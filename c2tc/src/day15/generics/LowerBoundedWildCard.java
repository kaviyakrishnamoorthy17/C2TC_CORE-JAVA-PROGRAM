package day15.generics;

import java.util.List;

public class LowerBoundedWildCard {

    // This method uses an upper-bounded wildcard to accept lists of Number or its subclasses.
    public static void displayNumbers(List<? extends Number> list) {
        // We can read elements from the list, as they are guaranteed to be of type Number or a subclass.
        for (Number number : list) {
            System.out.println(number);
        }
        
        // This would not compile:
        // list.add(10); // Cannot add elements to a list with an upper-bounded wildcard.
    }
}