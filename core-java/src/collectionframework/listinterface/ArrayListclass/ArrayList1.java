package collectionframework.listinterface.ArrayListclass;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        
        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Accessing elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit); // Output: First fruit: Apple
        
        // Updating an element
        fruits.set(1, "Mango");
        
        // Removing an element
        fruits.remove(2);
        
        // Iterating over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
