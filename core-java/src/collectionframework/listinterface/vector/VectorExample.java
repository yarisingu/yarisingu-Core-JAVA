package collectionframework.listinterface.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements to the vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        System.out.println("Vector: " + vector);

        // Accessing elements in the vector
        String element1 = vector.get(0);
        String element2 = vector.elementAt(1);
        System.out.println("Element at index 0: " + element1);
        System.out.println("Element at index 1: " + element2);

        // Updating an element in the vector
        vector.set(2, "Grapes");
        System.out.println("Updated Vector: " + vector);

        // Removing elements from the vector
        vector.remove(0);
        vector.remove("Banana");
        System.out.println("Updated Vector: " + vector);

        // Checking if the vector contains an element
        boolean containsApple = vector.contains("Apple");
        System.out.println("Vector contains 'Apple': " + containsApple);

        // Getting the size and capacity of the vector
        int size = vector.size();
        int capacity = vector.capacity();
        System.out.println("Size of the Vector: " + size);
        System.out.println("Capacity of the Vector: " + capacity);

        // Iterating over the vector using a for loop
        System.out.println("Elements of the Vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}

