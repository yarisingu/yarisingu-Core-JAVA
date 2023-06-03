package collectionframework.setinterface.treesetclass;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        Set<String> fruits = new TreeSet<>();

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
