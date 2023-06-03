package collectionframework.setinterface.linkedhashsettreeclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> fruits = new LinkedHashSet<>();

        // Add elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will be ignored

        // Check if an element exists
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Has Banana: " + hasBanana);

        // Remove an element
        boolean removed = fruits.remove("Orange");
        System.out.println("Removed Orange: " + removed);

        // Get the size of the set
        int size = fruits.size();
        System.out.println("Size: " + size);

        // Iterate over the set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the set
        fruits.clear();

        // Check if the set is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}

