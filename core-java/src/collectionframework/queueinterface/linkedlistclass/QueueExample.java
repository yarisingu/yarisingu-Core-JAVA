package collectionframework.queueinterface.linkedlistclass;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Check if the queue contains an element
        boolean containsBob = queue.contains("Bob");
        System.out.println("Contains Bob: " + containsBob);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size: " + size);

        // Access the element at the head of the queue
        String firstElement = queue.peek();
        System.out.println("First element: " + firstElement);

        // Remove and return the element at the head of the queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Iterate over the queue
        for (String element : queue) {
            System.out.println(element);
        }

        // Clear the queue
        queue.clear();

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}

