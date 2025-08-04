package day15.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo {

    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Display Integer values");
        // Display List of Integers
        LowerBoundedWildCard.displayNumbers(intList);

        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("\nDisplay Number values");
        // Display List of Numbers
        LowerBoundedWildCard.displayNumbers(numberList);

        List<Number> doubleList = Arrays.asList(1.0, 2.0, 3.0, 9);
        System.out.println("\nDisplay Double values");
        displayNumbers(doubleList);
    }

    // This method is defined here to handle the direct call "displayNumbers(doubleList)"
    // It's the same as the one in the LowerBoundedWildCard class.
    public static void displayNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
}