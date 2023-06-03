package collectionframework.collectioninterface;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionInterfaceExample {
    public static void main(String[] args) {
        // Create a Collection
        Collection<String> names = new ArrayList<>();

        // Add elements to the collection
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Check if the collection contains an element
        boolean containsBob = names.contains("Bob");
        System.out.println("Contains Bob: " + containsBob);

        // Get the size of the collection
        int size = names.size();
        System.out.println("Size: " + size);

        // Iterate over the collection
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an element from the collection
        names.remove("Charlie");

        // Clear the collection
        names.clear();

        // Check if the collection is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}

